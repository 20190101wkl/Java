package com.DouDiZhu;

public class main {
    // 1.准备牌：54张牌，存储到一个集合中
    // 特殊牌：大王、小王
    // 其他52张牌：定义一个数据/集合，存储4种花色，黑桃，红桃，梅花，方块
    //           定义一个数组/集合，存储13个序号：2.A,K...3
    // 循环嵌套遍历两个数组/集合，组装52张牌
    // 2.洗牌
    //使用集合工具类Collections的方法
    // static void shuffle（List<?> list） 使用指定的随机源对指定列表进行置换
    //3.发牌
    //要求；1人17张牌，剩余3张作为底牌，一人一张轮流发牌：集合的索引%3
    //定义4个集合，存储3个玩家的牌和底牌
    //4.看牌
    //直接打印集合，遍历存储玩家和底牌的集合
}
