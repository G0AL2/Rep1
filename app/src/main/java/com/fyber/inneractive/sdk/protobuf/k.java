package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.j0;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k implements e1 {

    /* renamed from: a  reason: collision with root package name */
    public final j f19939a;

    /* renamed from: b  reason: collision with root package name */
    public int f19940b;

    /* renamed from: c  reason: collision with root package name */
    public int f19941c;

    /* renamed from: d  reason: collision with root package name */
    public int f19942d = 0;

    public k(j jVar) {
        j jVar2 = (j) z.a(jVar, "input");
        this.f19939a = jVar2;
        jVar2.f19913d = this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <T> T a(Class<T> cls, q qVar) throws IOException {
        b(3);
        return (T) c(b1.f19840c.a(cls), qVar);
    }

    public final void b(int i10) throws IOException {
        int i11 = this.f19940b;
        int i12 = t1.f20010a;
        if ((i11 & 7) != i10) {
            throw a0.d();
        }
    }

    public final <T> T c(f1<T> f1Var, q qVar) throws IOException {
        int i10 = this.f19941c;
        int i11 = this.f19940b;
        int i12 = t1.f20010a;
        this.f19941c = t1.a(i11 >>> 3, 4);
        try {
            T a10 = f1Var.a();
            f1Var.a(a10, this, qVar);
            f1Var.c(a10);
            if (this.f19940b == this.f19941c) {
                return a10;
            }
            throw a0.g();
        } finally {
            this.f19941c = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int d() throws IOException {
        b(0);
        return this.f19939a.k();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int e() {
        return this.f19940b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public long f() throws IOException {
        b(0);
        return this.f19939a.v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public long g() throws IOException {
        b(1);
        return this.f19939a.i();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public double h() throws IOException {
        b(1);
        return this.f19939a.f();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public boolean i() throws IOException {
        int i10;
        if (this.f19939a.c() || (i10 = this.f19940b) == this.f19941c) {
            return false;
        }
        return this.f19939a.e(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int j() throws IOException {
        b(0);
        return this.f19939a.p();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public float k() throws IOException {
        b(5);
        return this.f19939a.j();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public long l() throws IOException {
        b(0);
        return this.f19939a.q();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int m() throws IOException {
        b(5);
        return this.f19939a.n();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public String n() throws IOException {
        b(2);
        return this.f19939a.r();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public long o() throws IOException {
        b(0);
        return this.f19939a.l();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public String p() throws IOException {
        b(2);
        return this.f19939a.s();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int q() throws IOException {
        b(5);
        return this.f19939a.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public boolean r() throws IOException {
        b(0);
        return this.f19939a.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int s() throws IOException {
        int i10 = this.f19942d;
        if (i10 != 0) {
            this.f19940b = i10;
            this.f19942d = 0;
        } else {
            this.f19940b = this.f19939a.t();
        }
        int i11 = this.f19940b;
        if (i11 == 0 || i11 == this.f19941c) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        int i12 = t1.f20010a;
        return i11 >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public long t() throws IOException {
        b(1);
        return this.f19939a.o();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void e(List<Integer> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 2) {
                int u10 = this.f19939a.u();
                c(u10);
                int b10 = this.f19939a.b() + u10;
                do {
                    yVar.c(this.f19939a.h());
                } while (this.f19939a.b() < b10);
                return;
            } else if (i12 == 5) {
                do {
                    yVar.c(this.f19939a.h());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 2) {
            int u11 = this.f19939a.u();
            c(u11);
            int b11 = this.f19939a.b() + u11;
            do {
                list.add(Integer.valueOf(this.f19939a.h()));
            } while (this.f19939a.b() < b11);
        } else if (i15 == 5) {
            do {
                list.add(Integer.valueOf(this.f19939a.h()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <T> T b(Class<T> cls, q qVar) throws IOException {
        b(2);
        return (T) d(b1.f19840c.a(cls), qVar);
    }

    public final <T> T d(f1<T> f1Var, q qVar) throws IOException {
        j jVar;
        int u10 = this.f19939a.u();
        j jVar2 = this.f19939a;
        if (jVar2.f19910a < jVar2.f19911b) {
            int d10 = jVar2.d(u10);
            T a10 = f1Var.a();
            this.f19939a.f19910a++;
            f1Var.a(a10, this, qVar);
            f1Var.c(a10);
            this.f19939a.a(0);
            jVar.f19910a--;
            this.f19939a.c(d10);
            return a10;
        }
        throw a0.h();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void f(List<Integer> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 2) {
                int u10 = this.f19939a.u();
                c(u10);
                int b10 = this.f19939a.b() + u10;
                do {
                    yVar.c(this.f19939a.n());
                } while (this.f19939a.b() < b10);
                return;
            } else if (i12 == 5) {
                do {
                    yVar.c(this.f19939a.n());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 2) {
            int u11 = this.f19939a.u();
            c(u11);
            int b11 = this.f19939a.b() + u11;
            do {
                list.add(Integer.valueOf(this.f19939a.n()));
            } while (this.f19939a.b() < b11);
        } else if (i15 == 5) {
            do {
                list.add(Integer.valueOf(this.f19939a.n()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void g(List<Long> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    h0Var.a(this.f19939a.q());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    h0Var.a(this.f19939a.q());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Long.valueOf(this.f19939a.q()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Long.valueOf(this.f19939a.q()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void h(List<i> list) throws IOException {
        int t10;
        int i10 = this.f19940b;
        int i11 = t1.f20010a;
        if ((i10 & 7) == 2) {
            do {
                list.add(a());
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
            return;
        }
        throw a0.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void i(List<Integer> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    yVar.c(this.f19939a.u());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    yVar.c(this.f19939a.u());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Integer.valueOf(this.f19939a.u()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Integer.valueOf(this.f19939a.u()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void j(List<Double> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof n) {
            n nVar = (n) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 1) {
                do {
                    nVar.a(this.f19939a.f());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int u10 = this.f19939a.u();
                d(u10);
                int b10 = this.f19939a.b() + u10;
                do {
                    nVar.a(this.f19939a.f());
                } while (this.f19939a.b() < b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 1) {
            do {
                list.add(Double.valueOf(this.f19939a.f()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int u11 = this.f19939a.u();
            d(u11);
            int b11 = this.f19939a.b() + u11;
            do {
                list.add(Double.valueOf(this.f19939a.f()));
            } while (this.f19939a.b() < b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void k(List<Long> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    h0Var.a(this.f19939a.l());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    h0Var.a(this.f19939a.l());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Long.valueOf(this.f19939a.l()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Long.valueOf(this.f19939a.l()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void l(List<Boolean> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof g) {
            g gVar = (g) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    gVar.a(this.f19939a.d());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    gVar.a(this.f19939a.d());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Boolean.valueOf(this.f19939a.d()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Boolean.valueOf(this.f19939a.d()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void m(List<Long> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 1) {
                do {
                    h0Var.a(this.f19939a.o());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int u10 = this.f19939a.u();
                d(u10);
                int b10 = this.f19939a.b() + u10;
                do {
                    h0Var.a(this.f19939a.o());
                } while (this.f19939a.b() < b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(this.f19939a.o()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int u11 = this.f19939a.u();
            d(u11);
            int b11 = this.f19939a.b() + u11;
            do {
                list.add(Long.valueOf(this.f19939a.o()));
            } while (this.f19939a.b() < b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void n(List<Long> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 1) {
                do {
                    h0Var.a(this.f19939a.i());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int u10 = this.f19939a.u();
                d(u10);
                int b10 = this.f19939a.b() + u10;
                do {
                    h0Var.a(this.f19939a.i());
                } while (this.f19939a.b() < b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(this.f19939a.i()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int u11 = this.f19939a.u();
            d(u11);
            int b11 = this.f19939a.b() + u11;
            do {
                list.add(Long.valueOf(this.f19939a.i()));
            } while (this.f19939a.b() < b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void o(List<Integer> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    yVar.c(this.f19939a.k());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    yVar.c(this.f19939a.k());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Integer.valueOf(this.f19939a.k()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Integer.valueOf(this.f19939a.k()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void p(List<Integer> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    yVar.c(this.f19939a.g());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    yVar.c(this.f19939a.g());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Integer.valueOf(this.f19939a.g()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Integer.valueOf(this.f19939a.g()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void q(List<String> list) throws IOException {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <T> T a(f1<T> f1Var, q qVar) throws IOException {
        b(3);
        return (T) c(f1Var, qVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public i a() throws IOException {
        b(2);
        return this.f19939a.e();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <T> T b(f1<T> f1Var, q qVar) throws IOException {
        b(2);
        return (T) d(f1Var, qVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void a(List<Long> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    h0Var.a(this.f19939a.v());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    h0Var.a(this.f19939a.v());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Long.valueOf(this.f19939a.v()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Long.valueOf(this.f19939a.v()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int b() throws IOException {
        b(0);
        return this.f19939a.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void b(List<String> list) throws IOException {
        a(list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <T> void b(List<T> list, f1<T> f1Var, q qVar) throws IOException {
        int t10;
        int i10 = this.f19940b;
        int i11 = t1.f20010a;
        if ((i10 & 7) == 2) {
            do {
                list.add(d(f1Var, qVar));
                if (this.f19939a.c() || this.f19942d != 0) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == i10);
            this.f19942d = t10;
            return;
        }
        throw a0.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public int c() throws IOException {
        b(0);
        return this.f19939a.u();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void c(List<Integer> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof y) {
            y yVar = (y) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 0) {
                do {
                    yVar.c(this.f19939a.p());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else if (i12 == 2) {
                int b10 = this.f19939a.b() + this.f19939a.u();
                do {
                    yVar.c(this.f19939a.p());
                } while (this.f19939a.b() < b10);
                a(b10);
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 0) {
            do {
                list.add(Integer.valueOf(this.f19939a.p()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else if (i15 == 2) {
            int b11 = this.f19939a.b() + this.f19939a.u();
            do {
                list.add(Integer.valueOf(this.f19939a.p()));
            } while (this.f19939a.b() < b11);
            a(b11);
        } else {
            throw a0.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public void d(List<Float> list) throws IOException {
        int t10;
        int t11;
        if (list instanceof w) {
            w wVar = (w) list;
            int i10 = this.f19940b;
            int i11 = t1.f20010a;
            int i12 = i10 & 7;
            if (i12 == 2) {
                int u10 = this.f19939a.u();
                c(u10);
                int b10 = this.f19939a.b() + u10;
                do {
                    wVar.a(this.f19939a.j());
                } while (this.f19939a.b() < b10);
                return;
            } else if (i12 == 5) {
                do {
                    wVar.a(this.f19939a.j());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            } else {
                throw a0.d();
            }
        }
        int i13 = this.f19940b;
        int i14 = t1.f20010a;
        int i15 = i13 & 7;
        if (i15 == 2) {
            int u11 = this.f19939a.u();
            c(u11);
            int b11 = this.f19939a.b() + u11;
            do {
                list.add(Float.valueOf(this.f19939a.j()));
            } while (this.f19939a.b() < b11);
        } else if (i15 == 5) {
            do {
                list.add(Float.valueOf(this.f19939a.j()));
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
        } else {
            throw a0.d();
        }
    }

    public void a(List<String> list, boolean z10) throws IOException {
        int t10;
        int t11;
        int i10 = this.f19940b;
        int i11 = t1.f20010a;
        if ((i10 & 7) == 2) {
            if ((list instanceof f0) && !z10) {
                f0 f0Var = (f0) list;
                do {
                    f0Var.a(a());
                    if (this.f19939a.c()) {
                        return;
                    }
                    t11 = this.f19939a.t();
                } while (t11 == this.f19940b);
                this.f19942d = t11;
                return;
            }
            do {
                list.add(z10 ? p() : n());
                if (this.f19939a.c()) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == this.f19940b);
            this.f19942d = t10;
            return;
        }
        throw a0.d();
    }

    public final void c(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw a0.g();
        }
    }

    public final void d(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw a0.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <T> void a(List<T> list, f1<T> f1Var, q qVar) throws IOException {
        int t10;
        int i10 = this.f19940b;
        int i11 = t1.f20010a;
        if ((i10 & 7) == 3) {
            do {
                list.add(c(f1Var, qVar));
                if (this.f19939a.c() || this.f19942d != 0) {
                    return;
                }
                t10 = this.f19939a.t();
            } while (t10 == i10);
            this.f19942d = t10;
            return;
        }
        throw a0.d();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e1
    public <K, V> void a(Map<K, V> map, j0.a<K, V> aVar, q qVar) throws IOException {
        b(2);
        this.f19939a.d(this.f19939a.u());
        throw null;
    }

    public final void a(int i10) throws IOException {
        if (this.f19939a.b() != i10) {
            throw a0.i();
        }
    }
}
