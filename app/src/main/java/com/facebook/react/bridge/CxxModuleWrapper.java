package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import g6.a;

@a
/* loaded from: classes.dex */
public class CxxModuleWrapper extends CxxModuleWrapperBase {
    protected CxxModuleWrapper(HybridData hybridData) {
        super(hybridData);
    }

    public static CxxModuleWrapper makeDso(String str, String str2) {
        SoLoader.p(str);
        return makeDsoNative(SoLoader.x(str).getAbsolutePath(), str2);
    }

    private static native CxxModuleWrapper makeDsoNative(String str, String str2);
}
