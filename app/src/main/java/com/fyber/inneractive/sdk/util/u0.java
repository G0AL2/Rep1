package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    public volatile String f20336a = null;

    /* renamed from: b  reason: collision with root package name */
    public Context f20337b = null;

    /* renamed from: c  reason: collision with root package name */
    public AtomicBoolean f20338c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f20339d = new a();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.e();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20341a;

        public b(String str) {
            this.f20341a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.f20337b.getSharedPreferences("fyber.ua", 0).edit().putString("ua", this.f20341a).apply();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0 u0Var = u0.this;
            Context context = u0Var.f20337b;
            if (context != null) {
                String str = null;
                try {
                    str = WebSettings.getDefaultUserAgent(context);
                } catch (Throwable unused) {
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                u0Var.a(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u0.this.b();
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f20336a)) {
            Runnable runnable = this.f20339d;
            if (runnable != null) {
                Handler handler = n.f20310b;
                handler.removeCallbacks(runnable);
                handler.postDelayed(this.f20339d, 50L);
            }
            return System.getProperty("http.agent");
        }
        return this.f20336a;
    }

    public final void b() {
        WebView webView;
        String str = null;
        try {
            webView = new WebView(this.f20337b);
            try {
                str = webView.getSettings().getUserAgentString();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            webView = null;
        }
        if (!TextUtils.isEmpty(str)) {
            a(str);
        }
        if (webView != null) {
            webView.destroy();
        }
    }

    public final void c() {
        if (this.f20337b == null || !TextUtils.isEmpty(this.f20336a)) {
            return;
        }
        this.f20336a = this.f20337b.getSharedPreferences("fyber.ua", 0).getString("ua", null);
        if (!TextUtils.isEmpty(this.f20336a)) {
            IAlog.a("UserAgentProvider | populated user agent from shared prefs", new Object[0]);
            this.f20338c.compareAndSet(false, true);
        }
        e();
    }

    public void d() {
        Context context;
        c();
        if (this.f20338c.get() || Build.VERSION.SDK_INT < 17 || (context = this.f20337b) == null) {
            return;
        }
        String str = null;
        try {
            str = WebSettings.getDefaultUserAgent(context);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(str);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 17) {
            n.a(new c());
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            n.f20310b.post(new d());
        }
    }

    public final void a(String str) {
        this.f20336a = str;
        if (!TextUtils.isEmpty(this.f20336a)) {
            IAlog.a("UserAgentProvider | populated user agent form updateUserAgentIfPossible", new Object[0]);
            this.f20338c.compareAndSet(false, true);
        }
        n.a(new b(str));
    }
}
