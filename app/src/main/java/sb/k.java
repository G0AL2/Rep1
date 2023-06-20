package sb;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: h  reason: collision with root package name */
    private static final Logger f36933h = new Logger("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a  reason: collision with root package name */
    private final ob.e f36934a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    volatile long f36935b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    volatile long f36936c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final long f36937d;
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    final HandlerThread f36938e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    final Handler f36939f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    final Runnable f36940g;

    public k(ob.e eVar) {
        f36933h.v("Initializing TokenRefresher", new Object[0]);
        ob.e eVar2 = (ob.e) Preconditions.checkNotNull(eVar);
        this.f36934a = eVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f36938e = handlerThread;
        handlerThread.start();
        this.f36939f = new zze(handlerThread.getLooper());
        this.f36940g = new j(this, eVar2.p());
        this.f36937d = 300000L;
    }

    public final void b() {
        this.f36939f.removeCallbacks(this.f36940g);
    }

    public final void c() {
        Logger logger = f36933h;
        long j10 = this.f36935b;
        long j11 = this.f36937d;
        logger.v("Scheduling refresh for " + (j10 - j11), new Object[0]);
        b();
        this.f36936c = Math.max((this.f36935b - DefaultClock.getInstance().currentTimeMillis()) - this.f36937d, 0L) / 1000;
        this.f36939f.postDelayed(this.f36940g, this.f36936c * 1000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        long j10;
        int i10 = (int) this.f36936c;
        if (i10 == 30 || i10 == 60 || i10 == 120 || i10 == 240 || i10 == 480) {
            long j11 = this.f36936c;
            j10 = j11 + j11;
        } else {
            j10 = i10 != 960 ? 30L : 960L;
        }
        this.f36936c = j10;
        this.f36935b = DefaultClock.getInstance().currentTimeMillis() + (this.f36936c * 1000);
        Logger logger = f36933h;
        long j12 = this.f36935b;
        logger.v("Scheduling refresh for " + j12, new Object[0]);
        this.f36939f.postDelayed(this.f36940g, this.f36936c * 1000);
    }
}
