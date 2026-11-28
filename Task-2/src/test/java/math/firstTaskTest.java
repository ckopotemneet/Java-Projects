package math;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class firstTaskTest
{
  @Test
  @DisplayName("Проверка firstTaskTest ( 2(An1+ An2 + An...)^2 )")
  void testSum()
  {
    double results = Nations.firstTask(new ArrayList<>(List.of(3.45,42.14,53.0)));
    assertEquals(19439.9762,results,0.0000001); // При 3 45  42 14 и 53 0, firstTask должен вернуть 19439.9762 +- 0.0000001
  }
} 
