package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclp;
import com.google.android.gms.internal.ads.zzcmm;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(21)
/* loaded from: classes2.dex */
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zza() {
        return 16974374;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcfi.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i10, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzclp zzd(zzcli zzcliVar, zzbdm zzbdmVar, boolean z10) {
        return new zzcmm(zzcliVar, zzbdmVar, z10);
    }
}
