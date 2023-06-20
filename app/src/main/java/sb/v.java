package sb;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private volatile int f36968a;

    /* renamed from: b  reason: collision with root package name */
    private final k f36969b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f36970c;

    public v(ob.e eVar) {
        Context l10 = eVar.l();
        k kVar = new k(eVar);
        this.f36970c = false;
        this.f36968a = 0;
        this.f36969b = kVar;
        BackgroundDetector.initialize((Application) l10.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        return this.f36968a > 0 && !this.f36970c;
    }

    public final void c() {
        this.f36969b.b();
    }

    public final void d(zzwe zzweVar) {
        if (zzweVar == null) {
            return;
        }
        long zzb = zzweVar.zzb();
        if (zzb <= 0) {
            zzb = 3600;
        }
        long zzc = zzweVar.zzc();
        k kVar = this.f36969b;
        kVar.f36935b = zzc + (zzb * 1000);
        kVar.f36936c = -1L;
        if (f()) {
            this.f36969b.c();
        }
    }
}
