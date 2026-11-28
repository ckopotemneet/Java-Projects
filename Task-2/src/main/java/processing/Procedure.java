package processing;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Procedure
{


  
  /* Создание динамического массива
     Принимает n кол-во элементов массива
     
     Возвращает ArrayList
  */ 
  public static ArrayList<Double> createarraylist(int n, String i, Scanner sc )
  {
    ArrayList<Double> list = new ArrayList<>();
    if (i.equalsIgnoreCase("yes") || i.equalsIgnoreCase("y") || i.equalsIgnoreCase("k"))
    {
      list = randlist(list, n);
    }
    else
    {
      list = setlist(list, n, sc);
    }
  return list;
  }


  
          //Приватный метод, заполняет ArrayList случайными числами
  private static ArrayList<Double> randlist(ArrayList<Double> list,int n)
  {
    Random rand = new Random();
    for (int i = 0; i < n ; i ++)
    {
      list.add(i,rand.nextDouble(100));
    }
  return list; 
  }
        // Приватный метод, пользователь сам вводит значения 
  private static ArrayList<Double> setlist(ArrayList<Double> list, int n, Scanner sc)
  {
    for (int i = 0; i < n; i++)
    {
      System.out.print("Введите " + (i+1) + " элемент массива");
      list.add(sc.nextDouble());
    }
  return list;
  }



      //Публичный метод, ничего не возвращает, выводит на экран по n элементов 
  public static void showMassive(ArrayList<Double> list,int n)
  {
    for (int i = 0; i < list.size() ; i++)
    {
      if (i % n == 0)
      {
        System.out.printf("\n%.2f ", list.get(i));
      }
      else
      {   
        System.out.printf("%.2f ",list.get(i));
      }
    }
  }


  // Запись в файл
  public static void fileExport(ArrayList<Double> list)
  {
    try
    {
      FileWriter file = new FileWriter("processingFiles/numbers.txt");
      file.write(list.toString());
      file.close();
    }
    catch(IOException e)
    {
      System.out.print("Ошибка чтения файла");
    }
  }

  
  // Запись из файла
  public static ArrayList<Double> fileImport()
  {
    ArrayList<Double> list = new ArrayList<>();
    try
    {
      Scanner sc = new Scanner(new File("processingFiles/inputnumbers.txt"));
      while(sc.hasNextDouble())
      {
        list.add(sc.nextDouble());
      }
    }
    catch (IOException e)
    {
      System.out.print("Ошибка чтения файла");
    }
    return list;
  }
}

