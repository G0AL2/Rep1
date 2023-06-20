package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import java.util.Arrays;
import java.util.List;
import tb.d;
import tb.e;
import tb.h;
import tb.i;
import tb.q;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements i {
    public static /* synthetic */ a a(e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ a lambda$getComponents$0(e eVar) {
        return new a((Context) eVar.a(Context.class), eVar.d(rb.a.class));
    }

    @Override // tb.i
    public List<d<?>> getComponents() {
        return Arrays.asList(d.c(a.class).b(q.j(Context.class)).b(q.i(rb.a.class)).f(new h() { // from class: qb.a
            @Override // tb.h
            public final Object a(e eVar) {
                return AbtRegistrar.a(eVar);
            }
        }).d(), cd.h.b("fire-abt", "21.0.1"));
    }
}
