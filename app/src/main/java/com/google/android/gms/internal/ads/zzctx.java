package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctx implements zzbom {
    final /* synthetic */ zzcty zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctx(zzcty zzctyVar) {
        this.zza = zzctyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcty.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcud zzcudVar;
                    zzcudVar = zzctx.this.zza.zzd;
                    zzcudVar.zzj();
                }
            });
        }
    }
}
