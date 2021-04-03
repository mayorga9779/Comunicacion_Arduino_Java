/*
 * Con este programa envio datos a Java, y
 * tambien, recibo dados desde Java
*/

void setup() {
  // put your setup code here, to run once:
  pinMode(10, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  // en caso que haya informacion en el serial port, se entra en el if
  if(Serial.available() > 0){ 
    //se lee la informacion entrante, en el puerto serial
    int input = Serial.read();

    if(input == '1'){
      // si el valor es 1, que encienda el led
      digitalWrite(10, HIGH);
      //Se envia a Java el mensaje de encendido
      String output = "LED Encendido";
      Serial.println(output);
    } else {
      digitalWrite(10, LOW);
      //se envia a Java el mensaje de apagado
      String output = "LED Apagado";
      Serial.println(output);
    }
  }
}
