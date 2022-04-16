public class App {
    public static void main(String[] args) throws Exception {

        Cassa cassa =  new Cassa();

        int i = 0;
        while(true){
            new Carello("Carello_"+ i , cassa , i);
            i++;
        }
    }
}
