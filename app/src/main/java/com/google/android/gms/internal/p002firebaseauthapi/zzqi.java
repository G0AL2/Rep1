package com.google.android.gms.internal.p002firebaseauthapi;

import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqi  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqi implements zzum {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zztg zzc;
    final /* synthetic */ zzrl zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqi(zzrl zzrlVar, String str, String str2, zztg zztgVar) {
        this.zzd = zzrlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzc.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwe zzweVar = (zzwe) obj;
        zzwu zzwuVar = new zzwu();
        zzwuVar.zze(zzweVar.zze());
        zzwuVar.zzd(this.zza);
        zzwuVar.zzg(this.zzb);
        zzrl.zze(this.zzd, this.zzc, zzweVar, zzwuVar, this);
    }
}
