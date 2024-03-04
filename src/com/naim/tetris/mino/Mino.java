package com.naim.tetris.mino;

import com.naim.tetris.PlayManager;

import java.awt.*;

public class Mino {

    public Block block[] = new Block[4];
    public Block tempBlock[] = new Block[4];

    int autoDropCounter = 0;

    public void create(Color color){
        block[0] = new Block(color);
        block[1] = new Block(color);
        block[2] = new Block(color);
        block[3] = new Block(color);
        tempBlock[0] = new Block(color);
        tempBlock[1] = new Block(color);
        tempBlock[2] = new Block(color);
        tempBlock[3] = new Block(color);
    }

    public void setXY(int x, int y){

    }

    public void updateXY(int direction){

    }

    public void update(){
        autoDropCounter++;

        if(autoDropCounter == PlayManager.dropInterval){
            block[0].y += Block.SIZE;
            block[1].y += Block.SIZE;
            block[2].y += Block.SIZE;
            block[3].y += Block.SIZE;
            autoDropCounter = 0;
        }
    }

    public void draw(Graphics2D g2){

        int margin = 1;
        g2.setColor(block[0].color);
        g2.fillRect(block[0].x + margin, block[0].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        g2.fillRect(block[1].x + margin, block[1].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        g2.fillRect(block[2].x + margin, block[2].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
        g2.fillRect(block[3].x + margin, block[3].y + margin, Block.SIZE - (margin * 2), Block.SIZE - (margin * 2));
    }
}
