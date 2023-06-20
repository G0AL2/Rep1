package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzed  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzed {
    public static final zzke zza;
    public static final zzke zzb;
    public static final zzke zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zzke zzkeVar = zzbt.zza;
        zza = zza(4, 5, 3, zzkeVar, 3, bArr);
        zzb = zza(4, 5, 4, zzkeVar, 5, bArr);
        zzc = zza(4, 5, 3, zzbt.zze, 3, bArr);
    }

    public static zzke zza(int i10, int i11, int i12, zzke zzkeVar, int i13, byte[] bArr) {
        zzif zza2 = zzig.zza();
        zzir zza3 = zzis.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzyi.zzn(bArr));
        zzic zza4 = zzid.zza();
        zza4.zza(zzkeVar);
        zzii zzb2 = zzij.zzb();
        zzb2.zzb((zzis) zza3.zzk());
        zzb2.zza((zzid) zza4.zzk());
        zzb2.zzc(i12);
        zza2.zza((zzij) zzb2.zzk());
        zzkd zza5 = zzke.zza();
        new zzdv();
        zza5.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza5.zzc(i13);
        zza5.zzb(((zzig) zza2.zzk()).zzo());
        return (zzke) zza5.zzk();
    }
}
