import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Zuklar on 07-Nov-16.
 */
public class Listener implements Runnable {
    private static  Integer port = 63400;
    private static ServerSocket ServerSocket;
    private Socket socket;

    public void run() {
        try {
            ServerSocket = new ServerSocket(port);
        }
        catch (Exception e)
        {
            System.out.println("Error creating serverSocket" + e.toString());
        }
        while(true) {
            try {
                socket = ServerSocket.accept();
                new ListenMessages(socket);
            }
            catch (IOException e)
            {
                System.out.println("Could not accept connection " + e.toString());
            }
        }
    }

    public void

}
