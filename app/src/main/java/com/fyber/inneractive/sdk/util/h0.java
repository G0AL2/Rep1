package com.fyber.inneractive.sdk.util;

/* loaded from: classes2.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public transient a[] f20281a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f20282b;

    /* renamed from: c  reason: collision with root package name */
    public int f20283c;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f20284a;

        /* renamed from: b  reason: collision with root package name */
        public Object f20285b;

        /* renamed from: c  reason: collision with root package name */
        public a f20286c;

        public a(int i10, int i11, Object obj, a aVar) {
            this.f20284a = i10;
            this.f20285b = obj;
            this.f20286c = aVar;
        }
    }

    public h0() {
        this(20, 0.75f);
    }

    public h0(int i10, float f10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        } else if (f10 > 0.0f) {
            i10 = i10 == 0 ? 1 : i10;
            this.f20281a = new a[i10];
            this.f20283c = (int) (i10 * f10);
        } else {
            throw new IllegalArgumentException("Illegal Load: " + f10);
        }
    }
}
