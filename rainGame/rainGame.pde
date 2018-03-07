int RainY=0;
int randomNumber=200;
int rain=mouseX;
int score=0;
void setup( ) {
  size(800, 800);
textSize(16);
}
void draw() {
  background(#4DE52C);
  fill(#42C6D3);
  stroke(#0763F2);
  ellipse(randomNumber, RainY, 10, 20);
  RainY=RainY+9;
  if (RainY>height) {
    RainY=0;
    checkCatch(randomNumber);
    randomNumber = (int) random(height);
   
  }
  rect(mouseX, height-75, 50, 70);
   fill(0, 0, 0);
  if (score==15) {
    text("YOU WON!!!!! GREAT JOB!!! The bucket is now full!", 20, 20);
  }
else if (score==-4) {
    text("You are no so good at this.          Score:-4 ", 20, 20);
  }
  else if (score==-3) {
    text("You are no so good at this.          Score:-3 ", 20, 20);
  }
  else if (score==-2) {
    text("You are no so good at this.          Score:-2 ", 20, 20);
  }
  else if (score==-1) {
    text("You are no so good at this.                    Score:-1 ", 20, 20);
  }
 else if (score==5) {
    text("You are okay at this.", 20, 20);
  }
 else if (score==15) {
    text("You are great at this.", 20, 20);
  }
else if (score==10) {
    text("You are good at this.", 20, 20);
  }
 else if (score==20) {
    text("YOU ARE A MASTER AT THIS!!!! YOU ARE AMAZING!!!!!!!!", 20, 20);
  }
  else if (score==25) {
    text("YOU ARE A GOD!!!!!!YOU ARE SO SO SO SO SO SO SO SO SO SO SO SO SO GOOD AT THIS!", 20, 20);
  } else {
   
    
    text("Score: " + score, 20, 20);
  }
    }
    void checkCatch(int x) {
      if (x > mouseX && x < mouseX+100)
        score++;
      else if (score > 0) 
        score=score-5;
      println("Your score is now: " + score);
    }