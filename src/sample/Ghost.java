package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Ghost extends Entity {

    public Ghost(Pane layer, Image image, double x, double y, double dx, double dy ) {
        super(layer, image, x, y, dx, dy);
    }
    
    public void move() {

    	switch (dir){
    	case 0: dy = -1;
    			dx=0;
    			break;
    	case 1 :dy = 1;
    			dx=0;
    	break;
    	case 2 :dx = 1;
    			dy=0;
    	break;
    	case 3 :dx = -1;
    			dy=0;
    	break;
    	}

    	super.move();
    }

	public static void checkGhosts() {
		for( Rectangle r: r) {
			for( Ghost enemy: enemies) {
				if( enemy.collidesWith(r)) {
					enemy.collision2 = true;
				}
			}
		}
		moveGhostsCollides();
	}

	// Mouvement ghosts lors d'une collision avec un mur
	public static void moveGhostsCollides() {
		for( Ghost enemy: enemies) {
			if( enemy.collision2) {
				enemy.freeze();
				enemy.dir = (int)(Math.random()*4);
				enemy.collision2 = false;
			}
		}
	}

	static public void updateLoc() {

		//ghost1
		locations.add(new int[] {220,235});
		locations.add(new int[] {220,232});
		locations.add(new int[] {224,230});
		for (int i = 0; i < 15; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] - 5, 230});
		}
		for (int i = 0; i < 29; i++) {
			locations.add(new int[] {144, locations.get(locations.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 26; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] - 5, 375});
		}
		for (int i = 0; i < 8; i++) {
			locations.add(new int[] {14, locations.get(locations.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 6; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] + 5, 415});
		}
		for (int i = 0; i < 10; i++) {
			locations.add(new int[] {44, locations.get(locations.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] + 5, 465});
		}
		for (int i = 0; i < 80; i++) {
			locations.add(new int[] {94, locations.get(locations.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 20; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] + 5, 65});
		}
		for (int i = 0; i < 13; i++) {
			locations.add(new int[] {194, locations.get(locations.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 44; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] + 5, 130});
		}
		for (int i = 0; i < 10; i++) {
			locations.add(new int[] {414, locations.get(locations.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 16; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] - 5, 180});
		}
		for (int i = 0; i < 48; i++) {
			locations.add(new int[] {334, locations.get(locations.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 18; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] - 5, 420});
		}
		for (int i = 0; i < 10; i++) {
			locations.add(new int[] {244, locations.get(locations.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 10; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] + 5, 370});
		}
		for (int i = 0; i < 28; i++) {
			locations.add(new int[] {289, locations.get(locations.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 10; i++) {
			locations.add(new int[] {locations.get(locations.size() - 1)[0] - 5, 230});
		}


		//ghost2
		locations2.add(new int[] {220,235});
		locations2.add(new int[] {220,232});
		locations2.add(new int[] {224,230});
		for (int i = 0; i < 13; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] + 5, 230});
		}
		for (int i = 0; i < 28; i++) {
			locations2.add(new int[] {289, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] - 5, 370});
		}
		for (int i = 0; i < 10; i++) {
			locations2.add(new int[] {239, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 28; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] - 5, 420});
		}
		for (int i = 0; i < 9; i++) {
			locations2.add(new int[] {99, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 17; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] - 5, 465});
		}
		for (int i = 0; i < 11; i++) {
			locations2.add(new int[] {14, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 81; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] + 5, 520});
		}
		for (int i = 0; i < 11; i++) {
			locations2.add(new int[] {419, locations2.get(locations2.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 16; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] - 5, 465});
		}
		for (int i = 0; i < 80; i++) {
			locations2.add(new int[] {339, locations2.get(locations2.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 18; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] - 5, 65});
		}
		for (int i = 0; i < 14; i++) {
			locations2.add(new int[] {249, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 46; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] - 5, 135});
		}
		for (int i = 0; i < 9; i++) {
			locations2.add(new int[] {19, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i <14; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] + 5, 180});
		}
		for (int i = 0; i <18; i++) {
			locations2.add(new int[] {89, locations2.get(locations2.size() - 1)[1] + 5});
		}
		for (int i = 0; i <11; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] + 5, 270});
		}
		for (int i = 0; i < 9; i++) {
			locations2.add(new int[] {144, locations2.get(locations2.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 12; i++) {
			locations2.add(new int[] {locations2.get(locations2.size() - 1)[0] + 5, 230});
		}

		//ghost3
		locations3.add(new int[] {220,232});
		locations3.add(new int[] {224,230});
		for (int i = 0; i < 3; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 230});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {239, locations3.get(locations3.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 180});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {289, locations3.get(locations3.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 39; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] - 5, 130});
		}
		for (int i = 0; i < 13; i++) {
			locations3.add(new int[] {94, locations3.get(locations3.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 16; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] - 5, 65});
		}
		for (int i = 0; i < 22; i++) {
			locations3.add(new int[] {14, locations3.get(locations3.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 17; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 175});
		}
		for (int i = 0; i < 58; i++) {
			locations3.add(new int[] {99, locations3.get(locations3.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 17; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] - 5, 465});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {14, locations3.get(locations3.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 80; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 515});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {414, locations3.get(locations3.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 15; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] - 5, 465});
		}
		for (int i = 0; i < 57; i++) {
			locations3.add(new int[] {339, locations3.get(locations3.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 16; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 180});
		}
		for (int i = 0; i < 23; i++) {
			locations3.add(new int[] {419, locations3.get(locations3.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 35; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] - 5, 65});
		}
		for (int i = 0; i < 13; i++) {
			locations3.add(new int[] {244, locations3.get(locations3.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 20; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] - 5, 130});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {144, locations3.get(locations3.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 180});
		}
		for (int i = 0; i < 10; i++) {
			locations3.add(new int[] {194, locations3.get(locations3.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 7; i++) {
			locations3.add(new int[] {locations3.get(locations3.size() - 1)[0] + 5, 230});
		}

		//ghost4
		locations4.add(new int[] {224,230});
		for (int i = 0; i < 7; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 230});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {189, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 180});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {139, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 40; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] + 5, 130});
		}
		for (int i = 0; i < 47; i++) {
			locations4.add(new int[] {339, locations4.get(locations4.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 20; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 365});
		}
		for (int i = 0; i < 11; i++) {
			locations4.add(new int[] {239, locations4.get(locations4.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] + 5, 420});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {289, locations4.get(locations4.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 470});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {239, locations4.get(locations4.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 520});
		}
		for (int i = 0; i < 12; i++) {
			locations4.add(new int[] {189, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 460});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {139, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 410});
		}
		for (int i = 0; i < 56; i++) {
			locations4.add(new int[] {89, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 15; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 130});
		}
		for (int i = 0; i < 13; i++) {
			locations4.add(new int[] {14, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 36; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] + 5, 65});
		}
		for (int i = 0; i < 13; i++) {
			locations4.add(new int[] {194, locations4.get(locations4.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 10; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] + 5, 130});
		}
		for (int i = 0; i < 13; i++) {
			locations4.add(new int[] {244, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 19; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] + 5, 65});
		}
		for (int i = 0; i < 43; i++) {
			locations4.add(new int[] {334, locations4.get(locations4.size() - 1)[1] + 5});
		}
		for (int i = 0; i < 8; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 280});
		}
		for (int i = 0; i < 11; i++) {
			locations4.add(new int[] {294, locations4.get(locations4.size() - 1)[1] - 5});
		}
		for (int i = 0; i < 9; i++) {
			locations4.add(new int[] {locations4.get(locations4.size() - 1)[0] - 5, 225});
		}

	}

	static int [] counter = {0};
	static int [] counter2 = {0};
	static int [] counter3 = {0};
	static int [] counter4 = {0};

	public static void moveGhosts(Ghost ghost, Ghost ghost2, Ghost ghost3, Ghost ghost4) {


		Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.09), ev -> {
			if (respawn) {
				counter[0] = 0;
				respawn = false;
			}
			ghost.updateUI(locations.get(counter[0])[0], locations.get(counter[0])[1]);
			counter[0] = counter[0] + 1;
			if (counter[0] == locations.size()) {
				counter[0] = 0;

			}

		}));
		timeline.setAutoReverse(true);
		timeline.setCycleCount(Animation.INDEFINITE);


		Timeline timeline2 = new Timeline(new KeyFrame(Duration.seconds(0.09), ev -> {
			if (respawn2) {
				counter2[0] = 0;
				respawn2 = false;
			}
			ghost2.updateUI(locations2.get(counter2[0])[0], locations2.get(counter2[0])[1]);
			counter2[0] = counter2[0] + 1;
			if (counter2[0] == locations2.size()) {
				counter2[0] = 0;

			}

		}));
		timeline2.setAutoReverse(true);
		timeline2.setCycleCount(Animation.INDEFINITE);

		Timeline timeline3 = new Timeline(new KeyFrame(Duration.seconds(0.09), ev -> {
			if (respawn3) {
				counter3[0] = 0;
				respawn3 = false;
			}
			ghost3.updateUI(locations3.get(counter3[0])[0], locations3.get(counter3[0])[1]);
			counter3[0] = counter3[0] + 1;
			if (counter3[0] == locations3.size()) {
				counter3[0] = 0;

			}

		}));
		timeline3.setAutoReverse(true);
		timeline3.setCycleCount(Animation.INDEFINITE);

		Timeline timeline4 = new Timeline(new KeyFrame(Duration.seconds(0.09), ev -> {
			if (respawn4) {
				counter4[0] = 0;
				respawn4 = false;
			}
			ghost4.updateUI(locations4.get(counter4[0])[0], locations4.get(counter4[0])[1]);
			counter4[0] = counter4[0] + 1;
			if (counter4[0] == locations4.size()) {
				counter4[0] = 0;

			}

		}));
		timeline4.setAutoReverse(true);
		timeline4.setCycleCount(Animation.INDEFINITE);

		Timeline timeline8 = new Timeline(new KeyFrame(Duration.seconds(3), ev -> {
			timeline.play();
			timeline2.play();
			timeline3.play();
			timeline4.play();

		}));
		timeline8.play();

	}
}