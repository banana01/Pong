//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   setX(x);setY(y);
   }
   public Paddle(int x, int y, int sp)
   {
	   setX(x);setY(y);setSpeed(sp);
   }
   public Paddle(int x, int y, int w, int h)
   {
	   setX(x);setY(y);setWidth(w);setHeight(h);
   }
   public Paddle(int x, int y, int w, int h, int s)
   {
	   setX(x);setY(y);setWidth(w);setHeight(h);setSpeed(s);
   }
   public Paddle(int x, int y, int w, int h, Color c)
   {
	   setX(x);setY(y);setWidth(w);setHeight(h);setColor(c);
   }
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   setX(x);setY(y);setWidth(w);setHeight(h);setColor(c);setSpeed(s);
   }









   public void moveUpAndDraw(Graphics window)
   {
	   window.setColor(Color.white);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   setY(getY()+(2*speed));
	   window.setColor(this.getColor());
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }

   public void moveDownAndDraw(Graphics window)
   {
	   window.setColor(Color.white);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   setY(getY()-(2*speed));
	   window.setColor(this.getColor());
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   public void setSpeed(int sp)
   {
	   speed = sp;
   }
   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   public String toString()
   {
	   return "X:"+getX()+" Y:"+getY()+" W:"+getWidth()+" H:"+getHeight()+" C:"+getColor()+" Sp:"+getSpeed();
   }
   //add a toString() method
}