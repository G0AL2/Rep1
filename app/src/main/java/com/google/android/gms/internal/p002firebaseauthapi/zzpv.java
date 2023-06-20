package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpv implements zzum {
    final /* synthetic */ zztg zza;
    final /* synthetic */ zzrl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpv(zzrl zzrlVar, zztg zztgVar) {
        this.zzb = zzrlVar;
        this.zza = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxl zzxlVar = (zzxl) obj;
        if (zzxlVar.zzg()) {
            this.zza.zzf(new zzps(zzxlVar.zzd(), zzxlVar.zzf(), null));
            return;
        }
        this.zzb.zzO(new zzwe(zzxlVar.zze(), zzxlVar.zzc(), Long.valueOf(zzxlVar.zzb()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
