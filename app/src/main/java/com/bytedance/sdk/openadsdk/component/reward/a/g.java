package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: VastEndCardManager.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f11517a;

    /* renamed from: b  reason: collision with root package name */
    private n f11518b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f11519c;

    /* renamed from: d  reason: collision with root package name */
    private SSWebView f11520d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f11521e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11522f;

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.b.g f11523g;

    /* renamed from: h  reason: collision with root package name */
    private e f11524h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11525i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11526j;

    public g(Activity activity) {
        this.f11517a = activity;
    }

    private void b() {
        this.f11520d.setWebViewClient(new SSWebView.a() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.g.2
            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || g.this.f11525i || webResourceError == null) {
                    return;
                }
                g.this.a(webResourceError.getErrorCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
                g.this.f11525i = true;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                if (Build.VERSION.SDK_INT >= 23 || g.this.f11525i) {
                    return;
                }
                g.this.a(i10, str2);
                g.this.f11525i = true;
            }
        });
    }

    public void a(n nVar) {
        com.bytedance.sdk.openadsdk.core.j.c c10;
        Activity activity = this.f11517a;
        if (activity == null) {
            return;
        }
        this.f11518b = nVar;
        this.f11519c = (FrameLayout) activity.findViewById(t.e(activity, "tt_reward_full_endcard_vast"));
        if (this.f11518b.ax() == null || (c10 = this.f11518b.ax().c()) == null) {
            return;
        }
        if (c10.e() != null) {
            this.f11522f = true;
            Activity activity2 = this.f11517a;
            this.f11521e = (ImageView) activity2.findViewById(t.e(activity2, "tt_reward_full_endcard_vast_image"));
            a(c10.b(), c10.c(), this.f11518b.ax());
            com.bytedance.sdk.openadsdk.d.a.a(c10.e()).a(com.bytedance.sdk.component.d.t.BITMAP).a(new com.bytedance.sdk.component.d.n<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.g.1
                @Override // com.bytedance.sdk.component.d.n
                public void a(j<Bitmap> jVar) {
                    if (g.this.f11521e == null || jVar == null) {
                        return;
                    }
                    Bitmap b10 = jVar.b();
                    if (b10 != null) {
                        g.this.f11521e.setImageBitmap(b10);
                        g.this.f11526j = true;
                        return;
                    }
                    g.this.a(-1);
                }

                @Override // com.bytedance.sdk.component.d.n
                public void a(int i10, String str, Throwable th) {
                    if (g.this.f11521e != null) {
                        g.this.f11521e.setVisibility(8);
                    }
                    g.this.a(-2);
                }
            });
            return;
        }
        Activity activity3 = this.f11517a;
        this.f11520d = (SSWebView) activity3.findViewById(t.e(activity3, "tt_reward_full_endcard_vast_web"));
        b();
        String d10 = c10.d();
        if (d10 != null) {
            this.f11522f = true;
            if (d10.startsWith("http")) {
                this.f11520d.a(d10);
                return;
            }
            this.f11520d.setDefaultTextEncodingName("UTF -8");
            this.f11520d.a(null, d10, "text/html", "UTF-8", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        a(i10, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("reason_code", i10);
            if (str != null) {
                jSONObject.put(ImagesContract.URL, str);
            }
            com.bytedance.sdk.openadsdk.b.e.b(m.a(), this.f11518b, this.f11518b.ax() != null ? this.f11518b.ax().k() : "", "load_vast_endcard_fail", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void a(int i10, int i11, final com.bytedance.sdk.openadsdk.core.j.a aVar) {
        Activity activity;
        float f10;
        float f11;
        if (i10 == 0 || i11 == 0 || this.f11521e == null || (activity = this.f11517a) == null) {
            return;
        }
        int c10 = v.c((Context) activity);
        int d10 = v.d((Context) this.f11517a);
        if (i10 / i11 <= c10 / d10) {
            c10 = (int) Math.ceil(f11 * f10);
        } else {
            d10 = (int) Math.ceil(f11 / f10);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11521e.getLayoutParams();
        layoutParams.width = c10;
        layoutParams.height = d10;
        this.f11521e.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.b.g gVar = new com.bytedance.sdk.openadsdk.core.b.g("VAST_END_CARD", aVar) { // from class: com.bytedance.sdk.openadsdk.component.reward.a.g.3
            @Override // com.bytedance.sdk.openadsdk.core.b.g
            public void a() {
                if (aVar.c() != null) {
                    aVar.c().a(g.this.f11524h != null ? g.this.f11524h.s() : -1L);
                }
            }
        };
        this.f11523g = gVar;
        this.f11521e.setOnClickListener(gVar);
        this.f11521e.setOnTouchListener(this.f11523g);
    }

    public void a() {
        v.a((View) this.f11519c, 8);
    }

    public boolean a(e eVar) {
        com.bytedance.sdk.openadsdk.core.j.c c10;
        if (this.f11522f) {
            this.f11524h = eVar;
            ImageView imageView = this.f11521e;
            if (imageView != null && this.f11526j) {
                imageView.setVisibility(0);
            } else {
                SSWebView sSWebView = this.f11520d;
                if (sSWebView != null) {
                    sSWebView.setVisibility(0);
                }
            }
            v.a((View) this.f11519c, 0);
            n nVar = this.f11518b;
            if (nVar == null || nVar.ax() == null || (c10 = this.f11518b.ax().c()) == null) {
                return true;
            }
            e eVar2 = this.f11524h;
            c10.b(eVar2 != null ? eVar2.s() : -1L);
            return true;
        }
        return false;
    }

    public void a(com.bytedance.sdk.openadsdk.core.b.e eVar) {
        com.bytedance.sdk.openadsdk.core.b.g gVar = this.f11523g;
        if (gVar != null) {
            gVar.a(eVar);
        }
    }
}
