class Speaker
{
 static String name = "Boat";
 static int minVolume = 0;
 static int maxVolume = 15;
 static boolean isConnected  = false;
 static int currentVolume;

  public static boolean onOrOff()
 {
  System.out.println("Inside onOrOff");
  if(isConnected == false)
      {
       isConnected = true;
  System.out.println("Speaker is turned on...");
    return isConnected;
      }
  else if(isConnected == true)
{
  isConnected = false;
  System.out.println("Speaker is turned off...");
  return isConnected;
  }
   return false;
 }

public static void increaseVolume()
{
 System.out.println("inside increaseVolume()");
 if(isConnected)
  {
      if(currentVolume < maxVolume)
      { 
       currentVolume = currentVolume + 1;
       System.out.println("The currrentVolume is:" +currentVolume);
       }
else
{
System.out.println("Max volume reached.......");

}
   }
else
{
System.out.println("Gube switch on the speaker");
}
 System.out.println("end of increaseVolume()");
 
}
 public static void decreaseVolume()
{  
 System.out.println("inside decreaseVolume()");
   if(isConnected)
    {
     if(currentVolume > minVolume)
      {
        currentVolume = currentVolume - 1;
        System.out.println("The currentVolume is:" +currentVolume);


}
else
{
System.out.println("Min volume reached.....");

}
 }
System.out.println("end of decreaseVolume()");
}


}