package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeqm implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqm(zzfvm zzfvmVar, zzfcd zzfcdVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfcdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqm.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeqn zzc() throws Exception {
        return new zzeqn("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
