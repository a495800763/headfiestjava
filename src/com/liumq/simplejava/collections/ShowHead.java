package com.liumq.simplejava.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 梭哈游戏
 */
public class ShowHead {
    //定义该游戏最多支持多少个玩家
    private final int PLAY_NUM = 5;
    //定义扑克牌的所有花色和数值
    private String[] types = {"方块", "草花", "红心", "黑桃"};
    private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    //card 是一局游戏中剩下的扑克牌
    private List<String> cards = new LinkedList<>();
    //定义所有玩家
    private String[] players = new String[PLAY_NUM];
    //所有玩家手里的扑克牌
    private List<String>[] playersCards = new List[PLAY_NUM];

    /**
     * 初始化扑克牌，放入52张扑克牌
     * 并且使用shuffle方法将他们随机排列
     */
    public void initCards() {
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards.add(types[i] + values[j]);
            }
        }
        //随机排列
        Collections.shuffle(cards);
    }

    /**
     * 初始化玩家， 为每个玩家分派用户名
     *
     * @param names
     */
    public void initPlayer(String... names) {
        if (names.length > PLAY_NUM || names.length < 2) {
            //校验玩家数量，此处应使用异常机制更合理
            System.out.println("玩家数量不对");
            return;
        } else {
            //初始化玩家用户名
            for (int i = 0; i < names.length; i++) {
                players[i] = names[i];
            }
        }
    }

    /**
     * 初始化玩家手上的牌，游戏开始每个玩家手上的扑克牌为空
     * 程序使用一个长度为0 的LinkedList来表示
     */
    public void initPlayerCards() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && !players[i].equals("")) {
                playersCards[i] = new LinkedList<String>();
            }
        }
    }

    /**
     * 输出全部扑克牌，仅做测试用
     */
    public void showAllCards() {
        for (String card : cards) {
            System.out.println(card);
        }
    }

    /**
     * 派扑克牌
     *
     * @param first 最先拍给谁
     */
    public void deliverCard(String first) {

    }


}
