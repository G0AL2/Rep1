package com.facebook.ads.redexgen.X;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class AG {
    public static final int A00;
    public static final UUID A01;
    public static final UUID A02;
    public static final UUID A03;
    public static final UUID A04;
    public static final UUID A05;

    static {
        int i10;
        if (C1020Iz.A02 < 23) {
            i10 = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
        } else {
            i10 = 6396;
        }
        A00 = i10;
        A04 = new UUID(0L, 0L);
        A02 = new UUID(1186680826959645954L, -5988876978535335093L);
        A01 = new UUID(-2129748144642739255L, 8654423357094679310L);
        A05 = new UUID(-1301668207276963122L, -6645017420763422227L);
        A03 = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long A00(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static long A01(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }
}
