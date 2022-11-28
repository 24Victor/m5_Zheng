import java.util.Scanner;
 
public class Main {
 public static void main(String[] args){
   /* llegir m: número de nombres reals d'una seqüència */
   Scanner teclat = new Scanner(System.in);
   int m = teclat.nextInt();
 
   /* Donar valor inicial a max */
    double max = teclat.nextDouble();
    /* Donar valor inicial a min */
    double min = teclat.nextDouble();
   /* Fer m vegades */
   for(int i=1; i<=m; i++){
     /* llegir 1 números reals */
     double num = teclat.nextDouble();
     /* actualitzar max si cal */
     if(num > max){
        max = num;
     }
     /*actualitzar min si cal */
     if(num < min ){
        min = num;
      } 
 
   }
 
    /* mostrar min */
    System.out.println(min);

   /* mostrar max */
   System.out.println(max);

 }
 }