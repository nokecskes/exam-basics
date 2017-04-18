package oddavg;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 * Created by Connor on 2017.04.18..
 */
class OddAvgTest {

  OddAvg oddAvg = new OddAvg();
  ArrayList<Integer> testList = new ArrayList<>();
  double expectedAverage;

  @Test
  public void listFromOneToTen() {
    for (int i = 0; i < 10; i++) {
      testList.add(i + 1);
    }
    expectedAverage = 5;
    assertEquals(expectedAverage, oddAvg.oddAverage(testList));
  }

  @Test
  void listOfEvenNumbersOnly() {
    testList.clear();
    for (int i = 0; i < 10; i += 2) {
      testList.add(i);
    }
    expectedAverage = 0;
    assertEquals(expectedAverage, oddAvg.oddAverage(testList));
  }

  @Test
  void expectedReturnValueOfDouble() {
    testList.clear();
    testList.add(1);
    testList.add(3);
    testList.add(7);
    expectedAverage = 11d / 3d;
    assertEquals(expectedAverage, oddAvg.oddAverage(testList));
  }

  @Test
  void emptyList() {
    testList.clear();
    expectedAverage = 0;
    assertEquals(expectedAverage, oddAvg.oddAverage(testList));
  }
}