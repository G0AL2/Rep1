package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbie {
    @VisibleForTesting
    String zzd;
    @VisibleForTesting
    Context zze;
    @VisibleForTesting
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    @VisibleForTesting
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    @VisibleForTesting
    final LinkedHashMap zzb = new LinkedHashMap();
    @VisibleForTesting
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbie zzbieVar) {
        while (true) {
            try {
                zzbio zzbioVar = (zzbio) zzbieVar.zza.take();
                zzbin zza = zzbioVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbieVar.zzg(zzbieVar.zzb(zzbieVar.zzb, zzbioVar.zzb()), zza);
                }
            } catch (InterruptedException e10) {
                zzcfi.zzk("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbin zzbinVar) {
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbinVar != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbinVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbinVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbinVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbinVar.zza());
            }
            uri = sb2.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzG(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file != null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                    try {
                        fileOutputStream2.write(uri.getBytes());
                        fileOutputStream2.write(10);
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e10) {
                            zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        zzcfi.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e12) {
                                zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                zzcfi.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } else {
            zzcfi.zzj("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
        }
    }

    public final zzbik zza(String str) {
        zzbik zzbikVar = (zzbik) this.zzc.get(str);
        return zzbikVar != null ? zzbikVar : zzbik.zza;
    }

    final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, zza(str).zza(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbjk.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbid
            @Override // java.lang.Runnable
            public final void run() {
                zzbie.zzc(zzbie.this);
            }
        });
        Map map2 = this.zzc;
        zzbik zzbikVar = zzbik.zzb;
        map2.put("action", zzbikVar);
        this.zzc.put("ad_format", zzbikVar);
        this.zzc.put("e", zzbik.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbio zzbioVar) {
        return this.zza.offer(zzbioVar);
    }
}
