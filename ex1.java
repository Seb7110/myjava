import java.util.Scanner;

/**
 * Essai
 */
public class ex1 {
public static void main(String[] args) {
System.out.println("Quel est ton prénom ?");       
String Prenom =FirstName("Sébastien");
System.out.println("Quel est ton nom ?");
String nom = DisplayName("Baloge") ;

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
    
}