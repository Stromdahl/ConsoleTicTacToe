package com.company;

public class GameBoard {

    String[][] tileTypes = {
            {
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            }, {
            "  ()()()  ",
            "()      ()",
            "()      ()",
            "()      ()",
            "  ()()()  ",
    },{
            "()      ()",
            "  ()  ()  ",
            "    ()    ",
            "  ()  ()  ",
            "()      ()",
    }};

    int[] gameBoard = {
            0,0,0,
            0,0,0,
            0,0,0
    };

    void drawGameboard(){
        System.out.println("============================================");
        drawRow(1, 0, 2);
        System.out.println("============================================");
        drawRow(0, 1, 0);
        System.out.println("============================================");
        drawRow(2, 0, 1);
        System.out.println("============================================");
    }

    void drawRow(int tile1, int tile2, int tile3){
        for(int i = 0; i<5; i++){
            System.out.printf("|| %s || %s || %s ||\n", tileTypes[tile1][i], tileTypes[tile2][i], tileTypes[tile3][i]);
        }
    }
}