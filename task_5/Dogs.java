import java.util.ArrayList;
import java.util.List;

enum Type{
    SHEPHERD, DACHSHUND
}

abstract class Dog{
    private Type dogType;
    public Dog(Type dogType){this.dogType = dogType;}

    public Type getDogType() {
        return dogType;
    }
}

class Shepherd extends Dog{
    public Shepherd(){
        super(Type.SHEPHERD);
    }
}
class Dachshund extends Dog{
    public Dachshund(){
        super(Type.DACHSHUND);
    }
}

class TaskDogs {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Shepherd());
        dogs.add(new Dachshund());
        dogs.stream().forEach(d -> System.out.println("Тип собаки: " + d.getDogType().name()));
    }
}