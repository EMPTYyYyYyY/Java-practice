import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Leg{
    private int lenght;
    public Leg(int lenght){
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}

class Head{
    private int iq;
    public Head(int iq){this.iq = iq;}

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
class Body{
    private int lenght;
    public Body(int lenght){this.lenght = lenght;}

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}

class Human{
    private Body body;
    private List<Leg> legs;
    private int weight;
    private Head head;
    public Human(int weight, int legsSize, int bodyLenght){
        this.weight = weight;
        this.legs = new ArrayList<>(Arrays.asList(new Leg(legsSize), new Leg(legsSize)));
        this.body = new Body(bodyLenght);
        this.head = new Head(120);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }
}

class TestHuman{
    public void doTest(){
        Human human = new Human(70, 60, 40);
        System.out.printf("Вес человека: %d\n", human.getWeight());
        System.out.printf("Кол-во ног человека: %d\n", human.getLegs().size());
        System.out.printf("Длина ног человека: %d\n", human.getLegs().get(0).getLenght());
        System.out.printf("Длина тела человека: %d\n", human.getBody().getLenght());
        System.out.printf("IQ человека: %d", human.getHead().getIq());
    }
}

class TaskHuman {
    public static void main(String[] args) {
        new TestHuman().doTest();
    }
}