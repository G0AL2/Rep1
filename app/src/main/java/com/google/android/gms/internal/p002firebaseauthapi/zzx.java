package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx  reason: invalid package */
/* loaded from: classes2.dex */
final class zzx extends zzab {
    final /* synthetic */ zzy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzy zzyVar, zzad zzadVar, CharSequence charSequence) {
        super(zzadVar, charSequence);
        this.zza = zzyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
    final int zzd(int i10) {
        CharSequence charSequence = ((zzab) this).zzb;
        int length = charSequence.length();
        zzw.zzb(i10, length, "index");
        while (i10 < length) {
            if (charSequence.charAt(i10) == '.') {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
