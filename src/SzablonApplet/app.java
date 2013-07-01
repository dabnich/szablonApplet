package SzablonApplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class app extends Applet implements Runnable, KeyListener{
	
	Thread thread;
	boolean pracuje;
	Graphics Gr;
	
	public void init(){
		pracuje = false;
		addKeyListener(this);
		resize(Constants.szerokoscOkna, Constants.wysokoscOkna);
		Gr = getGraphics();
	}
	
	public void start(){
		thread = new Thread(this);
		thread.start();
		pracuje = true;
	}
	
	public void stop(){
		pracuje = false;
	}
	
	public void run(){
		while(pracuje){
			
			Gr.clearRect(0, 0, getWidth(), getHeight());
			
			try{
				Thread.sleep(1000/Constants.FPS);
			}
			catch(InterruptedException ex){}
		}
	}
	
	
	
	
	public void keyPressed(KeyEvent evt){
		
	}
	
	public void keyTyped(KeyEvent evt){
		
	}
	
	public void keyReleased(KeyEvent evt){
		
	}

}
