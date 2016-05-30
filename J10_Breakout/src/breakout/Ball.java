package breakout;

import java.awt.Color;

import processing.core.PApplet;

public class Ball {
	private float x;
	private float y;
	private float vx;
	private float vy;
	private float size;
	private Color color;
	PApplet p;
	
	public Ball(PApplet np,float nx, float ny, float nsize, Color c){
		p = np;
		x = nx;
		y = ny;
		size = nsize;
		color = c;
		do{
			vx = p.random(-3,3);
		} while (vx == 0);
		do{
			vy = p.random(-3,3);
		} while (vy == 0);
	}
	
	public void update(){
		x = x + vx;
		y = y + vy;
		
		if(x > p.width || x < 0){
			vx = -vx;
		}
		
		if(y > p.height || y < 0){
			vy = -vy;
		}
	}
	
	public void paint(){
		p.noStroke();
		p.fill(color.getRed(), color.getGreen(), color.getBlue());
		p.ellipse(x, y, size, size);
	}
	
	public void setX(float newX){
	    x = newX;
	}
	
	public void setY(float newY){
	    y = newY;
	}
	
	public void setVX(float newVX){
		vx = newVX;
	}
	
	public void setVY(float newVY){
		vy = newVY;
	}
	
	public void setSize(float newSize){
	    size = newSize;
	}
	
	public void setVelocity(float nVX, float nVY){
		vx = nVX;
		vy = nVY;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
	
	public float getVX(){
		return vx;
	}
	
	public float getVY(){
		return vy;
	}
	
	public float getSize(){
		return size;
	}
	
	public Color getColor(){
		return color;
	}
	
}

