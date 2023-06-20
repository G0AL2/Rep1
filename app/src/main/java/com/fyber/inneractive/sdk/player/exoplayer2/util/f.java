package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f19556a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f19557b;

    public f(int i10) {
        this.f19557b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f19556a;
        long[] jArr = this.f19557b;
        if (i10 == jArr.length) {
            this.f19557b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f19557b;
        int i11 = this.f19556a;
        this.f19556a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long a(int i10) {
        if (i10 >= 0 && i10 < this.f19556a) {
            return this.f19557b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f19556a);
    }
}
