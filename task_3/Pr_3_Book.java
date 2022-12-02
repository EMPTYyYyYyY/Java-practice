class Book{
    private String name;
    private String author;
    private int creationDate;
    public Book(String name, String author, int creationDate){
        this.name = name;
        this.author = author;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }
}

class TestBook{
    public static void main(String[] args) {
        Book b = new Book("Война и мир", "Лев Толстой", 1869);
        System.out.printf("Название книги: %s\nАвтор: %s\nГод написания: %d", b.getName(), b.getAuthor(), b.getCreationDate());
    }
}

class TaskBook {
    public static void main(String[] args) {
        TestBook.main(args);
    }
}