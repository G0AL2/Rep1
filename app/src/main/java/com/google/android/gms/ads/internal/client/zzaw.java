package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfo;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaw {
    private static final zzaw zza = new zzaw();
    private final zzcfb zzb;
    private final zzau zzc;
    private final String zzd;
    private final zzcfo zze;
    private final Random zzf;

    protected zzaw() {
        zzcfb zzcfbVar = new zzcfb();
        zzau zzauVar = new zzau(new zzk(), new zzi(), new zzek(), new zzbna(), new zzcbq(), new zzbxs(), new zzbnb());
        String zzd = zzcfb.zzd();
        zzcfo zzcfoVar = new zzcfo(0, 221908000, true, false, false);
        Random random = new Random();
        this.zzb = zzcfbVar;
        this.zzc = zzauVar;
        this.zzd = zzd;
        this.zze = zzcfoVar;
        this.zzf = random;
    }

    public static zzau zza() {
        return zza.zzc;
    }

    public static zzcfb zzb() {
        return zza.zzb;
    }

    public static zzcfo zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
