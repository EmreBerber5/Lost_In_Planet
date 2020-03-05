package gui.components;

import javafx.scene.paint.Color;

public class Pixel {

	private int globalX;
	private int globalY;
	
	private Color color;
	
	public Pixel(int x , int y, Color color) {
		setGlobalX(x);
		setGlobalY(y);
		setColor(color);
	}
	
	public int getX() {
		return globalX;
	}
	public void setGlobalX(int x) {
		this.globalX = x;
	}
	public int getGlobalY() {
		return globalY;
	}
	public void setGlobalY(int y) {
		this.globalY = y;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
