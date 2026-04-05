package HashCodeEEquals.Program;

import HashCodeEEquals.Client.Client;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Maria","maria@gmail.com");
        Client c2 = new Client("Claudio","claudio@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(c1.hashCode() == c2.hashCode());

    }
}
