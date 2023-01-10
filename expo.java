import java.util.Scanner;
public class expo {
    public static void main(String[] args) {

        int take;
        int be;
        int total=1;
        boolean isError = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to take the exponent : ");
        take = input.nextInt();

        System.out.print("Enter the number to be the exponent : ");
        be = input.nextInt();

        if(take < 0 ){
            System.out.println("Please enter a pozitive number.");
            isError = false;
        }else {

            for (int start = 1; start <= be; start++) {
                total *= take;

            }
            System.out.println("Answer : " + total);

        }

    }
}
