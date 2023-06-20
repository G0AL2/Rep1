package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import ob.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzut extends PhoneAuthProvider.a {
    final /* synthetic */ PhoneAuthProvider.a zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzut(PhoneAuthProvider.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzuv.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.zza.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        zzuv.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.a
    public final void onVerificationFailed(k kVar) {
        zzuv.zza.remove(this.zzb);
        this.zza.onVerificationFailed(kVar);
    }
}
