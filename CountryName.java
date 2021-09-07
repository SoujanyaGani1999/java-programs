class CountryName
{
public static void main(String a[])
{
 String countryName[] = {"India","Sri Lanka","England","South Africa","USA","Pakistan","China"};
  int noOfStates[] = {29,18,12,45,23,25,15};
  String listOfCapitals[] = {"New Delhi","Colombo","London","Cape Town","dkn","dkn","dkn"};

System.out.println(countryName[0] + " " + countryName[1] + " " + countryName[2] + " " + countryName[3] + " " + countryName[4] + " " + countryName[5] + " " + countryName[6]);
System.out.println(noOfStates[0] + " " + noOfStates[1] + " " + noOfStates[2] + " " + noOfStates[3] + " " + noOfStates[4] + " " + noOfStates[5] + " " + noOfStates[6]);
System.out.println(listOfCapitals[0] + " " + listOfCapitals[1] + " " + listOfCapitals[2] + " " + listOfCapitals[3] + " " + listOfCapitals[4] + " " + listOfCapitals[5] + " " + listOfCapitals[6]);

for( int s=0; s <countryName.length; s++)
{
System.out.println(countryName[s]+ " ");

}
for(int s=0; s< noOfStates.length; s++)
{
System.out.println(noOfStates[s]+ " ");
}
}



}



