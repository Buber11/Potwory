import java.io.File;
import java.io.PrintWriter;

public class CreatorFile  {
   public CreatorFile(int D, int M, int P){
       try {
           File file = new File("Rezultaty symulacji.txt");
           file.createNewFile();
           PrintWriter pw = new PrintWriter(file);
           pw.println("ludzi przeżyło: " + P);
           pw.println("potworów przeżyło: " + M);
           pw.println("obrońców przeżyło: " + D);
           pw.close();

       } catch (Exception e){
           e.printStackTrace();
       }
   }

}
