package dk.sdu.mmmi.cbse.common.asteroids;

import dk.sdu.mmmi.cbse.common.data.Entity;

import java.util.Random;

/**
 *
 * @author corfixen
 */
public class Asteroid extends Entity {
    private int lifeAmount;

    public int getLifeAmount() {
        return lifeAmount;
    }

    public void setLifeAmount(int lifeAmount) {
        this.lifeAmount = lifeAmount;
    }
}
