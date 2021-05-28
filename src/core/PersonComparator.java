package core;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

import static java.time.LocalDate.now;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int status = 0;
        LocalDate currentDate = now();
        if( (extractYearFromDate(currentDate)-o1.getYob()) >
                (extractYearFromDate(currentDate) - o2.getYob())){
            status = 1;
        }else if(o1.getYob() < o2.getYob()){
            status = -1;
        }else {
            status = 0;
        }
        return status;
    }

    @Override
    public boolean equals(Object obj) {
      return true;
    }

    private int extractYearFromDate(Date date){
        return date.getYear();
    }
    private int extractYearFromDate(LocalDate date){
        return date.getYear();
    }
}
