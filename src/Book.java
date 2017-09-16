public class Book {

    private String title;
    private int ID;
    private String ISBN;

    public Book(String title, int ID, String ISBN) {
        this.title = title;
        this.ID = ID;
        this.ISBN = ISBN;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", ID=" + ID +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    public String getISBNandTitle() {
        return this.title+" " + this.ISBN;


    }

}
