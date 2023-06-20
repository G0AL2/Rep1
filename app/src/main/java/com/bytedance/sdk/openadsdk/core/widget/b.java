package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.q;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: PrivacyProtectDialog.java */
/* loaded from: classes.dex */
public class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private Context f13120a;

    /* renamed from: b  reason: collision with root package name */
    private String f13121b;

    /* renamed from: c  reason: collision with root package name */
    private String f13122c;

    /* renamed from: d  reason: collision with root package name */
    private c f13123d;

    /* renamed from: e  reason: collision with root package name */
    private InterfaceC0179b f13124e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f13125f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PrivacyProtectDialog.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id2 = view.getId();
            if (id2 == t.e(b.this.f13120a, "tt_privacy_accept_btn")) {
                if (b.this.f13123d != null) {
                    b.this.f13123d.a();
                }
                b.this.dismiss();
            } else if (id2 == t.e(b.this.f13120a, "tt_privacy_reject_btn")) {
                if (b.this.f13124e != null) {
                    b.this.f13124e.a();
                }
                b.this.dismiss();
            }
        }
    }

    /* compiled from: PrivacyProtectDialog.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0179b {
        void a();
    }

    /* compiled from: PrivacyProtectDialog.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    public b(Context context) {
        super(context, t.g(context, "tt_privacy_dialogTheme"));
        this.f13120a = context;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
        b();
    }

    private void b() {
        WindowManager.LayoutParams attributes;
        setCancelable(false);
        Window window = getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.dimAmount = 0.5f;
        attributes.width = (int) (this.f13120a.getResources().getDisplayMetrics().widthPixels * 0.8d);
        window.setAttributes(attributes);
    }

    public b a(String str, c cVar) {
        this.f13121b = str;
        this.f13123d = cVar;
        return this;
    }

    public b a(String str, InterfaceC0179b interfaceC0179b) {
        this.f13122c = str;
        this.f13124e = interfaceC0179b;
        return this;
    }

    private void a() {
        View inflate = LayoutInflater.from(this.f13120a).inflate(t.f(this.f13120a, "tt_privacy_dialog"), (ViewGroup) null);
        setContentView(inflate);
        final TTCornersWebView tTCornersWebView = (TTCornersWebView) inflate.findViewById(t.e(this.f13120a, "tt_privacy_webview"));
        Button button = (Button) inflate.findViewById(t.e(this.f13120a, "tt_privacy_accept_btn"));
        TextView textView = (TextView) inflate.findViewById(t.e(this.f13120a, "tt_privacy_reject_btn"));
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(t.e(this.f13120a, "tt_privacy_back_layout"));
        this.f13125f = relativeLayout;
        v.a((View) relativeLayout, 8);
        textView.getPaint().setFlags(8);
        a(tTCornersWebView);
        if (!TextUtils.isEmpty(this.f13121b) && !TextUtils.isEmpty(this.f13122c)) {
            button.setText(this.f13121b);
            textView.setText(this.f13122c);
        }
        button.setOnClickListener(new a());
        textView.setOnClickListener(new a());
        this.f13125f.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTCornersWebView tTCornersWebView2 = tTCornersWebView;
                if (tTCornersWebView2 == null || !tTCornersWebView2.canGoBack()) {
                    return;
                }
                tTCornersWebView.goBack();
                if (tTCornersWebView.canGoBack()) {
                    return;
                }
                v.a((View) b.this.f13125f, 8);
            }
        });
    }

    private void a(final TTCornersWebView tTCornersWebView) {
        String t10 = m.h().t();
        if (t10 != null) {
            try {
                tTCornersWebView.getSettings().setJavaScriptEnabled(true);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                tTCornersWebView.getSettings().setMixedContentMode(0);
            }
            try {
                WebSettings settings = tTCornersWebView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setDomStorageEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setBlockNetworkImage(false);
                settings.setSavePassword(false);
                tTCornersWebView.setLayerType(1, null);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            q.a(tTCornersWebView);
            tTCornersWebView.setWebViewClient(new SSWebView.a() { // from class: com.bytedance.sdk.openadsdk.core.widget.b.2
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    TTCornersWebView tTCornersWebView2 = tTCornersWebView;
                    if (tTCornersWebView2 == null || !tTCornersWebView2.canGoBack()) {
                        return;
                    }
                    v.a((View) b.this.f13125f, 0);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    if (webView == null || webResourceRequest == null) {
                        return false;
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        webView.loadUrl(webResourceRequest.getUrl().toString());
                        return true;
                    }
                    webView.loadUrl(webResourceRequest.toString());
                    return true;
                }
            });
            tTCornersWebView.loadUrl(t10);
        }
    }
}
