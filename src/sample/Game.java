package sample;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class Game extends Application {

    Pane playfieldLayer;

    Image playerImage;
    Image enemyImage, enemyImage2, enemyImage3, enemyImage4;
    Image BG_Maze;

    protected Pacman player;

    int score = 0;
    Label scoreLabel;
    Label gameOver;
    boolean collision = false;
    boolean collision2 = false;
    Group root = new Group();
    Scene scene;
    Ghost ghost1,ghost2,ghost3,ghost4;

    
    
    @Override
    public void start(Stage primaryStage) {

        playfieldLayer = new Pane();
        gameOver = new Label();
        
        scoreLabel = new Label("Score: " + Integer.toString(score));
        scoreLabel.setLayoutX(350);
        scoreLabel.setLayoutY(25);
        scoreLabel.setScaleX(2);
        scoreLabel.setScaleY(2);
        scoreLabel.setTextFill(Color.YELLOW);
        

        // Modification possible de la taille d'affichage dans Settings
       BG_Maze = new Image ("Images/Pac-ManMaze_448x576.png");
       ImageView imageView = new ImageView (BG_Maze);
       playfieldLayer.getChildren().add(imageView);
       root.getChildren().add(playfieldLayer);
       root.getChildren().add(scoreLabel);
        scene = new Scene( root, Settings.SCENE_WIDTH, Settings.SCENE_HEIGHT, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setWidth(464);
        primaryStage.setHeight(614);
        primaryStage.show();
       
        drawRectangles();
        Dots.drawDots();
        loadGame(); 
        Ghost.updateLoc();
        Ghost.moveGhosts(ghost1, ghost2,ghost3, ghost4);
		playfieldLayer.getChildren().addAll(Entity.dots);
		playfieldLayer.getChildren().addAll(Entity.bigDots);
      

        // Boucle principale.
        AnimationTimer gameLoop = new AnimationTimer() {

            @Override
            public void handle(long now) {
				changeSpot();
                player.processController();
                Ghost.checkGhosts();
                player.move();
                boxCollide();
                dotCollide();
                Entity.checkCollisions(player,gameOver,root);
                player.updateUI();
                drawScore();
                checkGameOver();
            }
        };	
        gameLoop.start();
        
    }

    public void changeSpot() {
    	if (player.x >= 424 && (player.y >= 260 && player.y <= 297)) {
    		player.x = 24;
    		player.y = 270;
    	}
    	else if(player.x <= 24 && (player.y >= 260 && player.y <= 297)) {
    		player.x = 424;
    		player.y = 272;
    	}
    }
    
    public void checkGameOver() {
        gameOver = new Label();
        gameOver.setLayoutX(190);
        gameOver.setLayoutY(150);
        gameOver.setScaleX(2);
        gameOver.setScaleY(2);
        gameOver.setTextFill(Color.RED);
        
    	if (Entity.dots.size() == 0 && Entity.bigDots.size() == 0) {
    		gameOver.setText("WINNER");
    		player.freeze();
    		player.removeFromLayer();
    		for (Ghost ghost : Entity.enemies) {
    			ghost.removeFromLayer();
    		}
    		root.getChildren().add(gameOver);
    	}
    }
    
    public void drawRectangles() {

    	//Création des rectangles représentant le nombre de vies
    	Entity.lives = new ArrayList<Rectangle>();
    	Entity.lives.add(new Rectangle(36,548,24,24));
    	Entity.lives.add(new Rectangle(69,547,23,25));
    	for(Rectangle life : Entity.lives) {
    		life.setFill(Color.TRANSPARENT);
    	}

    	//création des murs
    	Entity.r = new ArrayList<Rectangle>();

		Entity.r.add(new Rectangle(40, 88, 48, 32)); //1
		Entity.r.add(new Rectangle(120, 88, 64, 32)); //2
		Entity.r.add(new Rectangle(264, 88, 64, 32)); //3
		Entity.r.add(new Rectangle(360, 88, 48, 32)); //4
		Entity.r.add(new Rectangle(40, 152, 48, 16)); //5
		Entity.r.add(new Rectangle(360, 152, 48, 16)); //6
		Entity.r.add(new Rectangle(120, 152, 16, 112)); //7
		Entity.r.add(new Rectangle(168, 152, 112, 16)); //8
		Entity.r.add(new Rectangle(312, 152, 16, 112)); //9
		Entity.r.add(new Rectangle(264, 200, 50, 16)); //10
		Entity.r.add(new Rectangle(134, 200, 50, 16)); //11
		Entity.r.add(new Rectangle(216, 166, 16, 50)); //12

		Entity.r.add(new Rectangle(168, 248, 40, 8)); //13
		Entity.r.add(new Rectangle(240, 248, 40, 8)); //14
		Entity.r.add(new Rectangle(168, 256, 8, 48)); //15
		Entity.r.add(new Rectangle(272, 256, 8, 48)); //16
		Entity.r.add(new Rectangle(168, 304, 112, 8)); //17

		Entity.r.add(new Rectangle(120, 296, 16, 64)); //18
		Entity.r.add(new Rectangle(312, 296, 16, 64)); //19
		Entity.r.add(new Rectangle(168, 344, 112, 16)); //20
		Entity.r.add(new Rectangle(216, 360, 16, 48)); //21
		Entity.r.add(new Rectangle(120, 392, 64, 16)); //22
		Entity.r.add(new Rectangle(264, 392, 64, 16)); //23
		Entity.r.add(new Rectangle(40, 392, 48, 16)); //24
		Entity.r.add(new Rectangle(72, 408, 16, 48)); //25
		Entity.r.add(new Rectangle(360, 392, 48, 16)); //26
		Entity.r.add(new Rectangle(360, 408, 16, 48)); //27
		Entity.r.add(new Rectangle(168, 440, 112, 16)); //28
		Entity.r.add(new Rectangle(216, 456, 16, 48)); //29
		Entity.r.add(new Rectangle(120, 440, 16, 48)); //30
		Entity.r.add(new Rectangle(40, 488, 144, 16)); //31
		Entity.r.add(new Rectangle(312, 440, 16, 48)); //32
		Entity.r.add(new Rectangle(264, 488, 144, 16)); //33

		Entity.r.add(new Rectangle(0, 48, 448, 8)); //34
		Entity.r.add(new Rectangle(216, 56, 16, 64)); //35
		Entity.r.add(new Rectangle(0, 56, 8, 144)); //36
		Entity.r.add(new Rectangle(440, 56, 8, 144)); //37

		Entity.r.add(new Rectangle(0, 200, 88, 64)); //38
		Entity.r.add(new Rectangle(360, 200, 88, 64)); //39
		Entity.r.add(new Rectangle(0, 296, 88, 64)); //40
		Entity.r.add(new Rectangle(360, 296, 88, 64)); //41

		Entity.r.add(new Rectangle(0, 360, 8, 176)); //42
		Entity.r.add(new Rectangle(8, 440, 32, 16)); //43
		Entity.r.add(new Rectangle(408, 440, 32, 16)); //44
		Entity.r.add(new Rectangle(440, 360, 8, 176)); //45
		Entity.r.add(new Rectangle(0, 536, 448, 8)); //46
		for(Rectangle block : Entity.r){
			block.setFill(Color.BLUE);
			block.setStroke(Color.BLUE);
		}
		playfieldLayer.getChildren().addAll(Entity.r);
		playfieldLayer.getChildren().addAll(Entity.lives);
    }

    private void boxCollide() { 
    	collision = false;
    	for ( Rectangle block : Entity.r) {
    		if(player.collidesWith(block)){
    			collision = true;
    			player.freeze();
    		}
    	}
    }
   
    
    Circle temp;
    Circle temp2;
  
    //Check si Pacman mange des points
    private void dotCollide() {
    	
    	collision = false;
    	collision2 = false;
    	
    	for (Circle dot : Entity.dots) {
    		if(player.collidesWith(dot)) {
    			collision = true;
    			temp = dot;
    			Dots.removeDot(dot,playfieldLayer);
    			score += 100;
    		}
    	}
    	for (Circle bigDot : Entity.bigDots) {
    		if(player.collidesWith(bigDot)) {
    			collision2 = true;
    			temp2 = bigDot;
    			Dots.removeDot(bigDot, playfieldLayer);
    			score += 500;
    			player.setSpeed(2.5);
    			Entity.superP = true;
    			new Timer().schedule(
    			        new TimerTask() {
    			            @Override
    			            public void run() {
    			                player.setSpeed(1.5);
    			                Entity.superP = false;
    			            }
    			        }, 
    			        5000 
    			);
    		}
    	}
    	if (collision2) {
    		Entity.bigDots.remove(temp2);
    	}
    	if(collision) {
            Entity.dots.remove(temp);
        }
    }

    
    private void loadGame() {
    	playerImage = new Image("Images/pacRIGHT1.png");
        enemyImage  = new Image("Images/PINK1.png" );
        enemyImage2 = new Image("Images/ORANGE1.png");
        enemyImage3 = new Image("Images/CYAN1.png");
        enemyImage4 = new Image("Images/RED1.png");

        Controller controller = new Controller(scene);

        controller.addListeners();

        Image image = playerImage;

        // Placement Pacman
        double x = (Settings.SCENE_WIDTH - image.getWidth()) / 2.0;
        double y = 412;

        player = new Pacman(playfieldLayer, image, x, y, 0, 0, 1.5, controller);
        

        Image image2 = enemyImage;
        Image image3 = enemyImage2;
        Image image4 = enemyImage3;
        Image image5 = enemyImage4;
        ghost1 = new Ghost( playfieldLayer, image2, x, 280, 0, 0);
        ghost2 = new Ghost(playfieldLayer, image3, x + 20, 280, 0, 0);
        ghost3 = new Ghost(playfieldLayer,image4, x - 20, 280, 0,0);
        ghost4 = new Ghost(playfieldLayer, image5, x, 260, 0,0);
        Animation animatePac = new EntityAnimation(
        		player.imageView, Duration.millis(10000),player,
				ghost4.imageView, ghost4,
				ghost2.imageView, ghost2,
				ghost1.imageView, ghost1,
				ghost3.imageView, ghost3);
        animatePac.setCycleCount(Animation.INDEFINITE);
        animatePac.play();

        Entity.enemies.add(ghost1);
        Entity.enemies.add(ghost2);
        Entity.enemies.add(ghost3);
        Entity.enemies.add(ghost4);

       Ghost.moveGhosts(ghost1,ghost2,ghost3,ghost4);
       //Ghost.counter[0] = 0;
    }

    public void drawScore() { 
    	scoreLabel.setText("Score: " + Integer.toString(score));
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}