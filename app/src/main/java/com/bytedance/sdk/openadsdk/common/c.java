package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: LandingPageNewStyleManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private n f11249a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f11250b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11251c;

    /* renamed from: d  reason: collision with root package name */
    private SSWebView f11252d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f11253e;

    /* renamed from: f  reason: collision with root package name */
    private final String f11254f;

    /* renamed from: g  reason: collision with root package name */
    private f f11255g;

    /* renamed from: h  reason: collision with root package name */
    private d f11256h;

    public c(Context context, n nVar, String str) {
        this.f11251c = context;
        this.f11249a = nVar;
        this.f11254f = str;
        f();
    }

    private void f() {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(this.f11251c).inflate(t.f(this.f11251c, "tt_activity_endcard_landingpage_newstyle"), (ViewGroup) null, false);
        this.f11250b = relativeLayout;
        this.f11252d = (SSWebView) relativeLayout.findViewById(t.e(this.f11251c, "tt_browser_webview"));
        f fVar = new f(this.f11251c, (RelativeLayout) this.f11250b.findViewById(t.e(this.f11251c, "tt_title_bar")), this.f11249a);
        this.f11255g = fVar;
        this.f11253e = fVar.c();
        this.f11256h = new d(this.f11251c, (LinearLayout) this.f11250b.findViewById(t.e(this.f11251c, "tt_bottom_bar")), this.f11252d, this.f11249a, this.f11254f);
    }

    public void a() {
        f fVar = this.f11255g;
        if (fVar != null) {
            fVar.a();
        }
        d dVar = this.f11256h;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void b() {
        f fVar = this.f11255g;
        if (fVar != null) {
            fVar.b();
        }
        d dVar = this.f11256h;
        if (dVar != null) {
            dVar.b();
        }
    }

    public ImageView c() {
        return this.f11253e;
    }

    public SSWebView d() {
        return this.f11252d;
    }

    public View e() {
        return this.f11250b;
    }

    public void a(WebView webView, int i10) {
        f fVar = this.f11255g;
        if (fVar != null) {
            fVar.a(webView, i10);
        }
        d dVar = this.f11256h;
        if (dVar != null) {
            dVar.a(webView);
        }
    }
}
