package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vehiclecloud.app.videofetch.rndownloader.service.download.ParallelDownload;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzclh extends WebChromeClient {
    private final zzcli zza;

    public zzclh(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcli)) {
            return webView.getContext();
        }
        zzcli zzcliVar = (zzcli) webView;
        Activity zzk = zzcliVar.zzk();
        return zzk != null ? zzk : zzcliVar.getContext();
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcli)) {
            zzcfi.zzj("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = ((zzcli) webView).zzN();
        if (zzN == null) {
            zzcfi.zzj("Tried to close an AdWebView not associated with an overlay.");
        } else {
            zzN.zzb();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i10 = zzclg.zza[consoleMessage.messageLevel().ordinal()];
        if (i10 == 1) {
            zzcfi.zzg(str);
        } else if (i10 == 2) {
            zzcfi.zzj(str);
        } else if (i10 == 3 || i10 == 4) {
            zzcfi.zzi(str);
        } else if (i10 != 5) {
            zzcfi.zzi(str);
        } else {
            zzcfi.zze(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.zza.zzJ() != null) {
            webView2.setWebViewClient(this.zza.zzJ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j10, long j11, long j12, WebStorage.QuotaUpdater quotaUpdater) {
        long j13 = ParallelDownload.ONE_CONNECTION_UPPER_LIMIT - j12;
        if (j13 <= 0) {
            quotaUpdater.updateQuota(j10);
            return;
        }
        if (j10 == 0) {
            if (j11 > j13 || j11 > 1048576) {
                j11 = 0;
            }
        } else if (j11 == 0) {
            j11 = Math.min(j10 + Math.min(131072L, j13), 1048576L);
        } else {
            if (j11 <= Math.min(1048576 - j10, j13)) {
                j10 += j11;
            }
            j11 = j10;
        }
        quotaUpdater.updateQuota(j11);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z10;
        if (callback != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!com.google.android.gms.ads.internal.util.zzs.zzx(this.zza.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzs.zzx(this.zza.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z10 = false;
                    callback.invoke(str, z10, true);
                }
            }
            z10 = true;
            callback.invoke(str, z10, true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            zzcfi.zzj("Could not get ad overlay when hiding custom view.");
        } else {
            zzN.zzf();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zza.zzN();
        if (zzN == null) {
            zzcfi.zzj("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        zzN.zzA(view, customViewCallback);
        zzN.zzy(i10);
    }

    protected final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z10) {
        zzcli zzcliVar;
        com.google.android.gms.ads.internal.zzb zzd;
        try {
            zzcliVar = this.zza;
        } catch (WindowManager.BadTokenException e10) {
            zzcfi.zzk("Fail to display Dialog.", e10);
        }
        if (zzcliVar != null && zzcliVar.zzP() != null && this.zza.zzP().zzd() != null && (zzd = this.zza.zzP().zzd()) != null && !zzd.zzc()) {
            zzd.zzb("window." + str + "('" + str3 + "')");
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z10) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(17039370, new zzclf(jsPromptResult, editText)).setNegativeButton(17039360, new zzcle(jsPromptResult)).setOnCancelListener(new zzcld(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(17039370, new zzclc(jsResult)).setNegativeButton(17039360, new zzclb(jsResult)).setOnCancelListener(new zzcla(jsResult)).create().show();
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
