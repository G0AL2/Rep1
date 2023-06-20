package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public long f19603a;

    /* renamed from: b  reason: collision with root package name */
    public long f19604b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f19605c = -9223372036854775807L;

    public r(long j10) {
        c(j10);
    }

    public long a() {
        if (this.f19603a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f19605c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f19604b;
    }

    public long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f19605c != -9223372036854775807L) {
            long j11 = (this.f19605c * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - j11) < Math.abs(j10 - j11)) {
                j10 = j13;
            }
        }
        return a((j10 * 1000000) / 90000);
    }

    public synchronized void c(long j10) {
        a.b(this.f19605c == -9223372036854775807L);
        this.f19603a = j10;
    }

    public long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f19605c != -9223372036854775807L) {
            this.f19605c = j10;
        } else {
            long j11 = this.f19603a;
            if (j11 != Long.MAX_VALUE) {
                this.f19604b = j11 - j10;
            }
            synchronized (this) {
                this.f19605c = j10;
                notifyAll();
            }
        }
        return j10 + this.f19604b;
    }
}
