package ru.sber.ownstudy;

/*
Scanner sc = new Scanner(System.in);
! -    ОТРИЦАНИЕ
&& - И
|| -    ИЛИ
h = Math.sqrt(a * a + y * y) ГИПОТЕНУЗА
1) Вывести квадраты чисел от 1 до 10 и со след.строки от 10 до 1
2) Сложить все числа в ряде от 1 до 10
3) Юзер вводит от 1-999, вывести все числа между 0 и введеным числом
4) Машина загадывает число от 1-10. 3 попытки угадать.Подсказка: больше/меньше
*/


public class templates {
    
    /*1) int x;
        for (int n = 1; n < 11; n++) {
            x = n * n;
            System.out.println("квадрат " + n + " равен " + x);
        }
        
        System.out.println();
        
        for (int n = 10; n > 0; n--) {
            x = n * n;
            System.out.println("квадрат " + n + " равен " + x);
        }*/
  //****************************************************************************************************************************************      
       /*2) int x = 0;
        for (int n = 0; n < 11; n ++){
            x = n + x;            
        }
        System.out.println(x);
  //****************************************************************************************************************************************      
       3) Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите число от 1 до 999");
        int z = sc.nextInt();
        sc.close();
        if (z < 1 || z > 999) {
            System.out.println("Введено неправильное число");
        } else {
            for (int n = 1; n <= z; n++){
                System.out.print(" " + n + " ");                
            }System.out.println();
        val = -5;
        absval = val < 0 ? -val : val;
        }
        
        int n = (int)(Math.random()* 10 + 1);
        Scanner sc = new Scanner(System.in);
        int a;
        
         for (int x = 0; x < 3 ; x++) {
             System.out.println("TEST " + n);
             System.out.println("Введите число: ");
             int chislo = ();
             //sc.close();
             
             if (chislo < n){
                 System.out.println("Неправильно, загаданное число > " + chislo);
             } else if (chislo > n){
                 System.out.println("Неправильно, загаданное число < " + chislo);
             } else {
                 System.out.println("УГАДАЛИ! Ваше число " + chislo + " совпало с машинным числом " + n);
                 break;
             }//sc.close();
         }
    //****************************************************************************************************************************************
    Юзер вводит число, прога создает этим размером массив.Затем юзер вводит число и прога
сообщает сколько раз встречается в массиве это число
    
    System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int razmerMassiva = sc.nextInt();
        int [] massiv = new int[razmerMassiva]; // создали пустой массив размером с введное число
        int sum = 0;
        
        // заполняем массив рандомными данными
        for (int i = 0; i < razmerMassiva; i++){
            massiv[i] = (int)(Math.random() * 10);
            System.out.print(massiv[i] + " ");
            
        }System.out.println();
    
       System.out.println("Введите число");
        int chislo = sc.nextInt();
        
        for (int i:massiv) {
            if(i == chislo){
                sum = sum + 1;
            }
        }
        System.out.println("Введеное число встречается в массиве " + sum + " раз.");
****************************************************************************************************************************************    
    ВЫВОДИМ ТАБЛИЦУ ПИФАГОРА
    public static void main(String[] args) {
        int pifagor[][] = new int[10][10];
    
        for (int i = 1; i < 10; i++){
            for (int z = 1; z < 10; z++){
                pifagor[i][z] = i * z;
                System.out.print(pifagor[i][z] + " ");
            }
            System.out.println();
        }
    }
****************************************************************************************************************************************
 Сортировка строк
public static void main(String[] args) {
       
         String[] str = {"привет", "мир", "небо", "Кришна"};
         
         for (int j = 0; j < str.length; j++){
             for (int i = j + 1; i < str.length; i++){
                 
                 if (str[i].compareTo(str[j]) < 0){
                     String helper = str[j];
                     str[j] = str[i];
                     str[i] = helper;
                 }
             }
             System.out.println(str[j]);
        }
    }    
****************************************************************************************************************************************    
     //Прога чекает ввел ли что-либо
    public static void main(String[] args) {
        
        System.out.println("Введите текст");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if (str.isEmpty()){
            System.out.println("Строка пуста");
        }
        else
            System.out.println("Вы ввели " + str);
    }
    */

}
