public class App {
    public static void main(String[] args) throws Exception {

        Market market =  new Market();

        int i = 0;

        new Cassa(market);
        while(true){
            new Carello("Carello " + (i + 1) , market);
            Thread.sleep((int) (Math.random() * ((10000 - 1000) + 1) + 1000));
            i++;
        }
    }
}
