class SocialMedia
{
 static String apps[] = {"WhatsApp","Instagram","Facebook","Telegram","Snapchat","Twitter","Messages"};
 public static void main(String a[])
{
 System.out.println("Main method started");
 getApplications(apps);
 System.out.println("Main method ended");
}
 
public static void getApplications(String[] apps)
{
 System.out.println("Name of Apps");
 for(int i=0; i<apps.length; i++)
 System.out.println(apps[i]);
}

}