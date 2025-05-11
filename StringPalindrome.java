package PrcaticePrbOOP;

public class StringPalindrome {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("madam");
        System.out.println(sb);
        StringBuffer sb2=sb.reverse();
        System.out.println(sb2);
        if(sb.equals(sb2)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
