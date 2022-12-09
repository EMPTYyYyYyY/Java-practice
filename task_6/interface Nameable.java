interface Nameable{
    String getName();
}

class Book implements Nameable{
    private String name;
    public Book(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
}

class TaskNameable {
    public static void main(String[] args) {
        Book b = new Book("Война и мир");
        System.out.print(String.format("Имя книги: %s\n", b.getName()));
    }
}