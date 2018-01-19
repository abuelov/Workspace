import java.awt.Color;
import java.awt.Graphics;

public class PineTree extends AbstractTree{

	int[] l1 = {getXpos()-25, getXpos()+15, getXpos() + 50};
	int[] l2 = {getYpos(), getYpos()-80, getYpos()};
	
	public PineTree(int xpos, int ypos){
		super(xpos, ypos);
	}


	public void drawLeaves(Graphics g) {
		g.setColor(Color.GREEN);
		
		g.fillPolygon(l1, l2, 3);

	}
}
