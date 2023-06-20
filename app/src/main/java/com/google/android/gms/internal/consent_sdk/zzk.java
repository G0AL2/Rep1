package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import hb.c;
import hb.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzk implements c {
    private final zzam zza;
    private final zzv zzb;
    private final zzba zzc;

    public zzk(zzam zzamVar, zzv zzvVar, zzba zzbaVar) {
        this.zza = zzamVar;
        this.zzb = zzvVar;
        this.zzc = zzbaVar;
    }

    @Override // hb.c
    public final int getConsentStatus() {
        return this.zza.zza();
    }

    @Override // hb.c
    public final boolean isConsentFormAvailable() {
        return this.zzc.zzc();
    }

    @Override // hb.c
    public final void requestConsentInfoUpdate(Activity activity, d dVar, c.b bVar, c.a aVar) {
        this.zzb.zzc(activity, dVar, bVar, aVar);
    }

    @Override // hb.c
    public final void reset() {
        this.zzc.zzb(null);
        this.zza.zzd();
    }
}
