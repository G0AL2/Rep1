package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqk  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqk implements zzum {
    final /* synthetic */ zzxm zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzrl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqk(zzrl zzrlVar, zzxm zzxmVar, zztg zztgVar) {
        this.zzc = zzrlVar;
        this.zza = zzxmVar;
        this.zzb = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzun zzunVar;
        this.zza.zzd(((zzwe) obj).zze());
        zzunVar = this.zzc.zza;
        zzunVar.zzt(this.zza, new zzqj(this, this));
    }
}
