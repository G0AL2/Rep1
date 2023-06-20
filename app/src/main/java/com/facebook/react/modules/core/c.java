package com.facebook.react.modules.core;

import com.facebook.react.bridge.WritableArray;

/* compiled from: JavaScriptTimerExecutor.java */
/* loaded from: classes.dex */
public interface c {
    void callIdleCallbacks(double d10);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
