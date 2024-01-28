int redLight = 13;
int greenLight = 11;
int blueLight = 12;
int buzz = 7;


int scndRedLight = 9;
int scndBlueLight = 8;

int buttonState = 4;


void setup() {
  // put your setup code here, to run once:
    pinMode(redLight, OUTPUT);
    pinMode(greenLight, OUTPUT);
    pinMode(blueLight, OUTPUT);
    pinMode(scndRedLight, OUTPUT);
    pinMode(scndBlueLight, OUTPUT);
    pinMode(buzz, OUTPUT);
    pinMode(buttonState, INPUT);

    digitalWrite(redLight, LOW);
    digitalWrite(greenLight, LOW);
    digitalWrite(blueLight, LOW);
    digitalWrite(scndRedLight, LOW);
    digitalWrite(scndBlueLight, LOW);
    digitalWrite(scndRedLight, HIGH);
    delay(500);

}

void loop() {
  // put your main code here, to run repeatedly:

}
