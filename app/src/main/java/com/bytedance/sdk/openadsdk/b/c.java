package com.bytedance.sdk.openadsdk.b;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.b.k;
import com.bytedance.sdk.openadsdk.h.c.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AdEventDispatcher.java */
/* loaded from: classes.dex */
public class c<T extends k> {

    /* renamed from: a  reason: collision with root package name */
    private h<T> f11076a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f11077b;

    /* renamed from: c  reason: collision with root package name */
    private h<T> f11078c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f11079d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f11080e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdEventDispatcher.java */
    /* loaded from: classes.dex */
    public static class a extends c<com.bytedance.sdk.openadsdk.b.a> {

        /* renamed from: a  reason: collision with root package name */
        private static volatile a f11081a;

        a() {
        }

        public static a e() {
            if (f11081a == null) {
                synchronized (a.class) {
                    if (f11081a == null) {
                        f11081a = new a();
                    }
                }
            }
            return f11081a;
        }

        @Override // com.bytedance.sdk.openadsdk.b.c
        public void a(com.bytedance.sdk.openadsdk.b.a aVar) {
        }

        @Override // com.bytedance.sdk.openadsdk.b.c
        public void b() {
        }

        @Override // com.bytedance.sdk.openadsdk.b.c
        public synchronized void a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AdEventDispatcher.java */
    /* loaded from: classes.dex */
    public static class b extends c<c.a> {

        /* renamed from: a  reason: collision with root package name */
        private static volatile b f11082a;

        b() {
        }

        public static b e() {
            if (f11082a == null) {
                synchronized (b.class) {
                    if (f11082a == null) {
                        f11082a = new b();
                    }
                }
            }
            return f11082a;
        }

        @Override // com.bytedance.sdk.openadsdk.b.c
        public void a(c.a aVar) {
        }

        @Override // com.bytedance.sdk.openadsdk.b.c
        public void b() {
        }

        @Override // com.bytedance.sdk.openadsdk.b.c
        public synchronized void a() {
        }
    }

    public c(f<T> fVar, com.bytedance.sdk.openadsdk.core.n<T> nVar, h.c cVar, h.b bVar) {
        this.f11076a = new h<>(fVar, nVar, cVar, bVar);
        this.f11078c = new l(new m(com.bytedance.sdk.openadsdk.core.m.a()), nVar, cVar, bVar);
        this.f11080e = new AtomicBoolean(false);
    }

    public static a c() {
        return a.e();
    }

    public static b d() {
        return b.e();
    }

    public synchronized void a() {
        try {
            AtomicBoolean atomicBoolean = this.f11080e;
            if (atomicBoolean != null && !atomicBoolean.get()) {
                if (this.f11076a.getLooper() == null) {
                    this.f11076a.start();
                    Handler handler = new Handler(this.f11076a.getLooper(), this.f11076a);
                    this.f11077b = handler;
                    Message obtainMessage = handler.obtainMessage();
                    obtainMessage.what = 5;
                    this.f11077b.sendMessageDelayed(obtainMessage, 10000L);
                }
                if (this.f11078c.getLooper() == null) {
                    this.f11078c.start();
                    Handler handler2 = new Handler(this.f11078c.getLooper(), this.f11078c);
                    this.f11079d = handler2;
                    Message obtainMessage2 = handler2.obtainMessage();
                    obtainMessage2.what = 5;
                    this.f11079d.sendMessageDelayed(obtainMessage2, 10000L);
                }
                this.f11080e.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.f11080e.set(false);
        this.f11076a.quit();
        this.f11078c.quit();
        this.f11077b.removeCallbacksAndMessages(null);
        this.f11079d.removeCallbacksAndMessages(null);
    }

    public c(f<T> fVar, com.bytedance.sdk.openadsdk.core.n<T> nVar, h.c cVar, h.b bVar, h<T> hVar) {
        this.f11076a = hVar;
        this.f11078c = new l(new m(com.bytedance.sdk.openadsdk.core.m.a()), nVar, cVar, bVar);
        this.f11080e = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
    }

    public void a(T t10) {
        if (!this.f11080e.get()) {
            a();
        }
        if (t10.e()) {
            Message obtainMessage = this.f11079d.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = t10;
            this.f11079d.sendMessage(obtainMessage);
            return;
        }
        Message obtainMessage2 = this.f11077b.obtainMessage();
        obtainMessage2.what = 1;
        obtainMessage2.obj = t10;
        this.f11077b.sendMessage(obtainMessage2);
    }
}
