package mb;

import ib.l;

/* compiled from: Longs.java */
/* loaded from: classes3.dex */
public final class f {
    public static int a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static long b(long... jArr) {
        l.d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            if (jArr[i10] > j10) {
                j10 = jArr[i10];
            }
        }
        return j10;
    }
}
