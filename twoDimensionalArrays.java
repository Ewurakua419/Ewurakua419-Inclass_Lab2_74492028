import java.util.Arrays;
public class twoDimensionalArrays{
    public static void main(String[] args){
        int[][] employeeHours= {{2,4,3,4,5,8,8}, {7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{3,5,4,3,6,3,8},{6,3,5,9,2,7,9}};
        int[][] sumhours=new int[8][2];
        for (int i=0; i<employeeHours.length;i++){
            int total=0;
            for (int j=0; j<employeeHours[i].length;j++){
                total+=employeeHours[i][j];
            }
            sumhours[i][0]=i;
            sumhours[i][1]=total;
        }
        //System.out.println(Arrays.deepToString(sumhours));
        int temp;
        for (int i=0; i<sumhours.length;i++){
            for (int j=i+1;j<sumhours.length;j++){
                
                if (sumhours[i][1]<sumhours[j][1]){
                    temp=sumhours[i][1];
                    sumhours[i][1]=sumhours[j][1];
                    sumhours[j][1]=temp;

                    temp=sumhours[i][0];
                    sumhours[i][0]=sumhours[j][0];
                    sumhours[j][0]=temp;
                }
                
                  
            }
            
        }
        for (int i=0;i<sumhours.length;i++){
            System.out.println("Employee "+sumhours[i][0]+ " has "+sumhours[i][1]+ " total hours");
        }
        //System.out.println(Arrays.deepToString(sumhours));
    }
}
