import java.util.Scanner;

public class EditDist {
    static int minimum(int x, int y, int z){
        if(x<=y && x<=z)
            return x;
        if(y<=x && y<=z)
            return y;
        else
            return z;
    }

    static int editDist(String str1, String str2, int m, int n) {
        if (m == 0)
            return n;
        if (n==0)
            return m;

        if (str1.charAt(m-1) == str2.charAt(n-1))
            return editDist(str1, str2, m-1, n-1);

        return 1 + minimum(editDist(str1, str2, m, n-1),
                            editDist(str1, str2, m-1, n),
                            editDist(str1, str2, m-1, n-1));
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2: ");
        String str2 = sc.nextLine();
        System.out.println("OUTPUT: "+ editDist(str1,str2,str1.length(),str2.length()));
    }
}
