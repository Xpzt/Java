package com.xpzt.day13.redDemo;

import com.xpzt.day13.red.RedPacketFrame;

//实现类
public class MyRed extends RedPacketFrame {

    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public MyRed(String title) {
        super(title);
    }
}