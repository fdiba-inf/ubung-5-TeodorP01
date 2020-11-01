package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];

        boolean asd = false;
        int g=0;
     
        for (int i=0 ; i<numbers.length;i++)
        {
          for(int j=i+1; j<numbers.length-1;j++){
            if(numbers[i]==numbers[j])
            {
              asd=true;
            }
          }
           if (asd==false)
            {
              uniqueNumbers[g]=numbers[i];
              g++;
            }
            
            asd=false;
          
        }

        



        // Find unique numbers in numbers

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
