import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;
import static java.lang.Character.*;


public class Main {

    public static void main(String[] args) {
//        String s = "heheiksde";
//        char c = 'e';
//        System.out.println("w napisie " + s+ " znak " + c + " wystepuje tyle razy: " + countChar(s, c));
//
//        String ss = "hehehehihihohohe";
//        String sub = "hehe";
//
//        System.out.println(countSubStr(ss, sub));
//
//
//        Scanner scn = new Scanner(System.in);
//        String a = scn.next();
//
//        System.out.println(middle(a));


//        Scanner scn = new Scanner(System.in);
//        String b = scn.next();
//        System.out.println(repeat(b,2));

//        String s = "hkjghjkhkgfhj";
//        String sub = "he";
//        int[] tab = where(s, sub);
//        for(int i = 0; i <=tab.length-1; i++){
//            System.out.println(tab[i]);
//        }

        System.out.println(nice("46746784687", '.'));

    }


    public static int countChar(String str, char c) {
        int suma = 0;
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i <= sb.length() - 1; i++) {
            if (sb.charAt(i) == c)
                suma++;
        }
        return suma;
    }


    public static int countSubStr(String str, String subStr) {
        int suma = 0;
        StringBuffer sb = new StringBuffer(str);
        if (subStr.length() > str.length())
            return 0;
        for (int i = 0; i <= sb.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {
                    suma++;
                }
            }
        }
        return suma;

    }

    public static String middle(String str) {
        StringBuffer sb = new StringBuffer(str);
        StringBuffer st = new StringBuffer();
        if (sb.length() % 2 == 0) {
            st.append(sb.charAt(sb.length() / 2 - 1)).append(sb.charAt(sb.length() / 2));
        }
        if (sb.length() % 2 != 0) {
            st.append(sb.charAt(sb.length() / 2));
        }
        return st.toString();

    }

    public static String repeat(String str, int n) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static int[] where(String str, String subStr) {
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i <= i + subStr.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {
                    j++;
                }
            }
        }
        return where;
    }

    public static String change(String str) {
        StringBuffer changed = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i <= sb.length() - 1; i++) {
            if (isLowerCase(sb.charAt(i)))
                changed.append(toUpperCase(sb.charAt((i))));
            if (isUpperCase(sb.charAt(i)))
                changed.append(toLowerCase(sb.charAt(i)));
        }


        return changed.toString();
    }

    public static String nice(String str, char separator) {
        StringBuffer decimal = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        int count = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (count == 3) {
                decimal.append(separator);
                decimal.append(sb.charAt(i));
                count = 0;
            } else
                decimal.append(sb.charAt(i));
            count++;
        }
        return decimal.reverse().toString();
    }

    public static String nice1(String str, char separator, int range) {
        StringBuffer decimal = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        int count = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (count == range) {
                decimal.append(separator);
                decimal.append(sb.charAt(i));
                count = 0;
            } else
                decimal.append(sb.charAt(i));
            count++;
        }
        return decimal.reverse().toString();
    }

    public static BigDecimal odsetki(double k, double p, int n) {
        BigDecimal odsetki = new BigDecimal("1.0");
        odsetki = odsetki.add(new BigDecimal("" + p / 100)).pow(n).multiply(new BigDecimal("" + k)).multiply(new BigDecimal("" + k)).multiply(new BigDecimal("0.001"));
        return odsetki;
    }

    public static BigInteger seeds(int n) {
        BigInteger wynik = new BigInteger("0");
        BigInteger p = new BigInteger("1");
        BigInteger a = new BigInteger("1");
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    wynik = wynik.add(a);
                    a = p.multiply(new BigInteger("2"));
                    p = a;
                }
            }
        }
        return wynik;

    }
}