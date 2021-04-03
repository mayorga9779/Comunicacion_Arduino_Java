/*
 * Con este archivo, recibo datos desde Java hacia Arduino
*/

void setup() {
  // put your setup code here, to run once:
  pinMode(10, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // En caso de que haya informacion en el serial port, se entra en el if
  if(Serial.available() > 0){
    //Se lee la informacion entrante en el serial port
    int input = Serial.read();
    //Si el valor que envio desde java es 1, enciendo el LED
    if(input == '1'){
      digitalWrite(10, HIGH);
    } else {
      digitalWrite(10, LOW);
    }
  }
}
