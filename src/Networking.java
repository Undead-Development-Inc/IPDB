import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutionException;

public class Networking {

    public static void Net(){
        while(true){
            try{
                ServerSocket serverSocket = new ServerSocket(10000);
                Socket socket = serverSocket.accept();

                String IP_Node = socket.getInetAddress().getHostAddress();

                System.out.println("IP_NODE REQUESTING: "+ IP_Node);

                if(!DB.DB_GETIP(IP_Node)){
                    DB.DB_SETIP(IP_Node, 1.0);
                }

                socket.close();
                serverSocket.close();
            }catch (Exception ex){

            }
        }
    }
}
