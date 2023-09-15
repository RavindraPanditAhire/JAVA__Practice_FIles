import java.io.File;
public class Flie_Attributes {
    public static void main(String[] args) {
        try {
            File f=new File("D:\\Notes.txt");
            System.out.println("File Name is: "+f.getName());
            System.out.println("File Location is: "+f.getAbsolutePath());
            System.out.println(" is File writable: "+f.canWrite());
            System.out.println("is File readable: "+f.canRead());
            System.out.println(f.getTotalSpace());
            System.out.println(f.setReadable(true));
            System.out.println("is File readable: "+f.canRead());
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
