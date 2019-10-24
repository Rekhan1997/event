package com.cruds.event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseListener;

public class MouseEvent extends Frame implements MouseListener{

	
	Label l;
	
	public MouseEvent() {
		addMouseListener(this);
		
		l = new Label();
		l.setBounds(20, 50, 100, 20);
		add(l);
		
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		
		
	}
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		 l.setText("Mouse Clicked");
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		 l.setText("Mouse Entered");
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		 l.setText("Mouse Exited");
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		 l.setText("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		 l.setText("Mouse Released");
		
	}
 
}
