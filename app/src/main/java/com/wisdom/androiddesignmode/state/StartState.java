package com.wisdom.androiddesignmode.state;

public class StartState implements State {
    @Override
    public void start(Context context) {
    }

    @Override
    public void close(Context context) {
        //注意状态的切换
        context.setState(new CloseState());
        System.out.println("close State");
    }
}