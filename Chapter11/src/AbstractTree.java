import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractTree implements Tree{
	private int xpos, ypos;	
	private Color trunk, leaves;
	public AbstractTree(int xpos, int ypos){
		this.xpos = xpos;
		this.ypos = ypos;	
		trunk = new Color(20,50,25);
		leaves = Color.GREEN;
	}
	
	
public int getXpos() {
		return xpos;
	}


	public void setXpos(int xpos) {
		this.xpos = xpos;
	}


	public int getYpos() {
		return ypos;
	}


	public void setYpos(int ypos) {
		this.ypos = ypos;
	}


	public Color getLeaves() {
		return leaves;
	}


	public void setLeaves(Color leaves) {
		this.leaves = leaves;
	}


public abstract void drawLeaves(Graphics g);
	
	
	public void drawTrunk(Graphics g) {
		g.setColor(trunk); //RGB value for brown
		g.fillRect(xpos, ypos, 25, 50);
	}
	
	public void drawTree(Graphics g) {
		drawTrunk(g);
		drawLeaves(g);	
	}
}