package SynchronizationAssessment;

class Library {
    private int availableBooks;

    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    public void borrowBook(String readerName) {
        if (availableBooks > 0) {
            System.out.println(readerName + " is borrowing a book.");
            availableBooks--;
            System.out.println(readerName + " successfully borrowed a book. Books left: " + availableBooks);
        } else {
            System.out.println(readerName + " tried to borrow a book, but none are available.");
        }
    }

    public int getAvailableBooks() {
        return availableBooks;
    }
}

class Reader extends Thread {
    private Library library;
    private String readerName;

    public Reader(Library library, String readerName) {
        this.library = library;
        this.readerName = readerName;
    }

    @Override
    public void run() {
        library.borrowBook(readerName);
    }
}

public class LibraryManagementSystem
{
    public static void main(String[] args) {
        Library library = new Library(2); // Only 2 books available

        // Creating multiple readers trying to borrow books at the same time
        Reader reader1 = new Reader(library, "Reader1");
        Reader reader2 = new Reader(library, "Reader2");
        Reader reader3 = new Reader(library, "Reader3");

        reader1.start();
        reader2.start();
        reader3.start();
    }
}
