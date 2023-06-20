package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzekj implements com.google.android.gms.ads.internal.zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdbr zzb;
    private final zzdcl zzc;
    private final zzdji zzd;
    private final zzdjb zze;
    private final zzcud zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekj(zzdbr zzdbrVar, zzdcl zzdclVar, zzdji zzdjiVar, zzdjb zzdjbVar, zzcud zzcudVar) {
        this.zzb = zzdbrVar;
        this.zzc = zzdclVar;
        this.zzd = zzdjiVar;
        this.zze = zzdjbVar;
        this.zzf = zzcudVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
