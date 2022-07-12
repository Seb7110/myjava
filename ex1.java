import java.util.Scanner;

/**
 * ex1
 */
public class ex1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in) ;
System.out.println("Entrez votre prénom");
String name = input.nextLine();
System.out.println("Entrez votre nom de famille");
String firstName = input.nextLine() ;
input.close();
FullName(name, firstName); 
}
static void FullName (String _name, String _firstName) {
    if (_name.equals ("Sébastien")  && _firstName.equals ("Baloge") ) {
        System.out.println("Bonjour magesté !");
        
    }
    else {
        System.out.println("Vous vous appelez " + _name + _firstName + ".");
    }

}
    
}