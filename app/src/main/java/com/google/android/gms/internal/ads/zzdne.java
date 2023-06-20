package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdne {
    private zzbky zza;

    public zzdne(zzdmt zzdmtVar) {
        this.zza = zzdmtVar;
    }

    public final synchronized zzbky zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbky zzbkyVar) {
        this.zza = zzbkyVar;
    }
}
