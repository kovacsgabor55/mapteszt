package packages;

import java.util.*;

public class Progress {
    private final List<Entity> entities = new ArrayList<>();

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public List<String> mostMaxEntities() {
        List<String> result = new ArrayList<>();
        TreeMap<String, Integer> temp = new TreeMap<>();
        for (Entity item : entities) {
            if (temp.containsKey(item.getName())) {
                temp.put(item.getName(), temp.get(item.getName()) + 1);
            } else {
                temp.put(item.getName(), 1);
            }
        }
        Set<String> keys = temp.keySet();
        List<HelperClass> helperClasses = new ArrayList<>();
        for (String item : keys) {
            helperClasses.add(new HelperClass(item, temp.get(item)));
        }
        Collections.sort(helperClasses);
        for (int i = 0; i < helperClasses.size() && i < 3; i++) {
            result.add(helperClasses.get(i).getName());
        }
        return result;
    }
}
