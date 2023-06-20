package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqt  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqt implements zzum {
    final /* synthetic */ zztg zza;
    final /* synthetic */ zzrl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqt(zzrl zzrlVar, zztg zztgVar) {
        this.zzb = zzrlVar;
        this.zza = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxi zzxiVar = (zzxi) obj;
        zzwe zzweVar = new zzwe(zzxiVar.zzd(), zzxiVar.zzc(), Long.valueOf(zzxiVar.zzb()), "Bearer");
        if (zzxiVar.zzd() != null) {
            this.zzb.zzO(zzweVar, null, null, Boolean.valueOf(zzxiVar.zze()), null, this.zza, this);
            return;
        }
        zztg zztgVar = this.zza;
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(this);
        Preconditions.checkNotNull(zztgVar);
        zztgVar.zzi(zzweVar, new zzvx(zzwg.zzb(zzweVar.zze()).zzd()));
    }
}
