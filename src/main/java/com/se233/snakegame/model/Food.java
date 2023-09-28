package com.se233.snakegame.model;

import com.se233.snakegame.view.Platform;
import javafx.geometry.Point2D;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Food {
    Logger logger = LogManager.getLogger(Food.class);
    private Point2D position;
    private Random rn;

    public Food(Point2D position) {
        this.rn = new Random();
        this.position = position;
    }

    public Food() {
        this.rn = new Random();
        respawn();
    }

    public void respawn() {
        Point2D prev_position = this.position;
        do {
            this.position = new Point2D(rn.nextInt(Platform.WIDTH), rn.nextInt(Platform.HEIGHT));
        } while (prev_position == this.position);
        logger.info("food: x:{} y:{}", this.position.getX(), this.position.getY());
    }

    public Point2D getPosition() {
        return this.position;
    }
}
