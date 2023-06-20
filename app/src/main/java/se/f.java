package se;

import qe.k;
import se.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
/* loaded from: classes3.dex */
public class f extends e {
    public static int b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long c(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static int d(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long e(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static a g(int i10, int i11) {
        return a.f36984d.a(i10, i11, -1);
    }

    public static a h(a aVar, int i10) {
        k.f(aVar, "<this>");
        e.a(i10 > 0, Integer.valueOf(i10));
        a.C0501a c0501a = a.f36984d;
        int e10 = aVar.e();
        int f10 = aVar.f();
        if (aVar.g() <= 0) {
            i10 = -i10;
        }
        return c0501a.a(e10, f10, i10);
    }

    public static c i(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return c.f36992e.a();
        }
        return new c(i10, i11 - 1);
    }
}
