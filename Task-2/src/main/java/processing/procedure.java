package processing;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Procedure
{
  /* Создание динамического массива
     Принимает n кол-во элементов массива
     
     Возвращает ArrayList
  */ 
  public static ArrayList<Double> createarraylist(int n, String i )
  {
    ArrayList<Double> list = new ArrayList<>();
    if (i.equalsIgnoreCase("yes"))
    {
      list = randlist(list, n);
    }
    else
    {
      list = setlist(list, n);
    }
  return list;
  }
          //Приватный метод, заполняет ArrayList случайными числами
  private static ArrayList<Double> randlist(ArrayList<>() list,int n)
  {
    Random rand = new Random();
    for (int i = 0; i < n ; i ++)
    {
      list.add(i,rand.nextDouble(100));
    }
  return list; 
  }
        // Приватный метод, пользователь сам вводит значения 
  private static ArrayList<Double> setlist(ArrayList<>() list, int n)
  {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++)
    {
      System.out.print("Введите" + (i+1) + "элемент массива");
      list.add(sc.nextDouble());
    }
  return list;
  }
}

