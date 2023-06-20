package se;

import qe.k;

/* compiled from: Ranges.kt */
/* loaded from: classes3.dex */
class e {
    public static final void a(boolean z10, Number number) {
        k.f(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
