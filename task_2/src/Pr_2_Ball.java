import java.util.Random;

class Ball{
    private int radius;
    public Ball(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Радиус мяча: " + this.getRadius();
    }
}

class TestBall{
    public TestBall(){}
    public void doTest(){
        for (int i = 0; i < 10; i++) {
            System.out.println(new Ball(new Random().nextInt(10)).toString());
        }
    }
}

class TaskBall {
    public static void main(String[] args) {
        new TestBall().doTest();
    }
}