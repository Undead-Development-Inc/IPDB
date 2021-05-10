public class main {

    public static void main(String[] args){
        Thread networking = new Thread(Networking::Net);
        networking.start();
    }
}
