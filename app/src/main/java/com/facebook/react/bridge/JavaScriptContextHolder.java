package com.facebook.react.bridge;

/* loaded from: classes.dex */
public class JavaScriptContextHolder {
    private long mContext;

    public JavaScriptContextHolder(long j10) {
        this.mContext = j10;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }

    public long get() {
        return this.mContext;
    }
}
