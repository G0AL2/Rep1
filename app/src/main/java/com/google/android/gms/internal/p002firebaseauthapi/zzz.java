package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzz  reason: invalid package */
/* loaded from: classes2.dex */
final class zzz extends zzab {
    final /* synthetic */ zzn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzz(zzaa zzaaVar, zzad zzadVar, CharSequence charSequence, zzn zznVar) {
        super(zzadVar, charSequence);
        this.zza = zznVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    public final int zzc(int i10) {
        return ((zzq) this.zza).zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    public final int zzd(int i10) {
        if (((zzq) this.zza).zza.find(i10)) {
            return ((zzq) this.zza).zza.start();
        }
        return -1;
    }
}
