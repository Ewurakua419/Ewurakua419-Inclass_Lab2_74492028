/**
 * author; Ewurakua Amoah
 * Student ID=74492028
 * date: 14 Oct
 * Title= Test person
 * tests the Person class using all methods and constructors
 */
public class TestPerson{
    public static void main(String[] args){
        //constructing the object
        Person person1= new Person();
        // testing setperson with invalid age
        person1.setPerson("Ama", -1, "f");// invalid age

        //testing getter and setter
        Person person2= new Person();
        person2.setName("Nketia");
        person2.setAge(23);
        person2.setGender(Gender.M);
        System.out.println("This person is called "+ person2.getName()+ " and is "+ person2.getAge()+ " years old. Gender: "+ person2.getGender());

        // testing setperson with invalid gender
        Person person3 = new Person();
        person3.setPerson("Lois", 7, "k");

        //testing setPerson with all valid
        Person person4= new Person();
        person4.setPerson("Ewura", 18, "f");
        System.out.println("This person is called "+ person4.getName()+ " and is "+ person4.getAge()+ " years old. Gender: "+ person4.getGender());
    }
    
}
