import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
    public class client{
        public static void main(String args[]) throws IOException {
            Socket socket= new Socket("locolhost",8000);
            PrintWriter pr=new PrintWriter(socket.getOutputStream());
            pr.println("hello");
            pr.flush();

        }
    }

