package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpy  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpy implements zzum {
    final /* synthetic */ zzul zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzwe zzc;
    final /* synthetic */ zzwu zzd;
    final /* synthetic */ zzrl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpy(zzrl zzrlVar, zzul zzulVar, zztg zztgVar, zzwe zzweVar, zzwu zzwuVar) {
        this.zze = zzrlVar;
        this.zza = zzulVar;
        this.zzb = zztgVar;
        this.zzc = zzweVar;
        this.zzd = zzwuVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzvv) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            zzrl.zzf(this.zze, this.zzb, this.zzc, (zzvx) zzb.get(0), this.zzd, this.zza);
        } else {
            this.zza.zza("No users");
        }
    }
}
