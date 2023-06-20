package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f18947a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18948b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18949c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f18950d;

    /* renamed from: e  reason: collision with root package name */
    public int f18951e;

    public n(int i10, int i11) {
        this.f18947a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f18950d = bArr;
        bArr[2] = 1;
    }

    public void a() {
        this.f18948b = false;
        this.f18949c = false;
    }

    public void b(int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.f18948b);
        boolean z10 = i10 == this.f18947a;
        this.f18948b = z10;
        if (z10) {
            this.f18951e = 3;
            this.f18949c = false;
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f18948b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f18950d;
            int length = bArr2.length;
            int i13 = this.f18951e + i12;
            if (length < i13) {
                this.f18950d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f18950d, this.f18951e, i12);
            this.f18951e += i12;
        }
    }

    public boolean a(int i10) {
        if (this.f18948b) {
            this.f18951e -= i10;
            this.f18948b = false;
            this.f18949c = true;
            return true;
        }
        return false;
    }
}
