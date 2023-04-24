package Odev_2;

public class Prof extends Person implements Sports {
    private Book[] books;

    public Prof(String name, int age, Book[] books) {
        super(name, age);
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }
    public void readBook(Book book) {
        boolean hasBook = false;
        for (Book b : books) {
            if (b.equals(book)) {
                hasBook = true;
                break;
            }
        }
        if (hasBook) {
            System.out.println("Prof. " + getName() + " is reading " + book.getTitle() + " by " + book.getAuthor() + ".");
        } else {
            System.out.println("Prof. " + getName() + " does not have " + book.getTitle() + " by " + book.getAuthor() + ".");
        }
    }

        public void playSports() {
        System.out.println("Prof. " + getName() + " is playing sports.");
    }
}