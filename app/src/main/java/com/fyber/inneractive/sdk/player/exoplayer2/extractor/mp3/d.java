package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;

/* loaded from: classes.dex */
public final class d implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f18504a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18505b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18506c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f18507d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18508e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18509f;

    public d(long j10, long j11, long j12, long[] jArr, long j13, int i10) {
        this.f18504a = j10;
        this.f18505b = j11;
        this.f18506c = j12;
        this.f18507d = jArr;
        this.f18508e = j13;
        this.f18509f = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public boolean a() {
        return this.f18507d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b.a
    public long b(long j10) {
        if (a()) {
            long j11 = this.f18504a;
            if (j10 >= j11) {
                double d10 = ((j10 - j11) * 256.0d) / this.f18508e;
                int b10 = u.b(this.f18507d, (long) d10, true, false) + 1;
                long j12 = this.f18505b;
                long j13 = (b10 * j12) / 100;
                long j14 = b10 == 0 ? 0L : this.f18507d[b10 - 1];
                long j15 = b10 == 99 ? 256L : this.f18507d[b10];
                return j13 + (j15 != j14 ? (long) (((((j12 * (b10 + 1)) / 100) - j13) * (d10 - j14)) / (j15 - j14)) : 0L);
            }
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long c() {
        return this.f18505b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
    public long a(long j10) {
        if (!a()) {
            return this.f18504a;
        }
        float f10 = (((float) j10) * 100.0f) / ((float) this.f18505b);
        if (f10 <= 0.0f) {
            r0 = 0.0f;
        } else if (f10 < 100.0f) {
            int i10 = (int) f10;
            float f11 = i10 != 0 ? (float) this.f18507d[i10 - 1] : 0.0f;
            r0 = (((i10 < 99 ? (float) this.f18507d[i10] : 256.0f) - f11) * (f10 - i10)) + f11;
        }
        long round = Math.round(r0 * 0.00390625d * this.f18508e);
        long j11 = this.f18504a;
        long j12 = round + j11;
        long j13 = this.f18506c;
        return Math.min(j12, j13 != -1 ? j13 - 1 : ((j11 - this.f18509f) + this.f18508e) - 1);
    }
}
