package java_project1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
    public static void main(String[] args) throws FileNotFoundException { 
        String name[] = { "Tata", "Honda", "Hero", "Maruti", "HArley", "TVS","Toyota","KIA","Hyundai","Mercedez","Kawasaki" };
        PrintWriter pw = new PrintWriter("D:\\java_project1\\java_project1\\data.csv");
        pw.append("Company").append('\n');
        
   
        for (int i = 0; i < name.length; i++) {
            pw.println(name[i]);
        }
            pw.close();

           
        }    
        }
        