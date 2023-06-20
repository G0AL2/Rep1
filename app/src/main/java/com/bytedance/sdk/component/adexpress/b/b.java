package com.bytedance.sdk.component.adexpress.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.i;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;

/* compiled from: DynamicRenderInterceptor.java */
/* loaded from: classes.dex */
public class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private Context f9374a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.a.a f9375b;

    /* renamed from: c  reason: collision with root package name */
    private ThemeStatusBroadcastReceiver f9376c;

    /* renamed from: d  reason: collision with root package name */
    private g f9377d;

    /* renamed from: e  reason: collision with root package name */
    private l f9378e;

    /* renamed from: f  reason: collision with root package name */
    private int f9379f;

    public b(Context context, l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.c.i iVar, g gVar, com.bytedance.sdk.component.adexpress.dynamic.d.a aVar) {
        this.f9374a = context;
        this.f9378e = lVar;
        this.f9376c = themeStatusBroadcastReceiver;
        this.f9377d = gVar;
        com.bytedance.sdk.component.adexpress.dynamic.a.a aVar2 = new com.bytedance.sdk.component.adexpress.dynamic.a.a(context, themeStatusBroadcastReceiver, z10, iVar, lVar, aVar);
        this.f9375b = aVar2;
        aVar2.a(this.f9377d);
        if (iVar instanceof com.bytedance.sdk.component.adexpress.dynamic.c.h) {
            this.f9379f = 3;
        } else {
            this.f9379f = 2;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void b() {
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void c() {
    }

    public com.bytedance.sdk.component.adexpress.dynamic.c d() {
        com.bytedance.sdk.component.adexpress.dynamic.a.a aVar = this.f9375b;
        if (aVar != null) {
            return aVar.d();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public boolean a(final i.a aVar) {
        this.f9378e.c().b(this.f9379f);
        this.f9375b.a(new f() { // from class: com.bytedance.sdk.component.adexpress.b.b.1
            @Override // com.bytedance.sdk.component.adexpress.b.f
            public void a(View view, m mVar) {
                if (aVar.c()) {
                    return;
                }
                b.this.f9378e.c().f(b.this.f9379f);
                b.this.f9378e.c().g(b.this.f9379f);
                b.this.f9378e.c().h();
                n b10 = aVar.b();
                if (b10 == null) {
                    return;
                }
                b10.a(b.this.f9375b, mVar);
                aVar.a(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.b.f
            public void a(int i10) {
                b.this.f9378e.c().a(b.this.f9379f, i10, aVar.b(b.this));
                if (aVar.b(b.this)) {
                    aVar.a(b.this);
                    return;
                }
                n b10 = aVar.b();
                if (b10 == null) {
                    return;
                }
                b10.a_(i10);
            }
        });
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void a() {
        com.bytedance.sdk.component.adexpress.dynamic.a.a aVar = this.f9375b;
        if (aVar != null) {
            aVar.b();
        }
    }
}
