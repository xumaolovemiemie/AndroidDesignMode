package com.wisdom.androiddesignmode.chain;

public class Request3 extends AbstractRequest{
    public Request3(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 3;
    }
}
