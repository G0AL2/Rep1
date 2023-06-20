package com.fyber.inneractive.sdk.factories;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f17185a = new HashSet();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(InneractiveAdSpot inneractiveAdSpot);

        com.fyber.inneractive.sdk.interfaces.c b(InneractiveAdSpot inneractiveAdSpot);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static c f17186a = new c();
    }

    public com.fyber.inneractive.sdk.interfaces.c a(InneractiveAdSpot inneractiveAdSpot) {
        for (a aVar : this.f17185a) {
            if (aVar.a(inneractiveAdSpot)) {
                return aVar.b(inneractiveAdSpot);
            }
        }
        return null;
    }
}
