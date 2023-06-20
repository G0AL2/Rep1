package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbio {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbio(boolean z10, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbil zzf() {
        return new zzbil(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime(), null, null);
    }

    public final zzbin zza() {
        zzbin zzbinVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbil zzbilVar : this.zza) {
                long zza = zzbilVar.zza();
                String zzc = zzbilVar.zzc();
                zzbil zzb = zzbilVar.zzb();
                if (zzb != null && zza > 0) {
                    sb2.append(zzc);
                    sb2.append('.');
                    sb2.append(zza - zzb.zza());
                    sb2.append(',');
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb3 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb3.append('+');
                            sb3.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb2.append((String) null);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            StringBuilder sb4 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb4.append((CharSequence) entry.getValue());
                    sb4.append('.');
                    sb4.append(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime()));
                    sb4.append(',');
                }
                if (sb4.length() > 0) {
                    sb4.setLength(sb4.length() - 1);
                }
                str = sb4.toString();
            }
            zzbinVar = new zzbin(sb2.toString(), str);
        }
        return zzbinVar;
    }

    @VisibleForTesting
    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(zzbio zzbioVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbie zzf;
        if (TextUtils.isEmpty(str2) || (zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbik zza = zzf.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbil zzbilVar, long j10, String... strArr) {
        synchronized (this.zzc) {
            for (int i10 = 0; i10 <= 0; i10++) {
                this.zza.add(new zzbil(j10, strArr[i10], zzbilVar));
            }
        }
        return true;
    }
}
