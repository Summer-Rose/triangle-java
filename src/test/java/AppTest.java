import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle Checker");
  }

  @Test
  public void isNotATriangle() {
    goTo("http://localhost:4567/");
    fill("#sideOne").with("1");
    fill("#sideTwo").with("2");
    fill("#sideThree").with("10");
    submit(".btn");
    assertThat(pageSource()).contains("That's not a triangle, dummy!");
  }

  @Test
  public void isEquilateral() {
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("2");
    fill("#sideThree").with("2");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is Equilateral!");
  }

  @Test
  public void isIsosceles() {
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("2");
    fill("#sideThree").with("3");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is isosceles!");
  }

  @Test
  public void isScalene() {
    goTo("http://localhost:4567/");
    fill("#sideOne").with("2");
    fill("#sideTwo").with("3");
    fill("#sideThree").with("4");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is scalene!");
  }
}
