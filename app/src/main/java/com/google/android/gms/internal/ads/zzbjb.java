package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class zzbjb {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbjb(String str, Object obj, int i10) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i10;
    }

    public static zzbjb zza(String str, double d10) {
        return new zzbjb(str, Double.valueOf(d10), 3);
    }

    public static zzbjb zzb(String str, long j10) {
        return new zzbjb(str, Long.valueOf(j10), 2);
    }

    public static zzbjb zzc(String str, String str2) {
        return new zzbjb(str, str2, 4);
    }

    public static zzbjb zzd(String str, boolean z10) {
        return new zzbjb(str, Boolean.valueOf(z10), 1);
    }

    public final Object zze() {
        zzbke zza = zzbkg.zza();
        if (zza == null) {
            if (zzbkg.zzb() != null) {
                zzbkg.zzb().zza();
            }
            return this.zzb;
        }
        int i10 = this.zzc - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
