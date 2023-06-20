package wb;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f38535a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38536b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f38537c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f38538d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f38539e;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f38535a = eVar;
        this.f38536b = i10;
        this.f38537c = timeUnit;
    }

    @Override // wb.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f38538d) {
            vb.f f10 = vb.f.f();
            f10.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f38539e = new CountDownLatch(1);
            this.f38535a.a(str, bundle);
            vb.f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f38539e.await(this.f38536b, this.f38537c)) {
                    vb.f.f().i("App exception callback received from Analytics listener.");
                } else {
                    vb.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                vb.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f38539e = null;
        }
    }

    @Override // wb.b
    public void s(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f38539e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
