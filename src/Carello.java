public class Carello extends Thread {

    private Cassa cassa;
    private int numero;

    public Carello(String nome ,Cassa cassa , int numero){
        super(nome);

        this.cassa = cassa;
    }

    @Override
    public void run() {

    }
}
