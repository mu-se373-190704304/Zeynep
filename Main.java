package Odev_2;

public class Main {
    public static void main(String[] args) {
        Book[] books1 = {new Book("Germinal", "Emile Zole"), new Book("1984", "George Orwell")};
        Book[] books2 = {new Book("To Kill a Mockingbird", "Harper Lee"), new Book("The Hunger Games", "Suzanne Collins")};
        Student student = new Student("Ali Yılmaz", 20, books1);
        Prof prof = new Prof("Ahmet Akgül", 35, books2);

        System.out.println(student.getName() + " has " + student.getBooks().length + " books.");
        System.out.println(prof.getName() + " has " + prof.getBooks().length + " books.");
        student.readBook(books1[0]);
        prof.readBook(books2[0]);
        student.playSports();
        prof.playSports();
    }
}