package game;

import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;

public class Bullet extends Entity {
	public Bullet(float x, float y, int width, int height, Image sprite, boolean[][] blocked, HorizontalDirection hDir, float horizontalSpeed) {
		super(x, y, width, height, sprite, blocked, horizontalSpeed);
		this.hDir = hDir;  
	}
	
	public void render() {
		sprite.draw(pos.x, pos.y, 0.1f);
	}
	
	@Override
	public void update(int delta) {
		Vector2f trans = new Vector2f(0, 0);
		
		trans.x = horizontalSpeed * delta;
		
		if(hDir == HorizontalDirection.RIGHT)
			pos.x += trans.x;
		else
			pos.x -= trans.x;
	}

}
