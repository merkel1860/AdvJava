package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Population implements Iterable<Citizen>{
    private List<Citizen> citizens = new ArrayList<Citizen>();

    @Override
    public Iterator<Citizen> iterator() {
        return this.citizens.iterator();
    }

    @Override
    public void forEach(Consumer<? super Citizen> action) {

    }

    public void loadPersonDetails(){
        for (Person person :DAO.getInstance().getPersonList()){
            int cin = (int)(Math.random()*100);
            citizens.add(new Citizen(cin, person));
        }
    }

}
