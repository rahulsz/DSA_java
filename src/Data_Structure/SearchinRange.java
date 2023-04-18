package Data_Structure;

import org.w3c.dom.ls.LSOutput;

public class SearchinRange {
    static int search(int[]  arr,int s,int e,int target)
    {
        if(arr.length==0)
            return -1;
        for(int i=s;i<=e;i++)
            if(target==arr[i])
            {
                return i;
            }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int start=1;
        int end=4;
        int target=3;

        System.out.println(search (arr,start,end,target));

    }
}
