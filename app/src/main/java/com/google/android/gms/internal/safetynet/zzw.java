package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
final class zzw extends zzd {
    final /* synthetic */ zzx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(zzx zzxVar) {
        this.zza = zzxVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzh(Status status, com.google.android.gms.safetynet.zzf zzfVar) {
        this.zza.setResult((zzx) new zzab(status, zzfVar));
    }
}
