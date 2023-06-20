package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class q0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1649a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1650b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1651c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    private int f1652d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private int f1653e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1654f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1655g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1656h = false;

    public int a() {
        return this.f1655g ? this.f1649a : this.f1650b;
    }

    public int b() {
        return this.f1649a;
    }

    public int c() {
        return this.f1650b;
    }

    public int d() {
        return this.f1655g ? this.f1650b : this.f1649a;
    }

    public void e(int i10, int i11) {
        this.f1656h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1653e = i10;
            this.f1649a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1654f = i11;
            this.f1650b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f1655g) {
            return;
        }
        this.f1655g = z10;
        if (!this.f1656h) {
            this.f1649a = this.f1653e;
            this.f1650b = this.f1654f;
        } else if (z10) {
            int i10 = this.f1652d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = this.f1653e;
            }
            this.f1649a = i10;
            int i11 = this.f1651c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = this.f1654f;
            }
            this.f1650b = i11;
        } else {
            int i12 = this.f1651c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f1653e;
            }
            this.f1649a = i12;
            int i13 = this.f1652d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = this.f1654f;
            }
            this.f1650b = i13;
        }
    }

    public void g(int i10, int i11) {
        this.f1651c = i10;
        this.f1652d = i11;
        this.f1656h = true;
        if (this.f1655g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1649a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1650b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1649a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1650b = i11;
        }
    }
}
