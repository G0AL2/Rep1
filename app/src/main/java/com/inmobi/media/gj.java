package com.inmobi.media;

import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.Thread;
import java.lang.reflect.Method;

/* compiled from: InMobiCrashHandler.java */
/* loaded from: classes3.dex */
public class gj implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25546b = gj.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f25547a;

    public gj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f25547a = uncaughtExceptionHandler;
    }

    private static boolean a(Class<?> cls, StackTraceElement stackTraceElement) {
        if (stackTraceElement.getClassName().equals(cls.getName())) {
            for (Method method : PublisherCallbacks.class.getDeclaredMethods()) {
                if (stackTraceElement.getMethodName().equals(method.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        boolean z10 = true;
        if (th != null) {
            try {
                if (!(th instanceof SdkNotInitializedException) && !(th instanceof InvalidPlacementIdException)) {
                    for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                        if (a(InMobiInterstitial.a.class.getSuperclass(), stackTraceElement) || a(InMobiInterstitial.a.class, stackTraceElement) || a(InMobiNative.NativeCallbacks.class, stackTraceElement) || a(InMobiBanner.a.class, stackTraceElement) || a(InMobiBanner.a.class.getSuperclass(), stackTraceElement) || ((stackTraceElement.getClassName().equals(InMobiSdk.class.getName()) && stackTraceElement.getMethodName().equals(InMobiSdk.class.getDeclaredMethod("fireListener", SdkInitializationListener.class, String.class).getName())) || stackTraceElement.getClassName().contains(gj.class.getName()))) {
                            break;
                        }
                        if (stackTraceElement.getClassName().contains("com.inmobi.") || stackTraceElement.getClassName().contains("com.aerserv.")) {
                            break;
                        }
                    }
                }
            } catch (Exception e10) {
                try {
                    gg.a().a(new gi(thread, e10));
                    gg.a().a(new gi(thread, th));
                } catch (Exception unused) {
                }
            }
        }
        z10 = false;
        if (z10) {
            gg.a().a(new gi(thread, th));
        }
        this.f25547a.uncaughtException(thread, th);
    }
}
