import java.util.Scanner;
public class ZhengCalculVendes{
    
    public static void public static void main(String[] args) {
        /*S’ha de crear un programa que calcularà el total de vendes d’una empresa,
         la qual té sucursals repartides pel territori. A més ha de comunicar el nom i 
         l’import de la sucursal que més hagi venut. */

         /*L’usuari entrarà per teclat la quantitat de sucursals de l’empresa i 
         posteriorment introduirà l’import de cadascuna de les factures emeses de cada tenda. 
         Per indicar el final de factures de la sucursal s’entrarà un 0. */
        Scanner teclat = new Scanner(System.in);

        /*Nombre de la surcusal */
        System.out.println("Insereix el nom de la surcursal")
        int sucursals = scanner.nextInt();
        /*COntador del numero de la surcursal */
        int cont = 0;
        /*Controla les factures */
        int factura = 1;
        /*Sumar de 1 surcursal */
        int sum = 0;
        /*Sumar el total de les surcursals*/
        int total = 0;
        /*Nom de la millor sucursal */
        String MillorSucursal = "";
        /*Valor de la millor sucursal */
        int valMillorSucursal = 0;
        String nomSucursal = "";
        while (cont < sucursals){
            /*Demana el nom de la surcursal */
            System.out.println("Insereix el nom de la surcursal");
            nomSucursal = scanner.nextInt();
        
        while(factura != 0){
            /*Demana els diners generats */
            System.out.println("Inserir valor de la factura o ficar un 0 per a finalitzar");
            factura = Scanner.nextInt();
            sum += 0;
        }

            total += sum;
            if (sum > valMillorSucursalc){
                valMillorSucursal = sum;
                MillorSucursal = nomSucursal;
                sum = 0;

        factura = 1;
        cont++;
            }
        System.out.println("El total de ventes es" + total);
        System.out..println("Les major numero de ventes de la sucursal es" + MillorSucursal + "" + valMillorSucursal);
        }
    }
}