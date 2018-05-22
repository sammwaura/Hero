import java.util.ArrayList;
import java.util.List;
public class Hero{

// private variables that outline the hero properties

private String mName;
private int mAge;
private String mSuperPower;
private String mWeakness;
private static List<Hero> heroList = new ArrayList<Hero>();
private int mId;

public  Hero(String name,int age,String power, String weakness) {
    mName=name;
    mAge=age;
    mSuperPower=power;
    mWeakness=weakness;
    heroList.add(this);
    mId = heroList.size();
}

    public String getName(){
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public String getSuperPower() {
        return mSuperPower;
    }

    public String getWeakness() {
        return mWeakness;
    }

    public List<Hero> all(){
        return heroList;
    }
    public void clear() {
        heroList.clear();
      }
    public int getId() {
        return mId;
      }
      public Hero find(int id) {
        return heroList.get(id - 1);
      }
    }
 
