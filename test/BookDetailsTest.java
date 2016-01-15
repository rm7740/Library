import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookDetailsTest {
    @Test
    public void shouldReturnBookDetailsInColumns(){
        String expectedName = "Title\tAuthor\tYear\n" + "Dune\tSome Dude\t199x\n" + "Hyperion\tDan Something\t199x\n";
        Shelf shelf = new Shelf();
        String actualName = shelf.showBookShelf();
        assertEquals(expectedName, actualName);
    }
}
