package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.openadsdk.b.u;
import java.util.Map;

/* compiled from: ExpressRenderEventMonitor.java */
/* loaded from: classes.dex */
public class i implements com.bytedance.sdk.component.adexpress.b.h {

    /* renamed from: a  reason: collision with root package name */
    private u f12642a;

    /* renamed from: b  reason: collision with root package name */
    private String f12643b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f12644c;

    /* renamed from: d  reason: collision with root package name */
    private String f12645d;

    /* renamed from: e  reason: collision with root package name */
    private long f12646e;

    /* renamed from: f  reason: collision with root package name */
    private long f12647f;

    public i(u uVar, String str, com.bytedance.sdk.openadsdk.core.e.n nVar, String str2) {
        this.f12642a = uVar;
        this.f12643b = str;
        this.f12645d = str2;
        this.f12644c = nVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void d(int i10) {
        if (i10 == 3) {
            this.f12642a.d("dynamic_sub_analysis2_end");
        } else {
            this.f12642a.d("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void e(int i10) {
        if (i10 == 3) {
            this.f12642a.d("dynamic_sub_render2_start");
        } else {
            this.f12642a.d("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void f(int i10) {
        if (i10 == 3) {
            this.f12642a.d("dynamic_sub_render2_end");
        } else {
            this.f12642a.d("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void g(int i10) {
        final String str;
        this.f12647f = System.currentTimeMillis();
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "dynamic render success render type: " + i10 + "; ****cost time(ms): " + (this.f12647f - this.f12646e) + "****");
        if (i10 == 3) {
            this.f12642a.e("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.f12642a.e("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.f12642a.a(true);
        com.bytedance.sdk.component.f.e.b(new com.bytedance.sdk.component.f.g("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.i.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.b.e.c(com.bytedance.sdk.openadsdk.core.m.a(), i.this.f12644c, i.this.f12643b, str, (Map<String, Object>) null);
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void h() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "render success");
        this.f12642a.b();
    }

    public void i() {
        this.f12642a.l();
        this.f12642a.m();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void a() {
        this.f12642a.a();
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "start render ");
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void b() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "WebView start load");
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void c() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "webview render success");
        this.f12642a.b();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void b(int i10) {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "dynamic start render");
        this.f12646e = System.currentTimeMillis();
        if (i10 == 3) {
            this.f12642a.c("dynamic_render2_start");
        } else {
            this.f12642a.c("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void d() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "native render start");
        this.f12642a.c();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void e() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "native success");
        this.f12642a.a(true);
        this.f12642a.n();
        com.bytedance.sdk.component.f.e.b(new com.bytedance.sdk.component.f.g("native_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.i.2
            @Override // java.lang.Runnable
            public void run() {
                h.a(i.this.f12643b, i.this.f12645d, i.this.f12644c);
                com.bytedance.sdk.openadsdk.b.e.c(com.bytedance.sdk.openadsdk.core.m.a(), i.this.f12644c, i.this.f12643b, "dynamic_backup_render", (Map<String, Object>) null);
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void f() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "no native render");
        this.f12642a.o();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void a(boolean z10) {
        this.f12642a.b(z10 ? 1 : 0);
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "webview start request");
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void c(int i10) {
        if (i10 == 3) {
            this.f12642a.d("dynamic_sub_analysis2_start");
        } else {
            this.f12642a.d("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void a(int i10) {
        this.f12642a.a(i10);
        h.a(i10, this.f12643b, this.f12645d, this.f12644c);
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "WebView render fail");
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void g() {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "render fail");
        this.f12642a.p();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.h
    public void a(int i10, int i11, boolean z10) {
        com.bytedance.sdk.component.utils.l.b("ExpressRenderEvent", "dynamic fail");
        if (!z10) {
            this.f12642a.a(true);
        }
        if (i10 == 3) {
            this.f12642a.b(i11, "dynamic_render2_error");
        } else {
            this.f12642a.b(i11, "dynamic_render_error");
        }
        h.a(i11, this.f12643b, this.f12645d, this.f12644c);
    }
}
