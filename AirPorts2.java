class AirPorts2
{
static String internationalAirPorts[] = new String[3];
public static void main(String a[])
{
internationalAirPorts[0] = "Emirates";
internationalAirPorts[1] = "British Airways";
internationalAirPorts[2] = "Etihad Airways";
getinternationalAirPorts();
}
public static void getinternationalAirPorts()
{
System.out.println(internationalAirPorts.length);
for(int s=0; s<internationalAirPorts.length; s++)
{
System.out.println(internationalAirPorts[s]+ " ");
}
}
}