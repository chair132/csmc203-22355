/* 
 * Class: CMSC203  22355
 * Instructor: David Kuijt
 * Description: Define the class for the plot, composing of primitives that define x, y, width, and depth
 * Due: 11/03/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  assignment independently.  
 * I have not copied the code from a student or any source.  
 * I have not given my code to any student. 
 * Print your Name here: ____John Vu______ 
*/ 
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	public Plot(Plot otherPlot) {
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	public boolean overlaps(Plot plot) {
		if ((plot.x < this.x + this.width) 
				&& (plot.x + plot.width > this.x) 
				&& (plot.y < this.y + this.depth) 
				&& (plot.y + plot.depth > this.y)) {
			return true;
		}
		return false;
	}
	public boolean encompasses(Plot plot) {
		if((this.x <= plot.x) &&(this.x + this.width >= plot.x+plot.width) && (this.y <= plot.y) && (this.y+this.depth >= plot.y+plot.depth)){
			return true;
		}
		
		return false;
	}
	//getters
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getDepth() {
		return depth;
	}
	//setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	//toString method
	@Override
	public String toString() {
		return x+","+y+","+width+","+depth;
	}
	
	
}
