package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpw  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpw implements zzum {
    final /* synthetic */ EmailAuthCredential zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzrl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpw(zzrl zzrlVar, EmailAuthCredential emailAuthCredential, zztg zztgVar) {
        this.zzc = zzrlVar;
        this.zza = emailAuthCredential;
        this.zzb = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzc.zzN(new zzvm(this.zza, ((zzwe) obj).zze()), this.zzb);
    }
}
