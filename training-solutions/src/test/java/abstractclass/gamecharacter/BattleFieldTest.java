package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class BattleFieldTest {


    @Test
    void testFight() {

        Random random = new Random();
        BattleField battleField = new BattleField();
        Archer archer = new Archer(new Point(0, 0), random);
        AxeWarrior axeWarrior = new AxeWarrior(new Point(3, 0), random);
        battleField.fight(archer, axeWarrior);

        assertTrue(battleField.getRound() > 0);
        assertTrue(!archer.isAlive() || !axeWarrior.isAlive());

    }
}