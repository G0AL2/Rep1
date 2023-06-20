package com.fyber.inneractive.sdk.cache;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.m0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public long f16825a;

    /* renamed from: b  reason: collision with root package name */
    public String f16826b;

    /* renamed from: c  reason: collision with root package name */
    public String f16827c;

    /* renamed from: d  reason: collision with root package name */
    public String f16828d;

    public void a() {
        if (TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - this.f16825a) >= 60) {
            IAConfigManager iAConfigManager = IAConfigManager.J;
            if (iAConfigManager.f16886v.f16987b.a("use_js_inline", false)) {
                Application application = l.f20301a;
                if (application == null) {
                    IAlog.e("fetchJS() failed context null", new Object[0]);
                    return;
                }
                this.f16825a = System.currentTimeMillis();
                f0 f0Var = new f0(new d(this), application, new c("https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js", "MRAID-VIDEO.js"));
                iAConfigManager.f16884t.f17705a.offer(f0Var);
                m0 m0Var = m0.QUEUED;
                f0Var.a(m0Var);
                f0 f0Var2 = new f0(new e(this), application, new c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css", "centering_v1.css"));
                iAConfigManager.f16884t.f17705a.offer(f0Var2);
                f0Var2.a(m0Var);
                f0 f0Var3 = new f0(new f(this), application, new c("https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js", "centering_v1.js"));
                iAConfigManager.f16884t.f17705a.offer(f0Var3);
                f0Var3.a(m0Var);
            }
        }
    }
}
