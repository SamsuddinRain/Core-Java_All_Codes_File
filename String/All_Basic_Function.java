import java.util.Arrays;
class All_Basic_Function {
  public static void main(String[] args) {
         
         String str = "Hi,";
         String str2 = "Saim";
         String New = str.concat(str2);
         String str4= str.intern(); // it is used to access object from scp: 
         char arr[] = str2.toCharArray();

        
        // convert into string to array::
        System.out.println("String to Array: "+ Arrays.toString(arr));

       // But in this process have same memory allocation
        System.out.println("2. Comparing with memory: "+ str4.equals(str));
       
       // printing both variables::
          System.out.println(" First Variable value = "+ str);
          System.out.println(" Second Variable value = "+ str2);
      
      // Printing Strings Length::
          System.out.println("String length = "+New.length());
      
      // Here, I'm printing Upper and lower case::
          System.out.println("UpperCase: "+ New.toUpperCase() + "   LowerCase: " + New.toLowerCase());

      // Joining Two Strings::
          System.out.println("Joining Two Strings: " + New);
      
      // To Replace chars with another chars
          System.out.println();

      // finding char is available or not in given string Using indexOf()
          System.out.println("Index of a :"+str.indexOf('a'));
          System.out.println("Index of a :"+str2.indexOf('a'));
          System.out.println("Last Index of a :"+str2.lastIndexOf('a'));
          
      // Finding
          System.out.println("Substring of str2 :"+str2.substring(0,2));
      
      //Comparing Two Strings::
        if(str.equals(str2)) {
        System.out.println("Both are same::");
      
      }else{
        System.out.println("Both are not same::");   
     }
         System.out.println("Split ::"+str.equals(str2));
         
  }

}
