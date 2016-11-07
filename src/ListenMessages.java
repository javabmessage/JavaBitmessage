import java.io.*;
import java.io.PrintWriter;
import java.net.*;

/**
 * Created by Zuklar on 07-Nov-16.
 */
public class ListenMessages extends Thread{
    private Socket socket;
    private String message;
    public ListenMessages(Socket socket)
    {
        this.socket = socket;
    }

    public void run()
    {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader (socket.getInputStream()));
            while ((message = reader.readLine()) != null)
            {
                System.out.println("Message: " + message);
            }
        }
        catch (IOException e)
        {
            System.out.println("Could not create PrintWriter "  + e.toString());

        }

    }
}
