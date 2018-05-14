import java.util.ArrayList;
import java.util.List;

public class Squad{
    private String squadName;
    private String squadCause;
    private int squadSize;
    private int mId;
    private static List<Squad> heroSquad = new ArrayList<Squad>();
    private List<Hero> mHero;
    

    public Squad (String name, String cause, int size) {
        squadName=name;
        squadCause=cause;
        squadSize=size;
        heroSquad.add(this);
        mId = heroSquad.size();
        mHero = new ArrayList<Hero>(); 
    }
    public String getName() {
        return squadName;
    }

    public String getCause() {
        return squadCause;
    }

    public int getSize() {
        return squadSize;
    }
    public static List<Squad>all(){
        return heroSquad;
    }
    public static void clear(){
        heroSquad.clear();
    }
    public int getId() {
        return mId;
    }
    public static Squad find(int idNo){
        return heroSquad.get(idNo - 1);
    }
    public List <Hero> getHero() {
        return mHero;
    }
    public void addHero(Hero hero){
        mHero.add(hero);
    }

}