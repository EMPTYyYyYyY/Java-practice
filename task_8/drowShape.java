import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Shape{
    private int x, y;
    private Color color;
    public Shape(){}
    public Shape(int x, int y, Color color){this.x = x; this.y = y; this.color = color;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

class Box extends Shape {
    private int width, height;
    public Box(){}
    public Box(int x, int y, int width, int height, Color color){
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Circle extends Shape{
    private int radius;
    public Circle(){}
    public Circle(int x, int y, int radius, Color c){
        super(x, y, c);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class TaskFrame extends Application {

    public int getRandom(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setMinSize(500,500);
        List<Shape> shapes = new ArrayList<>(Arrays.asList(new Box(), new Circle()));
        List<Color> colors = new ArrayList<>(Arrays.asList(Color.DARKMAGENTA, Color.BLACK, Color.YELLOW, Color.BLUE));
        for (int i = 0; i < 20; i++) {
            Shape figure = shapes.get(getRandom(0, shapes.size()));
            if(figure instanceof Box){
                Box b = (Box) figure;
                b.setX(getRandom(0, 1000));
                b.setY(getRandom(0, 1000));
                b.setWidth(getRandom(0, 100));
                b.setHeight(getRandom(0, 100));
                b.setColor(colors.get(getRandom(0, colors.size())));

                Rectangle rectangle = new Rectangle(b.getX(), b.getY(), b.getWidth(), b.getHeight());
                rectangle.setFill(b.getColor());
                pane.getChildren().add(rectangle);
            }
            if(figure instanceof Circle){
                Circle c = (Circle) figure;
                c.setX(getRandom(0, 1000));
                c.setY(getRandom(0, 1000));
                c.setRadius(getRandom(0, 100));
                c.setColor(colors.get(getRandom(0, colors.size())));
                javafx.scene.shape.Circle javaFxCircle = new javafx.scene.shape.Circle(c.getX(), c.getY(), c.getRadius());
                javaFxCircle.setFill(c.getColor());
                pane.getChildren().add(javaFxCircle);
            }
        }


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
}