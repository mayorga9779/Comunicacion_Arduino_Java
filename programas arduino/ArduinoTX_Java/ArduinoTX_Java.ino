/*
 * Con este programo envio datos desde Arduino hacia Java
*/
int n = 0;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  String output = "Mensaje ";
  //se concatena el valor del contador al mensaje
  output += n;
  //Se imprime el mensaje en el puerto serie
  Serial.println(output);
  n++;
  delay(250);
}
