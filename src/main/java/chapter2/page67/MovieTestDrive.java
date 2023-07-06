package chapter2.page67;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Tron Legacy";
        one.genre = "Fantastic";
        one.rating = 10;

        Movie two = new Movie();
        two.title = "Lord of the Rings";
        two.genre = "Fantastic";
        two.rating = 10;
        two.playIt();

        Movie three = new Movie();
        three.title = "Terminator";
        three.genre = "Fantastic";
        three.rating = 10;
    }
}
