package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Register register = new Register();

        Item book = register.getItem("Book");

        book.setName("The hobbit");

        System.out.println(book.getName());
    }
}
