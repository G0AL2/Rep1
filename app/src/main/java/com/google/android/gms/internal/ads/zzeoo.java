package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeoo implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;
    private final zzcfo zzc;
    private final zzcev zzd;

    public zzeoo(zzfvm zzfvmVar, zzfcd zzfcdVar, zzcfo zzcfoVar, zzcev zzcevVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfcdVar;
        this.zzc = zzcfoVar;
        this.zzd = zzcevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoo.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeop zzc() throws Exception {
        return new zzeop(this.zzb.zzj, this.zzc, this.zzd.zzj());
    }
}
