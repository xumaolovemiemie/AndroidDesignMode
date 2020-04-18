package com.wisdom.androiddesignmode.chain;

/**
 * @author xumao
 */
public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    public abstract int getRequestLevel();
}
