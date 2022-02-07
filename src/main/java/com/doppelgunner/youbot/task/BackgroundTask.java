package com.doppelgunner.youbot.task;

import javafx.concurrent.Task;

/**
 * Created by protectionserver.com.
 */
public class BackgroundTask extends Task<Void>  {

    private final Runnable runnable;

    public BackgroundTask(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    protected Void call() throws Exception {
        runnable.run();
        return null;
    }
}
