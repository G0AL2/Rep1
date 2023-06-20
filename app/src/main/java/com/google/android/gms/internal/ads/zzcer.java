package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcer {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcev zzc;
    private boolean zzd;
    private Context zze;
    private zzcfo zzf;
    private zzbie zzg;
    private Boolean zzh;
    private final AtomicInteger zzi;
    private final zzceq zzj;
    private final Object zzk;
    private zzfvl zzl;
    private final AtomicBoolean zzm;

    public zzcer() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcev(com.google.android.gms.ads.internal.client.zzaw.zzd(), zzjVar);
        this.zzd = false;
        this.zzg = null;
        this.zzh = null;
        this.zzi = new AtomicInteger(0);
        this.zzj = new zzceq(null);
        this.zzk = new Object();
        this.zzm = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzi.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzil)).booleanValue()) {
                return zzcfm.zza(this.zze).getResources();
            }
            zzcfm.zza(this.zze).getResources();
            return null;
        } catch (zzcfl e10) {
            zzcfi.zzk("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final zzbie zzf() {
        zzbie zzbieVar;
        synchronized (this.zza) {
            zzbieVar = this.zzg;
        }
        return zzbieVar;
    }

    public final zzcev zzg() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final zzfvl zzj() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcj)).booleanValue()) {
                synchronized (this.zzk) {
                    zzfvl zzfvlVar = this.zzl;
                    if (zzfvlVar != null) {
                        return zzfvlVar;
                    }
                    zzfvl zzb = zzcfv.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcem
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzcer.this.zzm();
                        }
                    });
                    this.zzl = zzb;
                    return zzb;
                }
            }
        }
        return zzfvc.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzh;
        }
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzm() throws Exception {
        Context zza = zzcaj.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzo() {
        this.zzj.zza();
    }

    public final void zzp() {
        this.zzi.decrementAndGet();
    }

    public final void zzq() {
        this.zzi.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzr(Context context, zzcfo zzcfoVar) {
        zzbie zzbieVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcfoVar;
                com.google.android.gms.ads.internal.zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbyy.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzt.zze();
                if (!((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbieVar = null;
                } else {
                    zzbieVar = new zzbie();
                }
                this.zzg = zzbieVar;
                if (zzbieVar != null) {
                    zzcfy.zza(new zzcen(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhc)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzceo(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzcfoVar.zza);
    }

    public final void zzs(Throwable th, String str) {
        zzbyy.zzb(this.zze, this.zzf).zze(th, str, ((Double) zzbjx.zzg.zze()).floatValue());
    }

    public final void zzt(Throwable th, String str) {
        zzbyy.zzb(this.zze, this.zzf).zzd(th, str);
    }

    public final void zzu(Boolean bool) {
        synchronized (this.zza) {
            this.zzh = bool;
        }
    }

    public final boolean zzv(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhc)).booleanValue()) {
                return this.zzm.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
