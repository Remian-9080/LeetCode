public class Plus1 
{
    public int[] plusOne(int[] digits) 
    {
    StringBuilder st=new StringBuilder();
    for(int i=0;i<digits.length;i++)
    st.append(digits[i]);
    System.out.println(st);
    int number = Integer.parseInt(st.toString());
    number++;
    int digitCount=0,tempNumber=number;
    while (tempNumber > 0)
     {
        tempNumber /= 10;
        digitCount++;
    }
    int[] digitArray = new int[digitCount];
    tempNumber = number;
    for (int i = digitCount - 1; i >= 0; i--)
    {
        digitArray[i] = tempNumber % 10;
        tempNumber /= 10;
    }
    return digitArray;
    
}   
    public static void main(String[] args)
    {int[] myNum = {1, 2, 3, 4};
    Plus1 obj=new Plus1();
    obj.plusOne(myNum);   
    }
}


/* RUNTIME ERROR
 * 
 *  public int[] plusOne(int[] digits) 
    {
       for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) 
    {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
 */