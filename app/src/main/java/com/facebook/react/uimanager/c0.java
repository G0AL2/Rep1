package com.facebook.react.uimanager;

/* compiled from: ReactRootViewTagGenerator.java */
/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f15755a = 1;

    public static synchronized int a() {
        int i10;
        synchronized (c0.class) {
            i10 = f15755a;
            f15755a = i10 + 10;
        }
        return i10;
    }
}
