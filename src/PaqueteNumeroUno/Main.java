
package PaqueteNumeroUno;
import java.io.*;
public class Main {
    
    public static void main(String ... args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int[][] mapa;
        
        Mapa ob1 = new Mapa();
        ob1.mapa();
        mapa = ob1.mapaConBordes();
       
        
        for(int i = 0; i < mapa.length; i++){
            for(int j = 0; j < mapa.length; j++){
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
