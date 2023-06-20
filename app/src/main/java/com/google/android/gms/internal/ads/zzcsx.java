package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcsx implements zzcsp {
    private final zzdzb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsx(zzdzb zzdzbVar) {
        this.zza = zzdzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhL)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.zzk(str);
        }
    }
}
