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
public class Nomer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka[][]={
            {34,56,41},
            {45,36,37},
            {51,32,46}
        };
        for(int i=0;i<angka.length;i++){
            for(int j=0;j<angka.length;j++){
                System.out.print(angka[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
