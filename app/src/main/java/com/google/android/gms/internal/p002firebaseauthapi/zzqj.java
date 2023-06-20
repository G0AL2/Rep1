package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
/* loaded from: classes2.dex */
final class zzqj implements zzum {
    final /* synthetic */ zzum zza;
    final /* synthetic */ zzqk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqj(zzqk zzqkVar, zzum zzumVar) {
        this.zzb = zzqkVar;
        this.zza = zzumVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxn zzxnVar = (zzxn) obj;
        if (!TextUtils.isEmpty(zzxnVar.zzf())) {
            this.zzb.zzb.zzg(new Status(17025), PhoneAuthCredential.o1(zzxnVar.zzd(), zzxnVar.zzf()));
            return;
        }
        this.zzb.zzc.zzO(new zzwe(zzxnVar.zze(), zzxnVar.zzc(), Long.valueOf(zzxnVar.zzb()), "Bearer"), null, "phone", Boolean.valueOf(zzxnVar.zzg()), null, this.zzb.zzb, this.zza);
    }
}
