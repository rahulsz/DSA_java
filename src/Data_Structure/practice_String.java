package Data_Structure;

public class practice_String {
    public static void main(String[] args) {
        String S="Rahul hi";
        String X=S.toLowerCase();
        char target='h';
        System.out.println(liner_search(S,target ));

    }
     static boolean liner_search(String s,char x)
     {
         if(s.length()==0)
             return false;

         for(char c:s.toCharArray())
         {
             if(x==c)
             {
                 return true;
             }
         }

         return false;
     }

}
