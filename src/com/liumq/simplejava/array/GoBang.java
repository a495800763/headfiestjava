package com.liumq.simplejava.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 数组单元的测试五子棋程序
 */
public class GoBang {
    //棋盘的尺寸为15
    private static int BOARD_SIZE = 15;
    //定义一个二维数组来充当棋盘
    private String[][] board;

    //初始化棋盘
    public void ininBoard() {
        board = new String[BOARD_SIZE][BOARD_SIZE];
        //为每个数组元素赋值为“＋”,画出棋盘
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "＋";
            }
        }
    }

    //在控制台打印棋盘的方法
    public void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) throws IOException {
        GoBang gb = new GoBang();
        gb.ininBoard();
        gb.printBoard();
        //这是用于获取键盘输入的方法
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while ((inputStr = reader.readLine()) != null) {
            try {
                //将用户的输入用逗号做分割符，分割成2个字符串
                String[] posStrArr = inputStr.split(",");
                //将两个字符串转换成棋子的坐标
                int xPos = Integer.parseInt(posStrArr[0]);
                int yPos = Integer.parseInt(posStrArr[1]);

                if (!gb.board[xPos - 1][yPos - 1].equals("＋")) {
                    System.out.println("您输入的坐标点已经有棋子了，请重新输入：");
                    continue;
                }
                gb.board[yPos - 1][xPos - 1] = "○";
                gb.printBoard();
                System.out.println("请输入您下棋的坐标，以x,y格式输入");
            } catch (Exception e) {
                System.out.println("您输入的坐标不合法，请重新输入，下棋坐标以x,y 格式输入");
                continue;
            }

        }
    }
}
