package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.inmobi.media.fq;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final long[] f18479d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f18480a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f18481b;

    /* renamed from: c  reason: collision with root package name */
    public int f18482c;

    public long a(g gVar, boolean z10, boolean z11, int i10) throws IOException, InterruptedException {
        if (this.f18481b == 0) {
            if (!((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18480a, 0, 1, z10)) {
                return -1L;
            }
            int a10 = a(this.f18480a[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
            this.f18482c = a10;
            if (a10 != -1) {
                this.f18481b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f18482c;
        if (i11 > i10) {
            this.f18481b = 0;
            return -2L;
        }
        if (i11 != 1) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18480a, 1, i11 - 1, false);
        }
        this.f18481b = 0;
        return a(this.f18480a, this.f18482c, z11);
    }

    public static int a(int i10) {
        int i11;
        int i12 = 0;
        do {
            long[] jArr = f18479d;
            if (i12 >= jArr.length) {
                return -1;
            }
            i11 = ((jArr[i12] & i10) > 0L ? 1 : ((jArr[i12] & i10) == 0L ? 0 : -1));
            i12++;
        } while (i11 == 0);
        return i12;
    }

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f18479d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }
}
