package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaah  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaah implements zzaao {
    private final zzaao[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaah(zzaao... zzaaoVarArr) {
        this.zza = zzaaoVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaao
    public final zzaan zzb(Class cls) {
        zzaao[] zzaaoVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzaao zzaaoVar = zzaaoVarArr[i10];
            if (zzaaoVar.zzc(cls)) {
                return zzaaoVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaao
    public final boolean zzc(Class cls) {
        zzaao[] zzaaoVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzaaoVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
