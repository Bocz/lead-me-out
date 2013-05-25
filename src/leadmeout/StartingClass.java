package leadmeout;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class StartingClass extends Applet implements Runnable {

	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(17); // updates game @ 60 fps
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void init() {
		setSize(800, 480);
		setBackground(Color.BLACK);
		setFocusable(true); // all input now goes directly to app
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("test frame");
	}

	public void start() {
		Thread thread = new Thread(this);
		thread.start();
	}

	public void stop() {
	}

	public void destroy() {
	}
}
