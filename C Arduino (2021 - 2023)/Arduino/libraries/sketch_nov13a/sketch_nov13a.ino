#include <Servo.h>

Servo myservo;
int pos = 0;


void setup() {
  Serial.begin(9600);
  myservo.attach(7);
  // put your setup code here, to run once:

}

void loop() {
  // put your main code here, to run repeatedly:
  myservo.write(0);
  delay(5000);
  myservo.write(45);
  delay(5000);
  
  myservo.write(90);
  delay(5000);
  
  myservo.write(180);
  delay(5000);
  myservo.write(360);
  delay(5000);

}
