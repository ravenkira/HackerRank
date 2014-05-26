import java.util.Scanner;

/**
 * Created by SKanuri on 26-05-2014.
 */
public class ServiceLaneCalvin {
    public static void main(String []args){
        int bike=1,car=2,truck=3;
        Scanner s = new Scanner(System.in);
        String line1 = s.nextLine();
        String[] input1 = line1.split(" ");
        int length = Integer.parseInt(input1[0]);
        int nTestCases = Integer.parseInt(input1[1]);
        //System.out.println("Length of lanes is "+length);
        //System.out.println("Number of test Cases are "+nTestCases);
        String line2 = s.nextLine();
        String[] input2 = line2.split(" ");
        int[] width = new int[length];
        //System.out.print("Widths are ");
        for(int i=0; i<length ; i++){
            width[i] = Integer.parseInt(input2[i]);
            //System.out.print(width[i]);
        }
        System.out.println();
        for(int i=0; i< nTestCases; i++) {
            String line3 = s.nextLine();
            String[] input3 = line3.split(" ");
            int entryIndex = Integer.parseInt(input3[0]);
            int exitIndex = Integer.parseInt(input3[1]);
            //System.out.println("entryIndex "+entryIndex);
            //System.out.println("exitIndex "+exitIndex);
            int minWidth=width[entryIndex];
            for(int j = entryIndex; j < exitIndex; j++){
                if(width[j+1] < minWidth) {
                    minWidth=width[j+1];
                }
            }
            System.out.println(minWidth);
        }

    }
}
