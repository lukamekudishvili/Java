import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contact> emails=ContactData.getData("email");
        List<Contact> phones=ContactData.getData("phone");

        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts= new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);
        printData("Phone contacts:",phoneContacts);
        printData("email contacts: ",emailContacts);

        int index= emails.indexOf(new Contact("Robin Hood"));
        Contact robinHood= emails.get(index);
        System.out.println("-------------------------------------------------------------");
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        System.out.println(robinHood);
        System.out.println("-------------------------------------------------------------");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
        System.out.println(robinHood);

        System.out.println("-------------------------------------------------------------");
        Set<Contact> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("Union Data:",unionAB);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        Set<Contact> intersectAB =new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A \u2229 B) Intersect emails (A) and phones (B)", intersectAB);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        Set<Contact> intersectBA =new HashSet<>(phoneContacts);
        intersectBA.retainAll(emailContacts);
        printData("(B \u2229 A) Intersect phones (B) and emails (A)", intersectBA);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        Set<Contact> AminusB =new HashSet<>(emailContacts);
        AminusB.removeAll(phoneContacts);
        printData("(A -B) emails (A) - minus (B)", AminusB);

        System.out.println();
        System.out.println("-------------------------------------------------------------");
        Set<Contact> BminusA =new HashSet<>(phoneContacts);
        BminusA.removeAll(emailContacts);
        printData("(B-A) phones (B) - minus emails (A)", BminusA);


    }
    public static void printData(String header, Collection<Contact> contacts){
        System.out.println("-------------------------------------------------------------");
        System.out.println(header);
        System.out.println("-------------------------------------------------------------");
        contacts.forEach(s-> System.out.println(s));
    }
}
