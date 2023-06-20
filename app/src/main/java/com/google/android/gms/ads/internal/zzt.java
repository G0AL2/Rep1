package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbdj;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcjn;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzefc;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzcg zzA;
    private final zzcjn zzB;
    private final zzcgi zzC;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzclu zze;
    private final zzaa zzf;
    private final zzbbh zzg;
    private final zzcer zzh;
    private final zzab zzi;
    private final zzbcu zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbif zzm;
    private final zzaw zzn;
    private final zzcad zzo;
    private final zzbrg zzp;
    private final zzcgb zzq;
    private final zzbsr zzr;
    private final zzbv zzs;
    private final zzx zzt;
    private final zzy zzu;
    private final zzbtw zzv;
    private final zzbw zzw;
    private final zzbxp zzx;
    private final zzbdj zzy;
    private final zzcdn zzz;

    protected zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzclu zzcluVar = new zzclu();
        zzaa zzm = zzaa.zzm(Build.VERSION.SDK_INT);
        zzbbh zzbbhVar = new zzbbh();
        zzcer zzcerVar = new zzcer();
        zzab zzabVar = new zzab();
        zzbcu zzbcuVar = new zzbcu();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbif zzbifVar = new zzbif();
        zzaw zzawVar = new zzaw();
        zzcad zzcadVar = new zzcad();
        zzbrg zzbrgVar = new zzbrg();
        zzcgb zzcgbVar = new zzcgb();
        zzbsr zzbsrVar = new zzbsr();
        zzbv zzbvVar = new zzbv();
        zzx zzxVar = new zzx();
        zzy zzyVar = new zzy();
        zzbtw zzbtwVar = new zzbtw();
        zzbw zzbwVar = new zzbw();
        zzefc zzefcVar = new zzefc();
        zzbdj zzbdjVar = new zzbdj();
        zzcdn zzcdnVar = new zzcdn();
        zzcg zzcgVar = new zzcg();
        zzcjn zzcjnVar = new zzcjn();
        zzcgi zzcgiVar = new zzcgi();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcluVar;
        this.zzf = zzm;
        this.zzg = zzbbhVar;
        this.zzh = zzcerVar;
        this.zzi = zzabVar;
        this.zzj = zzbcuVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbifVar;
        this.zzn = zzawVar;
        this.zzo = zzcadVar;
        this.zzp = zzbrgVar;
        this.zzq = zzcgbVar;
        this.zzr = zzbsrVar;
        this.zzs = zzbvVar;
        this.zzt = zzxVar;
        this.zzu = zzyVar;
        this.zzv = zzbtwVar;
        this.zzw = zzbwVar;
        this.zzx = zzefcVar;
        this.zzy = zzbdjVar;
        this.zzz = zzcdnVar;
        this.zzA = zzcgVar;
        this.zzB = zzcjnVar;
        this.zzC = zzcgiVar;
    }

    public static Clock zzA() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzbbh zzb() {
        return zza.zzg;
    }

    public static zzbcu zzc() {
        return zza.zzj;
    }

    public static zzbdj zzd() {
        return zza.zzy;
    }

    public static zzbif zze() {
        return zza.zzm;
    }

    public static zzbsr zzf() {
        return zza.zzr;
    }

    public static zzbtw zzg() {
        return zza.zzv;
    }

    public static zzbxp zzh() {
        return zza.zzx;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzj() {
        return zza.zzc;
    }

    public static zzx zzk() {
        return zza.zzt;
    }

    public static zzy zzl() {
        return zza.zzu;
    }

    public static zzcad zzm() {
        return zza.zzo;
    }

    public static zzcdn zzn() {
        return zza.zzz;
    }

    public static zzcer zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzs;
    }

    public static zzbw zzu() {
        return zza.zzw;
    }

    public static zzcg zzv() {
        return zza.zzA;
    }

    public static zzcgb zzw() {
        return zza.zzq;
    }

    public static zzcgi zzx() {
        return zza.zzC;
    }

    public static zzcjn zzy() {
        return zza.zzB;
    }

    public static zzclu zzz() {
        return zza.zze;
    }
}
