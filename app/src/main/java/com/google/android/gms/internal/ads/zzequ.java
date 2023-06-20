package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzequ implements zzetg {
    private final zzfvm zza;
    private final zzdzb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzequ(zzfvm zzfvmVar, zzdzb zzdzbVar) {
        this.zza = zzfvmVar;
        this.zzb = zzdzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzequ.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqv zzc() throws Exception {
        return new zzeqv(this.zzb.zzb(), this.zzb.zzn(), com.google.android.gms.ads.internal.zzt.zzs().zzl());
    }
}
