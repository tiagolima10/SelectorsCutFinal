package main;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {


		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D Senai Game");
		
		GamePainel gamePainel = new GamePainel();
		window.add(gamePainel);
		
		window.pack();
		
		window.setLocationRelativeTo(null); 
		window.setVisible(true); 
		
                gamePainel.setupGame();
		gamePainel.startGameThread();
	}

}
