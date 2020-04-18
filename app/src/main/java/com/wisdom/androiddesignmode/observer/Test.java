package com.wisdom.androiddesignmode.observer;

public class Test {
    public static void main(String[] args) {
        Website website = new Website();

        Coder xiaoMing = new Coder("小明");
        Coder xiaoHong = new Coder("小红");
        Coder xiaoFang = new Coder("小芳");

        website.callCoder("出了最新的技术了");
    }
}
