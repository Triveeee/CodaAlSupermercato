
public class Market {

    //totali carelli
    private int n_lista;

    //numero carello in cassa
    private int carello;

    //metodo costruttore
    public Market(){
        carello = 0;
        n_lista = 0;
    }
    
    //metodo sincronizzato per la calsse thread carello
    //il carello fa la spesa al supermercato per un preciso periodo di tempo (il thread sta in attesa)
    //dopo avere finito alla spesa il carello si aggiunge alla lista e si mette in coda

    public synchronized int GoShoppingFor(long wait , Carello carello){

        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        n_lista++;
        System.out.println(carello.getName() + " ha finito la spesa e si mette in coda " + n_lista);
        notifyAll();
        return(n_lista);
    }


    //metodo sincronizzato per la classe thread carello
    //carello entra in cassa se è il suo turno altrimenti sta in attesa
    //corrisponde all fine del processo (carello)

    public synchronized void ReadyToExit(int number){
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

    //metodo sincronizzato per la classe thread Cassa
    //la cassa chiama continuamente i carelli rispettando la lista
    
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
        carello++;
        notifyAll();
}
}
