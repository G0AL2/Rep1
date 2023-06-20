package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static String f14781a;

    static {
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HermesExecutor(j5.a aVar) {
        super(initHybridDefaultConfig());
    }

    public static void a() throws UnsatisfiedLinkError {
        if (f14781a == null) {
            SoLoader.p("hermes");
            try {
                SoLoader.p("hermes-executor-debug");
                f14781a = "Debug";
            } catch (UnsatisfiedLinkError unused) {
                SoLoader.p("hermes-executor-release");
                f14781a = "Release";
            }
        }
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j10);

    private static native HybridData initHybridDefaultConfig();

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f14781a;
    }
}
