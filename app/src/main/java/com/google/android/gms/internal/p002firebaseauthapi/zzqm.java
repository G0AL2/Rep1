package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqm  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqm implements zzum {
    final /* synthetic */ zzxe zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzrl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqm(zzrl zzrlVar, zzxe zzxeVar, zztg zztgVar) {
        this.zzc = zzrlVar;
        this.zza = zzxeVar;
        this.zzb = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzun zzunVar;
        this.zza.zzd(true);
        this.zza.zzc(((zzwe) obj).zze());
        zzunVar = this.zzc.zza;
        zzunVar.zzq(this.zza, new zzql(this, this));
    }
}
