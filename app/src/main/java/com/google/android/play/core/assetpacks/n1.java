package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class n1 {

    /* renamed from: d  reason: collision with root package name */
    private static final cb.e f22918d = new cb.e("ExtractorTaskFinder");

    /* renamed from: a  reason: collision with root package name */
    private final k1 f22919a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f22920b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f22921c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n1(k1 k1Var, a0 a0Var, h0 h0Var) {
        this.f22919a = k1Var;
        this.f22920b = a0Var;
        this.f22921c = h0Var;
    }

    private final boolean b(h1 h1Var, i1 i1Var) {
        a0 a0Var = this.f22920b;
        g1 g1Var = h1Var.f22856c;
        return a0Var.w(g1Var.f22837a, h1Var.f22855b, g1Var.f22838b, i1Var.f22868a).exists();
    }

    private static boolean c(i1 i1Var) {
        int i10 = i1Var.f22873f;
        return i10 == 1 || i10 == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x040d, code lost:
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0216, code lost:
        r0 = com.google.android.play.core.assetpacks.n1.f22918d;
        r4 = new java.lang.Object[r8];
        r4[r7] = java.lang.Integer.valueOf(r6.f22854a);
        r4[1] = r6.f22856c.f22837a;
        r4[2] = r10.f22868a;
        r0.c("Found extraction task for patch for session %s, pack %s, slice %s.", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0233, code lost:
        r11 = r34.f22920b;
        r4 = r6.f22856c;
        r0 = new java.io.FileInputStream(r11.w(r4.f22837a, r6.f22855b, r4.f22838b, r10.f22868a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024a, code lost:
        r9 = r6.f22854a;
        r11 = r6.f22856c;
        r4 = new com.google.android.play.core.assetpacks.p0(r9, r11.f22837a, r6.f22855b, r11.f22838b, r10.f22868a, 0, 0, 1, r11.f22840d, r11.f22839c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0279, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x029f, code lost:
        throw new com.google.android.play.core.assetpacks.s0(java.lang.String.format("Error finding patch, session %s packName %s sliceId %s", java.lang.Integer.valueOf(r6.f22854a), r6.f22856c.f22837a, r10.f22868a), r0, r6.f22854a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.play.core.assetpacks.m1 a() {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.n1.a():com.google.android.play.core.assetpacks.m1");
    }
}
