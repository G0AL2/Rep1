package com.facebook.react.bridge;

import g6.a;

@a
/* loaded from: classes.dex */
public interface JavaJSExecutor {

    /* loaded from: classes.dex */
    public interface Factory {
        JavaJSExecutor create() throws Exception;
    }

    /* loaded from: classes.dex */
    public static class ProxyExecutorException extends Exception {
        public ProxyExecutorException(Throwable th) {
            super(th);
        }
    }

    void close();

    @a
    String executeJSCall(String str, String str2) throws ProxyExecutorException;

    @a
    void loadBundle(String str) throws ProxyExecutorException;

    @a
    void setGlobalVariable(String str, String str2);
}
