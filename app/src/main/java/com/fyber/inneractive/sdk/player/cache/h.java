package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.network.r;
import com.fyber.inneractive.sdk.player.cache.b;
import com.fyber.inneractive.sdk.player.cache.c;
import com.fyber.inneractive.sdk.player.cache.d;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o0;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class h implements o0 {

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.cache.c f17811b;

    /* renamed from: c  reason: collision with root package name */
    public c.f f17812c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.cache.b f17813d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17814e;

    /* renamed from: f  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.cache.a f17815f;

    /* renamed from: g  reason: collision with root package name */
    public InterfaceC0242h f17816g;

    /* renamed from: h  reason: collision with root package name */
    public e f17817h;

    /* renamed from: j  reason: collision with root package name */
    public Handler f17819j;

    /* renamed from: l  reason: collision with root package name */
    public String f17821l;

    /* renamed from: q  reason: collision with root package name */
    public g f17826q;

    /* renamed from: r  reason: collision with root package name */
    public final s f17827r;

    /* renamed from: a  reason: collision with root package name */
    public String f17810a = "MediaDownloader-" + hashCode();

    /* renamed from: k  reason: collision with root package name */
    public final Object f17820k = new Object();

    /* renamed from: m  reason: collision with root package name */
    public volatile boolean f17822m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17823n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f17824o = false;

    /* renamed from: p  reason: collision with root package name */
    public String f17825p = null;

    /* renamed from: i  reason: collision with root package name */
    public HandlerThread f17818i = new HandlerThread(String.format("MediaDownloader-%s-A", a()));

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            InterfaceC0242h interfaceC0242h = hVar.f17816g;
            if (interfaceC0242h != null) {
                ((d.a) interfaceC0242h).a(hVar, hVar.f17815f, null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Exception f17829a;

        public b(Exception exc) {
            this.f17829a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            InterfaceC0242h interfaceC0242h = hVar.f17816g;
            if (interfaceC0242h != null) {
                ((d.a) interfaceC0242h).a(hVar, hVar.f17815f, this.f17829a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.a(false);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Exception {
        public d(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public class e extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public AtomicBoolean f17832a;

        /* renamed from: b  reason: collision with root package name */
        public InputStream f17833b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f17834c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f17835d;

        /* renamed from: e  reason: collision with root package name */
        public long f17836e;

        /* renamed from: f  reason: collision with root package name */
        public long f17837f;

        /* renamed from: g  reason: collision with root package name */
        public c.C0241c f17838g;

        /* renamed from: h  reason: collision with root package name */
        public int f17839h;

        /* renamed from: i  reason: collision with root package name */
        public int f17840i;

        /* renamed from: j  reason: collision with root package name */
        public int f17841j;

        /* renamed from: k  reason: collision with root package name */
        public int f17842k;

        public e(String str, int i10) {
            super(str);
            this.f17832a = new AtomicBoolean(false);
            this.f17834c = false;
            this.f17835d = false;
            this.f17836e = -1L;
            this.f17837f = 0L;
            this.f17839h = i10;
            this.f17840i = h.this.f17827r != null ? ((com.fyber.inneractive.sdk.config.global.features.j) h.this.f17827r.a(com.fyber.inneractive.sdk.config.global.features.j.class)).d() : 10;
            this.f17841j = h.this.f17827r != null ? ((com.fyber.inneractive.sdk.config.global.features.j) h.this.f17827r.a(com.fyber.inneractive.sdk.config.global.features.j.class)).e() : 500;
            this.f17842k = h.this.f17827r != null ? ((com.fyber.inneractive.sdk.config.global.features.j) h.this.f17827r.a(com.fyber.inneractive.sdk.config.global.features.j.class)).i() : 25;
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01f2 A[EDGE_INSN: B:87:0x01f2->B:83:0x01f2 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.net.HttpURLConnection a(java.io.OutputStream r25, java.net.URL r26, java.nio.ByteBuffer r27, long r28, int r30) throws java.io.IOException, com.fyber.inneractive.sdk.player.cache.h.d {
            /*
                Method dump skipped, instructions count: 535
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.h.e.a(java.io.OutputStream, java.net.URL, java.nio.ByteBuffer, long, int):java.net.HttpURLConnection");
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            OutputStream outputStream;
            HttpURLConnection httpURLConnection;
            Handler handler;
            h hVar = h.this;
            IAlog.d("%s | Starting a fresh download for %s", hVar.f17810a, hVar.a());
            ByteBuffer b10 = com.fyber.inneractive.sdk.util.d.f20241b.b();
            try {
                try {
                    URL url = new URL(h.this.f17814e);
                    h hVar2 = h.this;
                    IAlog.d("%s | opening an editor for %s", hVar2.f17810a, hVar2.a());
                    h hVar3 = h.this;
                    c.C0241c a10 = hVar3.f17811b.a(hVar3.a());
                    this.f17838g = a10;
                    outputStream = a10.a(0);
                    try {
                        int i10 = this.f17840i - 1;
                        httpURLConnection = null;
                        while (i10 > 0) {
                            try {
                                if (!this.f17832a.compareAndSet(false, false)) {
                                    break;
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Throwable unused) {
                                    }
                                }
                                int i11 = i10 - 1;
                                long currentTimeMillis = System.currentTimeMillis();
                                try {
                                    httpURLConnection = a(outputStream, url, b10, this.f17836e, this.f17839h);
                                } catch (f e10) {
                                    throw e10;
                                } catch (Throwable unused2) {
                                }
                                m.a(this.f17833b);
                                IAlog.d("%s Downloaded %d out of %d for key %s", h.this.f17810a, Long.valueOf(this.f17836e), Long.valueOf(this.f17837f), h.this.a());
                                if (this.f17836e >= this.f17837f) {
                                    i10 = 0;
                                } else {
                                    long j10 = this.f17841j;
                                    if (System.currentTimeMillis() - currentTimeMillis < j10) {
                                        Thread.sleep(j10 - (System.currentTimeMillis() - currentTimeMillis));
                                    }
                                    i10 = i11;
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    IAlog.a("%s | mDownloadRunnable exception raised during download", th, h.this.f17810a);
                                    r.a("mDownloadRunnable exception raised during download", th.getMessage(), null, null);
                                    try {
                                        this.f17838g.a();
                                    } catch (Exception unused3) {
                                    }
                                    Handler handler2 = h.this.f17819j;
                                    if (handler2 != null) {
                                        handler2.sendMessage(handler2.obtainMessage(1, th));
                                    }
                                    m.a(outputStream);
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                    com.fyber.inneractive.sdk.util.d.f20241b.f20242a.offer(b10);
                                } catch (Throwable th2) {
                                    m.a(outputStream);
                                    if (httpURLConnection != null) {
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    com.fyber.inneractive.sdk.util.d.f20241b.f20242a.offer(b10);
                                    throw th2;
                                }
                            }
                        }
                        synchronized (h.this.f17820k) {
                            if (this.f17837f <= this.f17836e && !this.f17832a.compareAndSet(true, true)) {
                                h hVar4 = h.this;
                                IAlog.d("%s | committing to cache - %s", hVar4.f17810a, hVar4.a());
                                m.a(outputStream);
                                h hVar5 = h.this;
                                com.fyber.inneractive.sdk.player.cache.a aVar = hVar5.f17815f;
                                if (aVar != null) {
                                    synchronized (aVar.f17751d) {
                                        c.C0241c c0241c = this.f17838g;
                                        if (c0241c.f17779c) {
                                            com.fyber.inneractive.sdk.player.cache.c.a(com.fyber.inneractive.sdk.player.cache.c.this, c0241c, false);
                                            com.fyber.inneractive.sdk.player.cache.c.this.d(c0241c.f17777a.f17782a);
                                        } else {
                                            com.fyber.inneractive.sdk.player.cache.c.a(com.fyber.inneractive.sdk.player.cache.c.this, c0241c, true);
                                        }
                                        com.fyber.inneractive.sdk.player.cache.c cVar = h.this.f17811b;
                                        synchronized (cVar) {
                                            cVar.a();
                                            cVar.f();
                                            cVar.f17769i.flush();
                                        }
                                        h hVar6 = h.this;
                                        hVar6.f17815f.f17748a = hVar6.f17811b.a(hVar6.a(), 0);
                                    }
                                    h.this.f17815f.f17750c = false;
                                } else {
                                    String a11 = hVar5.a();
                                    h hVar7 = h.this;
                                    hVar5.f17815f = new com.fyber.inneractive.sdk.player.cache.a(a11, hVar7.f17814e, hVar7.f17811b.a(hVar7.a(), 0), true, h.this.f17821l);
                                }
                            }
                            this.f17838g.a();
                            h hVar8 = h.this;
                            hVar8.f17811b.d(hVar8.a());
                            h hVar9 = h.this;
                            IAlog.d("%s | aborting cache - %s", hVar9.f17810a, hVar9.a());
                        }
                        h.this.f17824o = false;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (this.f17832a.compareAndSet(false, false) && (handler = h.this.f17819j) != null && this.f17836e >= this.f17837f) {
                            handler.sendEmptyMessage(2);
                        }
                        m.a(outputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = null;
                    httpURLConnection = null;
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused5) {
            }
            com.fyber.inneractive.sdk.util.d.f20241b.f20242a.offer(b10);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends d {
        public f(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0242h {
    }

    public h(com.fyber.inneractive.sdk.player.cache.c cVar, String str, com.fyber.inneractive.sdk.player.cache.b bVar, int i10, s sVar) {
        this.f17811b = cVar;
        this.f17814e = str;
        this.f17821l = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.US));
        this.f17813d = bVar;
        this.f17827r = sVar;
        this.f17817h = new e(String.format("MediaDownloader-%s-A", a()), i10);
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static /* synthetic */ boolean c(com.fyber.inneractive.sdk.player.cache.h r0, boolean r1) {
        /*
            r0.getClass()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.h.c(com.fyber.inneractive.sdk.player.cache.h, boolean):boolean");
    }

    public final void b() {
        com.fyber.inneractive.sdk.util.n.f20310b.post(new a());
    }

    @Override // com.fyber.inneractive.sdk.util.o0
    public void handleMessage(Message message) {
        if (message.what == 4 && !this.f17815f.f17753f) {
            synchronized (this.f17820k) {
                IAlog.d("%s | reading from cache 1 - %s", this.f17810a, a());
                b.a a10 = this.f17813d.a(this.f17815f, this.f17821l);
                if (a10 == b.a.INVALID) {
                    a(new d("Failed cache validation"));
                    a(true);
                } else if (a10 == b.a.PARTIAL_CANNOT_VALIDATE) {
                    this.f17822m = true;
                } else {
                    this.f17815f.f17753f = true;
                    a(this.f17815f);
                    this.f17815f.f17752e.putAll(this.f17813d.f17754a);
                    b();
                }
            }
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            Object obj = message.obj;
            if (obj instanceof Exception) {
                a((Exception) obj);
            } else {
                a(new d("download failed"));
            }
            a(false);
        } else if (i10 == 2) {
            if (this.f17822m) {
                synchronized (this.f17820k) {
                    IAlog.d("%s | reading from cache 2 - %s", this.f17810a, a());
                    if (this.f17813d.a(this.f17815f, this.f17821l) == b.a.INVALID) {
                        a(new d("Failed cache validation after downloading complete file"));
                        a(true);
                    } else {
                        a(this.f17815f);
                        this.f17815f.f17752e.putAll(this.f17813d.f17754a);
                        b();
                    }
                }
            } else {
                com.fyber.inneractive.sdk.util.n.f20310b.post(new c());
            }
            IAlog.d("%s | Download success for cache key %s", this.f17810a, a());
        }
    }

    public static void b(h hVar, boolean z10) {
        com.fyber.inneractive.sdk.player.cache.g gVar = new com.fyber.inneractive.sdk.player.cache.g(hVar);
        Handler handler = hVar.f17819j;
        if (handler != null) {
            if (z10) {
                handler.postAtFrontOfQueue(gVar);
            } else {
                handler.postDelayed(gVar, 4L);
            }
        }
    }

    public final void a(Exception exc) {
        com.fyber.inneractive.sdk.util.n.f20310b.post(new b(exc));
    }

    public final void a(boolean z10) {
        e eVar = this.f17817h;
        if (eVar != null) {
            eVar.f17832a.compareAndSet(false, true);
            this.f17817h = null;
        }
        HandlerThread handlerThread = this.f17818i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f17819j = null;
        if (z10) {
            try {
                this.f17811b.d(a());
            } catch (IOException e10) {
                IAlog.a("failed to remove cache key", e10, new Object[0]);
            }
        }
    }

    public String a() {
        String str = "";
        if (this.f17825p == null) {
            String str2 = this.f17814e;
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(str2.getBytes());
                    byte[] digest = messageDigest.digest();
                    StringBuffer stringBuffer = new StringBuffer();
                    for (byte b10 : digest) {
                        stringBuffer.append(Integer.toHexString((b10 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1));
                    }
                    str = stringBuffer.toString();
                } catch (NullPointerException unused) {
                } catch (NoSuchAlgorithmException unused2) {
                    MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                    messageDigest2.update(str2.getBytes());
                    byte[] digest2 = messageDigest2.digest();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    for (byte b11 : digest2) {
                        stringBuffer2.append(Integer.toHexString((b11 & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1));
                    }
                    str = stringBuffer2.toString();
                }
            } catch (NoSuchAlgorithmException unused3) {
                str = str2.replaceAll("\\W+", "");
            }
            this.f17825p = str;
        }
        return this.f17825p;
    }

    public final void a(com.fyber.inneractive.sdk.player.cache.a aVar) {
        g gVar;
        if (aVar == null || (gVar = this.f17826q) == null) {
            return;
        }
        File a10 = aVar.a();
        File file = ((com.fyber.inneractive.sdk.util.f) gVar).f20262a;
        if ((file == null || a10 == null || !file.getAbsolutePath().equals(a10.getAbsolutePath())) ? false : true) {
            return;
        }
        g gVar2 = this.f17826q;
        File a11 = aVar.a();
        com.fyber.inneractive.sdk.util.f fVar = (com.fyber.inneractive.sdk.util.f) gVar2;
        fVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                try {
                    mediaMetadataRetriever.setDataSource(a11.getPath());
                    mediaMetadataRetriever.extractMetadata(Constants.BUFFER_SIZE);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1L);
                    fVar.f20263b = frameAtTime;
                    if (frameAtTime != null && frameAtTime.getWidth() > 0 && fVar.f20263b.getHeight() > 0) {
                        fVar.f20262a = a11;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e10) {
                    IAlog.a("Failed getting frame from video file%s", com.fyber.inneractive.sdk.util.s.a(e10));
                    mediaMetadataRetriever.release();
                    IAlog.d("FirstFrameDownloadMediaProcessor processing finished in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable unused2) {
        }
    }
}
