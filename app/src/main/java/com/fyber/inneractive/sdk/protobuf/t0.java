package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.e;
import com.fyber.inneractive.sdk.protobuf.j0;
import com.fyber.inneractive.sdk.protobuf.r1;
import com.fyber.inneractive.sdk.protobuf.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class t0<T> implements f1<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f19991r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f19992s;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f19993a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f19994b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19995c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19996d;

    /* renamed from: e  reason: collision with root package name */
    public final q0 f19997e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19998f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f19999g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f20000h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f20001i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f20002j;

    /* renamed from: k  reason: collision with root package name */
    public final int f20003k;

    /* renamed from: l  reason: collision with root package name */
    public final int f20004l;

    /* renamed from: m  reason: collision with root package name */
    public final v0 f20005m;

    /* renamed from: n  reason: collision with root package name */
    public final g0 f20006n;

    /* renamed from: o  reason: collision with root package name */
    public final m1<?, ?> f20007o;

    /* renamed from: p  reason: collision with root package name */
    public final r<?> f20008p;

    /* renamed from: q  reason: collision with root package name */
    public final l0 f20009q;

    static {
        Unsafe unsafe;
        Unsafe unsafe2 = r1.f19977a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f19992s = unsafe;
    }

    public t0(int[] iArr, Object[] objArr, int i10, int i11, q0 q0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, v0 v0Var, g0 g0Var, m1<?, ?> m1Var, r<?> rVar, l0 l0Var) {
        this.f19993a = iArr;
        this.f19994b = objArr;
        this.f19995c = i10;
        this.f19996d = i11;
        this.f19999g = q0Var instanceof GeneratedMessageLite;
        this.f20000h = z10;
        this.f19998f = rVar != null && rVar.a(q0Var);
        this.f20001i = z11;
        this.f20002j = iArr2;
        this.f20003k = i12;
        this.f20004l = i13;
        this.f20005m = v0Var;
        this.f20006n = g0Var;
        this.f20007o = m1Var;
        this.f20008p = rVar;
        this.f19997e = q0Var;
        this.f20009q = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0341  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.protobuf.t0 a(com.fyber.inneractive.sdk.protobuf.o0 r35, com.fyber.inneractive.sdk.protobuf.v0 r36, com.fyber.inneractive.sdk.protobuf.g0 r37, com.fyber.inneractive.sdk.protobuf.m1 r38, com.fyber.inneractive.sdk.protobuf.r r39, com.fyber.inneractive.sdk.protobuf.l0 r40) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.a(com.fyber.inneractive.sdk.protobuf.o0, com.fyber.inneractive.sdk.protobuf.v0, com.fyber.inneractive.sdk.protobuf.g0, com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.r, com.fyber.inneractive.sdk.protobuf.l0):com.fyber.inneractive.sdk.protobuf.t0");
    }

    public static long d(int i10) {
        return i10 & 1048575;
    }

    public static n1 e(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var == n1.f19962f) {
            n1 c10 = n1.c();
            generatedMessageLite.unknownFields = c10;
            return c10;
        }
        return n1Var;
    }

    public static int f(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x019c, code lost:
        if (r4.a(r10, r5) == r4.a(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01b7, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01ef, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x020c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0228, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (com.fyber.inneractive.sdk.protobuf.h1.a(com.fyber.inneractive.sdk.protobuf.r1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.r1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x024c, code lost:
        if (java.lang.Float.floatToIntBits(r4.d(r10, r5)) == java.lang.Float.floatToIntBits(r4.d(r11, r5))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0272, code lost:
        if (java.lang.Double.doubleToLongBits(r4.c(r10, r5)) == java.lang.Double.doubleToLongBits(r4.c(r11, r5))) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.h1.a(com.fyber.inneractive.sdk.protobuf.r1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.r1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.f(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.f(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0122, code lost:
        if (com.fyber.inneractive.sdk.protobuf.r1.e(r10, r5) == com.fyber.inneractive.sdk.protobuf.r1.e(r11, r5)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
        if (com.fyber.inneractive.sdk.protobuf.h1.a(com.fyber.inneractive.sdk.protobuf.r1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.r1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0160, code lost:
        if (com.fyber.inneractive.sdk.protobuf.h1.a(com.fyber.inneractive.sdk.protobuf.r1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.r1.g(r11, r5)) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017f, code lost:
        if (com.fyber.inneractive.sdk.protobuf.h1.a(com.fyber.inneractive.sdk.protobuf.r1.g(r10, r5), com.fyber.inneractive.sdk.protobuf.r1.g(r11, r5)) != false) goto L142;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final f1 c(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f19994b;
        f1 f1Var = (f1) objArr[i11];
        if (f1Var != null) {
            return f1Var;
        }
        f1<T> a10 = b1.f19840c.a((Class) objArr[i11 + 1]);
        this.f19994b[i11] = a10;
        return a10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public int d(T t10) {
        int i10;
        int a10;
        int length = this.f19993a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int g10 = g(i12);
            int i13 = this.f19993a[i12];
            long d10 = d(g10);
            int i14 = 37;
            switch (f(g10)) {
                case 0:
                    i10 = i11 * 53;
                    a10 = z.a(Double.doubleToLongBits(r1.f19981e.c(t10, d10)));
                    i11 = i10 + a10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    a10 = Float.floatToIntBits(r1.f19981e.d(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    a10 = z.a(r1.f(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    a10 = z.a(r1.f(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    a10 = r1.e(t10, d10);
                    i11 = i10 + a10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    a10 = z.a(r1.f(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    a10 = r1.e(t10, d10);
                    i11 = i10 + a10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    a10 = z.a(r1.f19981e.a(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    a10 = ((String) r1.g(t10, d10)).hashCode();
                    i11 = i10 + a10;
                    break;
                case 9:
                    Object g11 = r1.g(t10, d10);
                    if (g11 != null) {
                        i14 = g11.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    a10 = r1.g(t10, d10).hashCode();
                    i11 = i10 + a10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    a10 = r1.e(t10, d10);
                    i11 = i10 + a10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    a10 = r1.e(t10, d10);
                    i11 = i10 + a10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    a10 = r1.e(t10, d10);
                    i11 = i10 + a10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    a10 = z.a(r1.f(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    a10 = r1.e(t10, d10);
                    i11 = i10 + a10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    a10 = z.a(r1.f(t10, d10));
                    i11 = i10 + a10;
                    break;
                case 17:
                    Object g12 = r1.g(t10, d10);
                    if (g12 != null) {
                        i14 = g12.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    a10 = r1.g(t10, d10).hashCode();
                    i11 = i10 + a10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    a10 = r1.g(t10, d10).hashCode();
                    i11 = i10 + a10;
                    break;
                case 51:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(Double.doubleToLongBits(b(t10, d10)));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = Float.floatToIntBits(c(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(e(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(e(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = d(t10, d10);
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(e(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = d(t10, d10);
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(a(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = ((String) r1.g(t10, d10)).hashCode();
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = r1.g(t10, d10).hashCode();
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = r1.g(t10, d10).hashCode();
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = d(t10, d10);
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = d(t10, d10);
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = d(t10, d10);
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(e(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = d(t10, d10);
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = z.a(e(t10, d10));
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (a((t0<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        a10 = r1.g(t10, d10).hashCode();
                        i11 = i10 + a10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f20007o.b(t10).hashCode();
        return this.f19998f ? (hashCode * 53) + this.f20008p.a(t10).f20050a.hashCode() : hashCode;
    }

    public final int g(int i10) {
        return this.f19993a[i10 + 1];
    }

    public static <T> long e(T t10, long j10) {
        return ((Long) r1.g(t10, j10)).longValue();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void c(T t10) {
        int i10;
        int i11 = this.f20003k;
        while (true) {
            i10 = this.f20004l;
            if (i11 >= i10) {
                break;
            }
            long d10 = d(g(this.f20002j[i11]));
            Object g10 = r1.g(t10, d10);
            if (g10 != null) {
                r1.a(t10, d10, this.f20009q.e(g10));
            }
            i11++;
        }
        int length = this.f20002j.length;
        while (i10 < length) {
            this.f20006n.a(t10, this.f20002j[i10]);
            i10++;
        }
        this.f20007o.e(t10);
        if (this.f19998f) {
            this.f20008p.c(t10);
        }
    }

    public final int e(int i10) {
        if (i10 < this.f19995c || i10 > this.f19996d) {
            return -1;
        }
        return a(i10, 0);
    }

    public static <T> float c(T t10, long j10) {
        return ((Float) r1.g(t10, j10)).floatValue();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public int b(T t10) {
        int c10;
        int d10;
        int i10;
        int i11;
        int i12;
        int a10;
        int b10;
        int a11;
        int d11;
        int c11;
        int b11;
        int c12;
        int a12;
        int a13;
        int a14;
        int c13;
        int b12;
        int c14;
        int i13 = 1048575;
        int i14 = 1;
        if (this.f20000h) {
            Unsafe unsafe = f19992s;
            c10 = 0;
            for (int i15 = 0; i15 < this.f19993a.length; i15 += 3) {
                int g10 = g(i15);
                int f10 = f(g10);
                int i16 = this.f19993a[i15];
                long d12 = d(g10);
                int i17 = (f10 < v.f20057c.f20061a || f10 > v.f20058d.f20061a) ? 0 : this.f19993a[i15 + 2] & 1048575;
                switch (f10) {
                    case 0:
                        if (a((t0<T>) t10, i15)) {
                            a13 = l.a(i16, 0.0d);
                            a14 = a13;
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.a(i16, 0.0f);
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.b(i16, r1.f(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.e(i16, r1.f(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.c(i16, r1.e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.a(i16, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.b(i16, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.a(i16, true);
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if (a((t0<T>) t10, i15)) {
                            Object g11 = r1.g(t10, d12);
                            if (g11 instanceof i) {
                                a14 = l.a(i16, (i) g11);
                                break;
                            } else {
                                a14 = l.a(i16, (String) g11);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a((t0<T>) t10, i15)) {
                            a14 = h1.a(i16, r1.g(t10, d12), c(i15));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.a(i16, (i) r1.g(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.f(i16, r1.e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.a(i16, r1.e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.d(i16, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.c(i16, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.e(i16, r1.e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.d(i16, r1.f(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if (a((t0<T>) t10, i15)) {
                            a14 = l.a(i16, (q0) r1.g(t10, d12), c(i15));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        a14 = h1.d(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 19:
                        a14 = h1.c(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 20:
                        a14 = h1.f(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 21:
                        a14 = h1.j(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 22:
                        a14 = h1.e(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 23:
                        a14 = h1.d(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 24:
                        a14 = h1.c(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 25:
                        a14 = h1.a(i16, (List<?>) r1.g(t10, d12), false);
                        break;
                    case 26:
                        a14 = h1.b(i16, (List) r1.g(t10, d12));
                        break;
                    case 27:
                        a14 = h1.b(i16, (List) r1.g(t10, d12), c(i15));
                        break;
                    case 28:
                        a14 = h1.a(i16, (List) r1.g(t10, d12));
                        break;
                    case 29:
                        a14 = h1.i(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 30:
                        a14 = h1.b(i16, (List<Integer>) r1.g(t10, d12), false);
                        break;
                    case 31:
                        a14 = h1.c(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 32:
                        a14 = h1.d(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 33:
                        a14 = h1.g(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 34:
                        a14 = h1.h(i16, (List) r1.g(t10, d12), false);
                        break;
                    case 35:
                        c13 = h1.c((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        c13 = h1.b((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        c13 = h1.e((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        c13 = h1.i((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        c13 = h1.d((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        c13 = h1.c((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        c13 = h1.b((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        Class<?> cls = h1.f19877a;
                        c13 = ((List) unsafe.getObject(t10, d12)).size();
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        c13 = h1.h((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        c13 = h1.a((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        c13 = h1.b((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        c13 = h1.c((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        c13 = h1.f((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        c13 = h1.g((List) unsafe.getObject(t10, d12));
                        if (c13 > 0) {
                            if (this.f20001i) {
                                unsafe.putInt(t10, i17, c13);
                            }
                            b12 = l.b(i16);
                            c14 = l.c(c13);
                            a14 = c13 + b12 + c14;
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        a14 = h1.a(i16, (List<q0>) r1.g(t10, d12), c(i15));
                        break;
                    case 50:
                        a14 = this.f20009q.a(i16, r1.g(t10, d12), b(i15));
                        break;
                    case 51:
                        if (a((t0<T>) t10, i16, i15)) {
                            a13 = l.a(i16, 0.0d);
                            a14 = a13;
                            break;
                        } else {
                            continue;
                        }
                    case 52:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.a(i16, 0.0f);
                            break;
                        } else {
                            continue;
                        }
                    case 53:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.b(i16, e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 54:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.e(i16, e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 55:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.c(i16, d(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 56:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.a(i16, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 57:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.b(i16, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 58:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.a(i16, true);
                            break;
                        } else {
                            continue;
                        }
                    case 59:
                        if (a((t0<T>) t10, i16, i15)) {
                            Object g12 = r1.g(t10, d12);
                            if (g12 instanceof i) {
                                a14 = l.a(i16, (i) g12);
                                break;
                            } else {
                                a14 = l.a(i16, (String) g12);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = h1.a(i16, r1.g(t10, d12), c(i15));
                            break;
                        } else {
                            continue;
                        }
                    case 61:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.a(i16, (i) r1.g(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 62:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.f(i16, d(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 63:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.a(i16, d(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 64:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.d(i16, 0);
                            break;
                        } else {
                            continue;
                        }
                    case 65:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.c(i16, 0L);
                            break;
                        } else {
                            continue;
                        }
                    case 66:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.e(i16, d(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 67:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.d(i16, e(t10, d12));
                            break;
                        } else {
                            continue;
                        }
                    case 68:
                        if (a((t0<T>) t10, i16, i15)) {
                            a14 = l.a(i16, (q0) r1.g(t10, d12), c(i15));
                            break;
                        } else {
                            continue;
                        }
                    default:
                }
                c10 += a14;
            }
            m1<?, ?> m1Var = this.f20007o;
            d10 = m1Var.c(m1Var.b(t10));
        } else {
            Unsafe unsafe2 = f19992s;
            int i18 = 0;
            int i19 = 0;
            int i20 = 1048575;
            int i21 = 0;
            while (i18 < this.f19993a.length) {
                int g13 = g(i18);
                int i22 = this.f19993a[i18];
                int f11 = f(g13);
                if (f11 <= 17) {
                    i10 = this.f19993a[i18 + 2];
                    int i23 = i10 & i13;
                    i11 = i14 << (i10 >>> 20);
                    if (i23 != i20) {
                        i21 = unsafe2.getInt(t10, i23);
                        i20 = i23;
                    }
                } else {
                    i10 = (!this.f20001i || f11 < v.f20057c.f20061a || f11 > v.f20058d.f20061a) ? 0 : this.f19993a[i18 + 2] & i13;
                    i11 = 0;
                }
                long d13 = d(g13);
                switch (f11) {
                    case 0:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a10 = l.a(i22, 0.0d);
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 1:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a10 = l.a(i22, 0.0f);
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 2:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            b10 = l.b(i22, unsafe2.getLong(t10, d13));
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 3:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            b10 = l.e(i22, unsafe2.getLong(t10, d13));
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 4:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            b10 = l.c(i22, unsafe2.getInt(t10, d13));
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 5:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            b10 = l.a(i22, 0L);
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 6:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            b10 = l.b(i22, 0);
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 7:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a10 = l.a(i22, true);
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 8:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            Object object = unsafe2.getObject(t10, d13);
                            if (object instanceof i) {
                                a11 = l.a(i22, (i) object);
                            } else {
                                a11 = l.a(i22, (String) object);
                            }
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 9:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = h1.a(i22, unsafe2.getObject(t10, d13), c(i18));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 10:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.a(i22, (i) unsafe2.getObject(t10, d13));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 11:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.f(i22, unsafe2.getInt(t10, d13));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 12:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.a(i22, unsafe2.getInt(t10, d13));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 13:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a10 = l.d(i22, 0);
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 14:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.c(i22, 0L);
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 15:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.e(i22, unsafe2.getInt(t10, d13));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 16:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.d(i22, unsafe2.getLong(t10, d13));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 17:
                        i12 = i20;
                        if ((i21 & i11) != 0) {
                            a11 = l.a(i22, (q0) unsafe2.getObject(t10, d13), c(i18));
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 18:
                        i12 = i20;
                        d11 = h1.d(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 19:
                        i12 = i20;
                        d11 = h1.c(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 20:
                        i12 = i20;
                        d11 = h1.f(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 21:
                        i12 = i20;
                        d11 = h1.j(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 22:
                        i12 = i20;
                        d11 = h1.e(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 23:
                        i12 = i20;
                        d11 = h1.d(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 24:
                        i12 = i20;
                        d11 = h1.c(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 25:
                        i12 = i20;
                        d11 = h1.a(i22, (List<?>) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 26:
                        i12 = i20;
                        a11 = h1.b(i22, (List) unsafe2.getObject(t10, d13));
                        a10 = a11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 27:
                        i12 = i20;
                        a11 = h1.b(i22, (List) unsafe2.getObject(t10, d13), c(i18));
                        a10 = a11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 28:
                        i12 = i20;
                        a11 = h1.a(i22, (List) unsafe2.getObject(t10, d13));
                        a10 = a11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 29:
                        i12 = i20;
                        d11 = h1.i(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 30:
                        i12 = i20;
                        d11 = h1.b(i22, (List<Integer>) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 31:
                        i12 = i20;
                        d11 = h1.c(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 32:
                        i12 = i20;
                        d11 = h1.d(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 33:
                        i12 = i20;
                        d11 = h1.g(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 34:
                        i12 = i20;
                        d11 = h1.h(i22, (List) unsafe2.getObject(t10, d13), false);
                        a10 = d11;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 35:
                        i12 = i20;
                        c11 = h1.c((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 36:
                        i12 = i20;
                        c11 = h1.b((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 37:
                        i12 = i20;
                        c11 = h1.e((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 38:
                        i12 = i20;
                        c11 = h1.i((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 39:
                        i12 = i20;
                        c11 = h1.d((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 40:
                        i12 = i20;
                        c11 = h1.c((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 41:
                        i12 = i20;
                        c11 = h1.b((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 42:
                        i12 = i20;
                        Class<?> cls2 = h1.f19877a;
                        c11 = ((List) unsafe2.getObject(t10, d13)).size();
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 43:
                        i12 = i20;
                        c11 = h1.h((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 44:
                        i12 = i20;
                        c11 = h1.a((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 45:
                        i12 = i20;
                        c11 = h1.b((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 46:
                        i12 = i20;
                        c11 = h1.c((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 47:
                        i12 = i20;
                        c11 = h1.f((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 48:
                        c11 = h1.g((List) unsafe2.getObject(t10, d13));
                        if (c11 > 0) {
                            i12 = i20;
                            if (this.f20001i) {
                                unsafe2.putInt(t10, i10, c11);
                            }
                            b11 = l.b(i22);
                            c12 = l.c(c11);
                            a11 = b11 + c12 + c11;
                            a10 = a11;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 49:
                        a12 = h1.a(i22, (List<q0>) unsafe2.getObject(t10, d13), c(i18));
                        i12 = i20;
                        a10 = a12;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 50:
                        a12 = this.f20009q.a(i22, unsafe2.getObject(t10, d13), b(i18));
                        i12 = i20;
                        a10 = a12;
                        i19 += a10;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 51:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.a(i22, 0.0d);
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 52:
                        if (a((t0<T>) t10, i22, i18)) {
                            b10 = l.a(i22, 0.0f);
                            i12 = i20;
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 53:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.b(i22, e(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 54:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.e(i22, e(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 55:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.c(i22, d(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 56:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.a(i22, 0L);
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 57:
                        if (a((t0<T>) t10, i22, i18)) {
                            b10 = l.b(i22, 0);
                            i12 = i20;
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 58:
                        if (a((t0<T>) t10, i22, i18)) {
                            b10 = l.a(i22, true);
                            i12 = i20;
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 59:
                        if (a((t0<T>) t10, i22, i18)) {
                            Object object2 = unsafe2.getObject(t10, d13);
                            if (object2 instanceof i) {
                                a12 = l.a(i22, (i) object2);
                            } else {
                                a12 = l.a(i22, (String) object2);
                            }
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 60:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = h1.a(i22, unsafe2.getObject(t10, d13), c(i18));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 61:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.a(i22, (i) unsafe2.getObject(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 62:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.f(i22, d(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 63:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.a(i22, d(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 64:
                        if (a((t0<T>) t10, i22, i18)) {
                            b10 = l.d(i22, 0);
                            i12 = i20;
                            a10 = b10;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 65:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.c(i22, 0L);
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 66:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.e(i22, d(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 67:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.d(i22, e(t10, d13));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    case 68:
                        if (a((t0<T>) t10, i22, i18)) {
                            a12 = l.a(i22, (q0) unsafe2.getObject(t10, d13), c(i18));
                            i12 = i20;
                            a10 = a12;
                            i19 += a10;
                            i18 += 3;
                            i20 = i12;
                            i13 = 1048575;
                            i14 = 1;
                        }
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                    default:
                        i12 = i20;
                        i18 += 3;
                        i20 = i12;
                        i13 = 1048575;
                        i14 = 1;
                }
            }
            m1<?, ?> m1Var2 = this.f20007o;
            c10 = i19 + m1Var2.c(m1Var2.b(t10));
            if (!this.f19998f) {
                return c10;
            }
            d10 = this.f20008p.a(t10).d();
        }
        return c10 + d10;
    }

    public static <T> int d(T t10, long j10) {
        return ((Integer) r1.g(t10, j10)).intValue();
    }

    public static Field a(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public T a() {
        return (T) this.f20005m.a(this.f19997e);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void a(T t10, T t11) {
        t11.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f19993a;
            if (i10 < iArr.length) {
                int i11 = iArr[i10 + 1];
                long d10 = d(i11);
                int i12 = this.f19993a[i10];
                switch (f(i11)) {
                    case 0:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.d dVar = r1.f19981e;
                            dVar.a(t10, d10, dVar.c(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 1:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.d dVar2 = r1.f19981e;
                            dVar2.a((Object) t10, d10, dVar2.d(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 2:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.f(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 3:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.f(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 4:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.e(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 5:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.f(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 6:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.e(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 7:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.d dVar3 = r1.f19981e;
                            dVar3.a(t10, d10, dVar3.a(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 8:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a(t10, d10, r1.g(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 9:
                        a(t10, t11, i10);
                        break;
                    case 10:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a(t10, d10, r1.g(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 11:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.e(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 12:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.e(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 13:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.e(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 14:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.f(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 15:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.e(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 16:
                        if (!a((t0<T>) t11, i10)) {
                            break;
                        } else {
                            r1.a((Object) t10, d10, r1.f(t11, d10));
                            b((t0<T>) t10, i10);
                            break;
                        }
                    case 17:
                        a(t10, t11, i10);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f20006n.a(t10, t11, d10);
                        break;
                    case 50:
                        l0 l0Var = this.f20009q;
                        Class<?> cls = h1.f19877a;
                        r1.a(t10, d10, l0Var.a(r1.g(t10, d10), r1.g(t11, d10)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a((t0<T>) t11, i12, i10)) {
                            break;
                        } else {
                            r1.a(t10, d10, r1.g(t11, d10));
                            b((t0<T>) t10, i12, i10);
                            break;
                        }
                    case 60:
                        b(t10, t11, i10);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a((t0<T>) t11, i12, i10)) {
                            break;
                        } else {
                            r1.a(t10, d10, r1.g(t11, d10));
                            b((t0<T>) t10, i12, i10);
                            break;
                        }
                    case 68:
                        b(t10, t11, i10);
                        break;
                }
                i10 += 3;
            } else {
                m1<?, ?> m1Var = this.f20007o;
                Class<?> cls2 = h1.f19877a;
                m1Var.c(t10, m1Var.a(m1Var.b(t10), m1Var.b(t11)));
                if (this.f19998f) {
                    r<?> rVar = this.f20008p;
                    u<?> a10 = rVar.a(t11);
                    if (a10.f20050a.isEmpty()) {
                        return;
                    }
                    rVar.b(t10).a(a10);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x053f  */
    @Override // com.fyber.inneractive.sdk.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r18, com.fyber.inneractive.sdk.protobuf.u1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.a(java.lang.Object, com.fyber.inneractive.sdk.protobuf.u1):void");
    }

    public final <K, V> void a(u1 u1Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            this.f20009q.f(this.f19994b[(i11 / 3) * 2]);
            Map<?, ?> a10 = this.f20009q.a(obj);
            m mVar = (m) u1Var;
            mVar.f19956a.getClass();
            Iterator<Map.Entry<?, ?>> it = a10.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                mVar.f19956a.i(i10, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public void a(T t10, e1 e1Var, q qVar) throws IOException {
        qVar.getClass();
        a(this.f20007o, this.f20008p, (r) t10, e1Var, qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        r0 = r16.f20003k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r0 >= r16.f20004l) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r13 = a((java.lang.Object) r19, r16.f20002j[r0], (int) r13, (com.fyber.inneractive.sdk.protobuf.m1<UT, int>) r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r13 == null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
        r17.b((java.lang.Object) r19, (T) r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <UT, UB, ET extends com.fyber.inneractive.sdk.protobuf.u.a<ET>> void a(com.fyber.inneractive.sdk.protobuf.m1<UT, UB> r17, com.fyber.inneractive.sdk.protobuf.r<ET> r18, T r19, com.fyber.inneractive.sdk.protobuf.e1 r20, com.fyber.inneractive.sdk.protobuf.q r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.a(com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.r, java.lang.Object, com.fyber.inneractive.sdk.protobuf.e1, com.fyber.inneractive.sdk.protobuf.q):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0624  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(T r13, com.fyber.inneractive.sdk.protobuf.u1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.b(java.lang.Object, com.fyber.inneractive.sdk.protobuf.u1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0204 -> B:109:0x0205). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0138 -> B:58:0x0139). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x01b4 -> B:88:0x01b5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.fyber.inneractive.sdk.protobuf.e.a r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 956
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    public final Object b(int i10) {
        return this.f19994b[(i10 / 3) * 2];
    }

    public final void b(Object obj, int i10, e1 e1Var) throws IOException {
        if ((536870912 & i10) != 0) {
            e1Var.b(this.f20006n.b(obj, d(i10)));
        } else {
            e1Var.q(this.f20006n.b(obj, d(i10)));
        }
    }

    public final void b(T t10, T t11, int i10) {
        int[] iArr = this.f19993a;
        int i11 = iArr[i10 + 1];
        int i12 = iArr[i10];
        long d10 = d(i11);
        if (a((t0<T>) t11, i12, i10)) {
            Object g10 = a((t0<T>) t10, i12, i10) ? r1.g(t10, d10) : null;
            Object g11 = r1.g(t11, d10);
            if (g10 != null && g11 != null) {
                r1.a(t10, d10, z.a(g10, g11));
                b((t0<T>) t10, i12, i10);
            } else if (g11 != null) {
                r1.a(t10, d10, g11);
                b((t0<T>) t10, i12, i10);
            }
        }
    }

    public final void b(T t10, int i10) {
        int i11 = this.f19993a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        r1.a((Object) t10, j10, (1 << (i11 >>> 20)) | r1.e(t10, j10));
    }

    public final void b(T t10, int i10, int i11) {
        r1.a((Object) t10, this.f19993a[i11 + 2] & 1048575, i10);
    }

    public static <T> double b(T t10, long j10) {
        return ((Double) r1.g(t10, j10)).doubleValue();
    }

    public final <K, V> int a(T t10, byte[] bArr, int i10, int i11, int i12, long j10, e.a aVar) throws IOException {
        Unsafe unsafe = f19992s;
        Object obj = this.f19994b[(i12 / 3) * 2];
        Object object = unsafe.getObject(t10, j10);
        if (this.f20009q.d(object)) {
            Object b10 = this.f20009q.b(obj);
            this.f20009q.a(b10, object);
            unsafe.putObject(t10, j10, b10);
            object = b10;
        }
        this.f20009q.f(obj);
        this.f20009q.c(object);
        int d10 = e.d(bArr, i10, aVar);
        int i13 = aVar.f19857a;
        if (i13 >= 0 && i13 <= i11 - d10) {
            throw null;
        }
        throw a0.i();
    }

    public final int a(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, e.a aVar) throws IOException {
        Unsafe unsafe = f19992s;
        long j11 = this.f19993a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(Double.longBitsToDouble(e.b(bArr, i10))));
                    int i18 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i18;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(Float.intBitsToFloat(e.a(bArr, i10))));
                    int i19 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i19;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int e10 = e.e(bArr, i10, aVar);
                    unsafe.putObject(t10, j10, Long.valueOf(aVar.f19858b));
                    unsafe.putInt(t10, j11, i13);
                    return e10;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int d10 = e.d(bArr, i10, aVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(aVar.f19857a));
                    unsafe.putInt(t10, j11, i13);
                    return d10;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(e.b(bArr, i10)));
                    int i20 = i10 + 8;
                    unsafe.putInt(t10, j11, i13);
                    return i20;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(e.a(bArr, i10)));
                    int i21 = i10 + 4;
                    unsafe.putInt(t10, j11, i13);
                    return i21;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int e11 = e.e(bArr, i10, aVar);
                    unsafe.putObject(t10, j10, Boolean.valueOf(aVar.f19858b != 0));
                    unsafe.putInt(t10, j11, i13);
                    return e11;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int d11 = e.d(bArr, i10, aVar);
                    int i22 = aVar.f19857a;
                    if (i22 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else if ((i15 & 536870912) != 0 && !s1.b(bArr, d11, d11 + i22)) {
                        throw a0.c();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, d11, i22, z.f20078a));
                        d11 += i22;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return d11;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int a10 = e.a(c(i17), bArr, i10, i11, aVar);
                    Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, aVar.f19859c);
                    } else {
                        unsafe.putObject(t10, j10, z.a(object, aVar.f19859c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return a10;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int a11 = e.a(bArr, i10, aVar);
                    unsafe.putObject(t10, j10, aVar.f19859c);
                    unsafe.putInt(t10, j11, i13);
                    return a11;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int d12 = e.d(bArr, i10, aVar);
                    int i23 = aVar.f19857a;
                    z.e a12 = a(i17);
                    if (a12 != null && !a12.a(i23)) {
                        e(t10).a(i12, Long.valueOf(i23));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i23));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return d12;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int d13 = e.d(bArr, i10, aVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(j.b(aVar.f19857a)));
                    unsafe.putInt(t10, j11, i13);
                    return d13;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int e12 = e.e(bArr, i10, aVar);
                    unsafe.putObject(t10, j10, Long.valueOf(j.a(aVar.f19858b)));
                    unsafe.putInt(t10, j11, i13);
                    return e12;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int a13 = e.a(c(i17), bArr, i10, i11, (i12 & (-8)) | 4, aVar);
                    Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t10, j10, aVar.f19859c);
                    } else {
                        unsafe.putObject(t10, j10, z.a(object2, aVar.f19859c));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return a13;
                }
                break;
        }
        return i10;
    }

    public final z.e a(int i10) {
        return (z.e) this.f19994b[((i10 / 3) * 2) + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0393, code lost:
        if (r0 != r1) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03df, code lost:
        if (r0 != r15) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03e1, code lost:
        r10 = r30;
        r13 = r31;
        r12 = r33;
        r8 = r35;
        r11 = r36;
        r5 = r20;
        r2 = r21;
        r6 = r22;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03f5, code lost:
        r8 = r35;
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(T r31, byte[] r32, int r33, int r34, int r35, com.fyber.inneractive.sdk.protobuf.e.a r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02b2, code lost:
        if (r0 != r5) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0308, code lost:
        if (r0 != r15) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030a, code lost:
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0311, code lost:
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    @Override // com.fyber.inneractive.sdk.protobuf.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(T r31, byte[] r32, int r33, int r34, com.fyber.inneractive.sdk.protobuf.e.a r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t0.a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.protobuf.f1
    public final boolean a(T t10) {
        boolean z10;
        int i10 = 0;
        int i11 = 1048575;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= this.f20003k) {
                return !this.f19998f || this.f20008p.a(t10).e();
            }
            int i13 = this.f20002j[i10];
            int i14 = this.f19993a[i13];
            int g10 = g(i13);
            int i15 = this.f19993a[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i11) {
                if (i16 != 1048575) {
                    i12 = f19992s.getInt(t10, i16);
                }
                i11 = i16;
            }
            if ((268435456 & g10) != 0) {
                if (i11 == 1048575) {
                    z10 = a((t0<T>) t10, i13);
                } else {
                    z10 = (i12 & i17) != 0;
                }
                if (!z10) {
                    return false;
                }
            }
            int f10 = f(g10);
            if (f10 != 9 && f10 != 17) {
                if (f10 != 27) {
                    if (f10 == 60 || f10 == 68) {
                        if (a((t0<T>) t10, i14, i13) && !c(i13).a(r1.g(t10, d(g10)))) {
                            return false;
                        }
                    } else if (f10 != 49) {
                        if (f10 == 50 && !this.f20009q.a(r1.g(t10, d(g10))).isEmpty()) {
                            this.f20009q.f(this.f19994b[(i13 / 3) * 2]);
                            throw null;
                        }
                    }
                }
                List list = (List) r1.g(t10, d(g10));
                if (!list.isEmpty()) {
                    f1 c10 = c(i13);
                    int i18 = 0;
                    while (true) {
                        if (i18 >= list.size()) {
                            break;
                        } else if (!c10.a(list.get(i18))) {
                            z11 = false;
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                if (!z11) {
                    return false;
                }
            } else {
                if (i11 == 1048575) {
                    z11 = a((t0<T>) t10, i13);
                } else if ((i12 & i17) == 0) {
                    z11 = false;
                }
                if (z11 && !c(i13).a(r1.g(t10, d(g10)))) {
                    return false;
                }
            }
            i10++;
        }
    }

    public final void a(int i10, Object obj, u1 u1Var) throws IOException {
        if (obj instanceof String) {
            ((m) u1Var).f19956a.b(i10, (String) obj);
            return;
        }
        ((m) u1Var).f19956a.b(i10, (i) obj);
    }

    public final void a(Object obj, int i10, e1 e1Var) throws IOException {
        if ((536870912 & i10) != 0) {
            r1.a(obj, d(i10), e1Var.p());
        } else if (this.f19999g) {
            r1.a(obj, d(i10), e1Var.n());
        } else {
            r1.a(obj, d(i10), e1Var.a());
        }
    }

    public final <E> void a(Object obj, int i10, e1 e1Var, f1<E> f1Var, q qVar) throws IOException {
        e1Var.b(this.f20006n.b(obj, d(i10)), f1Var, qVar);
    }

    public final <E> void a(Object obj, long j10, e1 e1Var, f1<E> f1Var, q qVar) throws IOException {
        e1Var.a(this.f20006n.b(obj, j10), f1Var, qVar);
    }

    public final <UT, UB> UB a(Object obj, int i10, UB ub2, m1<UT, UB> m1Var) {
        z.e a10;
        int[] iArr = this.f19993a;
        int i11 = iArr[i10];
        Object g10 = r1.g(obj, d(iArr[i10 + 1]));
        if (g10 == null || (a10 = a(i10)) == null) {
            return ub2;
        }
        Map<?, ?> c10 = this.f20009q.c(g10);
        this.f20009q.f(this.f19994b[(i10 / 3) * 2]);
        for (Map.Entry<?, ?> entry : c10.entrySet()) {
            if (!a10.a(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    m1Var.a();
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
        return ub2;
    }

    public final <K, V> void a(Object obj, int i10, Object obj2, q qVar, e1 e1Var) throws IOException {
        long d10 = d(this.f19993a[i10 + 1]);
        Object g10 = r1.g(obj, d10);
        if (g10 == null) {
            g10 = this.f20009q.b(obj2);
            r1.a(obj, d10, g10);
        } else if (this.f20009q.d(g10)) {
            Object b10 = this.f20009q.b(obj2);
            this.f20009q.a(b10, g10);
            r1.a(obj, d10, b10);
            g10 = b10;
        }
        Map<?, ?> c10 = this.f20009q.c(g10);
        this.f20009q.f(obj2);
        e1Var.a(c10, (j0.a) null, qVar);
    }

    public final void a(T t10, T t11, int i10) {
        long d10 = d(this.f19993a[i10 + 1]);
        if (a((t0<T>) t11, i10)) {
            Object g10 = r1.g(t10, d10);
            Object g11 = r1.g(t11, d10);
            if (g10 != null && g11 != null) {
                r1.a(t10, d10, z.a(g10, g11));
                b((t0<T>) t10, i10);
            } else if (g11 != null) {
                r1.a(t10, d10, g11);
                b((t0<T>) t10, i10);
            }
        }
    }

    public final boolean a(T t10, int i10) {
        int[] iArr = this.f19993a;
        int i11 = iArr[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 != 1048575) {
            return (r1.e(t10, j10) & (1 << (i11 >>> 20))) != 0;
        }
        int i12 = iArr[i10 + 1];
        long d10 = d(i12);
        switch (f(i12)) {
            case 0:
                return r1.f19981e.c(t10, d10) != 0.0d;
            case 1:
                return r1.f19981e.d(t10, d10) != 0.0f;
            case 2:
                return r1.f(t10, d10) != 0;
            case 3:
                return r1.f(t10, d10) != 0;
            case 4:
                return r1.e(t10, d10) != 0;
            case 5:
                return r1.f(t10, d10) != 0;
            case 6:
                return r1.e(t10, d10) != 0;
            case 7:
                return r1.f19981e.a(t10, d10);
            case 8:
                Object g10 = r1.g(t10, d10);
                if (g10 instanceof String) {
                    return !((String) g10).isEmpty();
                }
                if (g10 instanceof i) {
                    return !i.f19881b.equals(g10);
                }
                throw new IllegalArgumentException();
            case 9:
                return r1.g(t10, d10) != null;
            case 10:
                return !i.f19881b.equals(r1.g(t10, d10));
            case 11:
                return r1.e(t10, d10) != 0;
            case 12:
                return r1.e(t10, d10) != 0;
            case 13:
                return r1.e(t10, d10) != 0;
            case 14:
                return r1.f(t10, d10) != 0;
            case 15:
                return r1.e(t10, d10) != 0;
            case 16:
                return r1.f(t10, d10) != 0;
            case 17:
                return r1.g(t10, d10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean a(T t10, int i10, int i11) {
        return r1.e(t10, (long) (this.f19993a[i11 + 2] & 1048575)) == i10;
    }

    public static <T> boolean a(T t10, long j10) {
        return ((Boolean) r1.g(t10, j10)).booleanValue();
    }

    public final int a(int i10, int i11) {
        int length = (this.f19993a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f19993a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }
}
