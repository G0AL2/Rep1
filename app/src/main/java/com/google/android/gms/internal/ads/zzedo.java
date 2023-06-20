package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzedo {
    private final zzedk zza;
    private final zzfvm zzb;

    public zzedo(zzedk zzedkVar, zzfvm zzfvmVar) {
        this.zza = zzedkVar;
        this.zzb = zzfvmVar;
    }

    public final void zza(zzffi zzffiVar) {
        zzfvm zzfvmVar = this.zzb;
        final zzedk zzedkVar = this.zza;
        zzfvc.zzr(zzfvmVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzedk.this.getWritableDatabase();
            }
        }), new zzedn(this, zzffiVar), this.zzb);
    }
}
