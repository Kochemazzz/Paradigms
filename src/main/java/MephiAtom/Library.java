package MephiAtom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Library{
    private List<Book> library;
    public Library(Book book) {
        library = new ArrayList<>();
        library.add(book);
    }
    public List<Book> getLibrary() {
        return library;
    }
    public void setLibrary(List<Book> library) {
        this.library = library;
    }
    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }

    public void RemoveBook(Book book){
        if (library.contains(book)){
            library.remove(book);
        }
        else {
            System.out.println("Книги нету в библиотеке");
        }
    }


}
