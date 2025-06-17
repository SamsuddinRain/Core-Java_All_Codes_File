class Occurance {
    public static void main(String[] args) {
        
        String str = "java";
        String[] occ = str.split("a",-1);
        int count = occ.length - 1;
        
        System.out.println("Numbers of Occurances: "+count);
    }
}