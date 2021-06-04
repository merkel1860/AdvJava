package core;


import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static DAO instance = new DAO();

    private List<Person> personList = new ArrayList<>();

    private DAO (){

    }

    public static DAO getInstance(){return instance;}

    public List<Person> getPersonList() {
        return personList;
    }

    public static void loadPersons(){
        getInstance().personList.add(
                new Person("Muller","Merkel",1984)
        );
        getInstance().personList.add(
                new Person("Ulrick","Merkel",1921)
        );
        getInstance().personList.add(
                new Person("Muller","Fox",1965)
        );
        getInstance().personList.add(
                new Person("Peter","Girodier",1954)
        );
        getInstance().personList.add(
                new Person("Julmice","Brutus",2014)
        );
        getInstance().personList.add(
                new Person("Dieudonne","MBala MBala",1974)
        );
        getInstance().personList.add(
                new Person("Miroslav","Vladic",1984)
        );
    }

}
