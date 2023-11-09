package homework.FinalProject;

import java.util.Scanner;

public class View {
    
    private final Scanner scanner = new Scanner(System.in);
    private final ICalculableFactory iCalculableFactory;

    public View(ICalculableFactory iCalculableFactory) {
        this.iCalculableFactory = iCalculableFactory;
    }


    public void run() {
        System.out.println("Калькулятор комплексных чисел.");
        Operations operations = iCalculableFactory.create(getComplexValue());
        while (true) {
            System.out.print("Операция (+,*,/,=) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    operations.sum(getComplexValue());
                    break;
                case "*":
                    operations.multi(getComplexValue());
                    break;
                case "/":
                    operations.division(getComplexValue());
                    break;
                case "=":
                    System.out.println("Результат: " + operations.getResult());
                    System.out.print("Продолжить y/n: ");
                    String nextCircle = scanner.nextLine().toLowerCase();
                    if (nextCircle.equals("n")) {
                        return;
                    } else {
                        operations = iCalculableFactory.create(getComplexValue());
                    }
                    break;
                default:
                    System.out.println(input + " - операция не поддерживается");
            }
        }
    }


    private ComplexValue getComplexValue(){
        System.out.println("Введите комплексное число: ");
        String input = scanner.nextLine();
        while (!input.matches("^[\\d]+\\+[\\d]+[i]$")) {
            System.out.print(input + " - не комплексное число, введите комплексное число: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        return new ComplexValue(Integer.parseInt(a), Integer.parseInt(b));
    }
}
