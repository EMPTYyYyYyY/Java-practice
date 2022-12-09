class Ball{
    private double x = 0, y = 0;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.setXY(this.getX() + xDisp, this.getY() + yDisp);
    }

    @Override
    public String toString() {
        return String.format("X: %.3f, Y: %.3f", this.getX(), this.getY());
    }
}

class TestBall{
    public void doTest(){
        Ball b = new Ball();
        b.setXY(0, 0);
        System.out.println(b.toString());
        b.move(5, 3);
        System.out.println(b.toString());
        b.move(-10, -20);
        System.out.println(b.toString());
    }
}

class TaskBall {
    public static void main(String[] args) {
        new TestBall().doTest();
    }
}