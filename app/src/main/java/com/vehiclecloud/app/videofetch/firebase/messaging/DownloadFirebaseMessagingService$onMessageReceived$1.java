package com.vehiclecloud.app.videofetch.firebase.messaging;

import com.google.firebase.messaging.RemoteMessage;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;
import we.s0;
import we.z;

/* compiled from: DownloadFirebaseMessagingService.kt */
@f(c = "com.vehiclecloud.app.videofetch.firebase.messaging.DownloadFirebaseMessagingService$onMessageReceived$1", f = "DownloadFirebaseMessagingService.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DownloadFirebaseMessagingService$onMessageReceived$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ RemoteMessage $message;
    int label;
    final /* synthetic */ DownloadFirebaseMessagingService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFirebaseMessagingService$onMessageReceived$1(DownloadFirebaseMessagingService downloadFirebaseMessagingService, RemoteMessage remoteMessage, d<? super DownloadFirebaseMessagingService$onMessageReceived$1> dVar) {
        super(2, dVar);
        this.this$0 = downloadFirebaseMessagingService;
        this.$message = remoteMessage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new DownloadFirebaseMessagingService$onMessageReceived$1(this.this$0, this.$message, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((DownloadFirebaseMessagingService$onMessageReceived$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            z b10 = s0.b();
            DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1 downloadFirebaseMessagingService$onMessageReceived$1$receivePush$1 = new DownloadFirebaseMessagingService$onMessageReceived$1$receivePush$1(this.this$0, null);
            this.label = 1;
            obj = we.d.c(b10, downloadFirebaseMessagingService$onMessageReceived$1$receivePush$1, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.notify(this.$message);
        }
        return u.f29813a;
    }
}
