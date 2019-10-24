import java.util.*;

public class Recursively3A817120 {
    private static char[][] data;

    public static void main(String[] args) {
        init();
        System.out.print("請依序輸入費式數列、河內塔的值:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        ho(h, 3, 2, 1);

        for (int u = 0;u <= n ;u++){
            int r = Fibonacci(u);
            System.out.println("費式數列(" + n + ")=" + r);
        }


    }

    public static int Fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static int c = 0;

    public static void ho(int h, int Src, int Temp, int Dest) {
        if (h == 1) {
            c++;
            char na = Move(Src - 1, Dest - 1);
            System.out.println("第" + c + "步" + " " + na + "由" + Src + "移動到第" + Dest + "根桿子");
        } else {
            ho(h - 1, Src, Dest, Temp);
            ho(1, Src, Temp, Dest);
            ho(h - 1, Temp, Src, Dest);
        }

    }

    private static void init() {
        data = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = '*';
            }
        }
        data[2][2] = '甲';
        data[2][1] = '乙';
        data[2][0] = '丙';

    }

    private static char Move(int xf, int xt) {
        char temp = ' ';
        for (int y = 0; y < 3; y++) {
            if (data[xf][y] == '*') {
                temp = data[xf][y - 1];
                data[xf][y - 1] = '*';
                break;
            }
            if (y == 2 && data[xf][y] != '*') {
                temp = data[xf][y];
                data[xf][y] = '*';
                break;
            }
        }
        for (int y = 0; y < 3; y++) {
            if (data[xt][y] == '*') {
                data[xt][y] = temp;
                break;
            }
        }
        return temp;
    }
}











































