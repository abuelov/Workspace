import java.awt.Graphics;

public class ChristmasTree extends PineTree {

	public ChristmasTree(int xpos, int ypos){
		super(xpos, ypos);
	}
	
	@Override
	public void drawTree(Graphics g){
		super.drawTree(g);
		Ornament o1 = new Ornament(getXpos() + 10, getYpos() - 100);
		Ornament o2 = new Ornament(getXpos() + 25, getYpos() - 70);
		Ornament o3 = new Ornament(getXpos(), getYpos() - 70);
		o1.drawOrnament(g);
		o2.drawOrnament(g);
		o3.drawOrnament(g);
	}
	
}
