public class Movie {

    String title;
    double star;
    String dir;
    int year;

    Movie(String title, double star, String dir, int year) {
        this.title = title;
        this.star = star;
        this.dir = dir;
        this.year = year;
    }

    public void print() {
        System.out.println(title + ", " + star + ", " + dir + ", "+ year);
    }

}