public class Rectangle extends Shape {

	private int length;
	private int width;

	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length*width;
	}
	
	public int findMax(int a, int b) {
		int m;
		if (a > b) {
			m = a;
			return m;
		}else {
			m = b;
			return m;
		}
	}
	
	public String toString(){
		if (color == null) {
			color = "red";
			return "Area : "+getArea()+" Color : " + color;
		} else {
			return "Area : "+getArea()+" Color : " + color;
		}
	}
	

}
