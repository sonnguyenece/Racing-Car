public class Main {
    public static final int DISTANCE = 100;
    public static final int STEP = 5;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

//        Neu dung method run thi cac xe se chay lan luot, xe A hoan tat quang duong moi den xe B chay
//        carA.run();
//        carB.run();
//        carC.run();

//        carA.start(); //Khong co lenh nay do su dung implement Runnable chu ko phai extends Thread

        Thread thread1= new Thread(carA);
        Thread thread2= new Thread(carB);
        Thread thread3= new Thread(carC);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
