package com.bytedance.sdk.component.adexpress.d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.g;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.k;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: BaseWebViewRender.java */
/* loaded from: classes.dex */
public abstract class a implements com.bytedance.sdk.component.adexpress.a, com.bytedance.sdk.component.adexpress.b.d<SSWebView>, j, com.bytedance.sdk.component.adexpress.theme.a {

    /* renamed from: a  reason: collision with root package name */
    protected SSWebView f9462a;

    /* renamed from: c  reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.a.c.b f9464c;

    /* renamed from: e  reason: collision with root package name */
    private Context f9466e;

    /* renamed from: f  reason: collision with root package name */
    private String f9467f;

    /* renamed from: g  reason: collision with root package name */
    private JSONObject f9468g;

    /* renamed from: h  reason: collision with root package name */
    private String f9469h;

    /* renamed from: i  reason: collision with root package name */
    private f f9470i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9471j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9472k;

    /* renamed from: l  reason: collision with root package name */
    private g f9473l;

    /* renamed from: m  reason: collision with root package name */
    private l f9474m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9475n;

    /* renamed from: o  reason: collision with root package name */
    private int f9476o;

    /* renamed from: b  reason: collision with root package name */
    protected int f9463b = 8;

    /* renamed from: d  reason: collision with root package name */
    protected AtomicBoolean f9465d = new AtomicBoolean(false);

    public a(Context context, l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.f9471j = false;
        this.f9466e = context;
        this.f9474m = lVar;
        this.f9467f = lVar.b();
        this.f9468g = lVar.a();
        themeStatusBroadcastReceiver.a(this);
        SSWebView b10 = e.a().b();
        this.f9462a = b10;
        if (b10 == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.c.a() != null) {
                this.f9462a = new SSWebView(com.bytedance.sdk.component.adexpress.c.a());
                return;
            }
            return;
        }
        this.f9471j = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private void c(int i10) {
        f fVar = this.f9470i;
        if (fVar != null) {
            fVar.a(i10);
        }
    }

    public abstract void a(int i10);

    @Override // com.bytedance.sdk.component.adexpress.b.d
    /* renamed from: b */
    public SSWebView e() {
        return a();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    public int c() {
        return 0;
    }

    public void d() {
        if (this.f9465d.get()) {
            return;
        }
        this.f9465d.set(true);
        g();
        if (this.f9462a.getParent() != null) {
            ((ViewGroup) this.f9462a.getParent()).removeView(this.f9462a);
        }
        if (this.f9472k) {
            e.a().a(this.f9462a);
        } else {
            e.a().c(this.f9462a);
        }
    }

    public void f() {
        if (a() == null) {
            return;
        }
        try {
            a().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public abstract void g();

    public void h() {
    }

    public void i() {
    }

    public void j() {
        k();
        Activity a10 = com.bytedance.sdk.component.utils.b.a(this.f9462a);
        if (a10 != null) {
            this.f9476o = a10.hashCode();
        }
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
    }

    public void a(String str) {
        this.f9469h = str;
    }

    public SSWebView a() {
        return this.f9462a;
    }

    public void a(g gVar) {
        this.f9473l = gVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    public void a(f fVar) {
        this.f9470i = fVar;
        if (a() != null && a().getWebView() != null) {
            if (!com.bytedance.sdk.component.adexpress.a.b.a.f()) {
                this.f9470i.a(102);
                return;
            } else if (TextUtils.isEmpty(this.f9469h)) {
                this.f9470i.a(102);
                return;
            } else if (this.f9464c == null && !com.bytedance.sdk.component.adexpress.a.b.a.a(this.f9468g)) {
                this.f9470i.a(103);
                return;
            } else {
                this.f9474m.c().a(this.f9471j);
                if (this.f9471j) {
                    try {
                        this.f9462a.m();
                        this.f9474m.c().b();
                        k.a(this.f9462a.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                        return;
                    } catch (Exception unused) {
                        com.bytedance.sdk.component.utils.l.b("WebViewRender", "reuse webview load fail ");
                        e.a().c(this.f9462a);
                        this.f9470i.a(102);
                        return;
                    }
                }
                SSWebView a10 = a();
                a10.m();
                this.f9474m.c().b();
                a10.a(this.f9469h);
                return;
            }
        }
        this.f9470i.a(102);
    }

    public void a(boolean z10) {
        this.f9475n = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.j
    public void a(final m mVar) {
        if (mVar == null) {
            this.f9470i.a(105);
            return;
        }
        boolean a10 = mVar.a();
        final float b10 = (float) mVar.b();
        final float c10 = (float) mVar.c();
        if (b10 > 0.0f && c10 > 0.0f) {
            this.f9472k = a10;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a(mVar, b10, c10);
                return;
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.a(mVar, b10, c10);
                    }
                });
                return;
            }
        }
        this.f9470i.a(105);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(m mVar, float f10, float f11) {
        if (this.f9472k && !this.f9475n) {
            a(f10, f11);
            a(this.f9463b);
            f fVar = this.f9470i;
            if (fVar != null) {
                fVar.a(a(), mVar);
                return;
            }
            return;
        }
        e.a().c(this.f9462a);
        c(mVar.h());
    }

    @Override // com.bytedance.sdk.component.adexpress.b.j
    public void a(View view, int i10, com.bytedance.sdk.component.adexpress.b bVar) {
        g gVar = this.f9473l;
        if (gVar != null) {
            gVar.a(view, i10, bVar);
        }
    }

    private void a(float f10, float f11) {
        this.f9474m.c().c();
        int a10 = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9466e, f10);
        int a11 = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9466e, f11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(a10, a11);
        }
        layoutParams.width = a10;
        layoutParams.height = a11;
        a().setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.a
    public void a(Activity activity) {
        if (this.f9476o == 0 || activity == null || activity.hashCode() != this.f9476o) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b("WebViewRender", "release from activity onDestroy");
        d();
        l();
    }
}
