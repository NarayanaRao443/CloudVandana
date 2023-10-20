import java.util.*;
public class RomanToInt {

    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        str = in.nextLine();
        int result = romanToInt(str);
        System.out.println(result);
    }

    public static int romanToInt(String st){
   
    HashMap<Character,Integer> hm = new HashMap<>();
    hm.put('I',1);
    hm.put('V',5);
    hm.put('X',10);
    hm.put('L',50);
    hm.put('C',100);
    hm.put('D',500);
    hm.put('M',1000); 
int dec = hm.get(st.charAt(st.length()-1));
for(int i=st.length()-2;i>=0;i--){
    if(hm.get(st.charAt(i))<hm.get(st.charAt(i+1))){
        dec -= hm.get(st.charAt(i));
    }
    else{
        dec += hm.get(st.charAt(i));
    }
    }
    return dec;
    }
}
