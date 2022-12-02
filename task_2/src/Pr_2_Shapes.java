import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Shape{
    public int[] parameters;
    private String name;

    public Shape(String name, int... parameters){
        this.name = name;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public int[] getParameters() { // длинна сторон
        return parameters;
    }

    @Override
    public String toString() {
        String ret = "Тип фигуры: " + this.getName() + " | Стороны: ";

        for (int i = 0; i < this.getParameters().length; i++) {
            ret += this.getParameters()[i];
            if(i != this.getParameters().length-1){
                ret += ",";
            }
        }
        return ret;
    }
}

class TestShapes{
    public TestShapes(){}
    public void doTest(){
        int[] paramsTriangle = new int[3]; // треугольник
        for (int i = 1; i <= paramsTriangle.length; i++) {
            paramsTriangle[i-1] = new Random().nextInt(100);
        }
        System.out.println(new Shape("Треугольник", paramsTriangle).toString());

        int[] paramsSquare = new int[4]; // кедрет
        for (int i = 1; i <= paramsSquare.length; i++) {
            paramsSquare[i-1] = new Random().nextInt(100);
        }
        System.out.println(new Shape("Квадрат", paramsSquare).toString());
    }
}

class TaskShape {
    public static void main(String[] args) {
        new TestShapes().doTest();
    }
}