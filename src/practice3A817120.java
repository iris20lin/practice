import java.util.*;

public class practice3A817120 {
    private static char[][] i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        input(c);
        output();
    }

    public static void input(String c) {
        char ch = c.toCharArray(c);
        i = new char[2][5];
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 5; k++) {
                i[k][j] = ch;
            }
        }



    }

    public static void output() {
        for (int k=0;k<5;k++){
            for (int j=0;j<2;j++){
                System.out.println(i);
            }
        }
    }
}
