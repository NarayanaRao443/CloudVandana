
public class Pangram {
    public static void main(String[] args) {
        String st = "ABCD EFGH KLMN IJ UVWX YZ OPQRST HELLO WORLD";
        System.out.println(isPangram(st.toLowerCase()));
    }

    public static boolean isPangram(String s){
        if(s.length()<0){
            return false;
        }
        else{
            for(char ch = 'a'; ch<='z';ch++){
                if(s.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }
}