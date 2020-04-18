package com.wisdom.androiddesignmode.state;

//使用 Context 来查看当状态 State 改变时的行为变化
public class StatePatternDemo {
    public static void main(String... args) {
        Context context = new Context();

        // 初始为开始状态
        context.setState(new StartState());
        // 切换为关闭状态
        context.close();
        // 切换为开始状态
        context.start();
    }
}
