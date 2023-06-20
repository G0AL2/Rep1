package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctf implements zzcsp {
    private final CookieManager zza;

    public zzctf(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzq().zzb(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map) {
        if (this.zza == null) {
            return;
        }
        if (((String) map.get("clear")) != null) {
            String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaH);
            String cookie = this.zza.getCookie(str);
            if (cookie == null) {
                return;
            }
            List zzf = zzfpg.zzc(zzfoh.zzc(';')).zzf(cookie);
            for (int i10 = 0; i10 < zzf.size(); i10++) {
                CookieManager cookieManager = this.zza;
                Iterator it = zzfpg.zzc(zzfoh.zzc('=')).zzd((String) zzf.get(i10)).iterator();
                Objects.requireNonNull(it);
                if (it.hasNext()) {
                    cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzau))));
                } else {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
            }
            return;
        }
        String str2 = (String) map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.setCookie((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaH), str2);
    }
}
