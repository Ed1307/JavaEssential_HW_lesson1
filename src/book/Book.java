package book;

public class Book {
    public static void main(String[] args) {
        Title t = new Title("Amazing book");
        Author a = new Author("Herbert Sponchbob");
        Content c = new Content("abcdef");

        t.show();
        a.show();
        c.show();
    }
}
