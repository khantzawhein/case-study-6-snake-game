package com.se233.snakegame.view;

import com.se233.snakegame.model.Food;
import com.se233.snakegame.model.Snake;
import com.se233.snakegame.model.SpecialFood;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Platform extends Pane {
    public static final int WIDTH = 30;
    public static final int HEIGHT = 30;
    public static final int TILE_SIZE = 10;

    private Canvas canvas;
    private KeyCode key;
    private Score score;

    public Platform() {
        this.setHeight(HEIGHT * TILE_SIZE);
        this.setWidth(WIDTH * TILE_SIZE);
        canvas = new Canvas(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
        this.getChildren().add(canvas);
        this.score = new Score(10, 10);
        this.getChildren().add(score);
    }

    public void render(Snake snake, Food food, SpecialFood specialFood) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE);
        gc.setFill(Color.BLUE);

        snake.getBody().forEach(p -> {
            gc.fillRect(p.getX() * TILE_SIZE, p.getY() * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        });

        gc.setFill(Color.RED);
        gc.fillRect(food.getPosition().getX() * TILE_SIZE, food.getPosition().getY() * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        gc.setFill(Color.GREEN);
        gc.fillRect(specialFood.getPosition().getX() * TILE_SIZE, specialFood.getPosition().getY() * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }

    public void setKey(KeyCode key) {
        this.key = key;
    }

    public KeyCode getKey() {
        return key;
    }

    public Score getScore() {
        return score;
    }
}
