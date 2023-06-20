package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import sb.g;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqo  reason: invalid package */
/* loaded from: classes2.dex */
final class zzqo implements zzum {
    final /* synthetic */ zzum zza;
    final /* synthetic */ zzwe zzb;
    final /* synthetic */ zzqp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqo(zzqp zzqpVar, zzum zzumVar, zzwe zzweVar) {
        this.zzc = zzqpVar;
        this.zza = zzumVar;
        this.zzb = zzweVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zzc.zzb.zzh(g.a(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzvv) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            zzvx zzvxVar = (zzvx) zzb.get(0);
            zzwu zzwuVar = new zzwu();
            zzwuVar.zze(this.zzb.zze());
            zzwuVar.zzb(this.zzc.zza);
            zzqp zzqpVar = this.zzc;
            zzrl.zzf(zzqpVar.zzc, zzqpVar.zzb, this.zzb, zzvxVar, zzwuVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}
