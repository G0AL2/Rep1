package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class m1<T, B> {
    public abstract B a();

    public abstract B a(Object obj);

    public abstract T a(T t10, T t11);

    public abstract void a(B b10, int i10, int i11);

    public abstract void a(B b10, int i10, long j10);

    public abstract void a(B b10, int i10, i iVar);

    public abstract void a(B b10, int i10, T t10);

    public abstract void a(T t10, u1 u1Var) throws IOException;

    public abstract boolean a(e1 e1Var);

    public final boolean a(B b10, e1 e1Var) throws IOException {
        int e10 = e1Var.e();
        int i10 = t1.f20010a;
        int i11 = e10 >>> 3;
        int i12 = e10 & 7;
        if (i12 == 0) {
            b(b10, i11, e1Var.o());
            return true;
        } else if (i12 == 1) {
            a((m1<T, B>) b10, i11, e1Var.g());
            return true;
        } else if (i12 == 2) {
            a((m1<T, B>) b10, i11, e1Var.a());
            return true;
        } else if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 5) {
                    a((m1<T, B>) b10, i11, e1Var.q());
                    return true;
                }
                throw a0.d();
            }
            return false;
        } else {
            B a10 = a();
            int a11 = t1.a(i11, 4);
            while (e1Var.s() != Integer.MAX_VALUE && a((m1<T, B>) a10, e1Var)) {
            }
            if (a11 == e1Var.e()) {
                a((m1<T, B>) b10, i11, (int) f(a10));
                return true;
            }
            throw a0.a();
        }
    }

    public abstract T b(Object obj);

    public abstract void b(B b10, int i10, long j10);

    public abstract void b(T t10, u1 u1Var) throws IOException;

    public abstract void b(Object obj, B b10);

    public abstract int c(T t10);

    public abstract void c(Object obj, T t10);

    public abstract int d(T t10);

    public abstract void e(Object obj);

    public abstract T f(B b10);
}
