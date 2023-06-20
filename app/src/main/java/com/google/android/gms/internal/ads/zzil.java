package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzil implements zzjg {
    private final Object zza;
    private zzci zzb;

    public zzil(Object obj, zzci zzciVar) {
        this.zza = obj;
        this.zzb = zzciVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzil zzilVar, zzci zzciVar) {
        zzilVar.zzb = zzciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final zzci zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final Object zzb() {
        return this.zza;
    }
}
