public class Cassa extends Thread {

    private Market market;

    public Cassa(Market market){
        this.market = market;
        this.start();
    }



    @Override
    public void run() {
        // TODO Auto-generated method stub
        int delay;
        while(true){
            delay = (int) (Math.random() * ((10000 - 1000) + 1) + 1000);
                market.nextCart();
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            //System.out.println(delay);
            }
        }
        
}
