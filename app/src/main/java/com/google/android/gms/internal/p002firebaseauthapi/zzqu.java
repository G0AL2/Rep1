package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqu  reason: invalid package */
/* loaded from: classes2.dex */
final class zzqu implements zzum {
    final /* synthetic */ zzqv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqu(zzqv zzqvVar) {
        this.zza = zzqvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzvp zzvpVar = (zzvp) obj;
        zzwe zzweVar = new zzwe(zzvpVar.zzc(), zzvpVar.zzb(), Long.valueOf(zzwg.zza(zzvpVar.zzb())), "Bearer");
        zzqv zzqvVar = this.zza;
        zzqvVar.zzc.zzO(zzweVar, null, null, Boolean.FALSE, null, zzqvVar.zzb, this);
    }
}
