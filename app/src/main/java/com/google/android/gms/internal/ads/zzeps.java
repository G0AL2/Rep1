package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeps implements zzetg {
    private final zzfvm zza;
    private final zzduh zzb;
    private final String zzc;
    private final zzfcd zzd;

    public zzeps(zzfvm zzfvmVar, zzduh zzduhVar, zzfcd zzfcdVar, String str) {
        this.zza = zzfvmVar;
        this.zzb = zzduhVar;
        this.zzd = zzfcdVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeps.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzept zzc() throws Exception {
        return new zzept(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
