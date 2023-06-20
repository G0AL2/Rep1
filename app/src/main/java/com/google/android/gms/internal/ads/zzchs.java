package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfnw;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzchs {
    private final Context zza;
    private final String zzb;
    private final zzcfo zzc;
    private final zzbil zzd;
    private final zzbio zze;
    private final com.google.android.gms.ads.internal.util.zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcgx zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzchs(Context context, zzcfo zzcfoVar, String str, zzbio zzbioVar, zzbil zzbilVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbdVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzcfoVar;
        this.zzb = str;
        this.zze = zzbioVar;
        this.zzd = zzbilVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzy);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                this.zzg[i10] = Long.parseLong(split[i10]);
            } catch (NumberFormatException e10) {
                zzcfi.zzk("Unable to parse frame hash target time number.", e10);
                this.zzg[i10] = -1;
            }
        }
    }

    public final void zza(zzcgx zzcgxVar) {
        zzbig.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcgxVar.zzj());
        this.zzn = zzcgxVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbig.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbig.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbkd.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zzj());
        for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.zzf.zza()) {
            bundle.putString("fps_c_".concat(String.valueOf(zzbcVar.zza)), Integer.toString(zzbcVar.zze));
            bundle.putString("fps_p_".concat(String.valueOf(zzbcVar.zza)), Double.toString(zzbcVar.zzd));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i10 < jArr.length) {
                String str = this.zzh[i10];
                if (str != null) {
                    bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str);
                }
                i10++;
            } else {
                com.google.android.gms.ads.internal.zzt.zzp();
                final Context context = this.zza;
                final String str2 = this.zzc.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                bundle.putString("device", com.google.android.gms.ads.internal.util.zzs.zzq());
                bundle.putString("eids", TextUtils.join(",", zzbhz.zza()));
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                zzcfb.zzv(context, str2, "gmob-apps", bundle, true, new zzcfa() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.google.android.gms.internal.ads.zzcfa
                    public final boolean zza(String str3) {
                        Context context2 = context;
                        String str4 = str2;
                        zzfnw zzfnwVar = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzp();
                        zzs.zzG(context2, str4, str3);
                        return true;
                    }
                });
                this.zzo = true;
                return;
            }
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcgx zzcgxVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbig.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long nanoTime = com.google.android.gms.ads.internal.zzt.zzA().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (nanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = nanoTime;
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzz)).longValue();
        long zza = zzcgxVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && longValue > Math.abs(zza - this.zzg[i10])) {
                String[] strArr2 = this.zzh;
                int i11 = 8;
                Bitmap bitmap = zzcgxVar.getBitmap(8, 8);
                long j10 = 63;
                long j11 = 0;
                int i12 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j10);
                        i13++;
                        j10--;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }
}
