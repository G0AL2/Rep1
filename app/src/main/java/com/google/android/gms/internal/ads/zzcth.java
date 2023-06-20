package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcth implements zzcsp {
    private final zzdzb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcth(zzdzb zzdzbVar) {
        this.zza = zzdzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzl(str.equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES));
    }
}
