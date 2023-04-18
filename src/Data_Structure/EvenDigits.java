package Data_Structure;

public class EvenDigits {

    static int findmembers(int []nums)
    {
        int count=0;
        for(int num:nums)
        {
            if(even(num))
            {
                count++;
            }

        }
        return count;
    }

    static boolean even(int num)
    {
        int ans=digits(num);
        if(ans%2==0)
            return true;

        else
            return false;
    }

    static int digits(int num)
    {
        if(num<0)
        {
            num=num*-1;
        }

        String s="";
        s=s+num;

        return s.length();

    }




    public static void main(String[] args) {
        int[] n={123,23,456,78,8897};
        System.out.println(findmembers(n));

    }
}

