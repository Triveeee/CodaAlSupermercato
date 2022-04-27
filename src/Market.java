

public class Market {

    private int n_lista;
    private int carello;
    //private Vector <Carello> carelli;

    public Market(){
        carello = 0;
        n_lista = 0;
        //carelli = new Vector <Carello> (0 , 1);
    }
    
    public synchronized int GoShoppingFor(long wait , Carello carello){

        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        n_lista++;
        System.out.println(carello.getName() + " ha finito la spesa e si mette in coda " + n_lista);
        //carelli.add(carello);
        notifyAll();
        return(n_lista);
    }

    public synchronized void WaitCashDesk(int number){
        while(carello != number){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " entra in cassa");
    }

    public synchronized void nextCart(){
        while(n_lista == carello){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("cassa libera");
        //System.out.println(carello);
        carello++;
        //System.out.println(carello);
        notifyAll();
}
}
