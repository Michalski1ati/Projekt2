
package Z1;
import java.io.*;
public class Pliki1 {
	public static void main(String[] args) {
	String s; int licznik=0;
		try{
			BufferedReader br = new BufferedReader (new FileReader("plik.txt"));
			do{
				s=br.readLine();
				if(s!=null){
				licznik++;}
				}while(s!=null);
			br.close();
			System.out.println(licznik);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}