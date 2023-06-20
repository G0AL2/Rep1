package ba;

import android.os.SystemClock;
import da.d0;

/* compiled from: TrackSelectionUtil.java */
/* loaded from: classes2.dex */
public final class z {
    public static d0.a a(q qVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (qVar.c(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new d0.a(1, 0, length, i10);
    }
}
