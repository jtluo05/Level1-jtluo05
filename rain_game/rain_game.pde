int RainY=0;
int randomNumber=200;
void setup( ){
size(600,600);
 
  
  
  
  
  
}
void draw() {
 background(#4DE52C);
  fill(#42C6D3);
stroke(#0763F2);
ellipse(randomNumber,RainY, 10, 20);
RainY=RainY+9;
if(RainY>height){
    RainY=0;
   randomNumber = (int) random(600);


}




}