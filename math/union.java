package math; //Пакет для мат формул
import java.util.ArrayList;
import java.util.Random;
//https://ivtipm.github.io/Programsming/Glava01/index01.htm#z11
public class union // Общий публичный класс, в нем буду узывать все необходимые мат. методы
{
  
  // Метод высчитывает условие задачи из задачника см. ссылку выше
  public static double[] calculator(double x, double y, double z)
  {
    if (x < 1)
      {
        throw new IllegalArgumentException("x должен быть >= 1");
      }
      
    double a = (Math.sqrt(x-1) - Math.cbrt(Math.abs(y))) / ( 1 + (Math.pow(x,2) /2 ) + (Math.pow(y,2) / 2) );
    double b = x*(Math.atan(z)+ Math.pow(Math.E,-(x+3)));
    return new double[]{a,b};
  }

  // Метод - Создание динамического массива на n элементов + заполнение случайными числами
  public static ArrayList<Double> randlist(int n)
  {
    ArrayList<Double> list = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < n ; i++)
    {
      list.add(rand.nextDouble(100));
    }
    return list;
  } 
}
