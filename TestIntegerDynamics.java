/**
 * name= Ewurakua Amoah
 * ID=74492028
 * Title= TestInteger dynamics
 * a class to test the IntegerDynamics class, contains objects and utilizes the methods
 */
import java.util.Scanner;
public class TestIntegerDynamics{
    public static void main( String[] args){
        IntegerDynamics tester = new IntegerDynamics();//constructor
        tester.getValue();// to see is it catches the error
        tester.setInputParameters(0, 100, "please enter a number between 0 and 100");//setting parameters metthod
        tester.getValue();



    }
}
