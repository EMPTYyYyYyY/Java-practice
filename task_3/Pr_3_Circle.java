class Circle{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class TestCircle{
    public static void main(String[] args) {
        Circle c = new Circle(123);
        System.out.printf("Радиус окружности: %d\n", c.getRadius());
        c.setRadius(321);
        System.out.printf("Новый радиус окружности: %d", c.getRadius());
    }
}