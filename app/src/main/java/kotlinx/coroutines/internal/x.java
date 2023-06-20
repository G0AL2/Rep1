package kotlinx.coroutines.internal;

import com.google.android.gms.common.api.Api;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemProps.common.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class x {
    public static final int a(String str, int i10, int i11, int i12) {
        qe.k.g(str, "propertyName");
        return (int) v.c(str, i10, i11, i12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        qe.k.g(str, "propertyName");
        String d10 = v.d(str);
        if (d10 != null) {
            Long h10 = ve.g.h(d10);
            if (h10 == null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d10 + '\'').toString());
            }
            long longValue = h10.longValue();
            if (j11 > longValue || j12 < longValue) {
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
            }
            return longValue;
        }
        return j10;
    }

    public static final boolean c(String str, boolean z10) {
        qe.k.g(str, "propertyName");
        String d10 = v.d(str);
        return d10 != null ? Boolean.parseBoolean(d10) : z10;
    }

    public static /* synthetic */ int d(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return v.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long e(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return v.c(str, j10, j13, j12);
    }
}
