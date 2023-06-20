package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import tb.e;
import tb.h;
import tb.i;
import tb.q;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements i {
    public static /* synthetic */ d a(e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ d lambda$getComponents$0(e eVar) {
        return new d((Context) eVar.a(Context.class), (ob.e) eVar.a(ob.e.class), (tc.d) eVar.a(tc.d.class), ((com.google.firebase.abt.component.a) eVar.a(com.google.firebase.abt.component.a.class)).b("frc"), eVar.d(rb.a.class));
    }

    @Override // tb.i
    public List<tb.d<?>> getComponents() {
        return Arrays.asList(tb.d.c(d.class).b(q.j(Context.class)).b(q.j(ob.e.class)).b(q.j(tc.d.class)).b(q.j(com.google.firebase.abt.component.a.class)).b(q.i(rb.a.class)).f(new h() { // from class: dd.s
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return RemoteConfigRegistrar.a(eVar);
            }
        }).e().d(), cd.h.b("fire-rc", "21.0.2"));
    }
}
