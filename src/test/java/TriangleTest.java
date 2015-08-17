import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2,4,5);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void isTriangle_NotATriangle() {
    Triangle testTriangle = new Triangle(2,2,5);
    assertEquals(true, testTriangle.isNotATriangle());
  }

  @Test
  public void isTriangle_isEquilateral() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isTriangle_isIsosceles() {
    Triangle testTriangle = new Triangle(2,2,4);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isTriangle_isScalene() {
    Triangle testTriangle = new Triangle(3,2,4);
    assertEquals(true, testTriangle.isScalene());
  }
}
