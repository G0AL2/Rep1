package com.google.firebase.analytics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
final class a extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FirebaseAnalytics firebaseAnalytics, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
