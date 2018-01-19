import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Ornament {
	private int xpos;
	private int ypos;
	private Color color;
	public Ornament(int xpos, int ypos) {
		this.xpos = xpos;
		this.ypos = ypos;
		
		Random random = new Random();
		int r = random.nextInt(256);
		int g = random.nextInt(256);
		int b = random.nextInt(256);
		
		color = new Color(r, g, b);
		
	
	}
	public void drawOrnament(Graphics g) {
		
		g.setColor(color);
		g.fillOval((int)Math.random()*xpos)-50),(int)((Math.random()*yPos)+80), 10, 10);
		System.out.println(color);
		
		
		
	}
}
