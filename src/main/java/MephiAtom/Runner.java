package MephiAtom;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Book book = CreateBook();
        Library library = new Library(book);
        System.out.println(library.getLibrary());
        library.RemoveBook(book);



    }

    public static Book CreateBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите Автора");
        String input1 = scanner.nextLine();
        System.out.println("Пожалуйста введите название книги");
        String input2 = scanner.nextLine();
        System.out.println("Пожалуйста введите издательство");
        String input3 = scanner.nextLine();
        System.out.println("Пожалуйста введите раздел");
        String input4 = scanner.nextLine();
        return new Book(input1,input2,input3,input4);


    }


}
