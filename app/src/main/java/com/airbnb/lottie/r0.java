package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TextDelegate.java */
/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b  reason: collision with root package name */
    private final LottieAnimationView f5885b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f5884a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f5887d = true;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f5886c = null;

    public r0(LottieAnimationView lottieAnimationView) {
        this.f5885b = lottieAnimationView;
    }

    private void d() {
        LottieAnimationView lottieAnimationView = this.f5885b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        d0 d0Var = this.f5886c;
        if (d0Var != null) {
            d0Var.invalidateSelf();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f5887d && this.f5884a.containsKey(str2)) {
            return this.f5884a.get(str2);
        }
        String b10 = b(str, str2);
        if (this.f5887d) {
            this.f5884a.put(str2, b10);
        }
        return b10;
    }

    public void e(String str, String str2) {
        this.f5884a.put(str, str2);
        d();
    }
}
