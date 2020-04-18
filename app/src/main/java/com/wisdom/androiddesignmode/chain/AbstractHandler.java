package com.wisdom.androiddesignmode.chain;

/**
 * @author xumao
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request) {
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                nextHandler.handle(request);
            } else {
                System.out.println("无法处理请求");
            }
        }
    }

    protected abstract int getHandleLevel();

    protected abstract void handle(AbstractRequest request);
}
