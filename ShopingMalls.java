class ShopingMalls
{
static String mallsName[] = new String[4]; 
public static void main(String a[])
{
mallsName[0] = "Orion";
mallsName[1] = "Phieonix";
mallsName[2] = "Mantri Square";
mallsName[3] = "Chor Bajar";
getmallsName();
}
public static void getmallsName()
{
System.out.println(mallsName.length);
for(int i=0; i<mallsName.length; i++)
{
System.out.println(mallsName[i]+ " ");
}
}
}