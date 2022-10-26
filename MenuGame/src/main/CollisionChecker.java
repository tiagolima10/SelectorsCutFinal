
package main;

import entity.Entity;

public class CollisionChecker {
    
    GamePainel gp;
	
	public CollisionChecker(GamePainel gp) {
		this.gp = gp;
	}
	
	public void checkTile(Entity entity) {
		
		int entityLeftWorldX = entity.worldX + entity.solidArea.x + 25;
		int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
		int entityTopWorldY = entity.worldY + entity.solidArea.y +25;
		int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;
                
     
                int entityLeftCol = entityLeftWorldX/gp.tileSize;
		int entityRightCol = entityRightWorldX/gp.tileSize;
		int entityTopRow = entityTopWorldY/gp.tileSize;
		int entityBottomRow = entityBottomWorldY/gp.tileSize;
		
		int tileNumber1, tileNumber2;
                
                switch(entity.direction) {
			
		case "up":
			entityTopRow = (entityTopWorldY - entity.speed)/gp.tileSize;
			tileNumber1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow]; //left side
			tileNumber2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow]; //right side
				if(gp.tileM.tile[tileNumber1].collision == true || gp.tileM.tile[tileNumber2].collision == true) {
					entity.collisionOn=true;
				}
			break;      
                        
                        case "down":
			entityBottomRow = (entityBottomWorldY - entity.speed)/gp.tileSize;
			tileNumber1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow]; //left side
			tileNumber2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow]; //right side
				if(gp.tileM.tile[tileNumber1].collision == true || gp.tileM.tile[tileNumber2].collision == true) {
					entity.collisionOn=true;
				}
			
			break;
		case "left":
			
			entityLeftCol = (entityLeftWorldX - entity.speed)/gp.tileSize;
			tileNumber1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow]; //left side
			tileNumber2 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow]; //right side
				if(gp.tileM.tile[tileNumber1].collision == true || gp.tileM.tile[tileNumber2].collision == true) {
					entity.collisionOn=true;
				}
			
			break;
		case "right":
			entityRightCol = (entityRightWorldX - entity.speed)/gp.tileSize;
			tileNumber1 = gp.tileM.mapTileNum[entityRightCol][entityTopRow]; //left side
			tileNumber2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow]; //right side
				if(gp.tileM.tile[tileNumber1].collision == true || gp.tileM.tile[tileNumber2].collision == true) {
					entity.collisionOn=true;
				}
			break;
                }
		}
                
               public int checkObject(Entity entity, boolean player) {
		//Check if player is hitting any object, if so, we return index of the object
		int index = 999;
		
		for(int i = 0; i < gp.obj.length; i++) {
			//analisar objects array
                if(gp.obj[i]!=null){
              entity.solidArea.x = entity.worldX + entity.solidArea.x;
	      entity.solidArea.y = entity.worldY + entity.solidArea.y;
              
              gp.obj[i].solidArea.x = gp.obj[i].worldX + gp.obj[i].solidArea.x;
              gp.obj[i].solidArea.y = gp.obj[i].worldY + gp.obj[i].solidArea.y;
              
                switch(entity.direction) {
				
				case "up":
					entity.solidArea.y -= entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
                                                        System.out.println("up collsion");
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				case "down":
					entity.solidArea.y += entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true; 
                                                        System.out.println("down collsion");
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				case "left":
					entity.solidArea.x -= entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
                                                         System.out.println("left collsion");
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				case "right":
					entity.solidArea.x += entity.speed;
					if(entity.solidArea.intersects(gp.obj[i].solidArea)) {
						if(gp.obj[i].collision == true) {
							entity.collisionOn = true;
                                                         System.out.println("right collsion");
						}
						if(player == true) {
							index = i;
						}
					}
					break;
				
				}
				entity.solidArea.x = entity.solidAreaDefaultX;
				entity.solidArea.y = entity.solidAreaDefaultY;
				gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
				gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
			}
                
                
                
                
                }
            
         return index;   
               }
              }

