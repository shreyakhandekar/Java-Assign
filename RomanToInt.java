import java.util.Scanner;

public class RomanToInt {
    public int romanToint(String s){
        int sum = 0;
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        if(s.indexOf("IV") != -1) sum -= 2;
        if(s.indexOf("IX") != -1) sum -= 2;
        if(s.indexOf("XL") != -1) sum -= 20;
        if(s.indexOf("XC") != -1) sum -= 20;
        if(s.indexOf("CD") != -1) sum -= 200;
        if(s.indexOf("CM") != -1) sum -= 200;

        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='M') sum += 1000;
            if(s.charAt(i)=='D') sum += 500;
            if(s.charAt(i)=='C') sum += 100;
            if(s.charAt(i)=='L') sum += 50;
            if(s.charAt(i)=='X') sum += 10;
            if(s.charAt(i)=='V') sum += 5;
            if(s.charAt(i)=='I') sum += 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        RomanToInt ri = new RomanToInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number in Roman: ");
        String s =  sc.nextLine();
        System.out.println("Roman number entered: " +s);
        System.out.println("Roman to Integer: " + ri.romanToint(s));

    }
}

