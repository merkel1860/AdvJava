package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Citizens implements Iterable<Citizen>{
    private List<Citizen> citizens = new ArrayList<Citizen>();

    @Override
    public Iterator<Citizen> iterator() {
        return this.citizens.iterator();
    }

    @Override
    public void forEach(Consumer<? super Citizen> action) {

    }

}
