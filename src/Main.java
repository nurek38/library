public class Main {
    public static void main(String[] args) {
        Book kubusPuchatek = new Book("Kubuś Puchatek", 1, "12345");

        System.out.println(kubusPuchatek.getTitle());
        System.out.println(kubusPuchatek.getISBN());
        System.out.println(kubusPuchatek.getID());
        System.out.println(kubusPuchatek.toString());

        Book ogniemImieczem = new Book();
        ogniemImieczem.setID(2);
        ogniemImieczem.setTitle("Ogniem i mieczem");
        ogniemImieczem.setISBN("12346");

        System.out.println(ogniemImieczem.getTitle());
        System.out.println(ogniemImieczem.getID());
        System.out.println(ogniemImieczem.getISBN());
        System.out.println(ogniemImieczem.toString());
        

    }
}
