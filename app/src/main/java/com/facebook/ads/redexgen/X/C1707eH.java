package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.eH  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1707eH {
    public final Map<String, C1720eU> A00;
    public final Set<C1720eU> A01;

    public C1707eH() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1720eU> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C1720eU> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C1720eU c1720eU : this.A01) {
            this.A00.put(c1720eU.A03, c1720eU);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C1720eU c1720eU) {
        if (this.A01.add(c1720eU)) {
            this.A00.remove(c1720eU.A03);
            return true;
        }
        return false;
    }
}
