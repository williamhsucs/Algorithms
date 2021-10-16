import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {

  @Before
  public void setUp() {
    // Add setup code here!
    
  }

  @After
  public void tearDown() {
    // Add teardown code here!
    
  }

  @Test
  public void MergeSortTest1() {
    int[] ary = {10, 90, 20, 80, 30, 70, 40, 60, 50};
    int[] expect = {10, 20, 30, 40, 50, 60, 70, 80, 90};
  
    MergeSort ms = new MergeSort();
    ms.sort(ary);
    
    assertArrayEquals(expect, ary);
  }

  @Test
  public void MergeSortTest2() {
    int[] ary = {20, 10};
    int[] expect = {10, 20};
  
    MergeSort ms = new MergeSort();
    ms.sort(ary);
    
    assertArrayEquals(expect, ary);
  }

  @Test
  public void MergeSortTest3() {
    int[] ary = {0};
    int[] expect = {0};
  
    MergeSort ms = new MergeSort();
    ms.sort(ary);
    
    assertArrayEquals(expect, ary);
  }

  @Test
  public void MergeSortTest4() {
    int[] ary = {10, -90, 20, -80, 30, -70, 40, -60, 50};
    int[] expect = {-90, -80, -70, -60, 10, 20, 30, 40, 50};
  
    MergeSort ms = new MergeSort();
    ms.sort(ary);
    
    assertArrayEquals(expect, ary);
  }

}