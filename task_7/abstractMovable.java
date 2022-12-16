interface Movable {
    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();
}

class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y -= ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }

    @Override
    public String toString() {
        return String.format("X: %d, Y: %d, xSpeed: %d, ySpeed: %d", this.x, this.y, this.xSpeed, this.ySpeed);
    }
}

class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);

        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return String.format("X: %d, Y: %d, xSpeed: %d, ySpeed: %d, Radius: %d", this.center.x,
                this.center.y, this.center.xSpeed, this.center.ySpeed, this.radius);
    }
}

class MovableRect implements Movable{
    private MovablePoint topLeft, bottomRight;

    public MovableRect(int x, int y, int x1, int y1, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x, y, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }

}

class TaskMovable {
    public static void main(String[] args) {

    }
}