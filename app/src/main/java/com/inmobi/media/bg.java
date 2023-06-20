package com.inmobi.media;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.inmobi.media.av;
import com.inmobi.media.fq;
import com.inmobi.media.fs;
import com.inmobi.media.hz;
import com.squareup.picasso.Callback;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: AssetStore.java */
/* loaded from: classes3.dex */
public final class bg implements fs.c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f24705b = "bg";

    /* renamed from: m  reason: collision with root package name */
    private static final Object f24706m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public ExecutorService f24707a;

    /* renamed from: c  reason: collision with root package name */
    private be f24708c;

    /* renamed from: d  reason: collision with root package name */
    private fq.a f24709d;

    /* renamed from: e  reason: collision with root package name */
    private fq.k f24710e;

    /* renamed from: f  reason: collision with root package name */
    private ExecutorService f24711f;

    /* renamed from: g  reason: collision with root package name */
    private a f24712g;

    /* renamed from: h  reason: collision with root package name */
    private HandlerThread f24713h;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f24714i;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f24715j;

    /* renamed from: k  reason: collision with root package name */
    private ConcurrentHashMap<String, av> f24716k;

    /* renamed from: l  reason: collision with root package name */
    private hz.c f24717l;

    /* renamed from: n  reason: collision with root package name */
    private List<aw> f24718n;

    /* renamed from: o  reason: collision with root package name */
    private final bf f24719o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssetStore.java */
    /* loaded from: classes3.dex */
    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<bg> f24729a;

        /* renamed from: b  reason: collision with root package name */
        private final bf f24730b;

        a(Looper looper, bg bgVar) {
            super(looper);
            this.f24729a = new WeakReference<>(bgVar);
            this.f24730b = new bf() { // from class: com.inmobi.media.bg.a.1
                @Override // com.inmobi.media.bf
                public final void a(gy gyVar, String str, av avVar) {
                    bg bgVar2 = (bg) a.this.f24729a.get();
                    if (bgVar2 != null) {
                        String unused = bg.f24705b;
                        av a10 = new av.a().a(avVar.f24630d, str, gyVar, bgVar2.f24709d.maxRetries, bgVar2.f24709d.timeToLive).a();
                        be unused2 = bgVar2.f24708c;
                        be.b(a10);
                        a10.f24637k = avVar.f24637k;
                        a10.f24627a = avVar.f24627a;
                        bgVar2.a(a10, (byte) 0);
                        a.this.a();
                        return;
                    }
                    String unused3 = bg.f24705b;
                }

                @Override // com.inmobi.media.bf
                public final void a(av avVar) {
                    bg bgVar2 = (bg) a.this.f24729a.get();
                    if (bgVar2 != null) {
                        String unused = bg.f24705b;
                        bgVar2.c(avVar.f24630d);
                        int i10 = avVar.f24629c;
                        if (i10 <= 0) {
                            bgVar2.a(avVar, avVar.f24638l);
                            a.this.a(avVar);
                            return;
                        }
                        avVar.f24629c = i10 - 1;
                        avVar.f24632f = System.currentTimeMillis();
                        be unused2 = bgVar2.f24708c;
                        be.b(avVar);
                        a.this.b();
                        return;
                    }
                    String unused3 = bg.f24705b;
                }
            };
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                bg bgVar = this.f24729a.get();
                int i10 = message.what;
                if (i10 == 1) {
                    if (bgVar != null) {
                        fq.a aVar = bgVar.f24709d;
                        if (aVar == null) {
                            aVar = ((fq) fs.a("ads", ho.f(), null)).assetCache;
                        }
                        be unused = bgVar.f24708c;
                        List<av> c10 = be.c();
                        if (c10.size() <= 0) {
                            String unused2 = bg.f24705b;
                            bgVar.i();
                            return;
                        }
                        String unused3 = bg.f24705b;
                        av avVar = c10.get(0);
                        Iterator<av> it = c10.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            av next = it.next();
                            if (!bg.b(bgVar, avVar)) {
                                avVar = next;
                                break;
                            }
                        }
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        long currentTimeMillis = System.currentTimeMillis() - avVar.f24632f;
                        try {
                            int i11 = aVar.retryInterval;
                            if (currentTimeMillis < i11 * 1000) {
                                sendMessageDelayed(obtain, (i11 * 1000) - currentTimeMillis);
                            } else if (!bg.b(bgVar, avVar)) {
                                String unused4 = bg.f24705b;
                                Message obtain2 = Message.obtain();
                                obtain2.what = 2;
                                obtain2.obj = avVar.f24630d;
                                sendMessage(obtain2);
                            } else {
                                sendMessageDelayed(obtain, aVar.retryInterval * 1000);
                            }
                        } catch (Exception unused5) {
                            String unused6 = bg.f24705b;
                        }
                    }
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        b();
                    } else if (i10 != 4) {
                    } else {
                        if (bgVar != null) {
                            be unused7 = bgVar.f24708c;
                            be.c((av) message.obj);
                        }
                        b();
                    }
                } else if (bgVar != null) {
                    be unused8 = bgVar.f24708c;
                    av b10 = be.b((String) message.obj);
                    if (b10 == null) {
                        b();
                    } else if (b10.a()) {
                        String unused9 = bg.f24705b;
                        a();
                        bgVar.a(b10, (byte) 0);
                    } else {
                        fq.a unused10 = bgVar.f24709d;
                        if (b10.f24629c == 0) {
                            b10.f24638l = (byte) 6;
                            bgVar.a(b10, (byte) 6);
                            a(b10);
                        } else if (!hv.a()) {
                            bgVar.a(b10, b10.f24638l);
                            bgVar.i();
                        } else if (bgVar.a(b10, this.f24730b)) {
                            String unused11 = bg.f24705b;
                            String unused12 = bg.f24705b;
                        } else {
                            String unused13 = bg.f24705b;
                            b();
                        }
                    }
                }
            } catch (Exception e10) {
                String unused14 = bg.f24705b;
                gg.a().a(new hg(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            try {
                sendEmptyMessage(1);
            } catch (Exception unused) {
                String unused2 = bg.f24705b;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(av avVar) {
            try {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = avVar;
                sendMessage(obtain);
            } catch (Exception unused) {
                String unused2 = bg.f24705b;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                sendEmptyMessage(3);
            } catch (Exception unused) {
                String unused2 = bg.f24705b;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssetStore.java */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        static final bg f24732a = new bg((byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssetStore.java */
    /* loaded from: classes3.dex */
    public class c implements InvocationHandler {

        /* renamed from: b  reason: collision with root package name */
        private CountDownLatch f24734b;

        /* renamed from: c  reason: collision with root package name */
        private String f24735c;

        /* renamed from: d  reason: collision with root package name */
        private long f24736d;

        /* renamed from: e  reason: collision with root package name */
        private String f24737e;

        c(CountDownLatch countDownLatch, String str, long j10, String str2) {
            this.f24734b = countDownLatch;
            this.f24735c = str;
            this.f24736d = j10;
            this.f24737e = str2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = bg.f24705b;
            if (method != null) {
                if ("onSuccess".equalsIgnoreCase(method.getName())) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f24736d));
                    hashMap.put("size", 0);
                    hashMap.put("assetType", "image");
                    hashMap.put("networkType", ib.b());
                    hashMap.put("adType", this.f24737e);
                    hh.a().a("AssetDownloaded", hashMap);
                    bg.this.a(this.f24735c);
                    this.f24734b.countDown();
                    return null;
                } else if ("onError".equalsIgnoreCase(method.getName())) {
                    bg.this.b(this.f24735c);
                    this.f24734b.countDown();
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
    }

    /* synthetic */ bg(byte b10) {
        this();
    }

    @TargetApi(23)
    private void h() {
        hz.a().a("android.net.conn.CONNECTIVITY_CHANGE", this.f24717l);
        if (Build.VERSION.SDK_INT >= 23) {
            hz.a().a(this.f24717l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (f24706m) {
            this.f24714i.set(false);
            this.f24716k.clear();
            HandlerThread handlerThread = this.f24713h;
            if (handlerThread != null) {
                handlerThread.getLooper().quit();
                this.f24713h.interrupt();
                this.f24713h = null;
                this.f24712g = null;
            }
        }
    }

    private bg() {
        this.f24714i = new AtomicBoolean(false);
        this.f24715j = new AtomicBoolean(false);
        this.f24718n = new ArrayList();
        this.f24719o = new bf() { // from class: com.inmobi.media.bg.1
            @Override // com.inmobi.media.bf
            public final void a(gy gyVar, String str, av avVar) {
                String unused = bg.f24705b;
                av a10 = new av.a().a(avVar.f24630d, str, gyVar, bg.this.f24709d.maxRetries, bg.this.f24709d.timeToLive).a();
                be unused2 = bg.this.f24708c;
                be.b(a10);
                a10.f24637k = avVar.f24637k;
                a10.f24627a = avVar.f24627a;
                bg.this.a(a10, (byte) 0);
                try {
                    bg.c(bg.this);
                } catch (Exception e10) {
                    String unused3 = bg.f24705b;
                    gg.a().a(new hg(e10));
                }
            }

            @Override // com.inmobi.media.bf
            public final void a(av avVar) {
                String unused = bg.f24705b;
                bg.this.c(avVar.f24630d);
                if (avVar.f24629c <= 0) {
                    String unused2 = bg.f24705b;
                    bg.this.a(avVar, avVar.f24638l);
                    be unused3 = bg.this.f24708c;
                    be.c(avVar);
                } else {
                    String unused4 = bg.f24705b;
                    avVar.f24632f = System.currentTimeMillis();
                    be unused5 = bg.this.f24708c;
                    be.b(avVar);
                    if (!hv.a()) {
                        bg.this.a(avVar, avVar.f24638l);
                    }
                }
                try {
                    bg.c(bg.this);
                } catch (Exception e10) {
                    String unused6 = bg.f24705b;
                    gg.a().a(new hg(e10));
                }
            }
        };
        fq fqVar = (fq) fs.a("ads", ho.f(), this);
        this.f24709d = fqVar.assetCache;
        this.f24710e = fqVar.vastVideo;
        this.f24708c = be.a();
        StringBuilder sb2 = new StringBuilder();
        String str = f24705b;
        sb2.append(str);
        sb2.append("-AP");
        this.f24707a = Executors.newCachedThreadPool(new ht(sb2.toString()));
        this.f24711f = Executors.newFixedThreadPool(1, new ht(str + "-AD"));
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        this.f24713h = handlerThread;
        handlerThread.start();
        this.f24712g = new a(this.f24713h.getLooper(), this);
        this.f24717l = new hz.c() { // from class: com.inmobi.media.bg.2
            @Override // com.inmobi.media.hz.c
            public final void a(boolean z10) {
                if (z10) {
                    bg.c(bg.this);
                } else {
                    bg.this.i();
                }
            }
        };
        this.f24716k = new ConcurrentHashMap<>(2, 0.9f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(String str) {
        boolean z10;
        for (int i10 = 0; i10 < this.f24718n.size(); i10++) {
            aw awVar = this.f24718n.get(i10);
            Iterator<bn> it = awVar.f24648b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f24803b.equals(str)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                awVar.f24651e++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.f24716k.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f24718n.size(); i10++) {
            aw awVar = this.f24718n.get(i10);
            if (awVar.f24650d == awVar.f24648b.size()) {
                try {
                    bh a10 = awVar.a();
                    if (a10 != null) {
                        a10.a(awVar);
                    }
                    arrayList.add(awVar);
                } catch (Exception e10) {
                    gg.a().a(new hg(e10));
                }
            }
        }
        a(arrayList);
    }

    @TargetApi(23)
    private void g() {
        hz.a();
        hz.a(this.f24717l, "android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 23) {
            hz.a();
            hz.b(this.f24717l);
        }
    }

    public final void c() {
        this.f24715j.set(true);
        i();
    }

    public final void d() {
        File[] listFiles;
        boolean z10;
        av b10;
        synchronized (f24706m) {
            List<av> d10 = be.d();
            if (d10.isEmpty()) {
                return;
            }
            Iterator<av> it = d10.iterator();
            while (true) {
                boolean z11 = true;
                if (!it.hasNext()) {
                    break;
                }
                av next = it.next();
                if (System.currentTimeMillis() <= next.f24634h) {
                    z11 = false;
                }
                if (z11) {
                    b(next);
                }
            }
            while (true) {
                long j10 = 0;
                for (av avVar : be.d()) {
                    j10 += new File(avVar.f24631e).length();
                }
                if (j10 <= this.f24709d.maxCacheSize || (b10 = be.b()) == null) {
                    break;
                }
                b(b10);
            }
            File b11 = ho.b(ho.c());
            if (b11.exists() && (listFiles = b11.listFiles()) != null) {
                for (File file : listFiles) {
                    Iterator<av> it2 = d10.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (file.getAbsolutePath().equals(it2.next().f24631e)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        file.getAbsolutePath();
                        file.delete();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(av avVar) {
        File file = new File(avVar.f24631e);
        long min = Math.min(System.currentTimeMillis() + (avVar.f24634h - avVar.f24632f), System.currentTimeMillis() + (this.f24709d.timeToLive * 1000));
        av.a aVar = new av.a();
        String str = avVar.f24630d;
        String str2 = avVar.f24631e;
        int i10 = this.f24709d.maxRetries;
        long j10 = avVar.f24635i;
        aVar.f24641c = str;
        aVar.f24642d = str2;
        aVar.f24640b = i10;
        aVar.f24645g = min;
        aVar.f24646h = j10;
        av a10 = aVar.a();
        a10.f24632f = System.currentTimeMillis();
        be.b(a10);
        long j11 = avVar.f24632f;
        a10.f24637k = ax.a(avVar, file, j11, j11);
        a10.f24636j = true;
        a(a10, (byte) 0);
    }

    public static bg a() {
        return b.f24732a;
    }

    @Override // com.inmobi.media.fs.c
    public final void a(fr frVar) {
        fq fqVar = (fq) frVar;
        this.f24709d = fqVar.assetCache;
        this.f24710e = fqVar.vastVideo;
    }

    public final void b() {
        this.f24715j.set(false);
        if (!hv.a()) {
            g();
            h();
            return;
        }
        synchronized (f24706m) {
            if (this.f24714i.compareAndSet(false, true)) {
                if (this.f24713h == null) {
                    HandlerThread handlerThread = new HandlerThread("assetFetcher");
                    this.f24713h = handlerThread;
                    handlerThread.start();
                }
                if (this.f24712g == null) {
                    this.f24712g = new a(this.f24713h.getLooper(), this);
                }
                if (be.c().isEmpty()) {
                    i();
                } else {
                    g();
                    h();
                    this.f24712g.sendEmptyMessage(1);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str) {
        boolean z10;
        for (int i10 = 0; i10 < this.f24718n.size(); i10++) {
            aw awVar = this.f24718n.get(i10);
            Set<bn> set = awVar.f24648b;
            Set<String> set2 = awVar.f24649c;
            Iterator<bn> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f24803b.equals(str)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && !set2.contains(str)) {
                awVar.f24649c.add(str);
                awVar.f24650d++;
            }
        }
    }

    private synchronized void a(av avVar) {
        boolean z10;
        for (int i10 = 0; i10 < this.f24718n.size(); i10++) {
            aw awVar = this.f24718n.get(i10);
            Iterator<bn> it = awVar.f24648b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f24803b.equals(avVar.f24630d)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10 && !awVar.f24647a.contains(avVar)) {
                awVar.f24647a.add(avVar);
            }
        }
    }

    private static void b(av avVar) {
        be.c(avVar);
        File file = new File(avVar.f24631e);
        if (file.exists()) {
            file.delete();
        }
    }

    static /* synthetic */ void c(bg bgVar) {
        if (bgVar.f24715j.get()) {
            return;
        }
        bgVar.b();
    }

    static /* synthetic */ void b(bg bgVar, final String str) {
        av a10 = be.a(str);
        if (a10 != null && a10.a()) {
            bgVar.c(a10);
            return;
        }
        av.a aVar = new av.a();
        fq.a aVar2 = bgVar.f24709d;
        av a11 = aVar.a(str, aVar2.maxRetries, aVar2.timeToLive).a();
        if (be.a(str) == null) {
            bgVar.f24708c.a(a11);
        }
        bgVar.f24711f.execute(new Runnable() { // from class: com.inmobi.media.bg.5
            @Override // java.lang.Runnable
            public final void run() {
                be unused = bg.this.f24708c;
                av a12 = be.a(str);
                if (a12 != null) {
                    if (a12.a()) {
                        bg.this.c(a12);
                        return;
                    }
                    bg bgVar2 = bg.this;
                    if (bgVar2.a(a12, bgVar2.f24719o)) {
                        String unused2 = bg.f24705b;
                    } else {
                        String unused3 = bg.f24705b;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(aw awVar) {
        if (!this.f24718n.contains(awVar)) {
            this.f24718n.add(awVar);
        }
    }

    private synchronized void a(List<aw> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f24718n.remove(list.get(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
        r23.f24638l = 4;
        r23.f24629c = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
        if (r6.exists() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
        r6.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
        r5.disconnect();
        com.inmobi.media.hv.a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
        r4 = r15;
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0117, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
        com.inmobi.media.gg.a().a(new com.inmobi.media.hg(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0142, code lost:
        r11 = r15;
        r11.flush();
        r5.disconnect();
        r12 = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.ax.a(r20, r16, r12);
        r0 = new com.inmobi.media.gy();
        r0.f25629c = r5.getHeaderFields();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
        r15 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0167, code lost:
        r23.f24637k = com.inmobi.media.ax.a(r23, r6, r20, r12);
        r23.f24627a = r12 - r20;
        r10.f24658a.a(r0, r6.getAbsolutePath(), r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017a, code lost:
        com.inmobi.media.hv.a(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.inmobi.media.av r23, com.inmobi.media.bf r24) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bg.a(com.inmobi.media.av, com.inmobi.media.bf):boolean");
    }

    static /* synthetic */ boolean b(bg bgVar, av avVar) {
        return bgVar.f24716k.containsKey(avVar.f24630d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(av avVar, byte b10) {
        a(avVar);
        c(avVar.f24630d);
        if (b10 == 0) {
            a(avVar.f24630d);
            f();
            return;
        }
        b(avVar.f24630d);
        a(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(byte b10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f24718n.size(); i10++) {
            aw awVar = this.f24718n.get(i10);
            if (awVar.f24651e > 0) {
                try {
                    bh a10 = awVar.a();
                    if (a10 != null) {
                        a10.a(awVar, b10);
                    }
                    arrayList.add(awVar);
                } catch (Exception e10) {
                    gg.a().a(new hg(e10));
                }
            }
        }
        a(arrayList);
    }

    static /* synthetic */ void a(bg bgVar, List list, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                di.a(ho.c()).load(str2).fetch((Callback) di.a(new c(countDownLatch, str2, SystemClock.elapsedRealtime(), str)));
            } catch (Exception unused) {
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused2) {
        }
    }
}
