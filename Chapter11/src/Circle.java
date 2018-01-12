
public class Circle extends AbstractFiigure{
	
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getArea() {
		return  Math.PI* Math.sqrt(radius);
	}

	//@Override
	//public String toString() {
	//	return "Circle- Circumference: " + getPerimeter() + " units, Area: " + getArea() + " units.";
//	}
}
