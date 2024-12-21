public class MovieMain {

    public static void main(String[] args) {

        Movie movie1 = new Movie("꽃다발 같은 사랑을 했다", 8.47, "도이 노부히로", 2021);
        Movie movie2 = new Movie("어바웃타임", 9.25, "리처드 커티스", 2013);

        movie1.print();
        movie2.print();

    }

}