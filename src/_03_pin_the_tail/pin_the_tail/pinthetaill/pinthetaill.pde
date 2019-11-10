import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch



int x = 10;
int y = 10;
boolean clicked = false;
PImage donkey;
PImage tail;

void setup(){
  donkey = loadImage("Donkey.jpg");      //change the file name if you need to
  tail = loadImage("tail.jpg");      //change the file name if you need to
  size(750, 536);
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
}
void draw(){
   background (donkey);
  textSize(24);
  text("Pin the tail on the donkey!",250,20);
 
  println("X: " + mouseX + " Y: " + mouseY); 
  rect(0, 0, 30, 30);
  
  if(dist(0,0, mouseX, mouseY) > 30){
    background(255);
  }
  if(mousePressed){
    clicked = true;
    x = mouseX - 10;
    y = mouseY - 10;
   if(mouseX > 620 && mouseX < 665 && mouseY > 110 && mouseY <150){
     if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
   }
  }
  if(clicked == false){
    image(tail, mouseX-10, mouseY-10, 200, 200);
  }
  else{
    background(donkey);
    image(tail, x, y, 200, 200);
  }
  
 
 
}
