#include <LiquidCrystal_I2C.h>
LiquidCrystal_I2C lcd(0x27, 16, 2);

const int pinSensorGas = D5;
const int pinBuzzer = D7;
boolean bacaSensor;

void setup() {
  pinMode(pinSensorGas, INPUT);
  pinMode(pinBuzzer, OUTPUT);
  digitalWrite(pinBuzzer, LOW);
   
  lcd.begin();
  lcd.setCursor(0, 0);
  lcd.print("Alat Pendeteksi");

  lcd.setCursor(0, 1);
  lcd.print("Kebocoran gas");
  delay(1500);

  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Ready.....");
  delay(1500);
}

void loop()
{
// membaca data sensor
  bacaSensor = digitalRead(pinSensorGas);

// jika terdeteksi gas
// terbaca output sensor "0" atau logic LOW
  if (bacaSensor == 0)
{
// buzzer menyala
  digitalWrite(pinBuzzer, LOW);

  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Gas Bocor");
  lcd.setCursor(0, 1);
  lcd.print("Terdeteksi...!!!");
  delay(100);

// buzzer dimatikan
  digitalWrite(pinBuzzer, LOW);
}

// jika tidak terdeteksi gas
// terbaca output sensor "1" atau logic HIGH
else if (bacaSensor == 1)
{
// buzzer dimatikan
  digitalWrite(pinBuzzer, HIGH);

// menulis pada lcd
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Tidak Ada");
  lcd.setCursor(0, 1);
  lcd.print("Kebocoran Gas");
  delay(100);
}
}
