package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzkr extends zzzl implements zzaar {
    private static final zzkr zzb;
    private int zze;
    private zzzq zzf = zzzl.zzy();

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzzl.zzE(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    public static zzko zza() {
        return (zzko) zzb.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzkr zzkrVar, zzkq zzkqVar) {
        zzkqVar.getClass();
        zzzq zzzqVar = zzkrVar.zzf;
        if (!zzzqVar.zzc()) {
            zzkrVar.zzf = zzzl.zzz(zzzqVar);
        }
        zzkrVar.zzf.add(zzkqVar);
    }

    public final zzkq zzb(int i10) {
        return (zzkq) this.zzf.get(0);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzl
    protected final Object zzj(int i10, Object obj, Object obj2) {
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
                    return new zzko(null);
                }
                return new zzkr();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzkq.class});
        }
        return (byte) 1;
    }
}
