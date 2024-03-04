package com.naim.tetris.mino;

import java.awt.*;

public class MinoL1 extends Mino{

    public MinoL1(){
        create(Color.orange);
    }

    public void setXY(int x, int y){
        block[0].x = x;
        block[0].y = y;
        block[1].x = block[0].x;
        block[1].y = block[0].y - Block.SIZE;
        block[2].x = block[0].x;
        block[2].y = block[0].y + Block.SIZE;
        block[3].x = block[0].x + Block.SIZE;
        block[3].y = block[0].y + Block.SIZE;
    }
}
