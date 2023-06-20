package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView;
import com.bytedance.sdk.openadsdk.core.y;
import com.bytedance.sdk.openadsdk.utils.v;
import com.inmobi.media.au;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: BrandBannerController.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f12589a = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.b.1
        {
            add(".jpeg");
            add(".png");
            add(".bmp");
            add(".gif");
            add(".jpg");
            add(".webp");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private final Context f12590b;

    /* renamed from: c  reason: collision with root package name */
    private C0173b f12591c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.n f12592d;

    /* renamed from: e  reason: collision with root package name */
    private NativeExpressView f12593e;

    /* renamed from: f  reason: collision with root package name */
    private int f12594f;

    /* renamed from: g  reason: collision with root package name */
    private int f12595g;

    /* compiled from: BrandBannerController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.nativeexpress.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0173b implements com.bytedance.sdk.component.adexpress.b.d<View>, c {

        /* renamed from: c  reason: collision with root package name */
        WeakReference<ImageView> f12601c;

        /* renamed from: d  reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.dislike.b f12602d;

        /* renamed from: e  reason: collision with root package name */
        private TTDislikeDialogAbstract f12603e;

        /* renamed from: f  reason: collision with root package name */
        private String f12604f;

        /* renamed from: g  reason: collision with root package name */
        private final Context f12605g;

        /* renamed from: h  reason: collision with root package name */
        private final int f12606h;

        /* renamed from: i  reason: collision with root package name */
        private final int f12607i;

        /* renamed from: j  reason: collision with root package name */
        private FrameLayout f12608j;

        /* renamed from: k  reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.core.e.n f12609k;

        /* renamed from: l  reason: collision with root package name */
        private n f12610l;

        /* renamed from: m  reason: collision with root package name */
        private int f12611m;

        /* renamed from: n  reason: collision with root package name */
        private SSWebView f12612n;

        /* renamed from: o  reason: collision with root package name */
        private com.bytedance.sdk.component.adexpress.b.f f12613o;

        /* renamed from: q  reason: collision with root package name */
        private List<String> f12615q;

        /* renamed from: a  reason: collision with root package name */
        AtomicBoolean f12599a = new AtomicBoolean(false);

        /* renamed from: b  reason: collision with root package name */
        AtomicBoolean f12600b = new AtomicBoolean(false);

        /* renamed from: p  reason: collision with root package name */
        private int f12614p = 0;

        public C0173b(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, int i10, int i11) {
            this.f12605g = context;
            this.f12606h = i10;
            this.f12607i = i11;
            this.f12609k = nVar;
            this.f12611m = v.e(context, 3.0f);
            this.f12610l = new n(context);
            f();
        }

        private void f() {
            FrameLayout frameLayout = new FrameLayout(this.f12605g);
            this.f12608j = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.f12606h, this.f12607i);
            }
            layoutParams.width = this.f12606h;
            layoutParams.height = this.f12607i;
            layoutParams.gravity = 17;
            this.f12608j.setLayoutParams(layoutParams);
            this.f12608j.addView(i());
            this.f12608j.addView(g());
            ImageView h10 = h();
            this.f12608j.addView(h10);
            this.f12601c = new WeakReference<>(h10);
        }

        private View g() {
            View inflate = LayoutInflater.from(this.f12605g).inflate(t.f(this.f12605g, "tt_backup_ad1"), (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            int i10 = this.f12611m;
            layoutParams.topMargin = i10;
            layoutParams.leftMargin = i10;
            inflate.setLayoutParams(layoutParams);
            inflate.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.b.b.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.a(C0173b.this.f12605g, C0173b.this.f12609k, "banner_ad");
                }
            });
            return inflate;
        }

        private ImageView h() {
            ImageView imageView = new ImageView(this.f12605g);
            imageView.setImageDrawable(this.f12605g.getResources().getDrawable(t.d(this.f12605g, "tt_dislike_icon2")));
            int e10 = v.e(this.f12605g, 15.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e10, e10);
            layoutParams.gravity = 8388613;
            int i10 = this.f12611m;
            layoutParams.rightMargin = i10;
            layoutParams.topMargin = i10;
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.b.b.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    C0173b.this.b();
                }
            });
            return imageView;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private SSWebView i() {
            SSWebView b10 = com.bytedance.sdk.openadsdk.core.nativeexpress.c.a().b();
            this.f12612n = b10;
            if (b10 == null) {
                this.f12612n = new SSWebView(this.f12605g);
            }
            com.bytedance.sdk.openadsdk.core.nativeexpress.c.a().c(this.f12612n);
            this.f12612n.setWebViewClient(new a(this.f12610l, this));
            this.f12612n.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.b.b.3
                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i10) {
                    if (C0173b.this.f12600b.get()) {
                        return;
                    }
                    super.onProgressChanged(webView, i10);
                    if (C0173b.this.f12614p == 0 && i10 >= 75) {
                        C0173b.this.d();
                        C0173b.this.f12600b.set(true);
                    }
                    if (i10 != 100 || C0173b.this.f12615q == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        for (String str : C0173b.this.f12615q) {
                            jSONArray.put(str);
                        }
                        jSONObject.put("error_url", jSONArray);
                        com.bytedance.sdk.openadsdk.b.e.b(C0173b.this.f12605g, C0173b.this.f12609k, "banner_ad", "html_banner_error_url", jSONObject);
                        C0173b.this.f12615q = null;
                    } catch (Exception unused) {
                    }
                }
            });
            this.f12612n.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.b.b.4
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    C0173b.this.f12610l.onTouchEvent(motionEvent);
                    return false;
                }
            });
            this.f12612n.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f12612n;
        }

        @Override // com.bytedance.sdk.component.adexpress.b.d
        public int c() {
            return 5;
        }

        public void b() {
            TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f12603e;
            if (tTDislikeDialogAbstract != null) {
                tTDislikeDialogAbstract.show();
                return;
            }
            com.bytedance.sdk.openadsdk.dislike.b bVar = this.f12602d;
            if (bVar != null) {
                bVar.showDislikeDialog();
            } else {
                TTDelegateActivity.a(this.f12609k, this.f12604f);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.b.c
        public void c(String str) {
            if (this.f12615q == null) {
                this.f12615q = new ArrayList();
            }
            this.f12615q.add(str);
        }

        public void d() {
            if (this.f12613o != null) {
                com.bytedance.sdk.component.adexpress.b.m mVar = new com.bytedance.sdk.component.adexpress.b.m();
                mVar.a(true);
                mVar.a(v.d(this.f12605g, this.f12606h));
                mVar.b(v.d(this.f12605g, this.f12607i));
                this.f12613o.a(this.f12608j, mVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.b.d
        public View e() {
            return this.f12608j;
        }

        @Override // com.bytedance.sdk.component.adexpress.b.d
        public void a(com.bytedance.sdk.component.adexpress.b.f fVar) {
            if (this.f12599a.get()) {
                return;
            }
            this.f12600b.set(false);
            if (this.f12605g == null) {
                fVar.a(106);
                return;
            }
            this.f12614p = 0;
            this.f12613o = fVar;
            this.f12612n.a(null, this.f12609k.az(), "text/html", "UTF-8", null);
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.b.c
        public void b(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!(str.contains("play.google.com/store/apps/details?id=") ? r3.b.d(this.f12605g, str.substring(str.indexOf("?id=") + 4)) : false)) {
                y.a(this.f12605g, this.f12609k, -1, (TTNativeAd) null, (TTNativeExpressAd) null, "", true, str);
            }
            if (this.f12610l != null) {
                WeakReference<ImageView> weakReference = this.f12601c;
                com.bytedance.sdk.openadsdk.core.e.g a10 = this.f12610l.a(this.f12605g, (View) this.f12608j.getParent(), weakReference != null ? weakReference.get() : null);
                HashMap hashMap = new HashMap();
                hashMap.put("click_scence", 1);
                com.bytedance.sdk.openadsdk.b.e.a(this.f12605g, au.CLICK_BEACON, this.f12609k, a10, "banner_ad", true, (Map<String, Object>) hashMap, this.f12610l.b() ? 1 : 2);
            }
            n nVar = this.f12610l;
            if (nVar != null) {
                nVar.a();
            }
        }

        public void a() {
            this.f12608j = null;
            this.f12602d = null;
            this.f12603e = null;
            this.f12613o = null;
            this.f12609k = null;
            this.f12610l = null;
            if (this.f12612n != null) {
                com.bytedance.sdk.openadsdk.core.nativeexpress.c.a().a(this.f12612n);
            }
            this.f12599a.set(true);
            this.f12600b.set(false);
        }

        public void a(TTAdDislike tTAdDislike) {
            if (tTAdDislike instanceof com.bytedance.sdk.openadsdk.dislike.b) {
                this.f12602d = (com.bytedance.sdk.openadsdk.dislike.b) tTAdDislike;
            }
        }

        public void a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.e.n nVar;
            if (tTDislikeDialogAbstract != null && (nVar = this.f12609k) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(nVar);
            }
            this.f12603e = tTDislikeDialogAbstract;
        }

        public void a(String str) {
            this.f12604f = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.b.c
        public void a(int i10, int i11) {
            this.f12614p = i11;
            com.bytedance.sdk.component.adexpress.b.f fVar = this.f12613o;
            if (fVar != null) {
                fVar.a(i10);
            }
            com.bytedance.sdk.openadsdk.b.e.a(this.f12605g, this.f12609k, "banner_ad", "render_html_fail");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BrandBannerController.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i10, int i11);

        void b(String str);

        void c(String str);
    }

    public b(Context context, NativeExpressView nativeExpressView, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f12590b = context;
        this.f12593e = nativeExpressView;
        a(nativeExpressView);
        this.f12591c = new C0173b(context, nVar, this.f12594f, this.f12595g);
    }

    private void a(NativeExpressView nativeExpressView) {
        k a10 = BannerExpressBackupView.a(nativeExpressView.getExpectExpressWidth(), nativeExpressView.getExpectExpressHeight());
        if (nativeExpressView.getExpectExpressWidth() > 0 && nativeExpressView.getExpectExpressHeight() > 0) {
            this.f12594f = v.e(this.f12590b, nativeExpressView.getExpectExpressWidth());
            this.f12595g = v.e(this.f12590b, nativeExpressView.getExpectExpressHeight());
        } else {
            int c10 = v.c(this.f12590b);
            this.f12594f = c10;
            this.f12595g = Float.valueOf(c10 / a10.f12652b).intValue();
        }
        int i10 = this.f12594f;
        if (i10 <= 0 || i10 <= v.c(this.f12590b)) {
            return;
        }
        float c11 = v.c(this.f12590b) / this.f12594f;
        this.f12594f = v.c(this.f12590b);
        this.f12595g = Float.valueOf(this.f12595g * c11).intValue();
    }

    public void b() {
        C0173b c0173b = this.f12591c;
        if (c0173b != null) {
            c0173b.a();
            this.f12591c = null;
        }
        this.f12592d = null;
        this.f12593e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BrandBannerController.java */
    /* loaded from: classes.dex */
    public static class a extends SSWebView.a {

        /* renamed from: a  reason: collision with root package name */
        n f12597a;

        /* renamed from: b  reason: collision with root package name */
        c f12598b;

        public a(n nVar, c cVar) {
            this.f12597a = nVar;
            this.f12598b = cVar;
        }

        private void a(String str, int i10, String str2) {
            c cVar = this.f12598b;
            if (cVar != null) {
                cVar.a(106, i10);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT < 23 || webResourceRequest == null || !webResourceRequest.isForMainFrame() || webResourceError == null) {
                return;
            }
            a(webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null, webResourceError.getErrorCode(), webResourceError.getDescription().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String uri;
            int lastIndexOf;
            c cVar;
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || Build.VERSION.SDK_INT < 21 || !webResourceRequest.isForMainFrame() || webResourceRequest.getUrl() == null || (lastIndexOf = (uri = webResourceRequest.getUrl().toString()).lastIndexOf(".")) <= 0) {
                return;
            }
            if (!b.f12589a.contains(uri.substring(lastIndexOf).toLowerCase()) || (cVar = this.f12598b) == null) {
                return;
            }
            cVar.c(uri);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            c cVar;
            n nVar = this.f12597a;
            if (nVar == null || !nVar.b() || (cVar = this.f12598b) == null) {
                return false;
            }
            cVar.b(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            if (Build.VERSION.SDK_INT < 23) {
                a(str2, i10, str);
            }
        }
    }

    public void a(com.bytedance.sdk.component.adexpress.b.n nVar) {
        this.f12592d = nVar;
    }

    public void a() {
        C0173b c0173b = this.f12591c;
        if (c0173b != null) {
            c0173b.a(new com.bytedance.sdk.component.adexpress.b.f() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.b.2
                @Override // com.bytedance.sdk.component.adexpress.b.f
                public void a(View view, com.bytedance.sdk.component.adexpress.b.m mVar) {
                    if (b.this.f12593e == null || view == null) {
                        if (b.this.f12592d != null) {
                            b.this.f12592d.a_(106);
                            return;
                        }
                        return;
                    }
                    b.this.f12593e.removeView(view);
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    b.this.f12593e.addView(view, new ViewGroup.LayoutParams(-1, -1));
                    if (b.this.f12592d != null) {
                        b.this.f12592d.a(b.this.f12591c, mVar);
                    }
                }

                @Override // com.bytedance.sdk.component.adexpress.b.f
                public void a(int i10) {
                    if (b.this.f12592d != null) {
                        b.this.f12592d.a_(106);
                    }
                }
            });
            return;
        }
        com.bytedance.sdk.component.adexpress.b.n nVar = this.f12592d;
        if (nVar != null) {
            nVar.a_(106);
        }
    }

    public void a(TTAdDislike tTAdDislike) {
        C0173b c0173b = this.f12591c;
        if (c0173b != null) {
            c0173b.a(tTAdDislike);
        }
    }

    public void a(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        C0173b c0173b = this.f12591c;
        if (c0173b != null) {
            c0173b.a(tTDislikeDialogAbstract);
        }
    }

    public void a(String str) {
        C0173b c0173b = this.f12591c;
        if (c0173b != null) {
            c0173b.a(str);
        }
    }
}
