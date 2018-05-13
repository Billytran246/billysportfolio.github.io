void setup(){
  size(800,800);
}
 
void draw(){
  //draw a drop at 120, 120 size 8
  background(#4D7A98);
  stroke(#DEDEDE);
  strokeWeight(6);
  textSize(50);
text("A rainy day makes the day ", 100, 700);

text("coming more happier!", 100, 750); 
  line(400,140,400,600);
  noStroke ();
  fill(#F25A6C);
  arc(400, 300, 400, 300,radians(180) ,radians(360), CHORD);
  fill(#98CDF0);
  //left line
  fill(#4D7A98);
  ellipse(250,310,100,85);
  ellipse(350,310,95,85);
  ellipse(450,310,95,85);
  ellipse(550,310,100,85);
  
  
  
  
  fill(#8DC3FA);
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
void drawRaindrop(int x,int y,int size){
    noStroke();
    for (int i = 2; i < size; i++ ) {
      ellipse(x,y + i*4,i*2,i*2);
    }
}
