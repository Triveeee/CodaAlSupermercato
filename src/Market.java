public class Market {
    private int carello;
    private int n_lista;
    private int sleep;

    public Market(){
        carello = 0;
        n_lista = 0;
    }

    public synchronized int EntraCarello(){
        n_lista++;
        return(n_lista);
    }


    public synchronized int ControlloCassa(){
        while(n_lista == carello){
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        carello++;
        notifyAll();
        return(carello);
    }

    public synchronized 
    


}
