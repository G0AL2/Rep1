package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18103a;

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f18104b;

    static {
        f18103a = u.f19606a < 23 ? IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT : 6396;
        f18104b = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return 1000 * j10;
    }

    public static long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 / 1000;
    }
}
