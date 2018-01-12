
public class Rectangle extends AbstractFiigure {
	
	private double length, width;

	public Rectangle(double length, double width){
		this.width = width;
		this.length = length;
	}

	@Override
	public double getPerimeter() {
		return width*2 + length*2;
	}

	@Override
	public double getArea() {
		return width * length;
	}

}
