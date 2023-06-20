package com.inmobi.media;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.inmobi.media.fq;
import com.inmobi.media.fs;
import com.inmobi.media.hc;
import com.inmobi.media.hz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ClickManager.java */
/* loaded from: classes3.dex */
public class bk implements fs.c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24749a = "bk";

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f24750b;

    /* renamed from: c  reason: collision with root package name */
    private static b f24751c;

    /* renamed from: d  reason: collision with root package name */
    private static HandlerThread f24752d;

    /* renamed from: f  reason: collision with root package name */
    private static bj f24754f;

    /* renamed from: h  reason: collision with root package name */
    private static fq.e f24756h;

    /* renamed from: j  reason: collision with root package name */
    private long f24758j = 0;

    /* renamed from: k  reason: collision with root package name */
    private final e f24759k = new e() { // from class: com.inmobi.media.bk.7
        @Override // com.inmobi.media.bk.e
        public final void a(bi biVar) {
            if (biVar != null) {
                String unused = bk.f24749a;
                bj unused2 = bk.f24754f;
                bj.a(biVar);
            }
        }

        @Override // com.inmobi.media.bk.e
        public final void b(bi biVar) {
            if (biVar != null) {
                String unused = bk.f24749a;
                bk.a(biVar);
                bk.this.b();
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static List<bi> f24753e = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private static AtomicBoolean f24755g = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private static final Object f24757i = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClickManager.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final bk f24775a = new bk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClickManager.java */
    /* loaded from: classes3.dex */
    public final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        private void a(bi biVar) {
            String unused = bk.f24749a;
            b(biVar);
            bj unused2 = bk.f24754f;
            bj.a(biVar);
            bk.f24753e.remove(biVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i10 = message.what;
                int i11 = 3;
                if (i10 == 1) {
                    String str = null;
                    if (((gd) fs.a("root", ho.f(), null)).i()) {
                        return;
                    }
                    bj unused = bk.f24754f;
                    int i12 = bk.f24756h.maxEventBatch;
                    int i13 = bk.f24756h.pingInterval;
                    ArrayList arrayList = new ArrayList();
                    he a10 = he.a();
                    if (a10.a(au.CLICK_BEACON) != 0) {
                        if (-1 != i12) {
                            str = Integer.toString(i12);
                        }
                        String[] strArr = bj.f24747a;
                        List<ContentValues> a11 = a10.a(au.CLICK_BEACON, strArr, null, null, "ts", "ts < " + (System.currentTimeMillis() - i13), "ts ASC ", str);
                        a10.b();
                        for (ContentValues contentValues : a11) {
                            arrayList.add(bj.a(contentValues));
                        }
                    }
                    List unused2 = bk.f24753e = arrayList;
                    if (bk.f24753e.isEmpty()) {
                        bj unused3 = bk.f24754f;
                        if (bj.a()) {
                            bk.f24755g.set(false);
                            return;
                        }
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        sendMessageDelayed(obtain, bk.f24756h.pingInterval * 1000);
                        return;
                    }
                    String unused4 = bk.f24749a;
                    Iterator it = bk.f24753e.iterator();
                    while (it.hasNext()) {
                        it.next();
                        String unused5 = bk.f24749a;
                    }
                    bi biVar = (bi) bk.f24753e.get(0);
                    Message obtain2 = Message.obtain();
                    obtain2.what = biVar.f24745h ? 3 : 2;
                    obtain2.obj = biVar;
                    long currentTimeMillis = System.currentTimeMillis() - biVar.f24741d;
                    if (currentTimeMillis < bk.f24756h.pingInterval * 1000) {
                        sendMessageDelayed(obtain2, (bk.f24756h.pingInterval * 1000) - currentTimeMillis);
                    } else {
                        sendMessage(obtain2);
                    }
                } else if (i10 == 2) {
                    if (!hv.a()) {
                        bk.f24755g.set(false);
                        bk.i();
                        return;
                    }
                    bi biVar2 = (bi) message.obj;
                    if (biVar2.f24743f != 0 && !biVar2.a(bk.f24756h.pingCacheExpiry)) {
                        if ((bk.f24756h.maxRetries - biVar2.f24743f) + 1 == 0) {
                            String unused6 = bk.f24749a;
                        } else {
                            String unused7 = bk.f24749a;
                        }
                        new d(new e() { // from class: com.inmobi.media.bk.b.1
                            @Override // com.inmobi.media.bk.e
                            public final void a(bi biVar3) {
                                b.a(b.this, biVar3);
                            }

                            @Override // com.inmobi.media.bk.e
                            public final void b(bi biVar3) {
                                String unused8 = bk.f24749a;
                                bk.a(biVar3);
                                b.this.b(biVar3);
                            }
                        }).a(biVar2);
                        return;
                    }
                    a(biVar2);
                } else if (i10 == 3) {
                    if (!hv.a()) {
                        bk.f24755g.set(false);
                        bk.i();
                        return;
                    }
                    bi biVar3 = (bi) message.obj;
                    if (biVar3.f24743f != 0 && !biVar3.a(bk.f24756h.pingCacheExpiry)) {
                        if ((bk.f24756h.maxRetries - biVar3.f24743f) + 1 == 0) {
                            String unused8 = bk.f24749a;
                        } else {
                            String unused9 = bk.f24749a;
                        }
                        new c(new e() { // from class: com.inmobi.media.bk.b.2
                            @Override // com.inmobi.media.bk.e
                            public final void a(bi biVar4) {
                                b.a(b.this, biVar4);
                            }

                            @Override // com.inmobi.media.bk.e
                            public final void b(bi biVar4) {
                                String unused10 = bk.f24749a;
                                bk.a(biVar4);
                                b.this.b(biVar4);
                            }
                        }).a(biVar3);
                        return;
                    }
                    a(biVar3);
                } else if (i10 != 4) {
                    String unused10 = bk.f24749a;
                } else {
                    bi biVar4 = (bi) message.obj;
                    String unused11 = bk.f24749a;
                    bj unused12 = bk.f24754f;
                    bj.a(biVar4);
                    bk.f24753e.remove(biVar4);
                    if (bk.f24753e.isEmpty()) {
                        bj unused13 = bk.f24754f;
                        if (bj.a()) {
                            String unused14 = bk.f24749a;
                            bk.f24755g.set(false);
                            return;
                        }
                        Message obtain3 = Message.obtain();
                        obtain3.what = 1;
                        sendMessage(obtain3);
                        return;
                    }
                    bi biVar5 = (bi) bk.f24753e.get(0);
                    Message obtain4 = Message.obtain();
                    if (!biVar5.f24745h) {
                        i11 = 2;
                    }
                    obtain4.what = i11;
                    obtain4.obj = biVar5;
                    sendMessage(obtain4);
                }
            } catch (Exception unused15) {
                String unused16 = bk.f24749a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(bi biVar) {
            int indexOf = bk.f24753e.indexOf(biVar);
            if (-1 != indexOf) {
                bi biVar2 = (bi) bk.f24753e.get(indexOf == bk.f24753e.size() + (-1) ? 0 : indexOf + 1);
                Message obtain = Message.obtain();
                obtain.what = biVar2.f24745h ? 3 : 2;
                obtain.obj = biVar2;
                if (System.currentTimeMillis() - biVar2.f24741d < bk.f24756h.pingInterval * 1000) {
                    sendMessageDelayed(obtain, bk.f24756h.pingInterval * 1000);
                } else {
                    sendMessage(obtain);
                }
            }
        }

        static /* synthetic */ void a(b bVar, bi biVar) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = biVar;
            bVar.sendMessage(obtain);
        }
    }

    /* compiled from: ClickManager.java */
    /* loaded from: classes3.dex */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        e f24779a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ClickManager.java */
        /* renamed from: com.inmobi.media.bk$c$1  reason: invalid class name */
        /* loaded from: classes3.dex */
        public final class AnonymousClass1 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bi f24780a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Handler f24781b;

            /* compiled from: ClickManager.java */
            /* renamed from: com.inmobi.media.bk$c$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes3.dex */
            final class C03291 extends WebViewClient {

                /* renamed from: a  reason: collision with root package name */
                AtomicBoolean f24783a = new AtomicBoolean(false);

                /* renamed from: b  reason: collision with root package name */
                boolean f24784b;

                /* renamed from: c  reason: collision with root package name */
                boolean f24785c;

                C03291() {
                }

                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    this.f24783a.set(true);
                    if (this.f24784b || AnonymousClass1.this.f24780a.f24744g.get()) {
                        return;
                    }
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    c.this.f24779a.a(anonymousClass1.f24780a);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(final WebView webView, String str, Bitmap bitmap) {
                    this.f24785c = true;
                    this.f24784b = false;
                    new Thread(new Runnable() { // from class: com.inmobi.media.bk.c.1.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Thread.sleep(bk.f24756h.pingTimeout * 1000);
                            } catch (InterruptedException unused) {
                            }
                            if (C03291.this.f24783a.get()) {
                                return;
                            }
                            String unused2 = bk.f24749a;
                            AnonymousClass1.this.f24780a.f24744g.set(true);
                            AnonymousClass1.this.f24781b.post(new Runnable() { // from class: com.inmobi.media.bk.c.1.1.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        WebView webView2 = webView;
                                        hc.a aVar = (hc.a) webView2;
                                        if (aVar == null || aVar.f25645a) {
                                            return;
                                        }
                                        webView2.stopLoading();
                                    } catch (Throwable th) {
                                        gg.a().a(new hg(th));
                                    }
                                }
                            });
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            c.this.f24779a.b(anonymousClass1.f24780a);
                        }
                    }).start();
                }

                @Override // android.webkit.WebViewClient
                @TargetApi(22)
                public final void onReceivedError(WebView webView, int i10, String str, String str2) {
                    this.f24784b = true;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    c.this.f24779a.b(anonymousClass1.f24780a);
                }

                @Override // android.webkit.WebViewClient
                @TargetApi(23)
                public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    this.f24784b = true;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    c.this.f24779a.b(anonymousClass1.f24780a);
                }

                @Override // android.webkit.WebViewClient
                public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (Build.VERSION.SDK_INT < 26) {
                        return false;
                    }
                    webView.destroy();
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    return (Build.VERSION.SDK_INT < 21 || AnonymousClass1.this.f24780a.f24746i || webResourceRequest.getUrl().toString().equals(AnonymousClass1.this.f24780a.f24739b)) ? false : true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    bi biVar = AnonymousClass1.this.f24780a;
                    return (biVar.f24746i || str.equals(biVar.f24739b)) ? false : true;
                }

                @Override // android.webkit.WebViewClient
                @TargetApi(23)
                public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    this.f24784b = true;
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    c.this.f24779a.b(anonymousClass1.f24780a);
                }
            }

            AnonymousClass1(bi biVar, Handler handler) {
                this.f24780a = biVar;
                this.f24781b = handler;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gx gxVar = new gx("GET", this.f24780a.f24739b);
                gxVar.f25625t = false;
                gxVar.f25620o = false;
                HashMap c10 = bk.c(this.f24780a);
                if (!c10.isEmpty()) {
                    gxVar.a(c10);
                }
                hc hcVar = new hc(gxVar, new C03291());
                try {
                    hc.a aVar = new hc.a(ho.c());
                    hcVar.f25644c = aVar;
                    aVar.setWebViewClient(hcVar.f25643b);
                    hcVar.f25644c.getSettings().setJavaScriptEnabled(true);
                    hcVar.f25644c.getSettings().setCacheMode(2);
                    hcVar.f25644c.loadUrl(hcVar.f25642a.e(), hcVar.f25642a.d());
                } catch (Exception unused) {
                }
            }
        }

        public c(e eVar) {
            this.f24779a = eVar;
        }

        public final void a(bi biVar) {
            biVar.f24744g.set(false);
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new AnonymousClass1(biVar, handler));
        }
    }

    /* compiled from: ClickManager.java */
    /* loaded from: classes3.dex */
    static final class d {

        /* renamed from: a  reason: collision with root package name */
        private e f24790a;

        public d(e eVar) {
            this.f24790a = eVar;
        }

        public final void a(bi biVar) {
            try {
                gx gxVar = new gx("GET", biVar.f24739b);
                HashMap c10 = bk.c(biVar);
                if (!c10.isEmpty()) {
                    gxVar.a(c10);
                }
                gxVar.f25625t = false;
                gxVar.f25620o = false;
                gxVar.b(biVar.f24740c);
                gxVar.f25619n = biVar.f24746i;
                gxVar.f25617l = bk.f24756h.pingTimeout * 1000;
                gxVar.f25618m = bk.f24756h.pingTimeout * 1000;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                gy a10 = new ha(gxVar).a();
                try {
                    iv.a().a(gxVar.g());
                    iv.a().b(a10.d());
                    iv.a().c(SystemClock.elapsedRealtime() - elapsedRealtime);
                } catch (Exception unused) {
                    String unused2 = bk.f24749a;
                }
                if (a10.a()) {
                    int i10 = a10.f25627a.f25605a;
                    if (-9 == i10) {
                        this.f24790a.a(biVar);
                        return;
                    } else if (!biVar.f24746i && (303 == i10 || 302 == i10)) {
                        this.f24790a.a(biVar);
                        return;
                    } else {
                        this.f24790a.b(biVar);
                        return;
                    }
                }
                this.f24790a.a(biVar);
            } catch (Exception unused3) {
                String unused4 = bk.f24749a;
                e eVar = this.f24790a;
                new gw(-1, "Unknown error");
                eVar.b(biVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClickManager.java */
    /* loaded from: classes3.dex */
    public interface e {
        void a(bi biVar);

        void b(bi biVar);
    }

    public bk() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ht(f24749a));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f24750b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f24752d = handlerThread;
            handlerThread.start();
            f24751c = new b(f24752d.getLooper());
            f24756h = ((fq) fs.a("ads", ho.f(), this)).imai;
            f24754f = new bj();
            hz.a().a(new hz.c() { // from class: com.inmobi.media.bk.5
                @Override // com.inmobi.media.hz.c
                public final void a(boolean z10) {
                    if (z10) {
                        bk.this.b();
                    }
                }
            });
            if (Build.VERSION.SDK_INT >= 23) {
                hz.a().a("android.os.action.DEVICE_IDLE_MODE_CHANGED", new hz.c() { // from class: com.inmobi.media.bk.6
                    @Override // com.inmobi.media.hz.c
                    public final void a(boolean z10) {
                        if (z10) {
                            return;
                        }
                        bk.this.b();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i() {
        HandlerThread handlerThread;
        try {
            f24755g.set(false);
            synchronized (f24757i) {
                if (!f24755g.get() && (handlerThread = f24752d) != null) {
                    handlerThread.getLooper().quit();
                    f24752d.interrupt();
                    f24752d = null;
                    f24751c = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, String> c(bi biVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            int i10 = (f24756h.maxRetries - biVar.f24743f) + 1;
            if (i10 > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(i10));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public void b() {
        try {
            if (hv.a()) {
                synchronized (f24757i) {
                    if (f24755g.compareAndSet(false, true)) {
                        if (f24752d == null) {
                            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
                            f24752d = handlerThread;
                            handlerThread.start();
                        }
                        if (f24751c == null) {
                            f24751c = new b(f24752d.getLooper());
                        }
                        if (bj.a()) {
                            f24755g.set(false);
                            i();
                        } else {
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            f24751c.sendMessage(obtain);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static bk a() {
        return a.f24775a;
    }

    @Override // com.inmobi.media.fs.c
    public void a(fr frVar) {
        f24756h = ((fq) frVar).imai;
    }

    public void a(final String str, final boolean z10) {
        new Thread() { // from class: com.inmobi.media.bk.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    if (((gd) fs.a("root", ho.f(), null)).i()) {
                        return;
                    }
                    bi biVar = new bi(str, z10, false, bk.f24756h.maxRetries + 1);
                    String unused = bk.f24749a;
                    bk.a(bk.this, biVar);
                } catch (Exception unused2) {
                    String unused3 = bk.f24749a;
                }
            }
        }.start();
    }

    public void a(final String str, final Map<String, String> map, final boolean z10) {
        new Thread() { // from class: com.inmobi.media.bk.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    if (((gd) fs.a("root", ho.f(), null)).i()) {
                        return;
                    }
                    bi biVar = new bi(str, map, z10, bk.f24756h.maxRetries + 1);
                    String unused = bk.f24749a;
                    bk.a(bk.this, biVar);
                } catch (Exception e10) {
                    String unused2 = bk.f24749a;
                    gg.a().a(new hg(e10));
                }
            }
        }.start();
    }

    static /* synthetic */ void a(bk bkVar, final bi biVar) {
        f24754f.a(biVar, f24756h.maxDbEvents);
        if (!hv.a()) {
            f24755g.set(false);
            i();
            return;
        }
        f24750b.submit(new Runnable() { // from class: com.inmobi.media.bk.4
            @Override // java.lang.Runnable
            public final void run() {
                bk.this.f24758j = SystemClock.elapsedRealtime();
                if (biVar.f24745h) {
                    new c(bk.this.f24759k).a(biVar);
                } else {
                    new d(bk.this.f24759k).a(biVar);
                }
            }
        });
    }

    public void b(final String str, final boolean z10) {
        new Thread() { // from class: com.inmobi.media.bk.3
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    if (((gd) fs.a("root", ho.f(), null)).i()) {
                        return;
                    }
                    bi biVar = new bi(str, z10, true, bk.f24756h.maxRetries + 1);
                    String unused = bk.f24749a;
                    bk.a(bk.this, biVar);
                } catch (Exception unused2) {
                    String unused3 = bk.f24749a;
                }
            }
        }.start();
    }

    static /* synthetic */ void a(bi biVar) {
        int i10 = biVar.f24743f;
        if (i10 > 0) {
            biVar.f24743f = i10 - 1;
            biVar.f24741d = System.currentTimeMillis();
            he a10 = he.a();
            a10.b(au.CLICK_BEACON, bj.b(biVar), "id = ?", new String[]{String.valueOf(biVar.f24738a)});
            a10.b();
        }
    }
}
