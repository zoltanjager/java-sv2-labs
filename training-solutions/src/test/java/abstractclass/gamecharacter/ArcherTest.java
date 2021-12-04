package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    @Test
    void testCreateArcher(){
        Random random = new Random();
        Character character = new Archer(new Point(0,0), random);

        assertEquals(100, character.getHitPoint());
        assertTrue(character.isAlive());
        assertEquals(0, character.getPosition().getX());
        assertEquals(0, character.getPosition().getY());

    }

    @Test
    void testIsAliveFalse() {

        Random random = new Random();
        Archer archer = new Archer(new Point(0, 0), random);
        Archer anotherArcher = new Archer(new Point(2, 2), random);

        assertTrue(anotherArcher.isAlive());

        while (anotherArcher.getHitPoint() > 0) {
            archer.secondaryAttack(anotherArcher);
        }
        assertFalse(anotherArcher.isAlive());
        assertTrue(archer.isAlive());
    }

    @Test
    void secondaryAttack() {
        Random random = new Random();
        Archer archer = new Archer(new Point(0, 0), random);
        Archer anotherArcher = new Archer(new Point(2, 2), random);
        archer.secondaryAttack(anotherArcher);

        assertEquals(99, archer.getNumberOfArrow());
        assertEquals(100, archer.getHitPoint());
        assertTrue(anotherArcher.getHitPoint() >= 95);
    }



}