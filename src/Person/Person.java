package Person;

import java.util.*;

public class Person implements Cloneable, Comparable<Person> {

    private String name;
    private Date birthday;
    private int passport;

    public Person(String name, Date birthday, int passport) {
        this.name = name;
        this.birthday = birthday;
        this.passport = passport;
    }

    public String getName() { return name; }
    
    public Date getBirthday() { return birthday; }    
    public void setBirthday(Date birthday) { this.birthday = birthday; }
    
    public int getPassport() { return passport; }
    public void setPassport(int passport) { this.passport = passport; }

    public int calculateAge() {
        Calendar dateBirthday = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        dateBirthday.setTime(this.birthday);
        dateBirthday.add(Calendar.DAY_OF_MONTH, -1);
        int age = today.get(Calendar.YEAR) - dateBirthday.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dateBirthday.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;        
    } 
    
    @Override
    public int compareTo(Person comparingPerson) {
        int result = this.calculateAge() - comparingPerson.calculateAge();
        if (result != 0) {
            return (int) result / Math.abs(result);
        }
        result = this.passport - comparingPerson.passport;
        if (result != 0) {
            return (int) result / Math.abs(result);
        }
        return 0;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return "Name=" + name + ", birthday=" + birthday + ", passport=" + passport;
    }
}
