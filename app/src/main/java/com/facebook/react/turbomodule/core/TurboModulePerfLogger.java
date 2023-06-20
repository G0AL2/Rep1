package com.facebook.react.turbomodule.core;

import com.facebook.react.perflogger.NativeModulePerfLogger;
import com.facebook.soloader.SoLoader;
import g6.a;

@a
/* loaded from: classes.dex */
public class TurboModulePerfLogger {
    private static boolean sIsSoLibraryLoaded = false;
    private static NativeModulePerfLogger sNativeModulePerfLogger;

    public static void enableLogging(NativeModulePerfLogger nativeModulePerfLogger) {
        if (nativeModulePerfLogger != null) {
            sNativeModulePerfLogger = nativeModulePerfLogger;
            maybeLoadSoLibrary();
            jniEnableCppLogging(nativeModulePerfLogger);
        }
    }

    private static native void jniEnableCppLogging(NativeModulePerfLogger nativeModulePerfLogger);

    private static synchronized void maybeLoadSoLibrary() {
        synchronized (TurboModulePerfLogger.class) {
            if (!sIsSoLibraryLoaded) {
                SoLoader.p("turbomodulejsijni");
                sIsSoLibraryLoaded = true;
            }
        }
    }

    public static void moduleCreateCacheHit(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.d(str, i10);
        }
    }

    public static void moduleCreateConstructEnd(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.e(str, i10);
        }
    }

    public static void moduleCreateConstructStart(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.f(str, i10);
        }
    }

    public static void moduleCreateEnd(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.g(str, i10);
        }
    }

    public static void moduleCreateFail(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.h(str, i10);
        }
    }

    public static void moduleCreateSetUpEnd(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.i(str, i10);
        }
    }

    public static void moduleCreateSetUpStart(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.j(str, i10);
        }
    }

    public static void moduleCreateStart(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.k(str, i10);
        }
    }

    public static void moduleDataCreateEnd(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.l(str, i10);
        }
    }

    public static void moduleDataCreateStart(String str, int i10) {
        NativeModulePerfLogger nativeModulePerfLogger = sNativeModulePerfLogger;
        if (nativeModulePerfLogger != null) {
            nativeModulePerfLogger.m(str, i10);
        }
    }
}
