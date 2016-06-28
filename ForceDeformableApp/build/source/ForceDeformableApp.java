import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.serial.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class ForceDeformableApp extends PApplet {


Serial myPort;        // The serial port

public void setup() {
  
  background(200);
  println(Serial.list());
  myPort = new Serial(this, Serial.list()[1], 57600);
  myPort.bufferUntil('\n');
}

public void draw() {
  background(204);
  String inString = myPort.readStringUntil('\n');
  delay(200);
}
public void serialEvent (Serial myPort) {}
public class AbstractActor {

}
public abstract class AbstractGUIElement implements GUIElemment {

    protected int m_x, m_y, m_height, m_width, m_radius;

    public AbstractGUIElement(int x, int y, int width, int height) {
        this.m_x = x;
        this.m_y = y;
        this.m_width = width;
        this.m_height = height;
    }

    public AbstractGUIElement(int x, int y, int radius) {
        this.m_x = x;
        this.m_y = y;
        this.m_radius = radius;
    }

    @Override
    public void setX(int x) {
        this.m_x = x;
    }

    @Override
    public void setY(int y) {
        this.m_y = y;
    }

    @Override
    public void setWidth(int width) {
        this.m_width = width;
    }

    @Override
    public void setHeight(int height) {
        this.m_height = height;
    }

    @Override
    public void setRadius(int radius) {
        this.m_radius = radius;
    }

    @Override
    public int getX() {
        return m_x;
    }


    @Override
    public int getY() {
        return m_y;
    }

    @Override
    public int getHeight() {
        return m_height;
    }

    @Override
    public int getWidth() {
        return m_width;
    }

    @Override
    public int getRadius() {
        return m_radius;
    }


    public boolean inBounds(int mouseX, int mouseY) {
        return mouseX > this.m_x && mouseX < this.m_x + this.m_width && mouseY > this.m_y && mouseY < this.m_y + this.m_height;
    }
}
public abstract class AbstractInterfaceType {

}
public abstract class AbstractMode {

}
public interface Actor {

}
public class Circle extends AbstractGUIElement {
  public Circle(int x, int y, int r){
    super(x,y,r);
  }
  public void draw(){

  }
}
public class Computer {

}
public class DeformableInterface extends AbstractInterfaceType {

}
public interface GUIElemment {
    public void draw();
    public void setX(int x);
    public void setY(int y);
    public void setWidth(int width);
    public void setHeight(int height);
    public void setRadius(int radius);
    public int getX();
    public int getY();
    public int getHeight();
    public int getWidth();
    public int getRadius();
}
public class GraphicalInterface extends AbstractInterfaceType {

}
public interface InterfaceType {

}
public interface Mode {

}
public class PinchMode extends AbstractMode {

}
public class Slider extends AbstractGUIElement {
  public Slider(int x, int y, int h, int w){
    super(x, y, h, w);
  }
  public void draw(){

  }
}
public class SliderMode extends AbstractMode{

}
public class User {

}
  public void settings() {  size(1250, 750); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ForceDeformableApp" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
