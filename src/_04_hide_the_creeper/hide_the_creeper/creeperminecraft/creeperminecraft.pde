int x = 500;
int y = 400;


PImage creeper;     //at the top of your program
PImage minecraft;

void setup(){
  size(900, 700); //in setup method
  minecraft = loadImage("forest.jpg");     //in setup method
  minecraft.resize(width, height);          //in setup method
  background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(30, 30);     //in setup method
}

void draw(){
  background(minecraft);    
  image(creeper, x, y);     //in draw method
  if(mousePressed){
    fill(255, 0, 0);
    ellipse(mouseX, mouseY, 50, 50);
  }
}
