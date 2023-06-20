package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

/* compiled from: HermesExecutorFactory.java */
/* loaded from: classes.dex */
public class a implements JavaScriptExecutorFactory {

    /* renamed from: a  reason: collision with root package name */
    private final j5.a f14782a;

    public a() {
        this(null);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(this.f14782a);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    public a(j5.a aVar) {
    }
}
