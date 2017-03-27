
public class Main {
    //COMMAND LINE ARGUMENTS ARE : [0]: 1  [1]: Hi  [2]: True
    public static void main(String[] args) {
        System.out.println("begin");

        for (String arg:args) {
            System.out.println("\n\nyour arg is: " + arg);
            int num = Integer.parseInt(arg);
            if (num > 0) {
                System.out.println("The int " + num +" is > 0");
            }else if (num < 0) {
                System.out.println("The int" + num + " is <= 0");
            }else {
                System.out.println("The int" + num + " IS 0!");
            }



            System.out.println("Lets do some math on "+ num );
            int arithmetic = 5 * 2 + (9 % 2 / 3) * 2 - 8;
            System.out.println("Here is some annoying arithmetic " + "5 * 2 + (9 % 2 / 3) * 2 - 8 = 2");
            System.out.println("arithmetic is equal to " + arithmetic);
            int sum = num + arithmetic;
            System.out.println("The total sum of num + arithmetic " + sum);

            switch (arg) {
                case "1":
                    System.out.println(arg + " is the loneliest number!");
                    break;
                case "2":
                    System.out.println("2 for the road");
                    break;
                case "3":
                    System.out.println("3 to get ready");
                    break;
                default:
                    System.out.println("I guess you didn't give me a number between 1 and 3");


            }









            // System.out.println("If your arg has a number, lets multiply it by 2, add 5");


            //int num = Integer.parseInt(arg) * 2 +5;
            //System.out.println(num);

            //int num = Integer.parseInt("2");
            //System.out.println("num is " + num);
             /*
            System.out.println("Lets do some math on num.. ");
            int arithmetic = (10%3)*(8 / 2) + (1 - 8 + 7);
            System.out.println(arithmetic);
            System.out.println("Lets find the sum of num and " +(10%3)*(8 / 2) + (1 - 8 + 7));
            System.out.println("num + " + arithmetic + " = " + num + arithmetic );
            */




        }

    }
}
