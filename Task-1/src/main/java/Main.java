import math.*;
import java.util.Scanner;
import java.util.InputMismatchException;
//https://github.com/VetrovSV/OOP/blob/master/plans/tasks_java.md
// 
public class Main{
  
  public static void main(String[] args)
  {
    double x,y,z;
    try //Попытка считывания данных (то место где может произойти ошибка)
    {
      if (args.length == 1 && args[0].equals("--help") )
      {
        System.out.print("Использование программы Main \n"+
                         "Программа принимает 3 аргумента после Main\n"+
                         "Например: Java Main 1 0 1\n" +
                         "Так же программа может принять значения через Scanner\n"+
                         "Нужно запустить программу без аргументов (Java Main)");
        return ;
        
      }
      else if ( args.length == 3) // Проверка что было передано 3 аргумета
      {
        x = Double.parseDouble(args[0]);
        y = Double.parseDouble(args[1]);
        z = Double.parseDouble(args[2]);
      }
      
      else if ( args.length == 0) // Проверка на то что программу вызывают без аргументов
      {
        Scanner sc = new Scanner(System.in);
        System.out.print("Привет!\n");
        System.out.print("Введи x: ");
        x = sc.nextInt();
        System.out.print("Введи y: ");
        y = sc.nextInt();
        System.out.print("Введи z: ");
        z = sc.nextInt();
      }
      

      else // Больше или меньше аргументов
      {
        throw new IllegalArgumentException("Необходимо указать 3 значения");
      }
      
      double[] answer = union.calculator(x,y,z); // Передаем полученные данные в calculator
      System.out.println(answer[0] + " " + answer[1]);  
    }


    
    catch(InputMismatchException e) //Ловим ошибку 
    {
      System.out.println("Введено не число");
      System.exit(1);
    }

    catch(IllegalArgumentException e)
    {
      System.out.println(e.getMessage()); //Ловим ошибку
      System.exit(1); //Вовзращаем 1 - чтобы знать что программа завершилась с ошибкой для дальнейший рабоыт
    }
 }
}
