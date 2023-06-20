package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import gb.p;

/* loaded from: classes3.dex */
final class b extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f23118a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Handler handler, p pVar) {
        super(handler);
        this.f23118a = pVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f23118a.e(null);
    }
}
