package MephiAtom;
import java.util.Objects;
public class Book {
    private String Author;
    private String NameBook;
    private String PublishingHouse;
    private String Chapter;
    public Book(String Autor, String NameBook, String PublishingHouse, String chapter) {
        this.Author = Autor;
        this.NameBook = NameBook;
        this.PublishingHouse = PublishingHouse;
        Chapter = chapter;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public String getNameBook() {
        return NameBook;
    }
    public void setNameBook(String nameBook) {
        NameBook = nameBook;
    }
    public String getPublishingHouse() {
        return PublishingHouse;
    }
    public void setPublishingHouse(String publishingHouse) {
        PublishingHouse = publishingHouse;
    }
    public String getChapter() {
        return Chapter;
    }
    public void setChapter(String chapter) {
        Chapter = chapter;
    }
    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", NameBook='" + NameBook + '\'' +
                ", PublishingHouse='" + PublishingHouse + '\'' +
                ", Chapter='" + Chapter + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(Author, book.Author) && Objects.equals(NameBook, book.NameBook) && Objects.equals(PublishingHouse, book.PublishingHouse) && Objects.equals(Chapter, book.Chapter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(Author, NameBook, PublishingHouse, Chapter);
    }
}
