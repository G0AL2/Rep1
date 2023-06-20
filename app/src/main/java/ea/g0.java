package ea;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock.java */
/* loaded from: classes2.dex */
public class g0 implements c {
    @Override // ea.c
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // ea.c
    public n b(Looper looper, Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    @Override // ea.c
    public void c() {
    }

    @Override // ea.c
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
