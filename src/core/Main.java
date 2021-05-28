package core;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p1 = new Person("Marjory",
                "Dessalines",1984);
        Person p2 = new Person("Müller",
                "Zapatero Iguita",1944);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Which one is older?");
        System.out.println(p1.compareTo(p2)>0?"P1 is older than P2":
        "P2 is older than P1");

    }
}
