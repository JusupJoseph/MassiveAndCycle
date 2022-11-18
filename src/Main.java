import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массивы - структура данных, в которой храним набор переменных одного типа. Шкаф с полочками.

        double a = 5;
        double b = 2;
        int[] dsjflkjd = {1,3,4,56,7,7};
        System.out.println(Arrays.toString(dsjflkjd));



        String[] numbers = new String[5]; //создание пустого массива с заданной длиной 5
        int[] numbers2 = {};//создание пустого массива с заданной длиной 10

        numbers = new String[55];
        System.out.println(Arrays.deepToString(numbers));

        // int - 0; double - 0.0; string = null; char -  0

        int arrayWithVariables[] = {2,3,-10,0,345,-700};
        System.out.println(arrayWithVariables[0]);
        System.out.println(arrayWithVariables[1]);
        System.out.println(arrayWithVariables[2]);
        System.out.println(arrayWithVariables[3]);
        System.out.println(arrayWithVariables[4]);
        System.out.println(arrayWithVariables[5]);
        //System.out.println(arrayWithVariables[6]);
        arrayWithVariables[0] = 3;
        System.out.println("-------------");
        System.out.println(arrayWithVariables[0]);


        double arrayDouble[] = {2.0,3.3};
        System.out.println(arrayDouble[0]);
        System.out.println(arrayDouble[1]);

        String arrayString[] = {"Hi","Geek","Tech"};
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);


        //двумерный массив
        int[][] array2D = new int[4][5];
        array2D[1][1] = 3;

        System.out.println(Arrays.deepToString(array2D));
        System.out.println(Arrays.toString(arrayWithVariables));

        String[][] stringArray = {{"Hi","Alisa",},{"dd","cc",}};
        // ЦИКЛЫ

        for (int i = 100; i > 10; i--) {
            System.out.println(1);

        }

        for (int i = 1; i <= 3; i = i+1){
            System.out.println("Hello");
            System.out.println(i);
        }
//  i = i + 1      i++  - инкрементация       i-- декрементация i = i-1

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
            System.out.println(i);
        }
        System.out.println("--------------------------");
        // таблица умножения на 5

        for (int i = 1; i <= 10; i++) {
            // System.out.println(i*5);
            System.out.println("5 x " + i + "= " +(5*i));
        }
        System.out.println("--------------------------");
        for (int i = 10; i >= 1 ; i--) {
            System.out.println("5 x " + i + "= " +(5*i));
        }

        // таблица умноджения на 8 но с конца и только на четные
        System.out.println("--------------------------");

        for (int i = 10; i >= 1 ; i = i-2) {
            System.out.println("5 x " + i + "= " +(8*i));
        }
        System.out.println("--------------------------");

        for (int i = 9; i >= 1 ; i = i-2) {
            System.out.println("5 x " + i + "= " +(8*i));
        }


        System.out.println("--------------------------");

        for (int i = 10; i >= 1 ; i--) {
            if(i%2==0){
                System.out.println("5 x " + i + "= " +(8*i));
            }
        }


        // While цикл

        System.out.println("*********");
        int c = 0;
        while(c<5){
            System.out.println(c);
            c++;
        }

        String str = "#";
        while(str.length()<5){
            System.out.println(str);
            str =str + "#";
        }


        String[] robots = new String[5];
        System.out.println(Arrays.toString(robots));
//        robots[0] = "Roboy_001";
//        robots[1] = "Roboy_002";
//        robots[2] = "Roboy_001";
//        robots[3] = "Roboy_001";
//        robots[4] = "Roboy_001";

        for (int i = 0; i < robots.length ; i++) {
            robots[i] = "Robot__00"+(i+1);
        }
        System.out.println(Arrays.toString(robots));

        System.out.println("************************");
        String[] students = {"Adilet","Aminat","Jusup","Marsel","Nurdoolot"};
        for (String currentName : students) {
            System.out.println("Hi "+currentName);
        }

        //do...while

        System.out.println("************************");

        // break; continue;
        int[] numbersArray = {3,-3,54,9,-7,0};
        for (int i = 0; i < numbersArray.length; i++) {
            if(numbersArray[i] < 0){
                break;     // экстренно прерывает работу цикла
            }
            System.out.println(numbersArray[i]);
        }
        System.out.println("************************");

        for (int i = 0; i < numbersArray.length; i++) {
            if(numbersArray[i] < 0){
                continue; // экстренно прерывает текущий круг цикла
            }
            System.out.println(numbersArray[i]);
        }


        System.out.println("--------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("Внешний цикл"+i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Внутренний цикл"+i);
            }
        }
    }
}