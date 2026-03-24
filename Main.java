import java.util.Scanner;



public class Main {

    private static int add(int num1, int num2) {

        int result = num1 + num2;
        return result;
    }

    private static int subtract(int num1, int num2) {

        int result = num1 - num2;
        return result;

    }

    private static int multiply(int num1, int num2) {

        int result = num1 * num2;
        return result;
    }

    private static double devide(int num1, int num2) {

        double result = num1 / num2;

        return result;

    }

    private static void calculator(Scanner sc) {

        while (true) {

            System.out.println("""
            PRESS 1 TO ADDITION
            PRESS 2 TO SUBTRACTION
            PRESS 3 TO MULTIPLY
            PRESS 4 TO DIVIDE
                    """);

            System.out.print("ENTER CHOICE=");
            String expression = sc.next();
            if (expression.equals("1") || expression.equals( "2")  ||
                    expression.equals("3" )|| expression.equals("4" ) ) {
                System.out.print("ENTER FIRST NUMBER =");
                int num1 = sc.nextInt();

                System.out.print("ENTER SECOND NUMBER =");
                int num2 = sc.nextInt();

                switch (expression) {
                    case "1":
                        int addNum = add(num1, num2);
                        System.out.println("ADDITION  IS " + addNum);

                        break;
                    case "2":
                        int subNum = subtract(num1, num2);

                        System.out.println("SUBTRACTION  IS " + subNum);

                        break;
                    case "3":
                        int multiplyNum = multiply(num1, num2);
                        System.out.println("MULTIPLICATION  IS " + multiplyNum);

                        break;
                    case "4":
                        if (num2 == 0) {
                            System.out.println("....CANNOT DEVIDE BY ZERO....");

                        } else {
                            double devideNum = devide(num1, num2) ;
                            System.out.printf("DEVISION  IS  " + devideNum);
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("..........wrong operation selected...........");

                }

                System.out.println("ENTER e TO EXIT OR ENTER c TO CONTINUE.");
                String s = sc.next();

                if (s.equalsIgnoreCase("e")) {
                    System.out.println("<<<<<<<<<<<<<EXITING PROGRAM.>>>>>>>>>>>>>>>>");
                    break;
                } else if (s.equalsIgnoreCase("c")) {
                    System.out.println(".........CONTINUEING PROGRAM.............");
                } else {
                    System.out.println("INVALID INPUT.");
                    break;
                }

            } else {
                System.out.println("------WRONG CHOICE SELECTED------");
            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            boolean isRunning = true;

            while (isRunning) {
                calculator(sc);

            }

        } catch (Exception e) {
            System.out.println("EXCEPTION HANDLED.");
            System.out.println("THIS EXCEPTION IS HAPPENED=");
            System.out.println(e);
        }

        sc.close();
    }

}
