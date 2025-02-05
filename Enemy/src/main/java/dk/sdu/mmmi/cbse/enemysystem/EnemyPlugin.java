package dk.sdu.mmmi.cbse.enemysystem;

import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
public class EnemyPlugin implements IGamePluginService {


    private Entity player;

    public EnemyPlugin() {
    }

        @Override
        public void start(GameData gameData, World world) {

        // Add entities to the world
        player = createPlayerShip(gameData);
        world.addEntity(player);
    }

        private Entity createPlayerShip(GameData gameData) {

        Entity playerShip = new Enemy();
        playerShip.setPolygonCoordinates(-5,-5,10,0,-5,5);
        playerShip.setX(gameData.getDisplayHeight());
        playerShip.setY(gameData.getDisplayWidth());
        playerShip.setRadius(8);
        return playerShip;
    }

        @Override
        public void stop(GameData gameData, World world) {
        // Remove entities
        world.removeEntity(player);
    }

    }
