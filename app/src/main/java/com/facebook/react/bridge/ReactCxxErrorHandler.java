package com.facebook.react.bridge;

import g6.a;
import java.lang.reflect.Method;

@a
/* loaded from: classes.dex */
public class ReactCxxErrorHandler {
    private static Method mHandleErrorFunc;
    private static Object mObject;

    @a
    private static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Exception(str));
            } catch (Exception e10) {
                z3.a.k("ReactCxxErrorHandler", "Failed to invole error hanlder function", e10);
            }
        }
    }

    @a
    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
