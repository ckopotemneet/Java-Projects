import java.util.Scanner;
import java.util.ArrayList;
import processing.procedure;
public class main
{
  public static void main(String[] args)
  {
    int n;
    String o;
    System.out.print("Введите n:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.nextLine();
    System.out.print("Хотите чтобы массив заполнился случайными числами? [Yes/No]");
    o = sc.nextLine();
    
    ArrayList<Double> list = new ArrayList<>();
    list = procedure.createarraylist(n,o);
     
  }
}
