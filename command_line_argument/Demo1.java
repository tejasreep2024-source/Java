class Demo1{
    public static void main(String[] args) {
        // System.out.println(args.length);
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println("Name:" +args[0]);


        // int num1 = Integer.parseInt(args[0]);
        // int num2 =Integer.parseInt(args[1]);

        // int sum = num1+num2;
        // System.out.println("sum: " +sum);

        System.out.println("Argument Length"+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}