package chapter2.taskpage74;

public class EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();
        int x = 0;
        while (x<4){
            e1.hello();//1,2,3,4
            e1.count = e1.count + 1;//1,2,3,4
            if(x==3){
                e2.count = e2.count + 1;//6
            }
            if(x>0){
                e2.count = e2.count + e1.count;//2,5,10
            }
            x=x+1;//x=1,x=2,x=3,x=4
        }
        System.out.println(e2.count);//1
    }
}
