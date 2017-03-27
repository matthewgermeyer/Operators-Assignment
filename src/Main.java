public class Main {
    //COMMAND LINE ARGUMENTS ARE : [0]: 1  [1]: Hi  [2]: True
    public static void main(String[] args) {
        //prints 'begin'
        System.out.println("begin");

        // FOR ----  for each element arg, in String[] args, do the following:
        for (String arg:args) {
            //print 2 new lines, followed by 'your arg is' and the arg itself
            System.out.println("\n\nyour arg is: " + arg);

            // take each arg, parse it to an into, store in int variable num.
            int num = Integer.parseInt(arg);
            //if > 0, tell me..
            if (num > 0) {
                System.out.println("The int " + num +" is > 0");
                // if < 0, tell me..
            }else if (num < 0) {
                System.out.println("The int" + num + " is <= 0");
                // If == 0, tell me..
            }else {
                System.out.println("The int" + num + " IS 0!");
            }

            //Math
            System.out.println("Lets do some math on "+ num );
            int arithmetic = 5 * 2 + (9 % 2 / 3) * 2 - 8;
            System.out.println("Here is some annoying arithmetic " + "5 * 2 + (9 % 2 / 3) * 2 - 8 = 2");
            System.out.println("arithmetic is equal to " + arithmetic);
            int sum = num + arithmetic;
            System.out.println("The total sum of num + arithmetic is " + sum);


            //Switch
            switch (arg) {
                case "0":
                    System.out.println(arg + "is your arg");
                case "1":
                    System.out.println(arg + " is the loneliest number!");
                    break;
                case "2":
                    System.out.println(arg + " for the road");
                    break;
                case "3":
                    System.out.println(arg + " to get ready");
                    break;
                default:
                    System.out.println(arg + "is a number > 3");


            }
        }

        for (int i = 0; i < args.length; ++i) {
            System.out.println("your arg is " + args[i]);
        }

        System.out.println("\n\n after enhanced for loop");
        int firstarg = Integer.parseInt(args[0]);
        int secondarg = Integer.parseInt(args[1]);
        if (firstarg > secondarg){
            System.out.println(firstarg +" > "+ secondarg);
        }else {
            System.out.println(firstarg +" <= "+ secondarg);
        }


    }
}
