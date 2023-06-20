package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class w1 {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f23086a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    private int f23087b;

    /* renamed from: c  reason: collision with root package name */
    private long f23088c;

    /* renamed from: d  reason: collision with root package name */
    private long f23089d;

    /* renamed from: e  reason: collision with root package name */
    private int f23090e;

    /* renamed from: f  reason: collision with root package name */
    private int f23091f;

    /* renamed from: g  reason: collision with root package name */
    private int f23092g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23093h;

    /* renamed from: i  reason: collision with root package name */
    private String f23094i;

    public w1() {
        e();
    }

    private final int a(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f23087b;
        if (i13 < i10) {
            int min = Math.min(i12, i10 - i13);
            System.arraycopy(bArr, i11, this.f23086a, this.f23087b, min);
            int i14 = this.f23087b + min;
            this.f23087b = i14;
            if (i14 < i10) {
                return -1;
            }
            return min;
        }
        return 0;
    }

    public final int b(byte[] bArr, int i10, int i11) {
        int a10 = a(30, bArr, i10, i11);
        if (a10 != -1) {
            if (this.f23088c == -1) {
                long e10 = u1.e(this.f23086a, 0);
                this.f23088c = e10;
                if (e10 == 67324752) {
                    this.f23093h = false;
                    this.f23089d = u1.e(this.f23086a, 18);
                    this.f23092g = u1.g(this.f23086a, 8);
                    this.f23090e = u1.g(this.f23086a, 26);
                    int g10 = this.f23090e + 30 + u1.g(this.f23086a, 28);
                    this.f23091f = g10;
                    int length = this.f23086a.length;
                    if (length < g10) {
                        do {
                            length += length;
                        } while (length < g10);
                        this.f23086a = Arrays.copyOf(this.f23086a, length);
                    }
                } else {
                    this.f23093h = true;
                }
            }
            int a11 = a(this.f23091f, bArr, i10 + a10, i11 - a10);
            if (a11 == -1) {
                return -1;
            }
            int i12 = a10 + a11;
            if (!this.f23093h && this.f23094i == null) {
                this.f23094i = new String(this.f23086a, 30, this.f23090e);
            }
            return i12;
        }
        return -1;
    }

    public final q2 c() {
        int i10 = this.f23087b;
        int i11 = this.f23091f;
        if (i10 < i11) {
            return q2.a(this.f23094i, this.f23089d, this.f23092g, true, Arrays.copyOf(this.f23086a, i10), this.f23093h);
        }
        q2 a10 = q2.a(this.f23094i, this.f23089d, this.f23092g, false, Arrays.copyOf(this.f23086a, i11), this.f23093h);
        e();
        return a10;
    }

    public final int d() {
        return this.f23091f;
    }

    public final void e() {
        this.f23087b = 0;
        this.f23090e = -1;
        this.f23088c = -1L;
        this.f23093h = false;
        this.f23091f = 30;
        this.f23089d = -1L;
        this.f23092g = -1;
        this.f23094i = null;
    }
}
