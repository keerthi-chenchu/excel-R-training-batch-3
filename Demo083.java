import java.util.Scanner;
class Demo083 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        char ch = str.toLowerCase().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') {
            System.out.println("vowels");
    }
        else {
            System.out.println("Consonants");
        }
    }
}   