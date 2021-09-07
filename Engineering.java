class Engineering
{
 static String []stream = new String[4];
public static void main(String a[])
{
 stream[0] = "CS"; 
stream[1] = "Civil";
stream[2] = "Mech";
stream[3] = "EC";
 getstream();
}
 public static void getstream()
{
 System.out.println(stream.length);
 for(int s=0; s<stream.length; s++)
{
System.out.println(stream[s]+ " ");

}

}
}