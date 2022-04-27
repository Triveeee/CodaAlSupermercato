public class Carello extends Thread {

    //classe condivisa
    private Market market;

    //numero carello
    private int n_numero;

    //te,po di attesa per la spesa
    private long wait;

    //metodo costruttore
    public Carello(String nome  , Market market){
        super(nome);

        this.market = market;
        
        n_numero = 0;

        wait = (int) (Math.random() * (10000 - 1000) + 1) + 1000;

        this.start();
    }

    // metodo implementato run dell' interfaccia Runnable
    @Override
    public void run() {

            //entra carello al partire dell'esecuzione del thread
            System.out.println(this.getName()  + " è entrato");

            //attende un preciso periodo di tempo corrispondente all tempo impiegato per
            //la spesa
            n_numero = market.GoShoppingFor(wait , this);

            //attende il suo turno in cassa
            market.ReadyToExit(n_numero);
    }
}
