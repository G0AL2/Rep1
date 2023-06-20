package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapt extends zzaqn {
    public zzapt(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i10, int i11) {
        super(zzapcVar, "Za6LxNnVxz2lEtZQYrJ2QLB5PwaCpmcdWBAdgk+Rc+b6fjcW8QKpJ7ITar8M3xU9", "2mbuydE9pw99Ld1EHQbedo6oUJcW1o/QWNiH9X+lcIw=", zzaliVar, i10, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzh.getInfo();
            String zzd = zzapf.zzd(info.getId());
            if (zzd != null) {
                synchronized (this.zze) {
                    this.zze.zzr(zzd);
                    this.zze.zzq(info.isLimitAdTrackingEnabled());
                    this.zze.zzaa(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqn, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zzb.zzq()) {
            synchronized (this.zze) {
                this.zze.zzr((String) this.zzf.invoke(null, this.zzb.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    public final Void zzk() throws Exception {
        if (this.zzb.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
