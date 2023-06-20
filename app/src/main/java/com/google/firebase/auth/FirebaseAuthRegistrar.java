package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class FirebaseAuthRegistrar implements tb.i {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(tb.e eVar) {
        return new sb.p0((ob.e) eVar.a(ob.e.class), eVar.d(qc.j.class));
    }

    @Override // tb.i
    @Keep
    public List<tb.d<?>> getComponents() {
        return Arrays.asList(tb.d.d(FirebaseAuth.class, sb.b.class).b(tb.q.j(ob.e.class)).b(tb.q.k(qc.j.class)).f(new tb.h() { // from class: com.google.firebase.auth.e1
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(eVar);
            }
        }).e().d(), qc.i.a(), cd.h.b("fire-auth", "21.0.3"));
    }
}
