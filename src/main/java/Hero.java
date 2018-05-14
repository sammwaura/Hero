import java.util.ArrayList;
import java.util.List;
public class Hero{

// private variables that outline the hero properties

private String heroName;
private int heroAge;
private String heroSuperPower;
private String heroWeakness;
private static List<Hero> heroList = new ArrayList<Hero>();
private int mId;

public  Hero(String name,int age,String power, String weakness) {
    heroName=name;
    heroAge=age;
    heroSuperPower=power;
    heroWeakness=weakness;
    heroList.add(this);
    mId = heroList.size();

    public String getName(){
        return heroName;
    }

    public int getAge() {
        return heroAge;
    }

    public String getSuperPower() {
        return heroSuperPower;
    }

    public String getWeakness() {
        return heroWeakness;
    }

    public static List<Hero> all(){
        return heroList;
    }
    public static void clear() {
        heroList.clear();
      }
    public int getId() {
        return mId;
      }
      public static Hero find(int id) {
        return heroList.get(id - 1);
      }
    }
 
