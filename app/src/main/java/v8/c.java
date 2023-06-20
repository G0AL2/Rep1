package v8;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import ea.n0;
import p8.x;
import p8.y;

/* compiled from: MlltSeeker.java */
/* loaded from: classes2.dex */
final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f37975a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f37976b;

    /* renamed from: c  reason: collision with root package name */
    private final long f37977c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f37975a = jArr;
        this.f37976b = jArr2;
        this.f37977c = j10 == -9223372036854775807L ? n0.C0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, MlltFrame mlltFrame, long j11) {
        int length = mlltFrame.f21205e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += mlltFrame.f21203c + mlltFrame.f21205e[i12];
            j12 += mlltFrame.f21204d + mlltFrame.f21206f[i12];
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> c(long j10, long[] jArr, long[] jArr2) {
        int i10 = n0.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i11] - j12))) + j12));
    }

    @Override // v8.g
    public long b(long j10) {
        return n0.C0(((Long) c(j10, this.f37975a, this.f37976b).second).longValue());
    }

    @Override // p8.x
    public x.a d(long j10) {
        Pair<Long, Long> c10 = c(n0.Z0(n0.r(j10, 0L, this.f37977c)), this.f37976b, this.f37975a);
        return new x.a(new y(n0.C0(((Long) c10.first).longValue()), ((Long) c10.second).longValue()));
    }

    @Override // v8.g
    public long e() {
        return -1L;
    }

    @Override // p8.x
    public boolean f() {
        return true;
    }

    @Override // p8.x
    public long i() {
        return this.f37977c;
    }
}
