public class Main {
    public static void main(String[] args) {
        YieldDemo y= new YieldDemo();
        y.run();
        Thread.interrupted();

        for (int i =1;i<=10;i++){
            System.out.println("demo2222");

        }
    }
}