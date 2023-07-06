package chapter2.page68;

public class Player {
    int number;

    void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("The number is " + number);
    }
}
