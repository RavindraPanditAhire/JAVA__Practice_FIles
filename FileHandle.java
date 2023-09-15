import java.io.FileReader;
import java.io.FileWriter;

public class FileHandle {
    public static void main(String[] args) {
        try {
            FileReader read = new FileReader("Notes1.txt");
            int character;
            while ((character = read.read()) != -1) {
                System.out.println((char) character);
            }
            read.close();
 
            FileWriter write = new FileWriter("Notes1.txt");
            write.write("I am Ravindra Pandit ahire from Sandip Foundation'Sandip polytechnic at Nashik.... India is my country and i am proud of that reach and avarie dharitage i shall aleays striveto be worthy of it to my country amd my people i pledge my devotion in their well being and prosperity along lie smy happiness");
            write.write("Hello World this is Ravindra Pandit Ahire from Sandip Polytechnic...");
            write.close();
        } catch (Exception e) {
            System.out.println("an error occered: " + e.getMessage());
        }
    }
}
