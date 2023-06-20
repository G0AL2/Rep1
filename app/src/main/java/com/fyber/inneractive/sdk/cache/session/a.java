package com.fyber.inneractive.sdk.cache.session;

import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, h> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16831a;

    public a(d dVar, int i10) {
        com.fyber.inneractive.sdk.cache.session.enums.b[] values;
        this.f16831a = i10;
        for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
            if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.f16858i) {
                put(bVar, new h(this.f16831a));
            }
        }
    }
}
