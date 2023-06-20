package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqf implements zzaiu {
    private volatile zzbps zza;
    private final Context zzb;

    public zzbqf(Context context) {
        this.zzb = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzbqf zzbqfVar) {
        if (zzbqfVar.zza == null) {
            return;
        }
        zzbqfVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final zzaix zza(zzajb zzajbVar) throws zzajk {
        Parcelable.Creator<zzbpt> creator = zzbpt.CREATOR;
        Map zzl = zzajbVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbpt zzbptVar = new zzbpt(zzajbVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        try {
            zzcga zzcgaVar = new zzcga();
            this.zza = new zzbps(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbqd(this, zzcgaVar), new zzbqe(this, zzcgaVar));
            this.zza.checkAvailabilityAndConnect();
            zzbqb zzbqbVar = new zzbqb(this, zzbptVar);
            zzfvm zzfvmVar = zzcfv.zza;
            zzfvl zzo = zzfvc.zzo(zzfvc.zzn(zzcgaVar, zzbqbVar, zzfvmVar), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdz)).intValue(), TimeUnit.MILLISECONDS, zzcfv.zzd);
            zzo.zzc(new zzbqc(this), zzfvmVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (elapsedRealtime2 - elapsedRealtime) + "ms");
            zzbpv zzbpvVar = (zzbpv) new zzbzt(parcelFileDescriptor).zza(zzbpv.CREATOR);
            if (zzbpvVar == null) {
                return null;
            }
            if (!zzbpvVar.zza) {
                if (zzbpvVar.zze.length != zzbpvVar.zzf.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                while (true) {
                    String[] strArr3 = zzbpvVar.zze;
                    if (i10 < strArr3.length) {
                        hashMap.put(strArr3[i10], zzbpvVar.zzf[i10]);
                        i10++;
                    } else {
                        return new zzaix(zzbpvVar.zzc, zzbpvVar.zzd, hashMap, zzbpvVar.zzg, zzbpvVar.zzh);
                    }
                }
            } else {
                throw new zzajk(zzbpvVar.zzb);
            }
        } catch (InterruptedException | ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (elapsedRealtime3 - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (elapsedRealtime4 - elapsedRealtime) + "ms");
            throw th;
        }
    }
}
