
package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Key extends SuperObject{

	public OBJ_Key() {
		this.name = "Filme";
		
		try {
			this.image = ImageIO.read((getClass().getResourceAsStream("/objects/coração.png")));
		}catch(IOException e) {
			e.printStackTrace();
		}
               collision = true;
	}
	
	
}
