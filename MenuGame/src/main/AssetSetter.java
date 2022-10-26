
package main;

import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Serie;



public class AssetSetter {
    
    GamePainel gp;
	
	public AssetSetter(GamePainel gp) {
		this.gp = gp;
}

public void setObject() {
		
		this.gp.obj[0] = new OBJ_Key();
		this.gp.obj[0].worldX = 10 * gp.tileSize;
		this.gp.obj[0].worldY = 9 * gp.tileSize;
                
                this.gp.obj[1] = new OBJ_Door();
		this.gp.obj[1].worldX = 23 * gp.tileSize;
		this.gp.obj[1].worldY = 28 * gp.tileSize;
                
                this.gp.obj[2] = new OBJ_Serie();
		this.gp.obj[2].worldX = 39 * gp.tileSize;
		this.gp.obj[2].worldY = 10 * gp.tileSize;
              
               
}
}
