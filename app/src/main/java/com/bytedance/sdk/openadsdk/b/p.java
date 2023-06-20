package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.inmobi.media.jh;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OpenAppSuccEvent.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static volatile p f11151a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f11152b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f11153c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f11154d = Executors.newCachedThreadPool();

    /* renamed from: e  reason: collision with root package name */
    private b f11155e = b.a();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object> f11156f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OpenAppSuccEvent.java */
    /* loaded from: classes.dex */
    public static class a implements Serializable, Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f11158a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public final AtomicBoolean f11159b = new AtomicBoolean(false);

        /* renamed from: c  reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.e.n f11160c;

        /* renamed from: d  reason: collision with root package name */
        public String f11161d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, Object> f11162e;

        public a() {
        }

        public static a a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, Map<String, Object> map) {
            return new a(nVar, str, map);
        }

        public void b() {
            this.f11158a.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11160c != null && !TextUtils.isEmpty(this.f11161d)) {
                e.d(com.bytedance.sdk.openadsdk.core.m.a(), this.f11160c, this.f11161d, this.f11159b.get() ? "dpl_success" : "dpl_failed", this.f11162e);
            } else {
                com.bytedance.sdk.component.utils.l.a("materialMeta or eventTag is null, pls check");
            }
        }

        public a a(boolean z10) {
            this.f11159b.set(z10);
            return this;
        }

        public int a() {
            return this.f11158a.get();
        }

        public a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, Map<String, Object> map) {
            this.f11160c = nVar;
            this.f11161d = str;
            this.f11162e = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OpenAppSuccEvent.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11163a = 500;

        /* renamed from: b  reason: collision with root package name */
        public int f11164b = jh.DEFAULT_BITMAP_TIMEOUT;

        public static b a() {
            return new b();
        }
    }

    private p() {
        if (this.f11152b == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.f11152b = handlerThread;
            handlerThread.start();
        }
        this.f11153c = new Handler(this.f11152b.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.b.p.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 100) {
                    a aVar = null;
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof a)) {
                        aVar = (a) obj;
                    }
                    if (aVar != null) {
                        p.this.b(aVar);
                        return true;
                    }
                    return true;
                }
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        if (aVar == null) {
            return;
        }
        Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
        if (com.bytedance.sdk.openadsdk.utils.u.c(a10, a10.getPackageName())) {
            a(aVar);
        } else {
            c(aVar.a(true));
        }
    }

    private void c(a aVar) {
        if (aVar == null) {
            return;
        }
        this.f11154d.execute(aVar);
    }

    public static p a() {
        if (f11151a == null) {
            synchronized (p.class) {
                if (f11151a == null) {
                    f11151a = new p();
                }
            }
        }
        return f11151a;
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str) {
        Message obtainMessage = this.f11153c.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = a.a(nVar, str, this.f11156f);
        obtainMessage.sendToTarget();
    }

    private void a(a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.b();
        int a10 = aVar.a();
        b bVar = this.f11155e;
        if (a10 * bVar.f11163a > bVar.f11164b) {
            c(aVar.a(false));
            return;
        }
        Message obtainMessage = this.f11153c.obtainMessage();
        obtainMessage.what = 100;
        obtainMessage.obj = aVar;
        this.f11153c.sendMessageDelayed(obtainMessage, this.f11155e.f11163a);
    }
}
