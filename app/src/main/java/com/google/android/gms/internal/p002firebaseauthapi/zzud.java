package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzud  reason: invalid package */
/* loaded from: classes2.dex */
final class zzud implements Runnable {
    final /* synthetic */ zzuf zza;
    final /* synthetic */ zzue zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzud(zzue zzueVar, zzuf zzufVar) {
        this.zzb = zzueVar;
        this.zza = zzufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zza.zzh) {
            if (!this.zzb.zza.zzh.isEmpty()) {
                this.zza.zza((PhoneAuthProvider.a) this.zzb.zza.zzh.get(0), new Object[0]);
            }
        }
    }
}
