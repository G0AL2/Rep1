package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzub  reason: invalid package */
/* loaded from: classes2.dex */
final class zzub implements zzuf {
    final /* synthetic */ String zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzub(zzue zzueVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzuf
    public final void zza(PhoneAuthProvider.a aVar, Object... objArr) {
        aVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
