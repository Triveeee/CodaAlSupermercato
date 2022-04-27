public class Cassa extends Thread {

    //classa condivisa
    private Market market;

    //metodo costruttore
    public Cassa(Market market){
        this.market = market;
        this.start();
    }


    // metodo implementato run dell interfaccia Runnable
    @Override
    public void run() {
        // TODO Auto-generated method stub

        //tempo della cassa per fare il conto
        int delay;

        //ciclo continuo
        while(true){
            delay = (int) (Math.random() * ((10000 - 1000) + 1) + 1000);   //tempo di attesa randomico

            //passa al prossimo carello
            market.nextCart();

            //attesa corrispondente al conto in cassa
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
