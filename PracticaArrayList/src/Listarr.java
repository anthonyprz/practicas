
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Listarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> numeros = new ArrayList<String>();
		System.out.println("numeros");
		try{
			FileInputStream fis = new FileInputStream("numeros.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);
			
			String linea = br.readLine();
			String [] campos = null;
			
			while(linea != null){
				campos = linea.split(",");
				String sitios = campos[0];
				sitios = campos[1];
				sitios = campos[2];
				sitios = campos[3];
				sitios = campos[4];
				numeros.add(sitios);
				linea = br.readLine();
			}
				for (int i=0;i<numeros.size() ;i++ ){
					System.out.println("estos son los numeros");
					System.out.println((campos[0]));
					System.out.println((campos[1]));
					System.out.println((campos[2]));
					System.out.println((campos[3]));
					System.out.println((campos[4]));
				}
		}
		catch(Exception ioe) {
			System.out.println("aqui hay un error: "+ioe);
		}
	}
}
