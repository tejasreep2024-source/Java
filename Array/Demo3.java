import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        int sum = 0;
        System.out.println("Enter marks:");
        for(int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        double avg = (double) sum / n;
        System.out.println("Average Marks = " + avg);

        sc.close();
    }
}
