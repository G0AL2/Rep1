package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqh implements zzum {
    final /* synthetic */ zztg zza;
    final /* synthetic */ zzrl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqh(zzrl zzrlVar, zztg zztgVar) {
        this.zzb = zzrlVar;
        this.zza = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxn zzxnVar = (zzxn) obj;
        this.zzb.zzO(new zzwe(zzxnVar.zze(), zzxnVar.zzc(), Long.valueOf(zzxnVar.zzb()), "Bearer"), null, null, Boolean.valueOf(zzxnVar.zzg()), null, this.zza, this);
    }
}
