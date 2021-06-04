package core;

import java.util.Iterator;

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

        // Initialization of personList.
        DAO.loadPersons();
        DAO.getInstance().getPersonList().add(p1);
        DAO.getInstance().getPersonList().add(p2);

        // Case One
        System.out.println("Case one");
        Iterator<Person> iterator = DAO.getInstance().
                getPersonList().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        // Case two
        System.out.println("Case two");
        DAO.getInstance().
                getPersonList().
                forEach(element -> System.out.println("Mr./Mrs."+element));

        // Case three
        System.out.println("Case three");
        DAO.getInstance().
                getPersonList().
                forEach(System.out::println);

        // Case four
        System.out.println("Case four");
        DAO.getInstance().getCitizens().loadPersonDetails();
        for (Citizen citizen :DAO.getInstance().getCitizens()){
            System.out.println(citizen.toString());
        }

    }
}
