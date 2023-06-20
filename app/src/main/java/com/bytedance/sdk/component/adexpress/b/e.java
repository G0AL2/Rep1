package com.bytedance.sdk.component.adexpress.b;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.i;

/* compiled from: NativeRenderInterceptor.java */
/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: a  reason: collision with root package name */
    private Context f9382a;

    /* renamed from: b  reason: collision with root package name */
    private a f9383b;

    /* renamed from: c  reason: collision with root package name */
    private l f9384c;

    public e(Context context, l lVar, a aVar) {
        this.f9382a = context;
        this.f9383b = aVar;
        this.f9384c = lVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void a() {
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void b() {
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public void c() {
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i
    public boolean a(final i.a aVar) {
        this.f9384c.c().d();
        this.f9383b.a(new f() { // from class: com.bytedance.sdk.component.adexpress.b.e.1
            @Override // com.bytedance.sdk.component.adexpress.b.f
            public void a(View view, m mVar) {
                if (aVar.c()) {
                    return;
                }
                n b10 = aVar.b();
                if (b10 != null) {
                    b10.a(e.this.f9383b, mVar);
                }
                aVar.a(true);
            }

            @Override // com.bytedance.sdk.component.adexpress.b.f
            public void a(int i10) {
                n b10 = aVar.b();
                if (b10 != null) {
                    b10.a_(i10);
                }
            }
        });
        return true;
    }

    public void a(c cVar) {
        this.f9383b.a(cVar);
    }
}
