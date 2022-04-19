public class App {
    public static void main(String[] args) throws Exception {

        Market market =  new Market();

        int i = 0;
        for(i = 0 ; i < 10 ; i++){
            new Carello("Carello " + (i + 1) , market);
            Thread.sleep(1000);
        }
    }
}
