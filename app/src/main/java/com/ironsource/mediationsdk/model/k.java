package com.ironsource.mediationsdk.model;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f27255a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27256b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27257c;

    /* renamed from: d  reason: collision with root package name */
    public l f27258d;

    /* renamed from: e  reason: collision with root package name */
    public int f27259e;

    /* renamed from: f  reason: collision with root package name */
    public int f27260f;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f27261a = true;

        /* renamed from: b  reason: collision with root package name */
        private boolean f27262b = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f27263c = false;

        /* renamed from: d  reason: collision with root package name */
        private l f27264d = null;

        /* renamed from: e  reason: collision with root package name */
        private int f27265e = 0;

        /* renamed from: f  reason: collision with root package name */
        private int f27266f = 0;

        public final a a(boolean z10, int i10) {
            this.f27263c = z10;
            this.f27266f = i10;
            return this;
        }

        public final a a(boolean z10, l lVar, int i10) {
            this.f27262b = z10;
            if (lVar == null) {
                lVar = l.PER_DAY;
            }
            this.f27264d = lVar;
            this.f27265e = i10;
            return this;
        }

        public final k a() {
            return new k(this.f27261a, this.f27262b, this.f27263c, this.f27264d, this.f27265e, this.f27266f, (byte) 0);
        }
    }

    private k(boolean z10, boolean z11, boolean z12, l lVar, int i10, int i11) {
        this.f27255a = z10;
        this.f27256b = z11;
        this.f27257c = z12;
        this.f27258d = lVar;
        this.f27259e = i10;
        this.f27260f = i11;
    }

    /* synthetic */ k(boolean z10, boolean z11, boolean z12, l lVar, int i10, int i11, byte b10) {
        this(z10, z11, z12, lVar, i10, i11);
    }
}
