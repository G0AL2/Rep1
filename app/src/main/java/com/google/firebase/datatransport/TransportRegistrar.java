package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import tb.d;
import tb.e;
import tb.h;
import tb.i;
import tb.q;
import u7.g;
import w7.t;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements i {
    public static /* synthetic */ g a(e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        t.f((Context) eVar.a(Context.class));
        return t.c().g(a.f20971g);
    }

    @Override // tb.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(g.class).b(q.j(Context.class)).f(new h() { // from class: jc.a
            @Override // tb.h
            public final Object a(e eVar) {
                return TransportRegistrar.a(eVar);
            }
        }).d(), cd.h.b("fire-transport", "18.1.2"));
    }
}
