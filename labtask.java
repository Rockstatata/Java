import java.util.Scanner;

public class labtask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int x;
        int[] array = new int[size];
        for(int i = 0;i<size;i++){
            x = scanner.nextInt();
            array[i] = x;
        }
        System.out.println("Enter the number you want to find: ");
        int c = scanner.nextInt();
        int count = 0;
        for(int i = 0;i<size;i++){
            if(array[i]==c){
                count++;
            }
        }
        System.out.println("The number "+c+" appears "+count+" times");
        
    }
}
