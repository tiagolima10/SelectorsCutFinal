package entity;


import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePainel;
import main.KeyHandler;


public class Player extends Entity{

	GamePainel gp;
	KeyHandler keyH;
	public final int screenX;
	public final int screenY;
        int hasKey =0;

	public Player(GamePainel gp, KeyHandler keyH) {
		this.gp =gp;
		this.keyH = keyH;
		
		//ponto fixo do player configuração
		screenX = gp.screenWidth/2 -(gp.tileSize/2);
		screenY = gp.screenHeight/2 -(gp.tileSize/2);
		
                solidArea = new Rectangle();
                solidArea.x = 0;
                solidArea.y =0;
                solidAreaDefaultX = solidArea.x;
                solidAreaDefaultY = solidArea.y;
                solidArea.width = 32;
                solidArea.height = 32;
                
                
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues() {
	  //ponto de partida do player
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		speed = 4;
		direction = "down";
	}
	public void getPlayerImage() {
		//imagens do player
		try {
			
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_1.png"));
                        up2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_2.png"));	
                        down1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_1.png"));
                        down2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_2.png"));
                        left1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_1.png"));
                        left2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_2.png"));
                        right1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_1.png"));
                        right2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_2.png"));
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void update() {
	//codigo para funcionalidade do teclado, com as ações utilizando as imagens do player	
        
        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true){
        
		if(keyH.upPressed == true) {
			direction = "up";
		
			
		}
		else if(keyH.downPressed ==true) {
			direction = "down";
		
		}
		
		else if(keyH.leftPressed == true) {
			direction = "left";
			
		}
		
		else if(keyH.rightPressed == true) {
			direction = "right";
		
		}
		
                //CHECK TILE COLLISION
		
                collisionOn = false;
                gp.cChecker.checkTile(this);
                
                //Check obj collision
                int objIndex = gp.cChecker.checkObject(this, true);
                pickUpObject(objIndex);
                // IF COLLSION IS FALSE, PLAYER CAM MOVE
                
                if(collisionOn == false) {
			switch(direction) {
			case "up":
				this.worldY -= this.speed;
				break;
			case "down":
				this.worldY += this.speed;
				break;
			case "left":
				this.worldX -= this.speed;
				break;
			case "right":
				this.worldX += this.speed;
				break;
			}
		}
                }
                
                spriteCounter++;
		if(spriteCounter >10) {
			if(spriteNum == 1) {
				spriteNum =2;
			}
			else if (spriteNum ==2) {
				spriteNum = 1;
			}
			spriteCounter = 0;
		}
	}
	
        public void pickUpObject(int i) {
		
		if(i != 999) {
		
		String objectName = gp.obj[i].name;
			
			switch(objectName) {
			case "Filme":
				hasKey++;
				this.gp.obj[i] = null;
				System.out.println("Filme");
                               try
                               {
                               Runtime.getRuntime().exec("java -jar ./Filmes.jar");                              
                               Process p = Runtime.getRuntime().exec("java -jar ./Senai2dGame.jar");

                              p.destroyForcibly();
                               }
                                catch(IOException iOException)
                               {
                                iOException.printStackTrace();
                                 }
				break;
                      
                        case "Serie":
				this.gp.obj[i] = null;
				System.out.println("Serie");
                               try
                               {
                               Runtime.getRuntime().exec("java -jar ./Series.jar");                              
                                Process p = Runtime.getRuntime().exec("java -jar ./Senai2dGame.jar");

                              p.destroyForcibly();
                               }
                                catch(IOException iOException)
                               {
                                iOException.printStackTrace();
                                 }
				break;
                       
                        case "Door":
				
				this.gp.obj[i] = null;
				System.out.println("Sair");
                              
                                System.exit(0);                
                             
				break;
                        
                        }
		}
        }
		
	
        
        
	public void draw(Graphics2D g2) {
		//animação do player a cada movimento
		BufferedImage image = null;
		
		switch(direction) {
		case "up":
			if(spriteNum == 1) {
			image = up1;
			}
			if(spriteNum == 2) {
				image = up2;
				}
			break;
			
		case "down":
			if(spriteNum == 1) {
				image = down1;
				}
			if(spriteNum == 2) {
				image = down2;
				}
			break;
			
		case "left":
			if(spriteNum == 1) {
				image = left1;
				}
			if(spriteNum == 2) {
				image = left2;
				}
			break;
			
		case "right":
			if(spriteNum == 1) {
				image = right1;
				}
			if(spriteNum == 2) {
				image = right2;
				}
			break;
		}
		g2.drawImage(image, screenX, screenY, gp.tileSize,gp.tileSize, null);
		
	}
}
