// C++ code
//
#include <Servo.h>
#include <LiquidCrystal.h>

// -- CONSTANT -- 
const int PHOTORESITSTOR1  = 0;
const int PHOTORESITSTOR2  = 1;
const int PHOTORESITSTOR3  = 2;
const int PHOTORESITSTOR4  = 5;
const int LED = 9;
const int BUT_ON = 13;
const int BUT_OFF = 12;
const int rs = 10, en = 11, d4 = 5, d5 = 4, d6 = 3, d7 = 2;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);


// -- GLOBAL -- 
int flag = 0;
int flag2 = 0;
int readPerSec = 5000;


Servo myservo;

Servo servohori;
int servoh = 0;
int servohLimitHigh = 160;
int servohLimitLow = 20;

Servo servoverti; 
int servov = 0; 
int servovLimitHigh = 160;
int servovLimitLow = 20;

int topRight = 0;
int topLeft = 0;
int bottomLeft = 0;
int bottomRight = 0;

void setup()
{
  
  Serial.begin(9600);
  lcd.begin(16, 2);
  pinMode(PHOTORESITSTOR1, INPUT);
  pinMode(PHOTORESITSTOR2, INPUT);
  pinMode(PHOTORESITSTOR3, INPUT);
  pinMode(PHOTORESITSTOR4, INPUT);
  pinMode(BUT_ON, INPUT);
  pinMode(BUT_OFF, INPUT);
  pinMode(LED, OUTPUT);
  servohori.attach(8);
  servohori.write(90);
  servoverti.attach(7);
  servoverti.write(90);
  
  
}

void checkBut(){
 int ButtonStateON = digitalRead(BUT_ON);
  int ButtonStateOFF = digitalRead(BUT_OFF);
 if(ButtonStateON == HIGH)
   {
    Serial.println("button is pressed.");
    flag = 1;
    Serial.print("The flag is ");
    Serial.println(flag);
   }
  if(ButtonStateOFF == HIGH)
   {
    Serial.println("button is pressed..");
    flag2 = 1;
    Serial.print("The flag2 is ");
    Serial.println(flag2);
   }
}

void LcdON(){
  digitalWrite(LED, HIGH);
  lcd.clear();
  topRight = analogRead(PHOTORESITSTOR1);
  topLeft = analogRead(PHOTORESITSTOR2);
  bottomLeft = analogRead(PHOTORESITSTOR3);
  bottomRight = analogRead(PHOTORESITSTOR4);
  //int myPin[4];
  int myPin[4] = {topRight,topLeft,bottomLeft,bottomRight};
  for(int i = 0; i <= 3; i++){
    Serial.println(myPin[i]);
    lcd.setCursor(0,0);
    lcd.print("Sensor No ");
    lcd.print(i);
    lcd.setCursor(0,1);
    lcd.print(myPin[i]);
    delay(readPerSec);
  }

}

void stop(){
flag = 0;
flag2 = 0;
digitalWrite(LED, LOW);
//Serial.println(sensorValue1);
}

void loop()
{
 //checkBut();
 //if (flag == 1)
 //{
  //LcdON();
  //checkBut();
  servoh = servohori.read();
  servov = servoverti.read();
  topRight = analogRead(PHOTORESITSTOR1);
  topLeft = analogRead(PHOTORESITSTOR2);
  bottomLeft = analogRead(PHOTORESITSTOR3);
  bottomRight = analogRead(PHOTORESITSTOR4);
  Serial.println(topRight);
  Serial.println(topLeft);
  Serial.println(bottomLeft);
  Serial.println(bottomRight);
  
  int avgtop = (topLeft + topRight) / 2; //average of top LDRs
  int avgbot = (bottomLeft + bottomRight) / 2; //average of bottom LDRs
  int avgleft = (topLeft + bottomLeft) / 2; //average of left LDRs
  int avgright = (topRight + bottomRight) / 2; //average of right LDRs

  if (avgtop < avgbot)
  {
    servoverti.write(servov + 1);
    if (servov > servovLimitHigh) 
     { 
      servov = servovLimitHigh;
     }
    delay(10);
  }
  else if (avgbot < avgtop)
  {
    servoverti.write(servov - 1);
    if (servov < servovLimitLow)
  	{
    servov = servovLimitLow;
  	}
    delay(10);
  }
  else 
  {
    servoverti.write(servov);
  }
  
  if (avgleft > avgright)
  {
    servohori.write(servoh +1);
    if (servoh > servohLimitHigh)
    {
    servoh = servohLimitHigh;
    }
    delay(10);
  }
  else if (avgright > avgleft)
  {
    servohori.write(servoh -1);
    if (servoh < servohLimitLow)
     {
     servoh = servohLimitLow;
     }
    delay(10);
  }
  else 
  {
    servohori.write(servoh);
  }
  delay(50);
//}



 }
  //if (flag2 == 1)
  //{
    //stop();
  //}

