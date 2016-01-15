import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ListBooksTest {
    @Test
    public void shouldReturnNameDune(){
        String expectedName = "Dune";
        Shelf shelf = new Shelf();
        String actualName = shelf.showBookShelf();
        assertEquals(expectedName, actualName);
    }
}
