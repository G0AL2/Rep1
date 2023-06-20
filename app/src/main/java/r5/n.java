package r5;

import android.os.Process;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PriorityThreadFactory.java */
/* loaded from: classes.dex */
public class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final int f36385a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36386b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f36387c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f36388d = new AtomicInteger(1);

    /* compiled from: PriorityThreadFactory.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f36389a;

        a(Runnable runnable) {
            this.f36389a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(n.this.f36385a);
            } catch (Throwable unused) {
            }
            this.f36389a.run();
        }
    }

    public n(int i10, String str, boolean z10) {
        this.f36385a = i10;
        this.f36386b = str;
        this.f36387c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.f36387c) {
            str = this.f36386b + Constants.FILENAME_SEQUENCE_SEPARATOR + this.f36388d.getAndIncrement();
        } else {
            str = this.f36386b;
        }
        return new Thread(aVar, str);
    }
}
