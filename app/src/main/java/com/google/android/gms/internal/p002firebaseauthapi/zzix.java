package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzix  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzix extends zzzl implements zzaar {
    private static final zzix zzb;
    private zzyi zze = zzyi.zzb;
    private zzkr zzf;

    static {
        zzix zzixVar = new zzix();
        zzb = zzixVar;
        zzzl.zzE(zzix.class, zzixVar);
    }

    private zzix() {
    }

    public static zziw zza() {
        return (zziw) zzb.zzt();
    }

    public static zzix zzc(byte[] bArr, zzyy zzyyVar) throws zzzt {
        return (zzix) zzzl.zzx(zzb, bArr, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzix zzixVar, zzkr zzkrVar) {
        zzkrVar.getClass();
        zzixVar.zzf = zzkrVar;
    }

    public final zzyi zzd() {
        return this.zze;
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
                    return new zziw(null);
                }
                return new zzix();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
