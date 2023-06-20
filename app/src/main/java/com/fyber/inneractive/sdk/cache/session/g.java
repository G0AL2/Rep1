package com.fyber.inneractive.sdk.cache.session;

import java.util.Comparator;

/* loaded from: classes.dex */
public class g implements Comparator<e> {
    public g(h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(e eVar, e eVar2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (eVar3 == null || eVar4 == null) {
            return 0;
        }
        return eVar4.f16846d - eVar3.f16846d > 0 ? 1 : -1;
    }
}
