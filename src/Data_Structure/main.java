package Data_Structure;

public class main {
    public static void main(String[] args) {
        int[] arr={23,45,1,2,8,19,-3,16,11,28};
        int target=19;
        System.out.println(linearsearch(arr,19));
    }

    static int linearsearch(int[]n,int x)
    {
        if(n.length==0) {
            return -1;
        }

        for(int i=0;i<n.length;i++)
        {
            if(n[i]==x)
            {
                return i;
            }
        }

        return -1;


    }
}
