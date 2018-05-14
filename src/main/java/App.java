import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
      staticFileLocation("/public");
      String layout = "templates/layout.vtl";

        //hero class get and post methods   
      get ("/", (request,response)->{
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
      },new VelocityTemplateEngine());

    //   Squad class get and post methods

    get("/squads/new", (request, response)-> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "template/squad-form.vtl");
        return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get ("/squads", (request, response)-> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squads", Squad.all());
            model.put("template", "template/squad.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/squads/:id", (request, response)-> {
        Map<String, Object> model =new HashMap<String, Object>();
        Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
        model.put("squad", squad);
        model.put("template", "templates/squad.vtl");
        return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("squads/:id/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            Squad squad = Squad.find(Integer.parseInt(request.params(":id")));
            model.put("squad", squad);
            model.put("template", "templates/squad-hero-form.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

          post("/squads", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String cause = request.queryParams("cause");
            int size = Integer.parseInt(request.queryParams("size"));
            Squad newSquad = new Squad(name,cause,size);
            model.put("template", "templates/squad-success.vtl");
            return new ModelAndView(model, layout);
          }, new VelocityTemplateEngine());

      post("/heroes", (request,response)->{
          Map<String, Object> model = new HashMap<String,Object>();
          Squad squad = Squad.find(Integer.parseInt(request.queryParams("squadId"))); 
          String name = request.queryParams("SuperHero-Name");
          int age = Integer.parseInt(request.queryParams("hero-age"));
          Strikng power = request.queryParams("special-power");
         String weakness = request.queryParams("weakness");
          Hero myHero = new Hero(name,age,power,weakness);
     
          squad.addHero(myHero);
          model.put("squad", squad);       
          model.put("template", "templates/success.vtl");
          return new ModelAndView(model, layout);

      }, new VelocityTemplateEngine());
}
}