package Prac28July;

public class Point {
	private int x,y;
	
	public Point() {
		
	}
	
	public Point(int x,int y) {
		setX(x);setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance() {
		return Math.sqrt((0-x)*(0-x)+(0-y)*(0-y));
	}
	
	public double distance(int x,int y) {
		return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
	}
	
	public double distance(Point p) {
		return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
	}
}
