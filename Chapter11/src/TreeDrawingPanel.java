import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TreeDrawingPanel extends JPanel{

	//Create fields for OakTree, PineTree, and Christmas Tree
	private OakTree oak;
	private PineTree pine;
	private ChristmasTree xmas;
	
	public TreeDrawingPanel(){
		//Instantiate the Trees
		oak = new OakTree(100, 400);
		pine = new PineTree(250, 400);
		xmas = new ChristmasTree(400, 400);
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		oak.drawTree(g);
		pine.drawTree(g);
		xmas.drawTree(g);
		
		//Draw the Trees
		
	}
	
	
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Tree Drawing");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setBounds(100, 50, 800, 600);
		JPanel panel = new TreeDrawingPanel();
		panel.setBackground(Color.WHITE);
		frame.add(panel);
		frame.setVisible(true);
	}
}