
package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Serie extends SuperObject{

	public OBJ_Serie() {
		this.name = "Serie";
		
		try {
			this.image = ImageIO.read((getClass().getResourceAsStream("/objects/heart_blank.png")));
		}catch(IOException e) {
			e.printStackTrace();
		}
               collision = true;
	}
	
	
}
