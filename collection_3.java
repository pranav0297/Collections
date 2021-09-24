import java.util.*;


public class collection_3 {

    void occurence(String s){
        s = s.replace(" ","");
        s = s.toLowerCase();

        int count = 0;
        char ch ;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0; i<s.length();i++){
            ch = s.charAt(i);
            if(hm.containsKey(ch)){
                count = hm.get(ch);
                count++;
                hm.replace(ch,count);

            }
            else{
                hm.put(ch,1);
            }
        }
        // System.out.println(hm.keySet());
        // System.out.println(hm.values());
        // System.out.println(hm);
        for(Character key : hm.keySet()){
            System.out.println(key+" = "+hm.get(key));
        }
    }

    public static void main (String[] args) {

        String s = "Pranav Mishra is an engineer";
        collection_3 c = new collection_3();
        c.occurence(s);
    }
}
