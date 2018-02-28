import ddf.minim.*;
AudioPlayer song; 
Minim minim;  
PImage pictureOfRecord;
int imageAngle= 0;
void setup(){
    minim = new Minim(this); 
song = minim.loadFile("batman.wav", 512);
pictureOfRecord= loadImage("record.jpg");  

  size(600, 449); 
}
void draw (){

 if(mousePressed){
   rotateImage(pictureOfRecord, imageAngle);
 song.play();
 }
 else{
   song.pause();      
 }
image(pictureOfRecord, 0,0);
imageAngle=imageAngle+10;
}

   void rotateImage(PImage image, int amountToRotate) {
     translate(600/2, 449/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
   }
  
  
  
  
  