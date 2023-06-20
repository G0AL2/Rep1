package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    final b f3815a;

    /* renamed from: b  reason: collision with root package name */
    a f3816b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3817a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f3818b;

        /* renamed from: c  reason: collision with root package name */
        int f3819c;

        /* renamed from: d  reason: collision with root package name */
        int f3820d;

        /* renamed from: e  reason: collision with root package name */
        int f3821e;

        a() {
        }

        void a(int i10) {
            this.f3817a = i10 | this.f3817a;
        }

        boolean b() {
            int i10 = this.f3817a;
            if ((i10 & 7) == 0 || (i10 & (c(this.f3820d, this.f3818b) << 0)) != 0) {
                int i11 = this.f3817a;
                if ((i11 & 112) == 0 || (i11 & (c(this.f3820d, this.f3819c) << 4)) != 0) {
                    int i12 = this.f3817a;
                    if ((i12 & 1792) == 0 || (i12 & (c(this.f3821e, this.f3818b) << 8)) != 0) {
                        int i13 = this.f3817a;
                        return (i13 & 28672) == 0 || (i13 & (c(this.f3821e, this.f3819c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f3817a = 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f3818b = i10;
            this.f3819c = i11;
            this.f3820d = i12;
            this.f3821e = i13;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(b bVar) {
        this.f3815a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f3815a.c();
        int d10 = this.f3815a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f3815a.a(i10);
            this.f3816b.e(c10, d10, this.f3815a.b(a10), this.f3815a.e(a10));
            if (i12 != 0) {
                this.f3816b.d();
                this.f3816b.a(i12);
                if (this.f3816b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f3816b.d();
                this.f3816b.a(i13);
                if (this.f3816b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f3816b.e(this.f3815a.c(), this.f3815a.d(), this.f3815a.b(view), this.f3815a.e(view));
        if (i10 != 0) {
            this.f3816b.d();
            this.f3816b.a(i10);
            return this.f3816b.b();
        }
        return false;
    }
}
