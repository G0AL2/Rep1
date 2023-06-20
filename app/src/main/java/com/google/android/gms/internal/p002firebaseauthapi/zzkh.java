package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkh  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzkh extends zzzl implements zzaar {
    private static final zzkh zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        zzkh zzkhVar = new zzkh();
        zzb = zzkhVar;
        zzzl.zzE(zzkh.class, zzkhVar);
    }

    private zzkh() {
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
                    return new zzkg(null);
                }
                return new zzkh();
            }
            return zzzl.zzD(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
