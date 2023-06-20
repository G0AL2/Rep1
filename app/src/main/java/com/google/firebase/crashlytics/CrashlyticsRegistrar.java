package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import tb.e;
import tb.h;
import tb.i;
import tb.q;
import tc.d;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements i {
    public static /* synthetic */ a a(CrashlyticsRegistrar crashlyticsRegistrar, e eVar) {
        return crashlyticsRegistrar.b(eVar);
    }

    public a b(e eVar) {
        return a.a((ob.e) eVar.a(ob.e.class), (d) eVar.a(d.class), eVar.e(vb.a.class), eVar.e(rb.a.class));
    }

    @Override // tb.i
    public List<tb.d<?>> getComponents() {
        return Arrays.asList(tb.d.c(a.class).b(q.j(ob.e.class)).b(q.j(d.class)).b(q.a(vb.a.class)).b(q.a(rb.a.class)).f(new h() { // from class: ub.f
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return CrashlyticsRegistrar.a(CrashlyticsRegistrar.this, eVar);
            }
        }).e().d(), cd.h.b("fire-cls", "18.2.9"));
    }
}
