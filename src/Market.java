import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Market {

    private int n_lista;
    private int carello;

    public Market(){
        carello = 0;
        n_lista = 0;
    }
    
    public synchronized int EntraInCassa(long wait){

        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        n_lista++;
        System.out.println(Thread.currentThread().getName() + " ha finito la spesa " + n_lista);
        return(n_lista);
    }
}
