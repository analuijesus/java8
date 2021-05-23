public class LambdaTeste {
    public static void main(String[] args) {

        // antes
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        }).start();

        // depois
        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}
