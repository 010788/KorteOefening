/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package korteoefening;

/**
 *
 * @author Elena
 */
public class KorteOefening {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int uitkomst = faculteitFunctie(5);
        String begeleidendeTekst = "de uitkomst van 5! is ";
        
        printFunctie(begeleidendeTekst, uitkomst);
        
    }

        public static int somFunctie(int getal1, int getal2){
            int optelling = getal1+getal2;
            return optelling;
        }    
        
        public static int vermenigvuldigFunctie(int getal1, int getal2){
            int product = getal1*getal2;
            return product;
        }
        
        public static int faculteitFunctie(int getal){
            if (getal == 1){
                return 1;
            }
            return getal*faculteitFunctie(getal-1);
            
        }
        
        public static void printFunctie(String tekst,int getal){
            System.out.println(tekst+getal);
        }
}
    
