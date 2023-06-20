package com.bytedance.sdk.component.adexpress.dynamic.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.b.d;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.g;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.dynamic.c.h;
import com.bytedance.sdk.component.adexpress.dynamic.c.i;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.f.e;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DynamicRender.java */
/* loaded from: classes.dex */
public class a implements d<DynamicRootView>, j {

    /* renamed from: a  reason: collision with root package name */
    private DynamicRootView f9490a;

    /* renamed from: b  reason: collision with root package name */
    private i f9491b;

    /* renamed from: c  reason: collision with root package name */
    private Context f9492c;

    /* renamed from: d  reason: collision with root package name */
    private f f9493d;

    /* renamed from: e  reason: collision with root package name */
    private g f9494e;

    /* renamed from: f  reason: collision with root package name */
    private l f9495f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f9496g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicBoolean f9497h = new AtomicBoolean(false);

    /* compiled from: DynamicRender.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class RunnableC0146a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f9504b;

        public RunnableC0146a(int i10) {
            this.f9504b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9504b == 2) {
                com.bytedance.sdk.component.utils.l.b("DynamicRender", "Dynamic parse time out");
                a.this.f9490a.a(a.this.f9491b instanceof h ? 127 : 117);
            }
        }
    }

    public a(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, i iVar, l lVar, com.bytedance.sdk.component.adexpress.dynamic.d.a aVar) {
        this.f9492c = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z10, lVar, aVar);
        this.f9490a = dynamicRootView;
        this.f9491b = iVar;
        this.f9495f = lVar;
        dynamicRootView.setRenderListener(this);
        this.f9495f = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f9495f.c().c(c());
        if (!com.bytedance.sdk.component.adexpress.a.b.a.a(this.f9495f.a())) {
            this.f9490a.a(this.f9491b instanceof h ? 123 : 113);
            return;
        }
        this.f9491b.a(new com.bytedance.sdk.component.adexpress.dynamic.d.b() { // from class: com.bytedance.sdk.component.adexpress.dynamic.a.a.2
            @Override // com.bytedance.sdk.component.adexpress.dynamic.d.b
            public void a(final com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
                a.this.h();
                a.this.f9495f.c().d(a.this.c());
                a.this.a(hVar);
                a.this.b(hVar);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.a.a.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.c(hVar);
                    }
                });
                a.this.f9490a.setBgColor(hVar.a());
            }
        });
        this.f9491b.a(this.f9495f);
    }

    private boolean g() {
        DynamicRootView dynamicRootView = this.f9490a;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f9496g;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f9496g.cancel(false);
                this.f9496g = null;
            }
            com.bytedance.sdk.component.utils.l.b("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public DynamicRootView d() {
        return this.f9490a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        if (hVar == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.b.h> j10 = hVar.j();
        if (j10 != null && j10.size() > 0) {
            for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2 : j10) {
                b(hVar2);
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.b.h k10 = hVar.k();
        if (k10 == null) {
            return;
        }
        hVar.c(hVar.e() - k10.e());
        hVar.d(hVar.f() - k10.f());
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    public void a(f fVar) {
        this.f9493d = fVar;
        int d10 = this.f9495f.d();
        if (d10 < 0) {
            this.f9490a.a(this.f9491b instanceof h ? 127 : 117);
            return;
        }
        this.f9496g = e.d().schedule(new RunnableC0146a(2), d10, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.h.b().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                a.this.f();
            }
        }, this.f9495f.j());
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    public int c() {
        return this.f9491b instanceof h ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        if (hVar == null) {
            this.f9490a.a(this.f9491b instanceof h ? 123 : 113);
            return;
        }
        this.f9495f.c().e(c());
        try {
            this.f9490a.a(hVar, c());
        } catch (Exception unused) {
            this.f9490a.a(this.f9491b instanceof h ? 128 : 118);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        List<com.bytedance.sdk.component.adexpress.dynamic.b.h> j10;
        if (hVar == null || (j10 = hVar.j()) == null || j10.size() <= 0) {
            return;
        }
        Collections.sort(j10, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.b.h>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.a.a.3
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2, com.bytedance.sdk.component.adexpress.dynamic.b.h hVar3) {
                com.bytedance.sdk.component.adexpress.dynamic.b.f e10 = hVar2.i().e();
                com.bytedance.sdk.component.adexpress.dynamic.b.f e11 = hVar3.i().e();
                if (e10 == null || e11 == null) {
                    return 0;
                }
                return e10.Z() >= e11.Z() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2 : j10) {
            if (hVar2 != null) {
                a(hVar2);
            }
        }
    }

    public void b() {
        a(e());
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    /* renamed from: a */
    public DynamicRootView e() {
        return d();
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i10 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i10 >= viewGroup.getChildCount()) {
                    break;
                }
                a(viewGroup.getChildAt(i10));
                i10++;
            }
        }
        if (view instanceof c) {
            ((c) view).b();
        }
    }

    public void a(g gVar) {
        this.f9494e = gVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.j
    public void a(m mVar) {
        if (this.f9497h.get()) {
            return;
        }
        this.f9497h.set(true);
        if (mVar.a() && g()) {
            this.f9490a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f9493d.a(e(), mVar);
            return;
        }
        this.f9493d.a(mVar.h());
    }

    @Override // com.bytedance.sdk.component.adexpress.b.j
    public void a(View view, int i10, com.bytedance.sdk.component.adexpress.b bVar) {
        g gVar = this.f9494e;
        if (gVar != null) {
            gVar.a(view, i10, bVar);
        }
    }
}
