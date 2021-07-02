import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class serveur{
    public static void main(String args[]) throws IOException{
        ServerSocket serverSocket=new ServerSocket(8000);
        Socket socket= serverSocket.accept();
        System.out.println("client has been accepted");
        InputStreamReader in=new InputStreamReader(socket.getInputStream());
        BufferedReader reader=new BufferedReader(in);
        String message= reader.readLine();
        System.out.println("client: "+message);

        }
}
