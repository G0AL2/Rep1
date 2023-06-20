package com.ironsource.mediationsdk.logger;

/* loaded from: classes3.dex */
public abstract class IronSourceLogger {

    /* renamed from: a  reason: collision with root package name */
    int f27152a;

    /* renamed from: b  reason: collision with root package name */
    String f27153b;

    /* loaded from: classes3.dex */
    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    /* loaded from: classes3.dex */
    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str) {
        this.f27153b = str;
        this.f27152a = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceLogger(String str, int i10) {
        this.f27153b = str;
        this.f27152a = i10;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof IronSourceLogger)) {
            IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
            String str = this.f27153b;
            if (str != null && str.equals(ironSourceLogger.f27153b)) {
                return true;
            }
        }
        return false;
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th);

    public void setDebugLevel(int i10) {
        this.f27152a = i10;
    }
}
