public class ReverseChar
{
  public static void main(String[] args)
  {
    char[] cArr ={ 'B', 'U', 'H', 'D', 'I', 'U', 'Q', 'I', 'L' };
    int i;
    System.out.println("The array in reverse : ");
    for(i=0;i<cArr.length;i++)
    {
     System.out.print(cArr[cArr.length-1-i]+" ");
    }
    System.out.println();
  }
}