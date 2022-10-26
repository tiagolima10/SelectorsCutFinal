package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import entity.Player;
import object.SuperObject;
import tile.TileManager;

public class GamePainel extends JPanel implements Runnable{

	// SCREEN SETTINGS
	final int originalTileSize = 16; //16x16
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale; // codigo feito para aumentar resolução dos elementos
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    public final int screenHeight = tileSize * maxScreenRow; // 576 pixels
   
    
    // WORLD SETTINGS
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;
    
    // FPS
    int FPS = 60;
    TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();//objeto "teclado funcões
    Thread gameThread; //Um Thread é usado para permitir que mais de uma tarefa seja . realizado de uma só vez 
    public CollisionChecker cChecker = new CollisionChecker(this);
   //OBJETOS 
    public Player player = new Player(this,keyH);
    public AssetSetter aSetter = new AssetSetter(this);
    public SuperObject obj[] = new SuperObject[10];
    
    //GAME STATE
    public int gameState;
    public final int playState = 1;
    public final int pauseState = 2;
    
    
    
    
    
    // Posição default do player
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    
    
    
public GamePainel() {
	this.setPreferredSize(new Dimension(screenWidth, screenHeight)); //definir tamanho do painel
	this.setBackground(Color.black); //cor de fundo do painel
	this.setDoubleBuffered(true); //O buffer duplo é o processo de desenhar gráficos em um buffer de imagem fora da tela e, em seguida, copiar o conteúdo do buffer para a tela de uma só vez . 
    this.addKeyListener(keyH);
    this.setFocusable(true); //utilizado para reconhecer a entrada de teclas
    
    
}


public void setupGame() {	
		aSetter.setObject();
                gameState = playState;
		}

public void startGameThread(){
	gameThread = new Thread(this);
	gameThread.start();
}


@Override
public void run() {
	
	double drawInterval = 1000000000/FPS;
	double nextDrawTime = System.nanoTime() + drawInterval;
	 
	
	while(gameThread != null) {
		// loop para movimentação do personagem eixo X e Y
		
		update();
		
		repaint();  
		
		
		try {
			double remainingTime = nextDrawTime - System.nanoTime();
			remainingTime = remainingTime/1000000;
			
			if(remainingTime < 0) {
				remainingTime = 0;
			}
			
			Thread.sleep((long)remainingTime);
			
			nextDrawTime += drawInterval;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	

	public void update(){
		if(gameState == playState){
                player.update();
                }
                 if(gameState == pauseState); 
		//Nada
		}
	
	
	
	public void paintComponent(Graphics g) {
		//metodo nativo do Java para desenhar elementos no Jpainel
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		tileM.draw(g2);
		
	//objects
        for(int i = 0; i < obj.length; i++) {
			if(obj[i] != null) {
				obj[i].draw(g2, this);
			}
		}
        
        player.draw(g2);
		
		g2.dispose();
        }
        
        
	
	
	

}
