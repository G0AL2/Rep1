package com.vehiclecloud.app.videofetch.firebase.messaging;

import com.vehiclecloud.app.videofetch.unit.AsyncStorageHelper;
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
@f(c = "com.vehiclecloud.app.videofetch.firebase.messaging.DownloadFirebaseMessagingService$onNewToken$1", f = "DownloadFirebaseMessagingService.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DownloadFirebaseMessagingService$onNewToken$1 extends k implements p<e0, d<? super u>, Object> {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ DownloadFirebaseMessagingService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadFirebaseMessagingService.kt */
    @f(c = "com.vehiclecloud.app.videofetch.firebase.messaging.DownloadFirebaseMessagingService$onNewToken$1$1", f = "DownloadFirebaseMessagingService.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vehiclecloud.app.videofetch.firebase.messaging.DownloadFirebaseMessagingService$onNewToken$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends k implements p<e0, d<? super u>, Object> {
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ DownloadFirebaseMessagingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DownloadFirebaseMessagingService downloadFirebaseMessagingService, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = downloadFirebaseMessagingService;
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<u> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$token, dVar);
        }

        @Override // pe.p
        public final Object invoke(e0 e0Var, d<? super u> dVar) {
            return ((AnonymousClass1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            je.d.c();
            if (this.label == 0) {
                o.b(obj);
                AsyncStorageHelper asyncStorageHelper = AsyncStorageHelper.INSTANCE;
                DownloadFirebaseMessagingService downloadFirebaseMessagingService = this.this$0;
                asyncStorageHelper.set(downloadFirebaseMessagingService, "fcmToken", "{\"fcmToken\":\"" + this.$token + "\",\"timestamp\":" + System.currentTimeMillis() + '}');
                return u.f29813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadFirebaseMessagingService$onNewToken$1(DownloadFirebaseMessagingService downloadFirebaseMessagingService, String str, d<? super DownloadFirebaseMessagingService$onNewToken$1> dVar) {
        super(2, dVar);
        this.this$0 = downloadFirebaseMessagingService;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new DownloadFirebaseMessagingService$onNewToken$1(this.this$0, this.$token, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((DownloadFirebaseMessagingService$onNewToken$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        c10 = je.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            o.b(obj);
            z b10 = s0.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$token, null);
            this.label = 1;
            if (we.d.c(b10, anonymousClass1, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            o.b(obj);
        }
        return u.f29813a;
    }
}
