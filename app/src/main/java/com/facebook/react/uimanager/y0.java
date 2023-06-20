package com.facebook.react.uimanager;

import java.util.Comparator;

/* compiled from: ViewAtIndex.java */
/* loaded from: classes.dex */
public class y0 {

    /* renamed from: c  reason: collision with root package name */
    public static Comparator<y0> f16077c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f16078a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16079b;

    /* compiled from: ViewAtIndex.java */
    /* loaded from: classes.dex */
    class a implements Comparator<y0> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(y0 y0Var, y0 y0Var2) {
            return y0Var.f16079b - y0Var2.f16079b;
        }
    }

    public y0(int i10, int i11) {
        this.f16078a = i10;
        this.f16079b = i11;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != y0.class) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f16079b == y0Var.f16079b && this.f16078a == y0Var.f16078a;
    }

    public String toString() {
        return "[" + this.f16078a + ", " + this.f16079b + "]";
    }
}
