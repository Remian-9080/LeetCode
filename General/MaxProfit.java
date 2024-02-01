public class MaxProfit {
    public int maxProfit(int[] prices) 
    {
    int m=Integer.MAX_VALUE;
    int rev=0;
    int pro=0;
    for(int i=0;i<prices.length; i++)
    {
        if(prices[i]<m)
        m=prices[i];

    pro=prices[i]-m;
    if(rev<pro)
    rev=pro;
    }
    return rev;
    }

}
