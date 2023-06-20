package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import sb.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrg  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzrg implements zzum {
    final /* synthetic */ UserProfileChangeRequest zza;
    final /* synthetic */ zztg zzb;
    final /* synthetic */ zzrl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrg(zzrl zzrlVar, UserProfileChangeRequest userProfileChangeRequest, zztg zztgVar) {
        this.zzc = zzrlVar;
        this.zza = userProfileChangeRequest;
        this.zzb = zztgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwe zzweVar = (zzwe) obj;
        zzwu zzwuVar = new zzwu();
        zzwuVar.zze(zzweVar.zze());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzwuVar.zzc(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.j1() != null) {
            zzwuVar.zzh(this.zza.zza());
        }
        zzrl.zze(this.zzc, this.zzb, zzweVar, zzwuVar, this);
    }
}
