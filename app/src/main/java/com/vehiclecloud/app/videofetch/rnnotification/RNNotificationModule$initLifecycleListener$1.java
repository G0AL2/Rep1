package com.vehiclecloud.app.videofetch.rnnotification;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.z;
import ee.o;
import ee.u;
import ie.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e;
import we.e0;
import we.s0;

/* compiled from: RNNotificationModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnnotification.RNNotificationModule$initLifecycleListener$1", f = "RNNotificationModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNNotificationModule$initLifecycleListener$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNNotificationModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNotificationModule$initLifecycleListener$1(RNNotificationModule rNNotificationModule, d<? super RNNotificationModule$initLifecycleListener$1> dVar) {
        super(2, dVar);
        this.this$0 = rNNotificationModule;
    }

    public static /* synthetic */ void a(RNNotificationModule rNNotificationModule, androidx.lifecycle.p pVar, i.b bVar) {
        m7invokeSuspend$lambda0(rNNotificationModule, pVar, bVar);
    }

    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m7invokeSuspend$lambda0(RNNotificationModule rNNotificationModule, androidx.lifecycle.p pVar, i.b bVar) {
        e0 e0Var;
        if (bVar == i.b.ON_PAUSE) {
            e0Var = rNNotificationModule.scope;
            e.b(e0Var, s0.b(), null, new RNNotificationModule$initLifecycleListener$1$1$1(rNNotificationModule, null), 2, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNNotificationModule$initLifecycleListener$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNNotificationModule$initLifecycleListener$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            i lifecycle = z.h().getLifecycle();
            final RNNotificationModule rNNotificationModule = this.this$0;
            lifecycle.a(new m() { // from class: com.vehiclecloud.app.videofetch.rnnotification.b
                @Override // androidx.lifecycle.m
                public final void b(androidx.lifecycle.p pVar, i.b bVar) {
                    RNNotificationModule$initLifecycleListener$1.a(RNNotificationModule.this, pVar, bVar);
                }
            });
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
