/**
 * author; Ewurakua Amoah
 * Student ID=74492028
 * date: 14 Oct
 * Title= Person Class
 * Person class creates an object with a name age and gender
 */
enum Gender{
    M,
    F
}
public class Person {
    private String name;// the Person name
    private int age;//The gender of the person
    private Gender gender;
    
    //mutator for name
    public void setName(String newName){
        name=newName;
    }

    //mutator for age
    public void setAge(int newAge){
        age=newAge;
    }

    //mutator for gender
    public void setGender(Gender newgender){
        gender =newgender;
    }

    // accessor for name
    public String getName(){
        return name;
    }

    // accessor for age
    public int getAge(){
        return age;
    }

    // accessor for gender
    public Gender getGender(){
        return gender;
    }

    public void setPerson(String inputname, int inputage, String inputGender){
        name=inputname;
        age=inputage;
        inputGender=inputGender.toUpperCase();
        if (inputage<0){
            System.out.println("Unsuccessful. Not a valid age");
            return;
        }
        try{
            gender=Gender.valueOf(inputGender);
        }catch(IllegalArgumentException e) {
            System.out.println("Unsuccessful. Not in Gender please retry");
            return;
        }
        System.out.println("Successful");
    }
    public Person(){
        
        System.out.println("Object created");
    }
}
