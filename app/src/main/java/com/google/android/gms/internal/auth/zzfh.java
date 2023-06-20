package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzfh implements zzfo {
    private final zzfo[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfh(zzfo... zzfoVarArr) {
        this.zza = zzfoVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final zzfn zzb(Class<?> cls) {
        zzfo[] zzfoVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzfo zzfoVar = zzfoVarArr[i10];
            if (zzfoVar.zzc(cls)) {
                return zzfoVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.auth.zzfo
    public final boolean zzc(Class<?> cls) {
        zzfo[] zzfoVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzfoVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
