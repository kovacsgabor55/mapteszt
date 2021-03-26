package packages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressTest {
    private Progress progress;

    @BeforeEach
    void init() {
        progress = new Progress();
    }

    @Test
    void mostMaxEntitiesTwoElement() {
        Entity entity1 = new Entity(1L, "Margarita", "itt");
        Entity entity2 = new Entity(2L, "Salam", "ott");
        Entity entity3 = new Entity(3L, "Salam", "amott");
        Entity entity4 = new Entity(4L, "Margarita", "emitt");
        Entity entity5 = new Entity(5L, "Margarita", "sehol");
        Entity entity6 = new Entity(6L, "Hawaii", "hol");
        Entity entity7 = new Entity(7L, "Bacon", "nemott");
        Entity entity8 = new Entity(8L, "Hawaii", "emitt");
        progress.addEntity(entity1);
        progress.addEntity(entity2);
        progress.addEntity(entity3);
        progress.addEntity(entity4);
        progress.addEntity(entity5);
        progress.addEntity(entity6);
        progress.addEntity(entity7);
        progress.addEntity(entity8);
        assertEquals("[Margarita, Hawaii, Salam]", progress.mostMaxEntities().toString());
    }

    @Test
    void mostMaxEntitiesSomeElement() {
        Entity entity1 = new Entity(1L, "Margarita", "itt");
        Entity entity2 = new Entity(4L, "Margarita", "emitt");
        Entity entity3 = new Entity(5L, "Margarita", "sehol");
        Entity entity4 = new Entity(6L, "Hawaii", "hol");
        Entity entity5 = new Entity(8L, "Hawaii", "emitt");
        progress.addEntity(entity1);
        progress.addEntity(entity2);
        progress.addEntity(entity3);
        progress.addEntity(entity4);
        progress.addEntity(entity5);
        assertEquals("[Margarita, Hawaii]", progress.mostMaxEntities().toString());
    }
}
