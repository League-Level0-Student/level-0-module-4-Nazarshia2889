 PImage face; 

void setup(){
   
  size(800, 600);
  face = loadImage("face.png");
  face.resize(width, height);
    background(face);
}

void draw(){
  background(face);
  if(mouseX < 270 || mouseX >380){
    mouseX = 320;
  }
  else if(mouseY < 80 || mouseY > 180){
    mouseY = 120;
  }
  fill(255);
  ellipse(320, 125, 120, 120);
  ellipse(450, 125, 120, 120);
  fill(0);
  ellipse(mouseX, mouseY, 35, 35);
  ellipse(mouseX + 100, mouseY, 35, 35);
}
