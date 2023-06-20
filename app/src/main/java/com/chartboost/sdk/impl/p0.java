package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.CBError;

/* loaded from: classes.dex */
public class p0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f14245a;

    /* renamed from: b  reason: collision with root package name */
    public final CBError f14246b;

    private p0(T t10, CBError cBError) {
        this.f14245a = t10;
        this.f14246b = cBError;
    }

    public static <T> p0<T> a(T t10) {
        return new p0<>(t10, null);
    }

    public static <T> p0<T> a(CBError cBError) {
        return new p0<>(null, cBError);
    }
}
