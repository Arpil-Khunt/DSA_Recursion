public class StringSkip{
    public static void main(String args[]){
       System.out.println(skip("aabbccdda",""));
    }
    static String skip(String s,String t){
        if(s.isEmpty()){
            return t;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
           return skip(s.substring(1),t);
        }
        return skip(s.substring(1),t+String.valueOf(ch));

    }
}
