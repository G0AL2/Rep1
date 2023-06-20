package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctb implements zzcsp {
    private final zzfbk zza;

    public zzctb(zzfbk zzfbkVar) {
        this.zza = zzfbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
