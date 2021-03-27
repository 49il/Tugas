/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2tugas;

/**
 *
 * @author user
 */
public class Nomer3 {
     public static void main(String[] args) {
        int x[][]={
            {2,5,4},
            {4,6,3}
            
    };
        int y[][]={
            {3,2},
            {1,7},
            {9,8},
        };
        if(x[0].length==y.length){
            int[][]z=new int[x.length][y[0].length];
            for(int i=0;i<x.length;i++){
                for(int j=0;j<y[0].length;j++){
                    for(int k=0;k<x[0].length;k++){
                        z[i][j]+=x[i][k]*y[k][j];
                    }
                }
            }
            for(int[]Z:z){
                for(int p:Z){
                    System.out.print(p+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Ukuran matriks tidak tersedia");
        }
    }
}
