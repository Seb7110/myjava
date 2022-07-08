import java.util.Scanner;

/**
 * Essai
 */
public class ex1 {
    static Scanner input = new Scanner (System.in) ;

public static void main(String[] args) {
System.out.println("Quel est ton prénom ?");       
String Prenom =FirstName("Sébastien");
System.out.println("Quel est ton nom ?");
String nom = DisplayName("Baloge") ;
String nomComplet = FullName("Sébastien", "Baloge");

}
static String DisplayName (String name){
name = "Baloge" ;
System.out.println("Ton nom est " + name);
return name ;
}
static String FirstName (String name) {
    name ="Sébastien";
    System.out.println("Ton prénom est " + name);
return name ;
}
static String FullName (String firstName, String name) {
firstName = "Sébastien";
name = "Baloge";

    System.out.println("Quel est ton prénom ?");
System.out.println("Ton prénom est " + firstName);
    System.out.println("Quel est ton nom ?");
System.out.println("Ton nom est " + name);
return name ;
}
    
}