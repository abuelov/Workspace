

import java.awt.Color;
import java.awt.Graphics;

public class OakTree extends AbstractTree{
	
	public OakTree(int xpos, int ypos){
		super(xpos, ypos);
	}

	public void drawLeaves(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(getXpos()-40, getYpos()-90, 100, 100);
		
	}

	
}
