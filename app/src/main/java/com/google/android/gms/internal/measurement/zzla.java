package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzla implements zzlh {
    private final zzlh[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzla(zzlh... zzlhVarArr) {
        this.zza = zzlhVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlg zzb(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzlh zzlhVar = zzlhVarArr[i10];
            if (zzlhVar.zzc(cls)) {
                return zzlhVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean zzc(Class cls) {
        zzlh[] zzlhVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzlhVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
