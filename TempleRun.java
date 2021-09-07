class TempleRun
{
  static String templeName[] = new String[4];
  public static void main(String a[])
 {
  templeName[0] = "Virupaksha";
  templeName[1] = "Annapurneshwari";
  templeName[2] = "Sri Manjunata";
  templeName[3] = "Sri Krishna";
  gettempleName();
 }
  public static void gettempleName()
  {
   System.out.println(templeName.length);
   for(int i=0; i<templeName.length; i++)
    {
     System.out.println(templeName[i]+ " ");
    }
   }
}

