package o1;

import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;

/* compiled from: WorkProgress.kt */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final String f34897a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.work.e f34898b;

    public q(String str, androidx.work.e eVar) {
        qe.k.f(str, "workSpecId");
        qe.k.f(eVar, DownloadWorker.KEY_OUT_PROGRESS);
        this.f34897a = str;
        this.f34898b = eVar;
    }

    public final androidx.work.e a() {
        return this.f34898b;
    }

    public final String b() {
        return this.f34897a;
    }
}
