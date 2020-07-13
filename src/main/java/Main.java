import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите первый аргумент:");
        Scanner scanner = new Scanner(System.in);
        String arg1 = scanner.nextLine();
        System.out.println("Введите оператор(+,-,*,/):");
        String operator = scanner.nextLine();
        System.out.println("Введите второй агрумент:");
        String arg2 = scanner.nextLine();
        Double doubleArg1;
        Double doubleArg2;
        System.out.println("Результат:");
        if (arg1.contains(".") || arg2.contains(".")){
            doubleArg1 = Double.parseDouble(arg1);
            doubleArg2 = Double.parseDouble(arg2);
            if (operator.equals("+")){
                System.out.println(Calc.sum(doubleArg1,doubleArg2));
            } else if (operator.equals("-")){
                System.out.println(Calc.minus(doubleArg1,doubleArg2));
            } else if (operator.equals("/")){
                System.out.println(Calc.div(doubleArg1,doubleArg2));
            } else if (operator.equals("*")){
                System.out.println(Calc.multi(doubleArg1,doubleArg2));
            }
            return;
        }
        Integer number1 = Integer.parseInt(arg1);
        Integer number2 = Integer.parseInt(arg1);
        if (operator.equals("+")){
            System.out.println(Calc.sum(number1,number2));
        } else if (operator.equals("-")){
            System.out.println(Calc.minus(number1,number2));
        } else if (operator.equals("/")){
            System.out.println(Calc.div(number1,number2));
        } else if (operator.equals("*")){
            System.out.println(Calc.multi(number1,number2));
        }

    }
}
