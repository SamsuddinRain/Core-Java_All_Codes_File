class Demo {
    public static void main(String[] args) {

        String str = "Saim";
        String str2 = "Hi,";
          
        // Adding two String
        String result = str2.concat(str);
        System.out.println(result);

     // Here, for printing 0th index value  
        System.out.println(str.charAt(0));

        System.out.println(str.codePointAt(2));

        System.out.println(str.codePointBefore(1));
        System.out.println(str.length());
        System.out.println(str2.length());

        


            }
}