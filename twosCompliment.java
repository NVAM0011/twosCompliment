import java.util.Scanner;
public class twosCompliment {
    public static void main(String[] args){
        //Initializing variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number you want to convert to binary:");
        int integerInput = scanner.nextInt();
        System.out.println("Please enter the number of bits you would like for the output:");
        int numberOfBits = scanner.nextInt();
        String output = "";
        String onesComplimentOutput = "";

        // If output = 0 then we just output 0
        if (integerInput == 0){
            output = "0";

        }
        // If the input is greater than zero we iterate through it and attach 1s or 0s as needed
        else if (integerInput > 0) {
            while (integerInput>= 1 || output.length() < numberOfBits) {
                if (integerInput % 2 == 1) {
                    output = ("1" + output);
                } else {
                    output = ("0" + output);
                }
                integerInput = integerInput / 2;
            }
            System.out.println(output);
        }
        // If the input is less than zeo we do the same process as before but perform the one's compliment on it
        if (integerInput < 0) {
            for (integerInput = (integerInput * -1) - 1; integerInput >= 1 || output.length() < numberOfBits;) {
                if (integerInput % 2 == 1) {
                    output = ("1" + output);
                } else {
                    output = ("0" + output);
                }
                integerInput = integerInput / 2;
            }
            for (int i = 0; onesComplimentOutput.length() < output.length(); i++) {
                if (output.toCharArray()[i] == '0') {
                    onesComplimentOutput = onesComplimentOutput + "1";
                }
                if (output.toCharArray()[i] == '1') {
                    onesComplimentOutput = onesComplimentOutput + "0";
                }
            }
            System.out.println(onesComplimentOutput);
        }
    }
}
