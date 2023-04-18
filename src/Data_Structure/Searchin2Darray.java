package Data_Structure;

import java.util.Arrays;

public class Searchin2Darray {
    public static void main(String[] args) {
        int [][]arr={ {1,2,5},
                       {7,9,0},
                       {10,7,67},
                       {88,101,109},
        };
        int target=67;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][]n, int target)
    {
        for(int row=0;row<n.length;row++)
        {
            for(int col=0;col<n[row].length;col++)
            {
                if(target==n[row][col])
                {
                  return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
