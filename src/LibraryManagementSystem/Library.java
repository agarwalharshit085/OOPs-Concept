package LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;

class LibraryItem
{
    int id;
    String title;
    String author;
    int publicationYear;
    boolean available;

    LibraryItem(int id, String title, String author, int publicationYear, boolean available)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
    }
    void checkOut(){
        available = false;
    }
    void returnItem(){
        available = true;
    }
    boolean isAvailable(){
        return available;
    }
    String getDetails(){
        return title + " " + author + " " + publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
}

class Book extends LibraryItem
{
    String ISBN;
    String genre;
    int pages;

    Book(int id, String title, String author, int publicationYear, boolean available, String ISBN, String genre, int pages)
    {
        super(id, title, author,  publicationYear, available);
        this.ISBN = ISBN;
        this.genre = genre;
        this.pages = pages;
    }
    String getGenre(){
        return genre;
    }
    int getPagesCount(){
        return pages;
    }
}
class Journal extends LibraryItem
{
    String ISSN;
    int volume;
    int issueNumber;

    Journal(int id, String title, String author, int publicationYear, boolean available, String ISSN, int volume, int issueNumber) {
        super(id, title, author, publicationYear, available);
        this.ISSN = ISSN;
        this.volume = volume;
        this.issueNumber = issueNumber;
    }

    int getVolume(){
        return volume;
    }
    int getIssueNumber(){
        return issueNumber;
    }
}
class DVD extends LibraryItem
{
    int duration;
    String format;
    String regionCode;

    DVD(int id, String title, String author, int publicationYear, boolean available, int duration, String format, String regionCode) {
        super(id, title, author, publicationYear, available);
        this.duration = duration;
        this.format = format;
        this.regionCode = regionCode;
    }

    String getFormat(){
        return format;
    }

    int getDuration(){
        return duration;
    }
}


class Library {
    private List<LibraryItem> items; // Store library items

    public Library() {
        items = new ArrayList<>();
    }

    void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    boolean removeItem(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                items.remove(item);
                System.out.println("Item removed: " + item.getTitle());
                return true;
            }
        }
        System.out.println("Item not found!");
        return false;
    }

    LibraryItem searchItem(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        System.out.println("Item not found!");
        return null;
    }

    void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the library.");
            return;
        }
        for (LibraryItem item : items) {
            System.out.println("Item id : " + item.id);
            System.out.println("Item Title : " + item.title);
            System.out.println("Item Author : " + item.author);
            System.out.println("Item Publication Year : " + item.publicationYear);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book(1, "Harry Potter", "JK Rowling", 1997, true, "9781408855652", "Fantasy", 766));
        library.addItem(new Journal(2, "Nature", "Norman Lockyer", 1869, true, "0028-0836", 636, 8043));
        library.addItem(new DVD(3, "Interstellar", "Jonathan Nolan", 2014, true, 169, "DVD", "All"));

        library.displayAllItems();

        library.removeItem(2);
        library.displayAllItems();

        LibraryItem foundItem = library.searchItem("Harry Potter");
        if (foundItem != null) {
            System.out.println("Found: " + foundItem.title);
        }
    }
}
