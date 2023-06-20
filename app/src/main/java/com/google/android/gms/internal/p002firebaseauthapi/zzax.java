package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzax  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzax {
    private final zzke zza;

    private zzax(zzke zzkeVar) {
        this.zza = zzkeVar;
    }

    public static zzax zze(String str, byte[] bArr, int i10) {
        zzkd zza = zzke.zza();
        zza.zza(str);
        zza.zzb(zzyi.zzn(bArr));
        int i11 = i10 - 1;
        zza.zzc(i11 != 0 ? i11 != 1 ? i11 != 2 ? 6 : 5 : 4 : 3);
        return new zzax((zzke) zza.zzk());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzke zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zze();
    }

    public final byte[] zzc() {
        return this.zza.zzd().zzt();
    }

    public final int zzd() {
        int zzh = this.zza.zzh() - 2;
        int i10 = 1;
        if (zzh != 1) {
            i10 = 2;
            if (zzh != 2) {
                i10 = 3;
                if (zzh != 3) {
                    if (zzh == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
