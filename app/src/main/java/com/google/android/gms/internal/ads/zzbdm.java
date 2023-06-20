package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdm {
    private final zzbds zza;
    private final zzbfb zzb;
    private final boolean zzc;

    private zzbdm() {
        this.zzb = zzbfc.zzd();
        this.zzc = false;
        this.zza = new zzbds();
    }

    public static zzbdm zza() {
        return new zzbdm();
    }

    private final synchronized String zzd(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzk(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime()), Integer.valueOf(i10 - 1), Base64.encodeToString(((zzbfc) this.zzb.zzal()).zzaw(), 3));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i10) {
        zzbfb zzbfbVar = this.zzb;
        zzbfbVar.zzd();
        List<String> zzb = zzbhz.zzb();
        ArrayList arrayList = new ArrayList();
        for (String str : zzb) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbfbVar.zzc(arrayList);
        zzbdr zzbdrVar = new zzbdr(this.zza, ((zzbfc) this.zzb.zzal()).zzaw(), null);
        int i11 = i10 - 1;
        zzbdrVar.zza(i11);
        zzbdrVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzbdl zzbdlVar) {
        if (this.zzc) {
            try {
                zzbdlVar.zza(this.zzb);
            } catch (NullPointerException e10) {
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdW)).booleanValue()) {
                zze(i10);
            } else {
                zzf(i10);
            }
        }
    }

    public zzbdm(zzbds zzbdsVar) {
        this.zzb = zzbfc.zzd();
        this.zza = zzbdsVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdV)).booleanValue();
    }
}
