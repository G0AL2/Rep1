package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import sb.g;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqq  reason: invalid package */
/* loaded from: classes2.dex */
final class zzqq implements zzum {
    final /* synthetic */ zzqr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqq(zzqr zzqrVar) {
        this.zza = zzqrVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxp zzxpVar = (zzxp) obj;
        if (!TextUtils.isEmpty(zzxpVar.zzb()) && !TextUtils.isEmpty(zzxpVar.zzc())) {
            zzwe zzweVar = new zzwe(zzxpVar.zzc(), zzxpVar.zzb(), Long.valueOf(zzwg.zza(zzxpVar.zzb())), "Bearer");
            zzqr zzqrVar = this.zza;
            zzqrVar.zzc.zzO(zzweVar, null, null, Boolean.FALSE, null, zzqrVar.zzb, this);
            return;
        }
        this.zza.zzb.zzh(g.a("INTERNAL_SUCCESS_SIGN_OUT"));
    }
}
