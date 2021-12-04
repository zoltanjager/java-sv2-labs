package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        return hitPoint > 0;
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    public Random getRandom() {
        return random;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Point getPosition() {
        return position;
    }
    abstract public void secondaryAttack(Character enemy);

    protected int getActualPrimaryDamage() {
        return random.nextInt(1, 11);
    }

    protected void hit(Character enemy, int damage) {
        int actualDefence = enemy.getActualDefence();
        if (actualDefence < damage ) {
            enemy.decreaseHitPoint(damage);
        }
    }

    private int getActualDefence() {
        return random.nextInt(0, 5);
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }


}
