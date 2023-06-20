package com.facebook.imageformat;

import com.facebook.imageformat.c;
import y3.i;
import y3.k;

/* compiled from: DefaultImageFormatChecker.java */
/* loaded from: classes.dex */
public class a implements c.a {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f14783c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f14784d;

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f14785e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f14786f;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f14787g = e.a("GIF87a");

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f14788h = e.a("GIF89a");

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f14789i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f14790j;

    /* renamed from: k  reason: collision with root package name */
    private static final byte[] f14791k;

    /* renamed from: l  reason: collision with root package name */
    private static final int f14792l;

    /* renamed from: m  reason: collision with root package name */
    private static final byte[] f14793m;

    /* renamed from: n  reason: collision with root package name */
    private static final byte[][] f14794n;

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f14795o;

    /* renamed from: p  reason: collision with root package name */
    private static final byte[] f14796p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f14797q;

    /* renamed from: a  reason: collision with root package name */
    final int f14798a = i.a(21, 20, f14784d, f14786f, 6, f14790j, f14792l, 12);

    /* renamed from: b  reason: collision with root package name */
    private boolean f14799b = false;

    static {
        byte[] bArr = {-1, -40, -1};
        f14783c = bArr;
        f14784d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f14785e = bArr2;
        f14786f = bArr2.length;
        byte[] a10 = e.a("BM");
        f14789i = a10;
        f14790j = a10.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f14791k = bArr3;
        f14792l = bArr3.length;
        f14793m = e.a("ftyp");
        f14794n = new byte[][]{e.a("heic"), e.a("heix"), e.a("hevc"), e.a("hevx"), e.a("mif1"), e.a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f14795o = bArr4;
        f14796p = new byte[]{77, 77, 0, 42};
        f14797q = bArr4.length;
    }

    private static c c(byte[] bArr, int i10) {
        k.b(Boolean.valueOf(h4.c.h(bArr, 0, i10)));
        if (h4.c.g(bArr, 0)) {
            return b.f14805f;
        }
        if (h4.c.f(bArr, 0)) {
            return b.f14806g;
        }
        if (h4.c.c(bArr, 0, i10)) {
            if (h4.c.b(bArr, 0)) {
                return b.f14809j;
            }
            if (h4.c.d(bArr, 0)) {
                return b.f14808i;
            }
            return b.f14807h;
        }
        return c.f14812b;
    }

    private static boolean d(byte[] bArr, int i10) {
        byte[] bArr2 = f14789i;
        if (i10 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean e(byte[] bArr, int i10) {
        return i10 >= f14797q && (e.c(bArr, f14795o) || e.c(bArr, f14796p));
    }

    private static boolean f(byte[] bArr, int i10) {
        if (i10 < 6) {
            return false;
        }
        return e.c(bArr, f14787g) || e.c(bArr, f14788h);
    }

    private static boolean g(byte[] bArr, int i10) {
        if (i10 >= 12 && bArr[3] >= 8 && e.b(bArr, f14793m, 4)) {
            for (byte[] bArr2 : f14794n) {
                if (e.b(bArr, bArr2, 8)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean h(byte[] bArr, int i10) {
        byte[] bArr2 = f14791k;
        if (i10 < bArr2.length) {
            return false;
        }
        return e.c(bArr, bArr2);
    }

    private static boolean i(byte[] bArr, int i10) {
        byte[] bArr2 = f14783c;
        return i10 >= bArr2.length && e.c(bArr, bArr2);
    }

    private static boolean j(byte[] bArr, int i10) {
        byte[] bArr2 = f14785e;
        return i10 >= bArr2.length && e.c(bArr, bArr2);
    }

    @Override // com.facebook.imageformat.c.a
    public final c a(byte[] bArr, int i10) {
        k.g(bArr);
        if (!this.f14799b && h4.c.h(bArr, 0, i10)) {
            return c(bArr, i10);
        }
        if (i(bArr, i10)) {
            return b.f14800a;
        }
        if (j(bArr, i10)) {
            return b.f14801b;
        }
        if (this.f14799b && h4.c.h(bArr, 0, i10)) {
            return c(bArr, i10);
        }
        if (f(bArr, i10)) {
            return b.f14802c;
        }
        if (d(bArr, i10)) {
            return b.f14803d;
        }
        if (h(bArr, i10)) {
            return b.f14804e;
        }
        if (g(bArr, i10)) {
            return b.f14810k;
        }
        if (e(bArr, i10)) {
            return b.f14811l;
        }
        return c.f14812b;
    }

    @Override // com.facebook.imageformat.c.a
    public int b() {
        return this.f14798a;
    }
}
