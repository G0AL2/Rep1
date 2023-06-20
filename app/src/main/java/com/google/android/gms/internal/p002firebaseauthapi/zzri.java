package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzri  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzri implements zzum {
    final /* synthetic */ String zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzrl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzri(zzrl zzrlVar, String str, zztg zztgVar) {
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
        zzwe zzweVar = (zzwe) obj;
        String zze = zzweVar.zze();
        zzwu zzwuVar = new zzwu();
        zzwuVar.zze(zze);
        zzwuVar.zzg(this.zza);
        zzrl.zze(this.zzc, this.zzb, zzweVar, zzwuVar, this);
    }
}
