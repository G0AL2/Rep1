package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfwr {
    private final zzgfo zza;

    private zzfwr(zzgfo zzgfoVar) {
        this.zza = zzgfoVar;
    }

    public static zzfwr zze(String str, byte[] bArr, int i10) {
        zzgfn zza = zzgfo.zza();
        zza.zza(str);
        zza.zzb(zzgji.zzv(bArr));
        int i11 = i10 - 1;
        zza.zzc(i11 != 0 ? i11 != 1 ? 5 : 4 : 3);
        return new zzfwr((zzgfo) zza.zzal());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgfo zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zzf();
    }

    public final byte[] zzc() {
        return this.zza.zze().zzE();
    }

    public final int zzd() {
        int zzi = this.zza.zzi() - 2;
        int i10 = 1;
        if (zzi != 1) {
            i10 = 2;
            if (zzi != 2) {
                i10 = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i10;
    }
}
