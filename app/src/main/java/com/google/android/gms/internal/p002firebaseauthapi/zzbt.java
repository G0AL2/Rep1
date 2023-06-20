package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbt  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzbt {
    public static final zzke zza = zzb(16);
    public static final zzke zzb = zzb(32);
    public static final zzke zzc = zza(16, 16);
    public static final zzke zzd = zza(32, 16);
    public static final zzke zze = zzc(16, 16, 32, 16, 5);
    public static final zzke zzf = zzc(32, 16, 32, 32, 5);
    public static final zzke zzg;
    public static final zzke zzh;

    static {
        zzkd zza2 = zzke.zza();
        new zzco();
        zza2.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(3);
        zzg = (zzke) zza2.zzk();
        zzkd zza3 = zzke.zza();
        new zzcy();
        zza3.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza3.zzc(3);
        zzh = (zzke) zza3.zzk();
    }

    public static zzke zza(int i10, int i11) {
        zzgw zzb2 = zzgx.zzb();
        zzb2.zza(i10);
        zzgz zzb3 = zzha.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzha) zzb3.zzk());
        zzkd zza2 = zzke.zza();
        zza2.zzb(((zzgx) zzb2.zzk()).zzo());
        new zzcf();
        zza2.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza2.zzc(3);
        return (zzke) zza2.zzk();
    }

    public static zzke zzb(int i10) {
        zzhf zzb2 = zzhg.zzb();
        zzb2.zza(i10);
        zzkd zza2 = zzke.zza();
        zza2.zzb(((zzhg) zzb2.zzk()).zzo());
        new zzci();
        zza2.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza2.zzc(3);
        return (zzke) zza2.zzk();
    }

    public static zzke zzc(int i10, int i11, int i12, int i13, int i14) {
        zzgn zzb2 = zzgo.zzb();
        zzgq zzb3 = zzgr.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzgr) zzb3.zzk());
        zzb2.zza(i10);
        zzje zzb4 = zzjf.zzb();
        zzjh zzb5 = zzji.zzb();
        zzb5.zzb(5);
        zzb5.zza(i13);
        zzb4.zzb((zzji) zzb5.zzk());
        zzb4.zza(32);
        zzgh zza2 = zzgi.zza();
        zza2.zza((zzgo) zzb2.zzk());
        zza2.zzb((zzjf) zzb4.zzk());
        zzkd zza3 = zzke.zza();
        zza3.zzb(((zzgi) zza2.zzk()).zzo());
        new zzbz();
        zza3.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza3.zzc(3);
        return (zzke) zza3.zzk();
    }
}
