class Languages
{
 static String languages[] = {"Kannada","Malayalam","Tamil","Telugu","Bengali","Marathi","Urdu","Punjabi","Odia","Konkani","Nepali"};
 static String languageStates[] = {"Karnataka","Kerala","Tamil Nadu","Andhra Pradesh","West Bengal","Maharashtra","Jammu","Punjab","Odisha","Goa","Nepal"};

 public static void main(String a[])
{
 System.out.println("Main method started");
 getLanguageName(languages);
 getStatesOfLanguage(languageStates);
 System.out.println("Main method ended");
}
 public static void getLanguageName(String[] languages)
 {
  System.out.println("Name of Language");
  for(int i=0; i<languages.length; i++)
  System.out.println(languages[i]);
 }
public static void getStatesOfLanguage(String[] languageStates)
 {
  System.out.println("Name of States");
  for(int i=0; i<languageStates.length; i++)
  System.out.println(languageStates[i]);
 }

}