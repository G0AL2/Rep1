package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpx  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpx implements zzum {
    final /* synthetic */ zztg zza;
    final /* synthetic */ zzrl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpx(zzrl zzrlVar, zztg zztgVar) {
        this.zzb = zzrlVar;
        this.zza = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzvn zzvnVar = (zzvn) obj;
        if (zzvnVar.zzg()) {
            this.zza.zzf(new zzps(zzvnVar.zzd(), zzvnVar.zzf(), null));
            return;
        }
        this.zzb.zzO(new zzwe(zzvnVar.zze(), zzvnVar.zzc(), Long.valueOf(zzvnVar.zzb()), "Bearer"), null, null, Boolean.valueOf(zzvnVar.zzh()), null, this.zza, this);
    }
}
