package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public GuardedAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    protected abstract void doInBackgroundGuarded(Params... paramsArr);

    /* JADX INFO: Access modifiers changed from: protected */
    public GuardedAsyncTask(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Void doInBackground(Params... paramsArr) {
        try {
            doInBackgroundGuarded(paramsArr);
            return null;
        } catch (RuntimeException e10) {
            this.mExceptionHandler.handleException(e10);
            return null;
        }
    }
}
