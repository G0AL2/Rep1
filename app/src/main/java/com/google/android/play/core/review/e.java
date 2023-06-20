package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import gb.p;

/* loaded from: classes3.dex */
public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final j f23119a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f23120b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(j jVar) {
        this.f23119a = jVar;
    }

    @Override // com.google.android.play.core.review.c
    public final gb.e<ReviewInfo> a() {
        return this.f23119a.a();
    }

    @Override // com.google.android.play.core.review.c
    public final gb.e<Void> b(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.c());
        p pVar = new p();
        intent.putExtra("result_receiver", new b(this.f23120b, pVar));
        activity.startActivity(intent);
        return pVar.a();
    }
}
