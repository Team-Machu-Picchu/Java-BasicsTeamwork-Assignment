import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class FinalPane extends JComponent implements MouseListener {

	private static BufferedImage puzzleImage;

	public FinalPane() {
		addMouseListener(this);
		try {
			puzzleImage = ImageIO.read(new File("Images/pic1.jpg"));
		}
		catch (IOException error) {
			error.printStackTrace();
		}
	}
	
	protected void paintComponent(Graphics g) {
		g.drawImage(puzzleImage, 0, 0, puzzleImage.getWidth(), puzzleImage.getHeight(), null);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		Window.window.dispose();
		System.exit(0);
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

}