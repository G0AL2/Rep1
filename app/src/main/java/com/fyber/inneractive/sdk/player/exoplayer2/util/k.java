package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.media.fq;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f19579a;

    /* renamed from: b  reason: collision with root package name */
    public int f19580b;

    /* renamed from: c  reason: collision with root package name */
    public int f19581c;

    public k() {
    }

    public void a(byte[] bArr, int i10) {
        this.f19579a = bArr;
        this.f19581c = i10;
        this.f19580b = 0;
    }

    public int b() {
        byte[] bArr = this.f19579a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public void c(int i10) {
        a(b() < i10 ? new byte[i10] : this.f19579a, i10);
    }

    public void d(int i10) {
        a.a(i10 >= 0 && i10 <= this.f19579a.length);
        this.f19581c = i10;
    }

    public void e(int i10) {
        a.a(i10 >= 0 && i10 <= this.f19581c);
        this.f19580b = i10;
    }

    public void f(int i10) {
        e(this.f19580b + i10);
    }

    public int g() {
        int e10 = e();
        if (e10 >= 0) {
            return e10;
        }
        throw new IllegalStateException("Top bit not zero: " + e10);
    }

    public int h() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        this.f19580b = i11 + 1;
        return ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i12;
    }

    public long i() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = i11 + 1;
        this.f19580b = i12;
        int i13 = i12 + 1;
        this.f19580b = i13;
        int i14 = i13 + 1;
        this.f19580b = i14;
        int i15 = i14 + 1;
        this.f19580b = i15;
        int i16 = i15 + 1;
        this.f19580b = i16;
        int i17 = i16 + 1;
        this.f19580b = i17;
        this.f19580b = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }

    public String j() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f19580b;
        while (i10 < this.f19581c && this.f19579a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f19579a;
        int i11 = this.f19580b;
        String str = new String(bArr, i11, i10 - i11);
        this.f19580b = i10;
        if (i10 < this.f19581c) {
            this.f19580b = i10 + 1;
        }
        return str;
    }

    public int k() {
        return (l() << 21) | (l() << 14) | (l() << 7) | l();
    }

    public int l() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        this.f19580b = i10 + 1;
        return bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public long m() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = i11 + 1;
        this.f19580b = i12;
        int i13 = i12 + 1;
        this.f19580b = i13;
        this.f19580b = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int n() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = i11 + 1;
        this.f19580b = i12;
        int i13 = ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f19580b = i12 + 1;
        return (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i13;
    }

    public int o() {
        int c10 = c();
        if (c10 >= 0) {
            return c10;
        }
        throw new IllegalStateException("Top bit not zero: " + c10);
    }

    public long p() {
        long i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException("Top bit not zero: " + i10);
    }

    public int q() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        this.f19580b = i11 + 1;
        return (bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public void r() {
        this.f19580b = 0;
        this.f19581c = 0;
    }

    public k(int i10) {
        this.f19579a = new byte[i10];
        this.f19581c = i10;
    }

    public String b(int i10) {
        String str = new String(this.f19579a, this.f19580b, i10, Charset.defaultCharset());
        this.f19580b += i10;
        return str;
    }

    public int c() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = i11 + 1;
        this.f19580b = i12;
        int i13 = ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        int i14 = i12 + 1;
        this.f19580b = i14;
        int i15 = i13 | ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f19580b = i14 + 1;
        return (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | i15;
    }

    public long f() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = i11 + 1;
        this.f19580b = i12;
        int i13 = i12 + 1;
        this.f19580b = i13;
        this.f19580b = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public String d() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f19580b;
        while (i10 < this.f19581c && !u.b(this.f19579a[i10])) {
            i10++;
        }
        int i11 = this.f19580b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.f19579a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f19580b = i11 + 3;
            }
        }
        byte[] bArr2 = this.f19579a;
        int i12 = this.f19580b;
        String str = new String(bArr2, i12, i10 - i12);
        this.f19580b = i10;
        int i13 = this.f19581c;
        if (i10 == i13) {
            return str;
        }
        byte[] bArr3 = this.f19579a;
        if (bArr3[i10] == 13) {
            int i14 = i10 + 1;
            this.f19580b = i14;
            if (i14 == i13) {
                return str;
            }
        }
        int i15 = this.f19580b;
        if (bArr3[i15] == 10) {
            this.f19580b = i15 + 1;
        }
        return str;
    }

    public int e() {
        byte[] bArr = this.f19579a;
        int i10 = this.f19580b;
        int i11 = i10 + 1;
        this.f19580b = i11;
        int i12 = bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i11 + 1;
        this.f19580b = i13;
        int i14 = i12 | ((bArr[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        int i15 = i13 + 1;
        this.f19580b = i15;
        int i16 = i14 | ((bArr[i13] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f19580b = i15 + 1;
        return ((bArr[i15] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i16;
    }

    public int a() {
        return this.f19581c - this.f19580b;
    }

    public k(byte[] bArr) {
        this.f19579a = bArr;
        this.f19581c = bArr.length;
    }

    public void a(j jVar, int i10) {
        a(jVar.f19575a, 0, i10);
        jVar.b(0);
    }

    public void a(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f19579a, this.f19580b, bArr, i10, i11);
        this.f19580b += i11;
    }

    public k(byte[] bArr, int i10) {
        this.f19579a = bArr;
        this.f19581c = i10;
    }

    public String a(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f19580b;
        int i12 = (i11 + i10) - 1;
        String str = new String(this.f19579a, i11, (i12 >= this.f19581c || this.f19579a[i12] != 0) ? i10 : i10 - 1);
        this.f19580b += i10;
        return str;
    }
}
