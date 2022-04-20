public class Cassa extends Thread {

    private Market market;
    public Cassa(Market market){
        this.market = market;
        this.start();
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){

                market.nextCart();
            }
        }
        
}
