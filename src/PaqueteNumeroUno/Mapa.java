
package PaqueteNumeroUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mapa {
    
    int[][] mapa;
    int n;
    int m;
    String entrada;
    
    public void mapa()throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Dame la dimencion de tu mapa : ");
        n = Integer.parseInt(entrada = bufer.readLine());
        
        mapa = new int [n][n];
    }
    
    public int[][] mapaConBordes(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == n - 1){
                    mapa[i][j] = 1;
                }else if(j == 0 || i == n - 1){
                    mapa[i][j] = 1;
                }else{
                    mapa[i][j] = 0;
                }
            }
        }
        
        return mapa;
    }

}
