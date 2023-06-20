package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
/* loaded from: classes2.dex */
final class zzs extends zzd {
    final /* synthetic */ zzt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzb(Status status, boolean z10) {
        this.zza.setResult((zzt) new zzad(status, z10));
    }
}
