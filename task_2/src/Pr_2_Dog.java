import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Dog{
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge(){ return this.getAge()*7;}

    @Override
    public String toString() {
        return String.format("Кличка: %s, Возраст: %d, Человеческий возраст: %d", this.getName(), this.getAge(), this.toHumanAge());
    }
}

class TestDog{
    public TestDog(){}
    public void doTest(){
        Dog[] arr = new Dog[]{
                new Dog("Барбос", 8),
                new Dog("Дружок", 2),
                new Dog("Шарик", 5)
        };
        Arrays.stream(arr).forEach(d -> System.out.println(d.toString()));
    }
}

class TaskDog {
    public static void main(String[] args) {
        new TestDog().doTest();
    }
}