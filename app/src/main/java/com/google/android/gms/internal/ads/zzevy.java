package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzevy implements zzetg {
    private final zzfvm zza;

    public zzevy(zzfvm zzfvmVar) {
        this.zza = zzfvmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] split;
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzI);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzJ)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                        }
                    }
                }
                return new zzevz(hashMap);
            }
        });
    }
}
