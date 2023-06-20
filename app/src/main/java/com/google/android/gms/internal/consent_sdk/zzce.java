package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebView;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzce {
    private static Boolean zza;

    private zzce() {
    }

    @TargetApi(19)
    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 19) {
            synchronized (zzce.class) {
                if (zza == null) {
                    try {
                        webView.evaluateJavascript("(function(){})()", null);
                        zza = Boolean.TRUE;
                    } catch (IllegalStateException unused) {
                        zza = Boolean.FALSE;
                    }
                }
                booleanValue = zza.booleanValue();
            }
            if (booleanValue) {
                webView.evaluateJavascript(str, null);
                return;
            }
        }
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
    }
}
