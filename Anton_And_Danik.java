import java.util.Scanner;

public class Anton_And_Danik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str = in.next();
        int Anton = 0;
        int Danik = 0;
        for(int i = 0; i < N; i++) {
            if(str.charAt(i) == 'A'){
                Anton++;
            }else{
                Danik++;
            }
        }
        if(Anton == Danik){
            System.out.println("Friendship");
        }else if(Anton > Danik){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
        in.close();
    }
}
