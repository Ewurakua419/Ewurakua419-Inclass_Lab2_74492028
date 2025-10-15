/**
 * author= Ewurakua Amoah
 * Student ID=74492028
 * date: 14 Oct
 * Title= IntegerDynamics
 * a class which takes an input and checks to see if it is in a set range
 */
import java.util.Scanner;
public class IntegerDynamics{
    private int minAcceptedValue;//Minimum accepted value
    private int maxAcceptedValue;//Maximum accepted value
    private String promptString;//Prompt string

    public void setInputParameters(int minimum,int maximum, String prompt){
        //initializing the three attributes
        minAcceptedValue=minimum;
        maxAcceptedValue=maximum;
        promptString=prompt;
    }

    public int getValue(){
        int value;//initializing the value
        Scanner find= new Scanner(System.in);
        //making sure that values hae been initialized
        if (minAcceptedValue!=-1 && maxAcceptedValue!=-1 ){
            System.out.println(promptString);
            value=find.nextInt();
            while (minAcceptedValue>value || maxAcceptedValue<value){
            System.out.println(promptString);
            value=find.nextInt();//recieves input

            }
            System.out.println("Acceptable value read ");
            return value;
        }
        else{
            System.out.println("please make sure it has been initialized");
            return -1;//to show that it is non applicable
        }
        
    }
    // default constructor for the class
    public IntegerDynamics(){
        minAcceptedValue=-1;//Minimum accepted value set to -1
        maxAcceptedValue=-1;//Maximum accepted value set to -1
        promptString="N/a";// set to not applicable

    }
        

}
