public class Task {

    public static void run() {
        Book book = new Book("The Lord of the Rings");
        BookMover bookMover = new FromAvailableStatusMover();
        bookMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
    }
}
