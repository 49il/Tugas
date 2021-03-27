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
public class Nomer2 {
    public static void main(String[] args) {
        
    
      int a[][]={
           {32,34},
           {36,40},
           {60,49}
       };
       int b[][]={
           {10,23},
           {34,20},
           {29,32}
       };
       if((a.length==b.length)&&(a[0].length==b[0].length)){
           int[][]C=new int[a.length][a[0].length];
           for(int i=0;i<a.length;i++){
               for(int j=0;j<a[0].length;j++){
                   C[i][j]=a[i][j]-b[i][j];
               }
               
           }
           for(int[]c:C){
               for(int q:c){
                   System.out.print(q+" ");
               }
               System.out.println( );
           }
       }
       else{
           System.out.println("ukuran matriks tidak sama");
       }
           
}
}
