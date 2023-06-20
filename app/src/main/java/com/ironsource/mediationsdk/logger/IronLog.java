package com.ironsource.mediationsdk.logger;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes3.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);
    

    /* renamed from: a  reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f27149a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f27149a = ironSourceTag;
    }

    private String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return String.format("%s %s", a(stackTrace, 5), b(stackTrace, 5));
    }

    private String a(String str) {
        return TextUtils.isEmpty(str) ? a() : String.format("%s - %s", a(), str);
    }

    private static String a(StackTraceElement[] stackTraceElementArr, int i10) {
        String[] split = stackTraceElementArr[5].getClassName().split("\\.");
        String str = split[split.length - 1];
        return str.contains("$") ? str.split("\\$")[0] : str;
    }

    private static String b(StackTraceElement[] stackTraceElementArr, int i10) {
        StackTraceElement stackTraceElement;
        StringBuilder sb2;
        StackTraceElement stackTraceElement2;
        String[] split = stackTraceElementArr[5].getClassName().split("\\.");
        String str = split[split.length - 1];
        if (!str.contains("$")) {
            if (stackTraceElementArr[5].getMethodName().contains("$")) {
                String[] split2 = stackTraceElementArr[6].getClassName().split("\\$");
                if (split2.length > 1) {
                    sb2 = new StringBuilder();
                    sb2.append(split2[1]);
                    sb2.append(".");
                    stackTraceElement2 = stackTraceElementArr[6];
                } else {
                    stackTraceElement = stackTraceElementArr[6];
                }
            } else {
                stackTraceElement = stackTraceElementArr[5];
            }
            return stackTraceElement.getMethodName();
        }
        String[] split3 = str.split("\\$");
        sb2 = new StringBuilder();
        sb2.append(split3[1]);
        sb2.append(".");
        stackTraceElement2 = stackTraceElementArr[5];
        sb2.append(stackTraceElement2.getMethodName());
        return sb2.toString();
    }

    public final void error() {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(""), 3);
    }

    public final void error(String str) {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(str), 3);
    }

    public final void info() {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(""), 1);
    }

    public final void info(String str) {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(str), 1);
    }

    public final void verbose() {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(""), 0);
    }

    public final void verbose(String str) {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(str), 0);
    }

    public final void warning() {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(""), 2);
    }

    public final void warning(String str) {
        IronSourceLoggerManager.getLogger().log(this.f27149a, a(str), 2);
    }
}
