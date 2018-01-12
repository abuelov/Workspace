
public abstract class AbstractFiigure implements Figure{
	
	public String toString(){
		return String.format("%s, Perimeter: %.2f units, Area: %.2f sq units",
				getClass().getSimpleName(), getPerimeter(), getArea());
	}
}
