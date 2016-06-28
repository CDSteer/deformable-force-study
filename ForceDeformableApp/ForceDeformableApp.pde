import processing.serial.*;
Serial myPort;
int setInterface = 0;

void setup() {
  if (setInterface == 0) {
    mode = new SliderMode();
  } else if (setInterface == 1){
    mode = new SliderMode();
  }
  size(1250, 750);
  background(200);
  println(Serial.list());
  myPort = new Serial(this, Serial.list()[1], 57600);
  myPort.bufferUntil('\n');
}

void draw() {
  background(204);
  String inString = myPort.readStringUntil('\n');
  delay(200);
}
void serialEvent (Serial myPort) {}
