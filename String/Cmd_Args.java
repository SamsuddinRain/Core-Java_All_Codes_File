class Cmd_Args {
    public static void main(String[] x) {

        String s = x[0];
        String s2 = x[1];
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s2);

        System.out.println(a+b);
    }
}