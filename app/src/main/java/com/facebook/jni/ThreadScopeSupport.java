package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import i7.a;

@DoNotStrip
/* loaded from: classes.dex */
public class ThreadScopeSupport {
    static {
        a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j10) {
        runStdFunctionImpl(j10);
    }

    private static native void runStdFunctionImpl(long j10);
}
