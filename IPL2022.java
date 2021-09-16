class IPL2022
{
 static String teamsName[] = new String[8];
  public static void main(String a[])
{
 teamsName[0] = "RCB";
 teamsName[1] = "PK";
 teamsName[2] = "CSK";
 teamsName[3] = "SRH";
 teamsName[4] = "DC";
 teamsName[5] = "MI";
 teamsName[6] = "RR";
 teamsName[7] = "KKR";
getTeamsname();
}

public static void getTeamsname()
{
 System.out.println(teamsName.length);
 for(int s=0; s<teamsName.length; s++)
{
System.out.println(teamsName[s]+ " ");

}

}
}