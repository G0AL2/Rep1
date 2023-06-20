package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f17279a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f17280b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = r.this.f17280b;
            sVar.e(!sVar.f17291t);
            r.this.f17280b.f17285n = null;
        }
    }

    public r(s sVar, long j10) {
        this.f17280b = sVar;
        this.f17279a = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f17280b.E()) {
            s sVar = this.f17280b;
            sVar.f17285n = new a();
            long a10 = sVar.a(this.f17279a);
            s sVar2 = this.f17280b;
            sVar2.getClass();
            w0 w0Var = new w0(TimeUnit.MILLISECONDS, a10);
            sVar2.f17286o = w0Var;
            w0Var.f20351e = new t(sVar2);
            w0Var.c();
            s sVar3 = this.f17280b;
            sVar3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(sVar3), Long.valueOf(a10));
            this.f17280b.f17283l = null;
            return;
        }
        s sVar4 = this.f17280b;
        sVar4.getClass();
        IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(sVar4));
        this.f17280b.e(false);
    }
}
