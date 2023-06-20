package com.amazon.device.ads;

import android.util.Log;

/* loaded from: classes.dex */
class DtbLog {
    private static final String DEBUG_ERROR = "DTBERROR::";
    private static boolean androidLogAvailable = false;
    private static boolean isCallerInfoEnabled = false;
    private static final Object listenerLock;
    private static DTBLogLevel logLevel = null;
    private static DtbLogListener logListener = null;
    private static final String sdkName = "Amazon DTB Ads API";

    static {
        try {
            Log.isLoggable("1234", 7);
            androidLogAvailable = true;
        } catch (Throwable unused) {
            androidLogAvailable = false;
        }
        listenerLock = new Object();
        isCallerInfoEnabled = false;
        logLevel = DTBLogLevel.Warn;
    }

    DtbLog() {
    }

    public static void debug(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(getTag(), str);
    }

    public static void debugError(String str) {
        if (logLevel.intValue() > DTBLogLevel.Debug.intValue() || !androidLogAvailable) {
            return;
        }
        String tag = getTag();
        Log.d(tag, DEBUG_ERROR + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void enableCallerInfo(boolean z10) {
        isCallerInfoEnabled = z10;
    }

    public static void error(String str) {
        if (logLevel.intValue() > DTBLogLevel.Error.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Fatal;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    private static String getCallerInfo() {
        if (isCallerInfoEnabled) {
            StackTraceElement stackTraceElement = null;
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= stackTrace.length) {
                        break;
                    }
                    String className = stackTrace[i10].getClassName();
                    if (className.startsWith("dalvik") || className.startsWith("java")) {
                        i10++;
                    } else {
                        int i11 = i10 + 2;
                        if (i11 < stackTrace.length) {
                            i10 = i11;
                        }
                        stackTraceElement = stackTrace[i10];
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement.getClassName() + ":" + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
            }
            return sdkName;
        }
        return sdkName;
    }

    private static String getTag() {
        return isCallerInfoEnabled ? getCallerInfo() : sdkName;
    }

    public static void info(String str) {
        if (logLevel.intValue() > DTBLogLevel.Info.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(getTag(), str);
    }

    private static void postMessageToListener(String str, DTBLogLevel dTBLogLevel, String str2) {
        if (logListener == null) {
            return;
        }
        synchronized (listenerLock) {
            DtbLogListener dtbLogListener = logListener;
            if (dtbLogListener != null && str.equals(dtbLogListener.getTag())) {
                logListener.postMessage(dTBLogLevel, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLogLevel(DTBLogLevel dTBLogLevel) {
        logLevel = dTBLogLevel;
    }

    public static void warn(String str) {
        if (logLevel.intValue() > DTBLogLevel.Warn.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(getTag(), str);
    }

    public static void debug(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void debugError(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Debug;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.d(str, DEBUG_ERROR + str2);
        postMessageToListener(str, dTBLogLevel, DEBUG_ERROR + str2);
    }

    public static void error(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Error;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void info(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Info;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.i(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void warn(String str, String str2) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Warn;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.w(str, str2);
        postMessageToListener(str, dTBLogLevel, str2);
    }

    public static void fatal(String str) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str);
    }

    public static void fatal(String str, Exception exc) {
        if (logLevel.intValue() > DTBLogLevel.Fatal.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(getTag(), str, exc);
    }

    public static void fatal(String str, String str2, Exception exc) {
        int intValue = logLevel.intValue();
        DTBLogLevel dTBLogLevel = DTBLogLevel.Fatal;
        if (intValue > dTBLogLevel.intValue() || !androidLogAvailable) {
            return;
        }
        Log.e(str, str2, exc);
        postMessageToListener(str, dTBLogLevel, str2);
    }
}
