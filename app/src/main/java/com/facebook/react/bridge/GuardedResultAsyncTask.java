package com.facebook.react.bridge;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
    private final NativeModuleCallExceptionHandler mExceptionHandler;

    @Deprecated
    protected GuardedResultAsyncTask(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    protected abstract Result doInBackgroundGuarded();

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Result result) {
        try {
            onPostExecuteGuarded(result);
        } catch (RuntimeException e10) {
            this.mExceptionHandler.handleException(e10);
        }
    }

    protected abstract void onPostExecuteGuarded(Result result);

    protected GuardedResultAsyncTask(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mExceptionHandler = nativeModuleCallExceptionHandler;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public final Result doInBackground(Void... voidArr) {
        try {
            return doInBackgroundGuarded();
        } catch (RuntimeException e10) {
            this.mExceptionHandler.handleException(e10);
            throw e10;
        }
    }
}
