import java.io.FileWriter;

public class FileWrite1 {
    public FileWrite1(String string) {
    }

    public static void main(String[] args) {
        try {
            
            FileWriter f=new FileWriter("Desktop\\Notes2.txt");
            try{
                f.write("welcome to java's Frpgramming language world....");
            }
            finally{
                f.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
