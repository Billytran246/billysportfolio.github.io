import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class RainyDay extends PApplet {

public void setup(){
  
}
 
public void draw(){
  //draw a drop at 120, 120 size 8
  background(0xff4D7A98);
  stroke(0xffDEDEDE);
  strokeWeight(6);
  textSize(50);
text("A rainy day makes the day ", 100, 700);

text("coming more happier!", 100, 750); 
  line(400,140,400,600);
  noStroke ();
  fill(0xffF25A6C);
  arc(400, 300, 400, 300,radians(180) ,radians(360), CHORD);
  fill(0xff98CDF0);
  //left line
  fill(0xff4D7A98);
  ellipse(250,310,100,85);
  ellipse(350,310,95,85);
  ellipse(450,310,95,85);
  ellipse(550,310,100,85);
  
  
  
  
  fill(0xff8DC3FA);
  noStroke( );
  drawRaindrop(120,mouseY+120,1);
  drawRaindrop(320,mouseY+120,2);
  drawRaindrop(420,mouseY+120,4);
  drawRaindrop(20,mouseY+120,6);
  drawRaindrop(140,mouseY+160,4);
  drawRaindrop(50,mouseY+60,6);
  drawRaindrop(30,mouseY+90,7);
  drawRaindrop(500,mouseY+520,4);
  drawRaindrop(620,mouseY+620,2);
  drawRaindrop(400,mouseY+200,1);
  drawRaindrop(800,mouseY+20,8);
  drawRaindrop(700,mouseY+40,8);
  drawRaindrop(670,mouseY+80,8);
  drawRaindrop(70,mouseY+500,8);
  drawRaindrop(150,mouseY+700,8);
  drawRaindrop(350,mouseY+600,8);
  drawRaindrop(250,mouseY+590,8);
  drawRaindrop(400,mouseY+400,8);
  drawRaindrop(200,mouseY+500,8);
  drawRaindrop(600,mouseY+400,8);
  drawRaindrop(30,mouseY+400,8);
}

//draw raindrop x = x position, y = y positiom, size = size
public void drawRaindrop(int x,int y,int size){
    noStroke();
    for (int i = 2; i < size; i++ ) {
      ellipse(x,y + i*4,i*2,i*2);
    }
}
  public void settings() {  size(800,800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "RainyDay" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
