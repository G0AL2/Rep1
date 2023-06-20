package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfji {
    private static final zzfji zza = new zzfji();

    private zzfji() {
    }

    public static zzfji zza() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb2.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb2.append(obj2);
                        } else {
                            sb2.append('\"');
                            sb2.append(obj2);
                            sb2.append('\"');
                        }
                    } else {
                        sb2.append(obj);
                    }
                    sb2.append(",");
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String sb3 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new zzfjh(this, webView, sb3));
                return;
            } else {
                webView.loadUrl(sb3);
                return;
            }
        }
        String concat = "The WebView is null for ".concat(str);
        if (!zzfik.zza.booleanValue() || TextUtils.isEmpty(concat)) {
            return;
        }
        Log.i("OMIDLIB", concat);
    }

    public final void zzc(WebView webView) {
        zzb(webView, "finishSession", new Object[0]);
    }

    public final void zzd(WebView webView, JSONObject jSONObject) {
        zzb(webView, "init", jSONObject);
    }

    public final void zze(WebView webView, float f10) {
        zzb(webView, "setDeviceVolume", Float.valueOf(f10));
    }

    public final void zzf(WebView webView, String str) {
        zzb(webView, "setNativeViewHierarchy", str);
    }

    public final void zzg(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        zzb(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
