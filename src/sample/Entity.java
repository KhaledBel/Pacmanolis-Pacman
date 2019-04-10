package sample;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public abstract class Entity {

    protected Image image;
    protected ImageView imageView;
    static protected Pane layer;
    protected double x;
    protected double y;
    protected double dx;
    protected double dy;
    protected double w;
    protected double h;
    protected double frameWidth = 20;
    protected double frameHeight = 20;
    int dir = 0;
    static protected boolean collision = false;
    static protected boolean collision2 = false;

    protected static ArrayList<Ghost> enemies = new ArrayList<>();
    protected static ArrayList<Rectangle> r;
    static ArrayList<int []> locations = new ArrayList<int []>();
    static ArrayList<int []> locations2 = new ArrayList<int []>();
    static ArrayList<int []> locations3 = new ArrayList<int []>();
    static ArrayList<int []> locations4 = new ArrayList<int []>();

    static ArrayList<Circle> dots;
    static ArrayList<Circle> bigDots;
    static ArrayList<Rectangle> lives;

    static int checkIt = -1;

    static int totalLife = 2; //total lives

    static boolean respawn = false, respawn2 = false, respawn3 = false, respawn4 = false;
    static boolean superP = false;

    public Entity(Pane layer, Image image, double x, double y, double dx, double dy) {

        this.layer = layer;
        this.image = image;
        this.x = x;
        this.y = y;

        this.dx = dx;
        this.dy = dy;

        this.imageView = new ImageView(image);
        this.imageView.relocate(x, y);

        this.w = image.getWidth();
        this.h = image.getHeight();

        addToLayer();
    }
    

    public void move() {
        x += dx;
        y += dy;
    }

public boolean collidesWith(Rectangle block) {
		return (block.intersects(x, y, frameWidth, frameHeight)); 

}

public boolean collidesWith(Circle dot) {
	return (dot.intersects(x, y, frameWidth, frameHeight)); 

}

public void freeze() {
		x -= dx;
		y -= dy;
	}

    public void updateUI() {
        imageView.relocate(x, y);
    }
    
    public void updateUI(double x, double y) {
    	this.x = x;
    	this.y = y;
        imageView.relocate(x, y);
    }
    


    public boolean collidesWith( Entity otherEntity) {
        return ( otherEntity.x + otherEntity.w >= x && otherEntity.y + otherEntity.h >= y && otherEntity.x <= x + w && otherEntity.y <= y + h);
    }
    
    public void addToLayer() {
        this.layer.getChildren().add(this.imageView);
    }

    public void removeFromLayer() {
        this.layer.getChildren().remove(this.imageView);
    }

    public double getCenterX() {
        return x + w * 0.5;
    }

    public double getCenterY() {
        return y + h * 0.5;
    }

    static protected void checkCollisions(Pacman player, Label gameOver, Group root) {
        collision = false;
        for( Ghost enemy: Entity.enemies) {
            if (enemy == (Entity.enemies.get(0))) {
                checkIt = 0;
            }
            if (enemy == (Entity.enemies.get(1))) {
                checkIt = 1;
            }
            if (enemy == (Entity.enemies.get(2))) {
                checkIt = 2;
            }
            if (enemy == (Entity.enemies.get(3))) {
                checkIt = 3;
            }
            if( player.collidesWith(enemy)) {
                if (!superP) {
                    respawn = true;
                    respawn2 = true;
                    respawn3 = true;
                    respawn4 = true;
                    collision = true;
                    player.freeze();
                    player.x = 0;
                    player.y = 0;
                    totalLife -= 1;
                    if (totalLife == -1) {

                        gameOver = new Label();
                        gameOver.setLayoutX(190);
                        gameOver.setLayoutY(150);
                        gameOver.setScaleX(2);
                        gameOver.setScaleY(2);
                        gameOver.setTextFill(Color.RED);
                        gameOver.setText("GAME OVER");
                        player.freeze();
                        player.removeFromLayer();

                        for (Ghost ghost : Entity.enemies) {
                            ghost.removeFromLayer();
                        }
                        for (Circle dot : dots) {
                            Dots.removeDot(dot, layer);
                        }
                        for(Circle bigDot : bigDots) {
                            Dots.removeDot(bigDot, layer);
                        }
                        root.getChildren().add(gameOver);
                        break;
                    }
                    lives.get(totalLife).setFill(Color.BLACK);


                    player.updateUI(225,412);
                    player.dx = 0;
                    player.dy = 0;

                    break;
                }
                else if (superP) {
                    collision = true;
                    enemy.updateUI(200,280);
                    if (checkIt == 0) {
                        respawn = true;
                    }
                    if(checkIt == 1) {
                        respawn2 = true;
                    }
                    if (checkIt == 2) {
                        respawn3 = true;
                    }
                    if (checkIt == 3) {
                        respawn4 = true;
                    }
                }

            }
        }

    }
    
}