import java.util.Scanner;
import java.util.ArrayList;
import processing.Procedure;
import math.Nations;
public class Main
{
  public static void main(String[] args)
  {
    if (args.length == 0)
    {
      interactive();
    }
    else
    {
      argsCom(args);
    }
  }

    
    //Вызов программы без аргументов
    public static void interactive()
    {
     int n;
     String o;
     System.out.print("Введите n:");
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     sc.nextLine();
     System.out.print("Хотите чтобы массив заполнился случайными числами? [Yes/No]: ");
     o = sc.nextLine();
  
     ArrayList<Double> list = new ArrayList<>();
     list = Procedure.createarraylist(n,o,sc);
      
     System.out.print("Сколько значений в строке вы хотите увидеть? ");
     int k;
     k = sc.nextInt(); 
     Procedure.showMassive(list,k);
     System.out.printf("%nРезультат математической функции - %.2f%n",Nations.firstTask(list)); 
    }

    //Обработка аргументов командной строки
    public static void argsCom(String[] args)
    {
      int n,k;
      String o;
      ArrayList<Double> list = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      n = Integer.parseInt(args[0]);
      o = args[1];
      k = Integer.parseInt(args[2]);
      list = Procedure.createarraylist(n,o,sc);
      Procedure.showMassive(list,k);   
      System.out.printf("%nРезультат математической функции - %.2f%n",Nations.firstTask(list)); 
    }
}
