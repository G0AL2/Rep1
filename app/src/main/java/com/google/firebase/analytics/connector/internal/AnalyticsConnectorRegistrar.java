package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;
import tb.h;
import tb.i;
import tb.q;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
@Keep
@KeepForSdk
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements i {
    public static /* synthetic */ rb.a lambda$getComponents$0(tb.e eVar) {
        return rb.b.h((ob.e) eVar.a(ob.e.class), (Context) eVar.a(Context.class), (pc.d) eVar.a(pc.d.class));
    }

    @Override // tb.i
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<tb.d<?>> getComponents() {
        return Arrays.asList(tb.d.c(rb.a.class).b(q.j(ob.e.class)).b(q.j(Context.class)).b(q.j(pc.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // tb.h
            public final Object a(tb.e eVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(eVar);
            }
        }).e().d(), cd.h.b("fire-analytics", "20.1.2"));
    }
}
