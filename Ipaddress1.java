import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ipaddress1 {
    public static void main(String[] args) {
       try{
        ServerSocket ss=new ServerSocket(5555);
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        String sss=dis.readUTF();
        ss.close();
        dis.close();
        s.close();
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }

    }
}
