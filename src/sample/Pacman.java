package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class Pacman extends Entity {

    private Controller controller;
    private double speed;
    protected int movement;
    
    public Pacman(Pane layer, Image image, double x, double y, double dx, double dy, double speed, Controller controller) {

        super(layer, image, x, y,  dx, dy);

        this.speed = speed;
        this.controller = controller;

    }

    public void setSpeed(double speed) {
    	this.speed = speed;
    }

    
    public void processController() {

        if( controller.isMoveUp()) {
        	movement = 1;
        	dx = 0;
            dy = -speed;
            
        } else if( controller.isMoveDown()) {
        	movement = 2;
            dy = speed;
            dx = 0;
        }
        
        if( controller.isMoveLeft()) {
        	movement = 3;
            dx = -speed;
            dy = 0;
          
        } else if( controller.isMoveRight()) {
        	movement = 4;
            dx = speed;
            dy = 0;
        } 


        
    }

    @Override
    public void move() {
        super.move();
        
        checkBounds();
    }

    private void checkBounds() {

        if( y < 0 ) {
            y = 0;
        } else if( (y+h) > Settings.SCENE_HEIGHT ) {
            y = Settings.SCENE_HEIGHT-h;
        }

        if( x < 0) {
            x = 0;
        } else if( (x+w) > Settings.SCENE_WIDTH ) {
            x = Settings.SCENE_WIDTH-w;
        }
    }

}