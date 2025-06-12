public class Instanceof_Test {
    public static void main(String[] args) {

        String str = "Saim";
        Object obj = 1245;

        if(str instanceof String) {
            System.out.println(str + " This is the String");

        }else{
            System.out.println(str +" Not String");
        }

        if(obj instanceof String) {
            System.out.println(obj + " This is a String");
        }else{
            System.out.println(obj + " Not a String");
        }
    }
}