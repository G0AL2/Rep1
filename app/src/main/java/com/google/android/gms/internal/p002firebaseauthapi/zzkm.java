package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkm  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzkm extends zzzl implements zzaar {
    private static final zzkm zzb;
    private int zze;
    private zzzq zzf = zzzl.zzy();

    static {
        zzkm zzkmVar = new zzkm();
        zzb = zzkmVar;
        zzzl.zzE(zzkm.class, zzkmVar);
    }

    private zzkm() {
    }

    public static zzkj zzc() {
        return (zzkj) zzb.zzt();
    }

    public static zzkm zzf(byte[] bArr, zzyy zzyyVar) throws zzzt {
        return (zzkm) zzzl.zzx(zzb, bArr, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzkm zzkmVar, zzkl zzklVar) {
        zzklVar.getClass();
        zzzq zzzqVar = zzkmVar.zzf;
        if (!zzzqVar.zzc()) {
            zzkmVar.zzf = zzzl.zzz(zzzqVar);
        }
        zzkmVar.zzf.add(zzklVar);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzkl zzd(int i10) {
        return (zzkl) this.zzf.get(i10);
    }

    public final List zzg() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzl
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzkj(null);
                }
                return new zzkm();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzkl.class});
        }
        return (byte) 1;
    }
}
