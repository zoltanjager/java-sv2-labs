package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AxeWarriorTest {

    @Test
    void testCreateAxeWarrior() {

        Random random = new Random();

        AxeWarrior axeWarrior = new AxeWarrior(new Point(0,0), random);

        assertEquals(100, axeWarrior.getHitPoint());
        assertTrue(axeWarrior.isAlive());
        assertEquals(0, axeWarrior.getPosition().getX());
        assertEquals(0, axeWarrior.getPosition().getY());
    }

    @Test
    void secondaryAttack() {

        Random random = new Random();

        AxeWarrior axeWarrior = new AxeWarrior(new Point(0,0), random);
        AxeWarrior anotherAxeWarrior = new AxeWarrior(new Point(2,0), random);

        axeWarrior.secondaryAttack(anotherAxeWarrior);

        assertEquals(100,axeWarrior.getHitPoint());
        assertTrue(anotherAxeWarrior.getHitPoint() >= 80);
        assertFalse(anotherAxeWarrior.getHitPoint() < 100);
    }

    @Test
    void secondaryAttackAnotherWarriorIsTooFar() {

        Random random = new Random();

        AxeWarrior axeWarrior = new AxeWarrior(new Point(0,0), random);
        AxeWarrior anotherAxeWarrior = new AxeWarrior(new Point(12,0), random);

        axeWarrior.secondaryAttack(anotherAxeWarrior);

        assertEquals(100,axeWarrior.getHitPoint());
        assertEquals(100, anotherAxeWarrior.getHitPoint());
    }
}