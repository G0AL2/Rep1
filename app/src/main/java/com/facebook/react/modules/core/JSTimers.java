package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;

@g6.a
/* loaded from: classes.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d10);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
