package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements tb.i {
    public static /* synthetic */ FirebaseMessaging a(tb.e eVar) {
        return lambda$getComponents$0(eVar);
    }

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(tb.e eVar) {
        return new FirebaseMessaging((ob.e) eVar.a(ob.e.class), (rc.a) eVar.a(rc.a.class), eVar.d(cd.i.class), eVar.d(qc.k.class), (tc.d) eVar.a(tc.d.class), (u7.g) eVar.a(u7.g.class), (pc.d) eVar.a(pc.d.class));
    }

    @Override // tb.i
    @Keep
    public List<tb.d<?>> getComponents() {
        return Arrays.asList(tb.d.c(FirebaseMessaging.class).b(tb.q.j(ob.e.class)).b(tb.q.h(rc.a.class)).b(tb.q.i(cd.i.class)).b(tb.q.i(qc.k.class)).b(tb.q.h(u7.g.class)).b(tb.q.j(tc.d.class)).b(tb.q.j(pc.d.class)).f(new tb.h() { // from class: com.google.firebase.messaging.z
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return FirebaseMessagingRegistrar.a(eVar);
            }
        }).c().d(), cd.h.b("fire-fcm", "23.0.3"));
    }
}
