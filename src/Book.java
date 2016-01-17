
public class Book {
    private String name;
    private String author;
    private String year;
    private boolean available = true;

    public void setName(String theName) {
        name = theName;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String theAuthor){
        author = theAuthor;
    }

    public String getAuthor(){
        return author;
    }

    public void setYear(String theYear){
        year = theYear;
    }

    public String getYear(){
        return year;
    }

    public void setAvailable(boolean availability){
        available = availability;
    }

    public boolean getAvailable(){
        return available;
    }
}
