package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public interface zzyy {
    public static final zzyy zzb = new zzyy() { // from class: com.google.android.gms.internal.ads.zzyw
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            int i10 = zzyx.zza;
            return new zzyr[0];
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };

    zzyr[] zza();

    zzyr[] zzb(Uri uri, Map map);
}
