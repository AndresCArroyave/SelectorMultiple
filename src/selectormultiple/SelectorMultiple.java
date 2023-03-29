/*
 
 */
package selectormultiple;
// Librerias
import java.util.Scanner;

public class SelectorMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Objread=new Scanner(System.in);
        int n,nro_personas;
        float valor_persona, valor_total;
        String Cod,ciudad;
        System.out.print("Digite cantidad de registros ");
        n=Objread.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("¿cual es el codigo del viaje? ");
            Cod=Objread.next();
            System.out.print("¿cuantas personas viajan? ");
            nro_personas=Objread.nextInt();
            System.out.print("¿cual es la ciudad de destino? ");
            ciudad=Objread.next();
            //Selector multiple
            switch (ciudad){
                case "Cartagena": valor_persona=1200000;
                    break;
                case "Leticia": valor_persona=2000000;
                    break;
                case "Cali": valor_persona=800000;
                    break;
                case "Bogota": valor_persona=700000;
                    break;
                default:System.out.println("\n Opcion no valida");
                    valor_persona=0;
                    break;
            } //fin caso
            valor_total=nro_personas * valor_persona;
            System.out.println("\nEl valor del viaje es " + valor_total);
        } //fin-para
    } 
    
}
