class SuperMarket
{
 static String[] shampoo = {"Clinic Plus","Dove","Sunsilk","Vatika","Clear","Tresemme","Head and Shoulders","Nyle"};
 static String[] faceWash = {"Himalaya","Clean and Clear","Everyuth","Ponds","Nivea","Charcoal"};
 static String[] soap = {"Santoor","Mysore Sandal","Chandrika","Lux","Vivel","Medimix","Liril","Dove","Hamam"};
 
 public static void main(String a[])
{
 System.out.println("Main method started");
 getShampoo(shampoo);
 getFaceWash(faceWash);
 getSoap(soap);
System.out.println("Main method ended");
}

 public static void getShampoo(String[] shampoo)
 {
  System.out.println("Name of Shampoo");
  for(int i=0; i<shampoo.length; i++)
  System.out.println(shampoo[i]);
 }

 public static void getFaceWash(String[] faceWash)
 {
  System.out.println("Name of FaceWash");
  for(int i=0; i<faceWash.length; i++)
  System.out.println(faceWash[i]);
  }
 
 public static void getSoap(String[] soap)
{
 System.out.println("Name of Soaps");
 for(int i=0; i<soap.length; i++)
 System.out.println(soap[i]);
}
 

} 

