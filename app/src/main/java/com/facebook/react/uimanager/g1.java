package com.facebook.react.uimanager;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: YogaNodePool.java */
/* loaded from: classes.dex */
public class g1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15856a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static h6.a<com.facebook.yoga.p> f15857b;

    public static h6.a<com.facebook.yoga.p> a() {
        h6.a<com.facebook.yoga.p> aVar;
        h6.a<com.facebook.yoga.p> aVar2 = f15857b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (f15856a) {
            if (f15857b == null) {
                f15857b = new h6.a<>(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            }
            aVar = f15857b;
        }
        return aVar;
    }
}
