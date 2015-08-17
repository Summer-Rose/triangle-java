import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class App {
    public static void main(String[] args) {
      String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();

        model.put("template", "templates/home.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/triangle", (request, response) -> {
        HashMap<String, Object> model = new HashMap<String, Object>();

        Integer sideOne = Integer.parseInt(request.queryParams("sideOne"));
        Integer sideTwo = Integer.parseInt(request.queryParams("sideTwo"));
        Integer sideThree = Integer.parseInt(request.queryParams("sideThree"));

        Triangle myTriangle = new Triangle(sideOne, sideTwo, sideThree);
        model.put("myTriangle", myTriangle);

        model.put("template", "templates/triangle.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    }
}
