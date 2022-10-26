package object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import main.GamePainel;


public class SuperObject {

	public BufferedImage image;
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
	public int solidAreaDefaultX = 0;
	public int solidAreaDefaultY = 0;
	
	public void draw(Graphics2D g2, GamePainel gp) {
		int screenX = worldX - gp.player.worldX + gp.player.screenX; //players position is always on the center on the screen -> 0-0 tile is really in different place since it's outside of our game window, so we need to do some offsetting.
		int screenY = worldY - gp.player.worldY + gp.player.screenY;
		
		//Drawing images while we move to render with better performance
		if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX && 
			worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
			worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
			worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
			g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
		}
	}
	
	
}

