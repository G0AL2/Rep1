package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhu implements Runnable {
    public static Boolean zza;
    private final Context zzb;
    private final zzcfo zzc;
    private String zze;
    private int zzf;
    private final zzdtz zzg;
    private final zzect zzi;
    private final zzcah zzj;
    private final zzfhz zzd = zzfic.zzc();
    private boolean zzh = false;

    public zzfhu(Context context, zzcfo zzcfoVar, zzdtz zzdtzVar, zzect zzectVar, zzcah zzcahVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzcfoVar;
        this.zzg = zzdtzVar;
        this.zzi = zzectVar;
        this.zzj = zzcahVar;
    }

    public static synchronized boolean zza() {
        boolean booleanValue;
        synchronized (zzfhu.class) {
            if (zza == null) {
                if (((Boolean) zzbji.zzb.zze()).booleanValue()) {
                    zza = Boolean.valueOf(Math.random() < ((Double) zzbji.zza.zze()).doubleValue());
                } else {
                    zza = Boolean.FALSE;
                }
            }
            booleanValue = zza.booleanValue();
        }
        return booleanValue;
    }

    private final synchronized void zzc() {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        if (zza()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            this.zze = com.google.android.gms.ads.internal.util.zzs.zzo(this.zzb);
            this.zzf = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzb);
            long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzho)).intValue();
            zzcfv.zzd.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzd() {
        try {
            new zzecs(this.zzb, this.zzc.zza, this.zzj, Binder.getCallingUid(), null).zza(new zzecq((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhn), 60000, new HashMap(), ((zzfic) this.zzd.zzal()).zzaw(), "application/x-protobuf"));
            this.zzd.zzc();
        } catch (Exception e10) {
            if ((e10 instanceof zzdzl) && ((zzdzl) e10).zza() == 3) {
                this.zzd.zzc();
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzs(e10, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (zza()) {
            if (this.zzd.zza() == 0) {
                return;
            }
            zzd();
        }
    }

    public final synchronized void zzb(zzfhl zzfhlVar) {
        if (!this.zzh) {
            zzc();
        }
        if (zza()) {
            if (zzfhlVar == null) {
                return;
            }
            if (this.zzd.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhp)).intValue()) {
                return;
            }
            zzfhz zzfhzVar = this.zzd;
            zzfia zza2 = zzfib.zza();
            zzfhw zza3 = zzfhx.zza();
            zza3.zzo(zzfhlVar.zzh());
            zza3.zzl(zzfhlVar.zzg());
            zza3.zze(zzfhlVar.zzb());
            zza3.zzq(3);
            zza3.zzk(this.zzc.zza);
            zza3.zza(this.zze);
            zza3.zzi(Build.VERSION.RELEASE);
            zza3.zzm(Build.VERSION.SDK_INT);
            zza3.zzp(zzfhlVar.zzj());
            zza3.zzh(zzfhlVar.zza());
            zza3.zzc(this.zzf);
            zza3.zzn(zzfhlVar.zzi());
            zza3.zzb(zzfhlVar.zzc());
            zza3.zzd(zzfhlVar.zzd());
            zza3.zzf(zzfhlVar.zze());
            zza3.zzg(this.zzg.zzc(zzfhlVar.zze()));
            zza3.zzj(zzfhlVar.zzf());
            zza2.zza(zza3);
            zzfhzVar.zzb(zza2);
        }
    }
}
