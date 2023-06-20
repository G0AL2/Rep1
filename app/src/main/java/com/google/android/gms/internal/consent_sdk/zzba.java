package com.google.android.gms.internal.consent_sdk;

import hb.f;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzba {
    private final zzcl<zzas> zza;
    private final AtomicReference<zzbc> zzb = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzcl<zzas> zzclVar) {
        this.zza = zzclVar;
    }

    public final void zza(f.b bVar, f.a aVar) {
        zzcd.zza();
        zzbc zzbcVar = this.zzb.get();
        if (zzbcVar == null) {
            aVar.onConsentFormLoadFailure(new zzj(3, "No available form can be built.").zza());
            return;
        }
        zzas zzb = this.zza.zzb();
        zzb.zza(zzbcVar);
        zzb.zzb().zza().zzb(bVar, aVar);
    }

    public final void zzb(zzbc zzbcVar) {
        this.zzb.set(zzbcVar);
    }

    public final boolean zzc() {
        return this.zzb.get() != null;
    }
}
