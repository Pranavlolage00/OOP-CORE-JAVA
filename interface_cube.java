interface I1
{
    void cube(int n);
}
class Demo implements I1
{
    public void cube(int n)
    {
        int ans=n*n*n;
        System.out.println("Cube of number="+ans);
    }
  public static void main(String args[])
  {
      Demo ob=new Demo();
      ob.cube(5);
  }
}
