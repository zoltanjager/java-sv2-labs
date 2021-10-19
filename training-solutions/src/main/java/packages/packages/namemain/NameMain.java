package packages.packages.namemain;

import packages.packages.firstname.FirstName;
import packages.packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {

    public static void main(String[] args) {
        Prefix pre = new Prefix("Dr.");
        FirstName first = new FirstName("Bill");
        LastName last = new LastName("Doe");

        System.out.println(pre.getPre() +" " + first.getFirst() + " " + last.getLast());
    }
}
