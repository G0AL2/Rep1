package y4;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import y4.a;

/* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
/* loaded from: classes.dex */
public class c<T extends y4.a> extends y4.b<T> {

    /* renamed from: b  reason: collision with root package name */
    private final f4.b f39270b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f39271c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39272d;

    /* renamed from: e  reason: collision with root package name */
    private long f39273e;

    /* renamed from: f  reason: collision with root package name */
    private long f39274f;

    /* renamed from: g  reason: collision with root package name */
    private long f39275g;

    /* renamed from: h  reason: collision with root package name */
    private b f39276h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f39277i;

    /* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                c.this.f39272d = false;
                if (c.this.p()) {
                    if (c.this.f39276h != null) {
                        c.this.f39276h.h();
                    }
                } else {
                    c.this.q();
                }
            }
        }
    }

    /* compiled from: AnimationBackendDelegateWithInactivityCheck.java */
    /* loaded from: classes.dex */
    public interface b {
        void h();
    }

    private c(T t10, b bVar, f4.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t10);
        this.f39272d = false;
        this.f39274f = Constants.MIN_PROGRESS_TIME;
        this.f39275g = 1000L;
        this.f39277i = new a();
        this.f39276h = bVar;
        this.f39270b = bVar2;
        this.f39271c = scheduledExecutorService;
    }

    public static <T extends y4.a & b> y4.b<T> n(T t10, f4.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return o(t10, (b) t10, bVar, scheduledExecutorService);
    }

    public static <T extends y4.a> y4.b<T> o(T t10, b bVar, f4.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new c(t10, bVar, bVar2, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p() {
        return this.f39270b.now() - this.f39273e > this.f39274f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q() {
        if (!this.f39272d) {
            this.f39272d = true;
            this.f39271c.schedule(this.f39277i, this.f39275g, TimeUnit.MILLISECONDS);
        }
    }

    @Override // y4.b, y4.a
    public boolean g(Drawable drawable, Canvas canvas, int i10) {
        this.f39273e = this.f39270b.now();
        boolean g10 = super.g(drawable, canvas, i10);
        q();
        return g10;
    }
}
