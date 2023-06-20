package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqp  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqp implements zzum {
    final /* synthetic */ String zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzrl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqp(zzrl zzrlVar, String str, zztg zztgVar) {
        this.zzc = zzrlVar;
        this.zza = str;
        this.zzb = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzun zzunVar;
        zzwe zzweVar = (zzwe) obj;
        zzvu zzvuVar = new zzvu(zzweVar.zze());
        zzunVar = this.zzc.zza;
        zzunVar.zzg(zzvuVar, new zzqo(this, this, zzweVar));
    }
}
