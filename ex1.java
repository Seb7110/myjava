import java.util.Scanner;

/**
 * Essai
 */
public class ex1 {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Quel est ton prénom ?");       
String Prenom = input.nextLine();
String nom = DisplayName("Baloge") ;

}
static String DisplayName (String name){
name = "Baloge" ;
System.out.println("Ton nom est " + name);
return name ;
}
    
}