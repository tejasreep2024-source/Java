import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of List:");
        int size = sc.nextInt();

        String name[] = new String[size];
        System.out.println("Enter List Elements:");
        for(int i = 0; i < size; i++) {
            name[i] = sc.next();
        }
        System.out.println("Enter the Search Name:");
        String search = sc.next();
        boolean found = false;
        for(int i = 0; i < size; i++) {
            if(name[i].equals(search)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Name Found");
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}

