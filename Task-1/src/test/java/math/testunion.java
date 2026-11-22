package math;

import org.junit.jupiter.api.Test; //Портируем Junit 5 версии
public class testunion //Проверка класса union
{

// Меод testresults проверяет результат выполненения класса calculator из union, связанную с мат функциям
  @Test
  public void testresults() 
  {
    // 1 0 0
    double[] p1 = union.calculator(1,0,0);
    assert Math.abs(p1[0]) < 0.0000000000001;           // при значениях x y z | 1 0 0 -> p0 =  0.0
    assert Math.abs(p1[1] - 0.0183156389) < 0.0000001;  //                        значние p1 =  0.018315638888734186

    // 2 0 0
    double[] p2 = union.calculator(2,0,0);
    assert Math.abs(p2[0] - 0.3333333333) < 0.0000001;  // при значениях x y z | 2 0 0 -> p0 = 0.3333333333
    assert Math.abs(p2[1] - 0.0134758939) < 0.0000001;  //                        значние p1 = 0.0134758939 

    // 1 1 0
    double[] p3 = union.calculator(1,1,0);
    assert Math.abs(p3[0] - (-0.5)) < 0.00000001;          // при значениях x y z | 1 1 0 -> p0 = -0.5
    assert Math.abs(p3[1] - 0.0183156389) < 0.0000001;  //                        значние p1 =  0.0183156389

  }
}
