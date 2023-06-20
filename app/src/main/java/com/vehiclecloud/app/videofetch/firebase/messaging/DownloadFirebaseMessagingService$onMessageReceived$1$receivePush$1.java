package com.vehiclecloud.app.videofetch.firebase.messaging;

import android.content.Context;
import com.vehiclecloud.app.videofetch.unit.AsyncStorageHelper;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import org.json.JSONObject;
import pe.p;
import we.e0;

/* compiled from: DownloadFirebaseMessagingService.kt */
@f(c = "com.vehiclecloud.app.videofetch.firebase.messaging.DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1", f = "DownloadFirebaseMessagingService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1 extends k implements p<e0, d<? super Boolean>, Object> {
    int label;
    final /* synthetic */ DownloadFirebaseMessagingService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1(DownloadFirebaseMessagingService downloadFirebaseMessagingService, d<? super DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1> dVar) {
        super(2, dVar);
        this.this$0 = downloadFirebaseMessagingService;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super Boolean> dVar) {
        return ((DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            Context applicationContext = this.this$0.getApplicationContext();
            qe.k.e(applicationContext, "applicationContext");
            JSONObject query = AsyncStorageHelper.query(applicationContext, "appSettings");
            return b.a(query != null ? query.optBoolean("receivePush", true) : true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
