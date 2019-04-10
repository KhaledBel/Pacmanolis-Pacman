package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class Dots extends Entity {

    public Dots(Pane layer, Image image, double x, double y, double dx, double dy) {
        super(layer, image, x, y, dx, dy);
    }

    static public void drawDots() {
        dots = new ArrayList<Circle>();
        bigDots = new ArrayList<Circle>();

        bigDots.add(new Circle(20, 75, 7, Color.YELLOW));
        bigDots.add(new Circle(426, 75, 7, Color.YELLOW));
        bigDots.add(new Circle(20, 525, 7, Color.YELLOW));
        bigDots.add(new Circle(425, 525, 7, Color.YELLOW));


        dots.add(new Circle(20, 95, 4, Color.YELLOW));
        dots.add(new Circle(20, 115, 4, Color.YELLOW));
        dots.add(new Circle(20, 135, 4, Color.YELLOW));
        dots.add(new Circle(20, 155, 4, Color.YELLOW));
        dots.add(new Circle(20, 180, 4, Color.YELLOW));
        dots.add(new Circle(20, 375, 4, Color.YELLOW));
        dots.add(new Circle(20, 395, 4, Color.YELLOW));
        dots.add(new Circle(20, 415, 4, Color.YELLOW));
        dots.add(new Circle(20, 470, 4, Color.YELLOW));
        dots.add(new Circle(20, 490, 4, Color.YELLOW));
        dots.add(new Circle(20, 507, 4, Color.YELLOW));

        dots.add(new Circle(40, 75, 4, Color.YELLOW));
        dots.add(new Circle(60, 75, 4, Color.YELLOW));
        dots.add(new Circle(80, 75, 4, Color.YELLOW));
        dots.add(new Circle(100, 75, 4, Color.YELLOW));
        dots.add(new Circle(120, 75, 4, Color.YELLOW));
        dots.add(new Circle(140, 75, 4, Color.YELLOW));
        dots.add(new Circle(160, 75, 4, Color.YELLOW));
        dots.add(new Circle(180, 75, 4, Color.YELLOW));
        dots.add(new Circle(200, 75, 4, Color.YELLOW));
        dots.add(new Circle(200, 95, 4, Color.YELLOW));
        dots.add(new Circle(200, 115, 4, Color.YELLOW));
        dots.add(new Circle(250, 95, 4, Color.YELLOW));
        dots.add(new Circle(250, 115, 4, Color.YELLOW));
        dots.add(new Circle(250, 75, 4, Color.YELLOW));
        dots.add(new Circle(270, 75, 4, Color.YELLOW));
        dots.add(new Circle(290, 75, 4, Color.YELLOW));
        dots.add(new Circle(310, 75, 4, Color.YELLOW));
        dots.add(new Circle(330, 75, 4, Color.YELLOW));
        dots.add(new Circle(350, 75, 4, Color.YELLOW));
        dots.add(new Circle(370, 75, 4, Color.YELLOW));
        dots.add(new Circle(390, 75, 4, Color.YELLOW));
        dots.add(new Circle(410, 75, 4, Color.YELLOW));
        dots.add(new Circle(40, 75, 4, Color.YELLOW));


        dots.add(new Circle(425, 95, 4, Color.YELLOW));
        dots.add(new Circle(425, 95, 4, Color.YELLOW));
        dots.add(new Circle(425, 115, 4, Color.YELLOW));
        dots.add(new Circle(425, 135, 4, Color.YELLOW));
        dots.add(new Circle(425, 155, 4, Color.YELLOW));
        dots.add(new Circle(425, 175, 4, Color.YELLOW));
        dots.add(new Circle(425, 375, 4, Color.YELLOW));
        dots.add(new Circle(425, 395, 4, Color.YELLOW));
        dots.add(new Circle(425, 470, 4, Color.YELLOW));
        dots.add(new Circle(425, 490, 4, Color.YELLOW));
        dots.add(new Circle(425, 507, 4, Color.YELLOW));

        dots.add(new Circle(40, 135, 4, Color.YELLOW));
        dots.add(new Circle(60, 135, 4, Color.YELLOW));
        dots.add(new Circle(80, 135, 4, Color.YELLOW));
        dots.add(new Circle(100, 135, 4, Color.YELLOW));
        dots.add(new Circle(120, 135, 4, Color.YELLOW));
        dots.add(new Circle(140, 135, 4, Color.YELLOW));
        dots.add(new Circle(160, 135, 4, Color.YELLOW));
        dots.add(new Circle(180, 135, 4, Color.YELLOW));
        dots.add(new Circle(200, 135, 4, Color.YELLOW));
        dots.add(new Circle(220, 135, 4, Color.YELLOW));
        dots.add(new Circle(240, 135, 4, Color.YELLOW));
        dots.add(new Circle(260, 135, 4, Color.YELLOW));
        dots.add(new Circle(280, 135, 4, Color.YELLOW));
        dots.add(new Circle(300, 135, 4, Color.YELLOW));
        dots.add(new Circle(320, 135, 4, Color.YELLOW));
        dots.add(new Circle(340, 135, 4, Color.YELLOW));
        dots.add(new Circle(360, 135, 4, Color.YELLOW));
        dots.add(new Circle(380, 135, 4, Color.YELLOW));
        dots.add(new Circle(400, 135, 4, Color.YELLOW));

        dots.add(new Circle(40, 180, 4, Color.YELLOW));
        dots.add(new Circle(60, 180, 4, Color.YELLOW));
        dots.add(new Circle(80, 180, 4, Color.YELLOW));
        dots.add(new Circle(100, 180, 4, Color.YELLOW));
        dots.add(new Circle(100, 160, 4, Color.YELLOW));
        dots.add(new Circle(155, 185, 4, Color.YELLOW));
        dots.add(new Circle(175, 185, 4, Color.YELLOW));
        dots.add(new Circle(195, 185, 4, Color.YELLOW));
        dots.add(new Circle(155, 160, 4, Color.YELLOW));
        dots.add(new Circle(295, 160, 4, Color.YELLOW));
        dots.add(new Circle(255, 185, 4, Color.YELLOW));
        dots.add(new Circle(275, 185, 4, Color.YELLOW));
        dots.add(new Circle(295, 185, 4, Color.YELLOW));
        dots.add(new Circle(340, 160, 4, Color.YELLOW));

        dots.add(new Circle(100, 95, 4, Color.YELLOW));
        dots.add(new Circle(100, 115, 4, Color.YELLOW));
        dots.add(new Circle(100, 200, 4, Color.YELLOW));
        dots.add(new Circle(100, 220, 4, Color.YELLOW));
        dots.add(new Circle(100, 240, 4, Color.YELLOW));
        dots.add(new Circle(100, 260, 4, Color.YELLOW));
        dots.add(new Circle(100, 280, 4, Color.YELLOW));
        dots.add(new Circle(100, 300, 4, Color.YELLOW));
        dots.add(new Circle(100, 320, 4, Color.YELLOW));
        dots.add(new Circle(100, 340, 4, Color.YELLOW));
        dots.add(new Circle(100, 360, 4, Color.YELLOW));
        dots.add(new Circle(100, 380, 4, Color.YELLOW));
        dots.add(new Circle(100, 400, 4, Color.YELLOW));
        dots.add(new Circle(100, 420, 4, Color.YELLOW));
        dots.add(new Circle(100, 440, 4, Color.YELLOW));
        dots.add(new Circle(100, 460, 4, Color.YELLOW));

        dots.add(new Circle(80, 470, 4, Color.YELLOW));
        dots.add(new Circle(60, 470, 4, Color.YELLOW));
        dots.add(new Circle(40, 470, 4, Color.YELLOW));
        dots.add(new Circle(150, 450, 4, Color.YELLOW));
        dots.add(new Circle(150, 470, 4, Color.YELLOW));
        dots.add(new Circle(170, 470, 4, Color.YELLOW));
        dots.add(new Circle(190, 470, 4, Color.YELLOW));
        dots.add(new Circle(300, 450, 4, Color.YELLOW));
        dots.add(new Circle(300, 470, 4, Color.YELLOW));
        dots.add(new Circle(280, 470, 4, Color.YELLOW));
        dots.add(new Circle(260, 470, 4, Color.YELLOW));
        dots.add(new Circle(250, 490, 4, Color.YELLOW));
        dots.add(new Circle(200, 490, 4, Color.YELLOW));

        dots.add(new Circle(40, 525, 4, Color.YELLOW));
        dots.add(new Circle(60, 525, 4, Color.YELLOW));
        dots.add(new Circle(80, 525, 4, Color.YELLOW));
        dots.add(new Circle(100, 525, 4, Color.YELLOW));
        dots.add(new Circle(120, 525, 4, Color.YELLOW));
        dots.add(new Circle(140, 525, 4, Color.YELLOW));
        dots.add(new Circle(160, 525, 4, Color.YELLOW));
        dots.add(new Circle(180, 525, 4, Color.YELLOW));
        dots.add(new Circle(200, 525, 4, Color.YELLOW));
        dots.add(new Circle(220, 525, 4, Color.YELLOW));
        dots.add(new Circle(240, 525, 4, Color.YELLOW));
        dots.add(new Circle(260, 525, 4, Color.YELLOW));
        dots.add(new Circle(280, 525, 4, Color.YELLOW));
        dots.add(new Circle(300, 525, 4, Color.YELLOW));
        dots.add(new Circle(320, 525, 4, Color.YELLOW));
        dots.add(new Circle(340, 525, 4, Color.YELLOW));
        dots.add(new Circle(360, 525, 4, Color.YELLOW));
        dots.add(new Circle(380, 525, 4, Color.YELLOW));
        dots.add(new Circle(400, 525, 4, Color.YELLOW));

        dots.add(new Circle(120, 425, 4, Color.YELLOW));
        dots.add(new Circle(140, 425, 4, Color.YELLOW));
        dots.add(new Circle(160, 425, 4, Color.YELLOW));
        dots.add(new Circle(180, 425, 4, Color.YELLOW));
        dots.add(new Circle(200, 425, 4, Color.YELLOW));
        dots.add(new Circle(240, 425, 4, Color.YELLOW));
        dots.add(new Circle(260, 425, 4, Color.YELLOW));
        dots.add(new Circle(280, 425, 4, Color.YELLOW));
        dots.add(new Circle(300, 425, 4, Color.YELLOW));
        dots.add(new Circle(320, 425, 4, Color.YELLOW));
        dots.add(new Circle(340, 425, 4, Color.YELLOW));

        dots.add(new Circle(390, 425, 4, Color.YELLOW));
        dots.add(new Circle(410, 425, 4, Color.YELLOW));
        dots.add(new Circle(425, 415, 4, Color.YELLOW));
        dots.add(new Circle(390, 445, 4, Color.YELLOW));

        dots.add(new Circle(340, 95, 4, Color.YELLOW));
        dots.add(new Circle(340, 115, 4, Color.YELLOW));
        dots.add(new Circle(340, 185, 4, Color.YELLOW));
        dots.add(new Circle(340, 205, 4, Color.YELLOW));
        dots.add(new Circle(340, 225, 4, Color.YELLOW));
        dots.add(new Circle(340, 245, 4, Color.YELLOW));
        dots.add(new Circle(340, 265, 4, Color.YELLOW));
        dots.add(new Circle(340, 285, 4, Color.YELLOW));
        dots.add(new Circle(340, 305, 4, Color.YELLOW));
        dots.add(new Circle(340, 325, 4, Color.YELLOW));
        dots.add(new Circle(340, 345, 4, Color.YELLOW));
        dots.add(new Circle(340, 365, 4, Color.YELLOW));
        dots.add(new Circle(340, 385, 4, Color.YELLOW));
        dots.add(new Circle(340, 405, 4, Color.YELLOW));
        dots.add(new Circle(340, 425, 4, Color.YELLOW));
        dots.add(new Circle(340, 445, 4, Color.YELLOW));
        dots.add(new Circle(340, 465, 4, Color.YELLOW));

        dots.add(new Circle(360, 470, 4, Color.YELLOW));
        dots.add(new Circle(380, 470, 4, Color.YELLOW));
        dots.add(new Circle(400, 470, 4, Color.YELLOW));

        dots.add(new Circle(40, 375, 4, Color.YELLOW));
        dots.add(new Circle(60, 375, 4, Color.YELLOW));
        dots.add(new Circle(80, 375, 4, Color.YELLOW));

        dots.add(new Circle(40, 425, 4, Color.YELLOW));
        dots.add(new Circle(60, 425, 4, Color.YELLOW));
        dots.add(new Circle(60, 445, 4, Color.YELLOW));

        dots.add(new Circle(405, 375, 4, Color.YELLOW));
        dots.add(new Circle(385, 375, 4, Color.YELLOW));
        dots.add(new Circle(365, 375, 4, Color.YELLOW));
        dots.add(new Circle(310, 375, 4, Color.YELLOW));
        dots.add(new Circle(290, 375, 4, Color.YELLOW));
        dots.add(new Circle(270, 375, 4, Color.YELLOW));
        dots.add(new Circle(250, 375, 4, Color.YELLOW));
        dots.add(new Circle(250, 395, 4, Color.YELLOW));
        dots.add(new Circle(200, 375, 4, Color.YELLOW));
        dots.add(new Circle(200, 395, 4, Color.YELLOW));
        dots.add(new Circle(180, 375, 4, Color.YELLOW));
        dots.add(new Circle(160, 375, 4, Color.YELLOW));
        dots.add(new Circle(140, 375, 4, Color.YELLOW));
        dots.add(new Circle(120, 375, 4, Color.YELLOW));

        dots.add(new Circle(405, 185, 4, Color.YELLOW));
        dots.add(new Circle(385, 185, 4, Color.YELLOW));
        dots.add(new Circle(365, 185, 4, Color.YELLOW));


    }

    static public void removeDot(Circle dot, Pane layer) {
        layer.getChildren().remove(dot);
    }


}
