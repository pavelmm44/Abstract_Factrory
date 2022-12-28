package Classes;

public class ClassFactory {
    public static CharacterClass getClass(String type){
        if("Barbarian".equalsIgnoreCase(type))
            return new Barbarian();
        else if ("Druid".equalsIgnoreCase(type))
            return new Druid();

        return null;
    }
}