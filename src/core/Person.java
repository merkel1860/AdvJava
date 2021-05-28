package core;

import java.time.LocalDate;
import java.util.Date;

import static java.time.LocalDate.now;

public class Person implements Comparable<Person>{
    private String fname;
    private String lname;
    private int yob;

    public Person() {
    }

    public Person(String fname,
                  String lname, int yob) {
        this.fname = fname;
        this.lname = lname;
        this.yob = yob;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    @Override
    public int compareTo(Person o) {
        /*
        * 0 : means they are both equal
        * 1 : host is greater than guest
        * -1 : means guest is greater than host
        * */
        int status = 0;
        LocalDate currentDate = now();
        if( (extractYearFromDate(currentDate)-this.yob) >
                (extractYearFromDate(currentDate) - o.yob)){
            status = 1;
        }else if(this.yob < o.yob){
            status = -1;
        }else {
            status = 0;
        }
        return status;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", yob=" + yob +
                '}';
    }
    private int extractYearFromDate(Date date){
        return date.getYear();
    }
    private int extractYearFromDate(LocalDate date){
        return date.getYear();
    }
}
