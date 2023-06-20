package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.media.fq;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f19582a;

    /* renamed from: b  reason: collision with root package name */
    public int f19583b;

    /* renamed from: c  reason: collision with root package name */
    public int f19584c;

    /* renamed from: d  reason: collision with root package name */
    public int f19585d;

    public l(byte[] bArr, int i10, int i11) {
        a(bArr, i10, i11);
    }

    public void a(byte[] bArr, int i10, int i11) {
        this.f19582a = bArr;
        this.f19584c = i10;
        this.f19583b = i11;
        this.f19585d = 0;
        a();
    }

    public int b(int i10) {
        int i11;
        this.f19585d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f19585d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f19585d = i13;
            byte[] bArr = this.f19582a;
            int i14 = this.f19584c;
            i12 |= (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << i13;
            if (!c(i14 + 1)) {
                r3 = 1;
            }
            this.f19584c = i14 + r3;
        }
        byte[] bArr2 = this.f19582a;
        int i15 = this.f19584c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f19585d = 0;
            this.f19584c = i15 + (c(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public boolean c() {
        boolean z10 = (this.f19582a[this.f19584c] & (128 >> this.f19585d)) != 0;
        f();
        return z10;
    }

    public void d(int i10) {
        int i11 = this.f19584c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f19584c = i13;
        int i14 = this.f19585d + (i10 - (i12 * 8));
        this.f19585d = i14;
        if (i14 > 7) {
            this.f19584c = i13 + 1;
            this.f19585d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 <= this.f19584c) {
                if (c(i11)) {
                    this.f19584c++;
                    i11 += 2;
                }
            } else {
                a();
                return;
            }
        }
    }

    public int e() {
        int d10 = d();
        return (d10 % 2 == 0 ? -1 : 1) * ((d10 + 1) / 2);
    }

    public void f() {
        int i10 = this.f19585d + 1;
        this.f19585d = i10;
        if (i10 == 8) {
            this.f19585d = 0;
            int i11 = this.f19584c;
            this.f19584c = i11 + (c(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public final boolean c(int i10) {
        if (2 <= i10 && i10 < this.f19583b) {
            byte[] bArr = this.f19582a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean a(int i10) {
        int i11 = this.f19584c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f19585d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f19583b) {
                break;
            } else if (c(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f19583b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean b() {
        int i10 = this.f19584c;
        int i11 = this.f19585d;
        int i12 = 0;
        while (this.f19584c < this.f19583b && !c()) {
            i12++;
        }
        boolean z10 = this.f19584c == this.f19583b;
        this.f19584c = i10;
        this.f19585d = i11;
        return !z10 && a((i12 * 2) + 1);
    }

    public final int d() {
        int i10 = 0;
        while (!c()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? b(i10) : 0);
    }

    public final void a() {
        int i10;
        int i11 = this.f19584c;
        a.b(i11 >= 0 && (i11 < (i10 = this.f19583b) || (i11 == i10 && this.f19585d == 0)));
    }
}
