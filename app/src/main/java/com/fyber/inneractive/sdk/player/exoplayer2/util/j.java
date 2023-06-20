package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.inmobi.media.fq;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f19575a;

    /* renamed from: b  reason: collision with root package name */
    public int f19576b;

    /* renamed from: c  reason: collision with root package name */
    public int f19577c;

    /* renamed from: d  reason: collision with root package name */
    public int f19578d;

    public j(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public int a(int i10) {
        int i11;
        this.f19577c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f19577c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f19577c = i13;
            byte[] bArr = this.f19575a;
            int i14 = this.f19576b;
            this.f19576b = i14 + 1;
            i12 |= (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << i13;
        }
        byte[] bArr2 = this.f19575a;
        int i15 = this.f19576b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f19577c = 0;
            this.f19576b = i15 + 1;
        }
        a();
        return i16;
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        this.f19576b = i11;
        this.f19577c = i10 - (i11 * 8);
        a();
    }

    public void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f19576b + i11;
        this.f19576b = i12;
        int i13 = this.f19577c + (i10 - (i11 * 8));
        this.f19577c = i13;
        if (i13 > 7) {
            this.f19576b = i12 + 1;
            this.f19577c = i13 - 8;
        }
        a();
    }

    public j(byte[] bArr, int i10) {
        this.f19575a = bArr;
        this.f19578d = i10;
    }

    public boolean b() {
        byte[] bArr = this.f19575a;
        int i10 = this.f19576b;
        byte b10 = bArr[i10];
        int i11 = this.f19577c;
        boolean z10 = (b10 & (128 >> i11)) != 0;
        int i12 = i11 + 1;
        this.f19577c = i12;
        if (i12 == 8) {
            this.f19577c = 0;
            this.f19576b = i10 + 1;
        }
        a();
        return z10;
    }

    public final void a() {
        int i10;
        int i11 = this.f19576b;
        a.b(i11 >= 0 && (i11 < (i10 = this.f19578d) || (i11 == i10 && this.f19577c == 0)));
    }
}
