package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public interface zzfn extends zzeq {
    public static final zzfov zza = new zzfov() { // from class: com.google.android.gms.internal.ads.zzfh
        @Override // com.google.android.gms.internal.ads.zzfov
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String zza2 = zzfoc.zza(str);
            if (TextUtils.isEmpty(zza2)) {
                return false;
            }
            return ((zza2.contains("text") && !zza2.contains("text/vtt")) || zza2.contains("html") || zza2.contains("xml")) ? false : true;
        }
    };

    @Override // 
    Map zze();
}
