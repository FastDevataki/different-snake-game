package com.thepot.differentsnakegame.service.levels;

import com.thepot.differentsnakegame.service.LevelService;

import static com.thepot.differentsnakegame.model.CellType.FOOD;
import static com.thepot.differentsnakegame.model.CellType.FOOD_MOVE_TO_NEXT_LEVEL;
import static com.thepot.differentsnakegame.model.CellType.OBSTACLE;
import static com.thepot.differentsnakegame.model.CellType.POISON;
import static com.thepot.differentsnakegame.model.CellType.SAVE;
import static com.thepot.differentsnakegame.model.CellType.WALL;

public class Level18_1 implements Level {
    private LevelService levelService;

    public Level18_1(LevelService levelService) {
        this.levelService = levelService;
    }


    @Override
    public void loadLevel() {
        levelService.makeWallTransparent(false);
        levelService.updateMoveCount(-1);

        levelService.addLevelCell(2, 7, WALL);
        levelService.addLevelCell(3, 6, WALL);
        levelService.addLevelCell(4, 5, WALL);
        levelService.addLevelCell(5, 4, WALL);
        levelService.addLevelCell(6, 3, WALL);
        levelService.addLevelCell(7, 2, OBSTACLE);
        levelService.addLevelCell(8, 3, WALL);
        levelService.addLevelCell(9, 4, WALL);
        levelService.addLevelCell(10, 5, WALL);
        levelService.addLevelCell(11, 6, WALL);

        levelService.addLevelCell(10, 9, WALL);
        levelService.addLevelCell(9, 10, WALL);
        levelService.addLevelCell(8, 11, WALL);
        levelService.addLevelCell(7, 12, WALL);
        levelService.addLevelCell(6, 11, WALL);
        levelService.addLevelCell(5, 10, WALL);
        levelService.addLevelCell(4, 9, WALL);
        levelService.addLevelCell(3, 8, WALL);

        levelService.addLevelCell(1, 0, WALL);
        levelService.addLevelCell(1, 1, WALL);
        levelService.addLevelCell(1, 2, WALL);
        levelService.addLevelCell(1, 3, WALL);
        levelService.addLevelCell(1, 4, WALL);
        levelService.addLevelCell(2, 4, WALL);
        levelService.addLevelCell(3, 4, WALL);
        levelService.addLevelCell(4, 4, WALL);

        levelService.addLevelCell(3, 1, WALL);
        levelService.addLevelCell(4, 1, WALL);
        levelService.addLevelCell(5, 1, WALL);
        levelService.addLevelCell(6, 1, WALL);
        levelService.addLevelCell(7, 1, WALL);
        levelService.addLevelCell(7, 0, WALL);


        levelService.addLevelCell(1, 14, WALL);
        levelService.addLevelCell(1, 13, WALL);
        levelService.addLevelCell(1, 12, WALL);
        levelService.addLevelCell(1, 11, WALL);
        levelService.addLevelCell(1, 10, WALL);
        levelService.addLevelCell(2, 10, WALL);
        levelService.addLevelCell(3, 10, WALL);
        levelService.addLevelCell(4, 10, WALL);
        levelService.addLevelCell(2, 13, WALL);
        levelService.addLevelCell(3, 13, WALL);
        levelService.addLevelCell(4, 13, WALL);
        levelService.addLevelCell(5, 13, WALL);
        levelService.addLevelCell(6, 13, WALL);
        levelService.addLevelCell(7, 13, WALL);
        levelService.addLevelCell(7, 12, WALL);
        levelService.addLevelCell(7, 14, WALL);


        levelService.addLevelCell(13, 0, WALL);
        levelService.addLevelCell(13, 1, WALL);
        levelService.addLevelCell(13, 2, WALL);
        levelService.addLevelCell(13, 3, WALL);
        levelService.addLevelCell(13, 4, WALL);
        levelService.addLevelCell(12, 4, WALL);
        levelService.addLevelCell(11, 4, WALL);
        levelService.addLevelCell(10, 4, WALL);
        levelService.addLevelCell(9, 1, WALL);
        levelService.addLevelCell(10, 1, WALL);
        levelService.addLevelCell(11, 1, WALL);


        levelService.addLevelCell(13, 13, WALL);
        levelService.addLevelCell(13, 12, WALL);
        levelService.addLevelCell(13, 11, WALL);
        levelService.addLevelCell(13, 10, WALL);
        levelService.addLevelCell(12, 10, WALL);
        levelService.addLevelCell(11, 10, WALL);
        levelService.addLevelCell(10, 10, WALL);
        levelService.addLevelCell(9, 13, WALL);
        levelService.addLevelCell(10, 13, WALL);
        levelService.addLevelCell(11, 13, WALL);


        levelService.addLevelCell(4, 0, OBSTACLE);
        levelService.addLevelCell(4, 3, OBSTACLE);
        levelService.addLevelCell(5, 3, OBSTACLE);
        levelService.addLevelCell(7, 2, OBSTACLE);
        levelService.addLevelCell(4, 11, OBSTACLE);
        levelService.addLevelCell(5, 11, OBSTACLE);
        levelService.addLevelCell(12, 11, OBSTACLE);
        levelService.addLevelCell(12, 13, OBSTACLE);

        levelService.addLevelCell(3, 7, POISON);
        levelService.addLevelCell(12, 3, POISON);

        levelService.addLevelCell(14, 1, SAVE);

        levelService.addLevelCell(12, 12, FOOD_MOVE_TO_NEXT_LEVEL);
        levelService.addLevelCell(14, 10, FOOD);
        levelService.addLevelCell(14, 11, FOOD);
        levelService.addLevelCell(14, 12, FOOD);
        levelService.addLevelCell(14, 13, FOOD);


        levelService.addLevelCell(6, 0, FOOD);
        levelService.addLevelCell(7, 3, FOOD);
        levelService.addLevelCell(7, 11, FOOD);

    }

    @Override
    public double levelNumber() {
        return 18.1;
    }

    @Override
    public double nextLevelNumber() {
        return 18.2;
    }
}
