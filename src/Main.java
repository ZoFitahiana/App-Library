import static Service.ServiceAuthor.TestAuthor;
import static Service.ServiceBook.TestCrudBook;
import static Service.ServiceSubscribe.TestCrudSubscribe;

public class Main {
    public static void main(String[] args) {
        TestCrudBook();
        TestAuthor();
        TestCrudSubscribe();
    }
}