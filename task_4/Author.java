class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return String.format("Имя: %s, E-mail: %s, Gender: %c", this.getName(), this.getEmail(), this.getGender());
    }

}

class TestAuthor{
    public void doTest(){
        Author author = new Author("Иван", "asdasd@mail.ru", 'M');
        System.out.println(author.toString());
    }
}

class TaskAuthor {
    public static void main(String[] args) {
        new TestAuthor().doTest();
    }
}