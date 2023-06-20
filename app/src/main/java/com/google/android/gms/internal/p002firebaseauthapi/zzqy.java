package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqy  reason: invalid package */
/* loaded from: classes2.dex */
final class zzqy implements zzum {
    final /* synthetic */ zzum zza;
    final /* synthetic */ zzwe zzb;
    final /* synthetic */ zzqz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqy(zzqz zzqzVar, zzum zzumVar, zzwe zzweVar) {
        this.zzc = zzqzVar;
        this.zza = zzumVar;
        this.zzb = zzweVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzvv) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            this.zzc.zza.zzi(this.zzb, (zzvx) zzb.get(0));
        } else {
            this.zza.zza("No users");
        }
    }
}
