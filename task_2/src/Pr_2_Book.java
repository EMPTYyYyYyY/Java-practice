class Book{
    private String name, author;
    private int pages;

    public Book(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return String.format("Книга: %s, Автор: %s, Кол-во страниц: %d", this.getName(), this.getAuthor(), this.getPages());
    }
}

class TestBook{
    public TestBook(){}
    public void doTest(){
        Book book = new Book("Война и мир", "Лев Толстой", 1274 );
        System.out.println(book.toString());
    }
}

class TaskBook {
    public static void main(String[] args) {
        new TestBook().doTest();
    }
}