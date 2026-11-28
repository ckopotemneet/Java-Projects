package math;
import java.util.ArrayList;
public class Nations
{
  public static double firstTask(ArrayList<Double> list)
  {
    double a = 0;
    for (int i = 0; i < list.size(); i++)
    {
      a+=list.get(i);
    }
    a = Math.pow(a,2);
    a*=2;
    return a;
  }
}
