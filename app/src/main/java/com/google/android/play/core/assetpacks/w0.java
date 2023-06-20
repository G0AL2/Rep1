package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Double> f23085a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double a(String str, m1 m1Var) {
        double d10;
        d10 = (((p0) m1Var).f22971g + 1.0d) / ((p0) m1Var).f22972h;
        this.f23085a.put(str, Double.valueOf(d10));
        return d10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        this.f23085a.put(str, Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double c(String str) {
        Double d10 = this.f23085a.get(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }
}
