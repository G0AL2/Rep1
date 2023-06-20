package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclp;
import com.google.android.gms.internal.ads.zzcmk;
import java.io.InputStream;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaa {
    private zzaa() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    public static zzaa zzm(int i10) {
        return i10 >= 30 ? new zzy() : i10 >= 28 ? new zzx() : i10 >= 26 ? new zzv() : i10 >= 24 ? new zzu() : i10 >= 21 ? new zzt() : new zzaa();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzs.zzB()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcfi.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzclp zzd(zzcli zzcliVar, zzbdm zzbdmVar, boolean z10) {
        return new zzcmk(zzcliVar, zzbdmVar, z10);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzg(Context context) {
    }

    public int zzh(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzi(AudioManager audioManager) {
        return 0;
    }

    public void zzj(Activity activity) {
    }

    public int zzl(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
