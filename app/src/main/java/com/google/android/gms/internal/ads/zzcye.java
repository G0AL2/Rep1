package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcye {
    public final List zza;

    public zzcye(zzcxx zzcxxVar) {
        this.zza = Collections.singletonList(zzfvc.zzi(zzcxxVar));
    }

    public zzcye(List list) {
        this.zza = list;
    }

    public static zzefd zza(zzefd zzefdVar) {
        return new zzefe(zzefdVar, new zzfok() { // from class: com.google.android.gms.internal.ads.zzcyd
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                return new zzcye((zzcxx) obj);
            }
        });
    }
}
