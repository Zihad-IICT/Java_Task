package PrcaticePrbOOP;

public class CountOccuraneChar {
    public static void main(String[] args) {
        String s1=new String("Zihadul Islam");
        char tar='a';
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==tar){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
