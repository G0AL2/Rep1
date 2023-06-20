package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: TTBottomNewStyleManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f11257a;

    /* renamed from: b  reason: collision with root package name */
    private final SSWebView f11258b;

    /* renamed from: c  reason: collision with root package name */
    private final n f11259c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11260d;

    /* renamed from: e  reason: collision with root package name */
    private Context f11261e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f11262f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f11263g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f11264h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f11265i;

    public d(Context context, LinearLayout linearLayout, SSWebView sSWebView, n nVar, String str) {
        this.f11261e = context;
        this.f11257a = linearLayout;
        this.f11258b = sSWebView;
        this.f11259c = nVar;
        this.f11260d = str;
        c();
    }

    private void c() {
        this.f11262f = (ImageView) this.f11257a.findViewById(t.e(this.f11261e, "tt_bottom_bar_back"));
        this.f11263g = (ImageView) this.f11257a.findViewById(t.e(this.f11261e, "tt_bottom_bar_forward"));
        this.f11264h = (ImageView) this.f11257a.findViewById(t.e(this.f11261e, "tt_bottom_bar_refresh"));
        this.f11265i = (ImageView) this.f11257a.findViewById(t.e(this.f11261e, "tt_bottom_bar_go_to_browser"));
        this.f11262f.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f11258b == null || !d.this.f11258b.e()) {
                    return;
                }
                d.this.a("backward");
                d.this.f11258b.f();
            }
        });
        this.f11263g.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f11258b == null || !d.this.f11258b.g()) {
                    return;
                }
                d.this.a("forward");
                d.this.f11258b.h();
            }
        });
        this.f11264h.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f11258b != null) {
                    d.this.b("refresh");
                    d.this.f11258b.d();
                }
            }
        });
        this.f11265i.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.f11258b != null) {
                    d.this.b("external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = d.this.f11258b.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.b.a(d.this.f11261e, intent, null);
                }
            }
        });
        this.f11257a.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.d.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.f11262f.setClickable(false);
        this.f11263g.setClickable(false);
        this.f11262f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.f11263g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public void a(WebView webView) {
        try {
            if (this.f11262f != null) {
                if (webView.canGoBack()) {
                    this.f11262f.setClickable(true);
                    this.f11262f.clearColorFilter();
                } else {
                    this.f11262f.setClickable(false);
                    this.f11262f.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.f11263g != null) {
                if (webView.canGoForward()) {
                    this.f11263g.setClickable(true);
                    this.f11263g.clearColorFilter();
                    return;
                }
                this.f11263g.setClickable(false);
                this.f11263g.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        if (this.f11257a.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.f11257a, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11258b.getWebView() != null && (copyBackForwardList = this.f11258b.getWebView().copyBackForwardList()) != null) {
                String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f11258b.getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(ImagesContract.URL, url);
                jSONObject2.putOpt("first_page", Integer.valueOf(copyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.b.e.c(m.a(), this.f11259c, this.f11260d, str, jSONObject);
    }

    public void a() {
        if (this.f11257a.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.f11257a, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        WebBackForwardList copyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11258b.getWebView() != null && (copyBackForwardList = this.f11258b.getWebView().copyBackForwardList()) != null) {
                int currentIndex = copyBackForwardList.getCurrentIndex();
                String url = copyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = this.f11258b.getUrl();
                }
                String url2 = str.equals("backward") ? copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i10 = 1;
                if (str.equals("forward")) {
                    url2 = copyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(ImagesContract.URL, url);
                jSONObject2.putOpt("next_url", url2);
                if (copyBackForwardList.getCurrentIndex() != 0) {
                    i10 = 0;
                }
                jSONObject2.putOpt("first_page", Integer.valueOf(i10));
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.b.e.c(m.a(), this.f11259c, this.f11260d, str, jSONObject);
    }
}
