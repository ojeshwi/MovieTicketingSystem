package Model;

public class Category extends MainCategory{

    String Genre;
    public Category(int seats, int sofa, String genre) {
        super(seats, sofa);
        Genre = genre;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Genre:" + this.getGenre());
    }

}