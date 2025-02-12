import java.util.Scanner;

class Demo079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        boolean found = false;
        
        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
        
        sc.close();
    }
}
