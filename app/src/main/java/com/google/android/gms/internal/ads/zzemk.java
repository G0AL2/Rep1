package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzemk implements zzdee {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zza.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyo.zza(this.zza, new zzeyn() { // from class: com.google.android.gms.internal.ads.zzemj
            @Override // com.google.android.gms.internal.ads.zzeyn
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(com.google.android.gms.ads.internal.client.zzs.this);
            }
        });
    }
}
