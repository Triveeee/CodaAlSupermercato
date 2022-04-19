public class Carello extends Thread {

    private Market market;
    private int n_numero;
    private long wait;

    public Carello(String nome  , Market market){
        super(nome);
        this.market = market;
        n_numero = 0;
        wait = (int) (Math.random() * (10000 - 1000) + 1) + 1000;
        this.start();
    }

    @Override
    public void run() {
            
            System.out.println(this.getName()  + " è entrato");
            n_numero = market.EntraInCassa(wait);
    }
}
