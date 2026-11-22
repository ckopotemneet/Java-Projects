import java.util.Scanner;
import math.union;
import java.util.ArrayList;
public class Massive
{
  public static void main(String[] args)
  {
    System.out.print("Введите кол-во элементов массива: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Double> mymass= union.randlist(n);
    System.out.print(mymass);
    double sum = 0;
    for (int i = 0; i < n; i++)
    {
      sum = sum + mymass.get(i);
    }
    sum = 2 * Math.pow(sum,2);
    System.out.print(sum);
  }
}
