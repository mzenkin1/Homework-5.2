import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");

        int[] monthCost = new int[]{200, 400, 600, 800, 1000};
        int sumCost = 0;
        for (int i = 0; i < monthCost.length; i++) {
            sumCost += monthCost[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumCost + " рублей");

        System.out.println("Задание 2");

        int[] monthCost2 = new int[]{200, 400, 600, 800, 1000};

        int minCostAmount = monthCost[0];
        int maxCostAmount = monthCost[0];

        for (int salary : monthCost2) {
            if (salary < minCostAmount) {
                minCostAmount = salary;
            }

            if (salary > maxCostAmount) {
                maxCostAmount = salary;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCostAmount + " рублей. Максимальная сумма трат за неделю составила " + maxCostAmount + " рублей");

        System.out.println("Задание 3");

        int[] monthCost3 = new int[]{200, 400, 600, 800, 1000};

        int sumCost2 = 0;
         for (int salary : monthCost3) {
             sumCost2 += salary;
         }

         double sumCostAverage = (double) sumCost2 / monthCost3.length;

        System.out.println("Средняя сумма трат за месяц составила " + sumCostAverage + " рублей");

        System.out.println("Задание 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;

        }

        System.out.println(Arrays.toString(reverseFullName));





    }
}