package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import cb.o;
import gb.p;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    private static final cb.e f23127c = new cb.e("ReviewService");

    /* renamed from: a  reason: collision with root package name */
    final o<cb.b> f23128a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23129b;

    public j(Context context) {
        this.f23129b = context.getPackageName();
        this.f23128a = new o<>(context, f23127c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), f.f23121a);
    }

    public final gb.e<ReviewInfo> a() {
        f23127c.f("requestInAppReview (%s)", this.f23129b);
        p pVar = new p();
        this.f23128a.c(new g(this, pVar, pVar));
        return pVar.a();
    }
}
