public class Main {
    public static void main(String[] args) {
        Book kubusPuchatek = new Book("Kubuś Puchatek", 1, "12345");

        System.out.println(kubusPuchatek.getTitle());
        System.out.println(kubusPuchatek.getISBN());
        System.out.println(kubusPuchatek.getID());
        System.out.println(kubusPuchatek.toString());

    }
}
