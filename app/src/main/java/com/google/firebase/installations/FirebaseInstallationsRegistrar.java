package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import qc.j;
import tb.q;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements tb.i {
    public static /* synthetic */ tc.d a(tb.e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ tc.d lambda$getComponents$0(tb.e eVar) {
        return new c((ob.e) eVar.a(ob.e.class), eVar.d(j.class));
    }

    @Override // tb.i
    public List<tb.d<?>> getComponents() {
        return Arrays.asList(tb.d.c(tc.d.class).b(q.j(ob.e.class)).b(q.i(j.class)).f(new tb.h() { // from class: tc.e
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return FirebaseInstallationsRegistrar.a(eVar);
            }
        }).d(), qc.i.a(), cd.h.b("fire-installations", "17.0.1"));
    }
}
