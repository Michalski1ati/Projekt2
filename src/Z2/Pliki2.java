
package Z2;

import java.io.*;


public class Pliki2 {
public static void main(String[] args) {
        try{
            DataInputStream fstream = new DataInputStream(new FileInputStream("plik.txt"));
           
            int c;
            int licznik = 1;
            while ((c = fstream.read()) != -1) 
            {
            if ( (char)c == '\n' || (char)c == ' '){
             licznik++;}               
             }
            fstream = new DataInputStream(new FileInputStream("plik.txt"));
            if ((c=fstream.read()) != -1) licznik++;  
           
            System.out.println(licznik);
            fstream.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
   
}