import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Ipaddress {

    Ipaddress() {
        try {
            Socket s=new Socket("localhost",5555);
            DataOutputStream dous=new DataOutputStream(s.getOutputStream());
            dous.writeUTF("this is Ravindra Pandit Ahire from sandip Polytechnic");
            dous.flush();
            dous.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        Ipaddress ip = new Ipaddress();
    }
}
