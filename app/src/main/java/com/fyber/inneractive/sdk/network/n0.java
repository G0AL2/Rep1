package com.fyber.inneractive.sdk.network;

/* loaded from: classes.dex */
public class n0 extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public int f17624a;

    public n0(int i10, String str) {
        super(str);
        this.f17624a = i10;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return String.valueOf(this.f17624a);
    }
}
