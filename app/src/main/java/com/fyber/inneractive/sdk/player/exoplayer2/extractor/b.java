package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f18141g = new byte[4096];

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f18142a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18143b;

    /* renamed from: c  reason: collision with root package name */
    public long f18144c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f18145d = new byte[Constants.MIN_PROGRESS_STEP];

    /* renamed from: e  reason: collision with root package name */
    public int f18146e;

    /* renamed from: f  reason: collision with root package name */
    public int f18147f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, long j10, long j11) {
        this.f18142a = gVar;
        this.f18144c = j10;
        this.f18143b = j11;
    }

    public boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        if (a(i11, z10)) {
            System.arraycopy(this.f18145d, this.f18146e - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    public int b(int i10) throws IOException, InterruptedException {
        int min = Math.min(this.f18147f, i10);
        d(min);
        if (min == 0) {
            byte[] bArr = f18141g;
            min = a(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        a(min);
        return min;
    }

    public void c(int i10) throws IOException, InterruptedException {
        int min = Math.min(this.f18147f, i10);
        d(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            byte[] bArr = f18141g;
            i11 = a(bArr, -i11, Math.min(i10, bArr.length + i11), i11, false);
        }
        a(i11);
    }

    public final void d(int i10) {
        int i11 = this.f18147f - i10;
        this.f18147f = i11;
        this.f18146e = 0;
        byte[] bArr = this.f18145d;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[Constants.MIN_PROGRESS_STEP + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f18145d = bArr2;
    }

    public boolean a(int i10, boolean z10) throws IOException, InterruptedException {
        int i11 = this.f18146e + i10;
        byte[] bArr = this.f18145d;
        if (i11 > bArr.length) {
            int i12 = Constants.MIN_PROGRESS_STEP + i11;
            int i13 = u.f19606a;
            this.f18145d = Arrays.copyOf(this.f18145d, Math.max(i12, Math.min(bArr.length * 2, i11 + 524288)));
        }
        int min = Math.min(this.f18147f - this.f18146e, i10);
        while (min < i10) {
            min = a(this.f18145d, this.f18146e, i10, min, z10);
            if (min == -1) {
                return false;
            }
        }
        int i14 = this.f18146e + i10;
        this.f18146e = i14;
        this.f18147f = Math.max(this.f18147f, i14);
        return true;
    }

    public boolean b(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException {
        int i12;
        int i13 = this.f18147f;
        if (i13 == 0) {
            i12 = 0;
        } else {
            int min = Math.min(i13, i11);
            System.arraycopy(this.f18145d, 0, bArr, i10, min);
            d(min);
            i12 = min;
        }
        while (i12 < i11 && i12 != -1) {
            i12 = a(bArr, i10, i11, i12, z10);
        }
        a(i12);
        return i12 != -1;
    }

    public int a(byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int i12 = this.f18147f;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f18145d, 0, bArr, i10, min);
            d(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = a(bArr, i10, i11, 0, true);
        }
        a(i13);
        return i13;
    }

    public final int a(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a10 = this.f18142a.a(bArr, i10 + i12, i11 - i12);
            if (a10 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + a10;
        }
        throw new InterruptedException();
    }

    public final void a(int i10) {
        if (i10 != -1) {
            this.f18144c += i10;
        }
    }
}
