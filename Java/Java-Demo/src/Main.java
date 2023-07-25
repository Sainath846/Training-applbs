class Book {
    final String title, author, ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

class User {
    final String name, userID;
    final int age;
    public User(String name, int age, String userID) {
        this.name = name;
        this.age = age;
        this.userID = userID;
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("User ID: " + userID);
    }
}

abstract class LibraryItem {
    final String itemID;
    private String status;
    public LibraryItem(String itemID) {
        this.itemID = itemID;
        this.status = "Available";
    }

    public String getItemID() {
        return itemID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void displayItemDetails();
}

class BookItem extends LibraryItem {
    final Book book;
    final String edition;

    public BookItem(String itemID, Book book, String edition) {
        super(itemID);
        this.book = book;
        this.edition = edition;
    }

    public Book getBook() {
        return book;
    }

    public void displayItemDetails() {
        book.displayBookInfo();
        System.out.println("Edition: " + edition);
        System.out.println("Item ID: " + getItemID());
        System.out.println("Status: " + getStatus());
    }
}
class Library {
    private BookItem[] books;
    private int bookCount;

    public Library() {
        books = new BookItem[100];
        bookCount = 0;
    }

    public void addBook(BookItem bookItem) {
        books[bookCount] = bookItem;
        bookCount++;
    }

    public void issueBook(BookItem bookItem, User user) {
        if (bookItem.getStatus().equals("Available")) {
            bookItem.setStatus("Issued");
            System.out.println("Book issued successfully to " + user.getClass());
        } else {
            System.out.println("Book is not available for issuing.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getStatus().equals("Available")) {
                books[i].displayItemDetails();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("Introduction to Java", "John Doe", "1234567890");
        Book book2 = new Book("Data Structures and Algorithms", "Jane Smith", "9876543210");

        // Create book items
        BookItem bookItem1 = new BookItem("B001", book1, "2nd Edition");
        BookItem bookItem2 = new BookItem("B002", book2, "3rd Edition");

        // Create users
        User user1 = new User("Alice", 25, "U001");
        User user2 = new User("Bob", 30, "U002");

        // Create library
        Library library = new Library();

        // Add books to the library
        library.addBook(bookItem1);
        library.addBook(bookItem2);

        // Display available books
        library.displayAvailableBooks();

        // Issue a book to a user
        library.issueBook(bookItem1, user1);

        // Display available books after issuing
        library.displayAvailableBooks();
    }
}






