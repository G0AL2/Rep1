package com.applovin.impl.sdk.network;

import android.os.Process;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final PriorityBlockingQueue<b> f8673a = new PriorityBlockingQueue<>();

    /* renamed from: b  reason: collision with root package name */
    private final m f8674b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final BlockingQueue<b> f8675a;

        /* renamed from: b  reason: collision with root package name */
        private final m f8676b;

        private a(BlockingQueue<b> blockingQueue, int i10, m mVar) {
            super("AL-Network-" + i10);
            if (blockingQueue == null) {
                throw new IllegalArgumentException("No request queue specified");
            }
            if (mVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f8675a = blockingQueue;
            this.f8676b = mVar;
        }

        private void a() throws InterruptedException {
            a(this.f8675a.take());
        }

        private void a(final b bVar) {
            HttpURLConnection httpURLConnection;
            InputStream inputStream;
            InputStream inputStream2;
            String str;
            InputStream inputStream3;
            String str2;
            String str3 = null;
            int i10 = 0;
            try {
                httpURLConnection = b(bVar);
                try {
                    if (bVar.f8684e != null && bVar.f8684e.length > 0) {
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setFixedLengthStreamingMode(bVar.f8684e.length);
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(bVar.f8684e);
                        outputStream.close();
                    }
                    i10 = httpURLConnection.getResponseCode();
                    if (i10 > 0) {
                        inputStream3 = httpURLConnection.getInputStream();
                        try {
                            str2 = com.applovin.impl.sdk.utils.h.a(inputStream3, this.f8676b);
                        } catch (Throwable th) {
                            inputStream = inputStream3;
                            th = th;
                            try {
                                if (v.a()) {
                                    this.f8676b.A().a("NetworkCommunicationThread", "Failed to make HTTP request", th);
                                }
                                if (httpURLConnection != null) {
                                    try {
                                        inputStream2 = httpURLConnection.getErrorStream();
                                        try {
                                            str = com.applovin.impl.sdk.utils.h.a(inputStream2, this.f8676b);
                                        } catch (Throwable unused) {
                                            str = null;
                                            Utils.close(inputStream, this.f8676b);
                                            Utils.close(inputStream2, this.f8676b);
                                            Utils.disconnect(httpURLConnection, this.f8676b);
                                            final c a10 = c.d().a(i10).a(str3).b(str).a(th).a();
                                            bVar.f8687h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    bVar.f8686g.accept(a10);
                                                }
                                            });
                                        }
                                    } catch (Throwable unused2) {
                                        inputStream2 = null;
                                    }
                                } else {
                                    inputStream2 = null;
                                    str = null;
                                }
                                Utils.close(inputStream, this.f8676b);
                                Utils.close(inputStream2, this.f8676b);
                                Utils.disconnect(httpURLConnection, this.f8676b);
                                final c a102 = c.d().a(i10).a(str3).b(str).a(th).a();
                                bVar.f8687h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        bVar.f8686g.accept(a102);
                                    }
                                });
                            } catch (Throwable th2) {
                                Utils.close(inputStream, this.f8676b);
                                Utils.close(null, this.f8676b);
                                Utils.disconnect(httpURLConnection, this.f8676b);
                                throw th2;
                            }
                        }
                    } else {
                        inputStream3 = null;
                        str2 = null;
                    }
                    Utils.close(inputStream3, this.f8676b);
                    Utils.close(null, this.f8676b);
                    Utils.disconnect(httpURLConnection, this.f8676b);
                    th = null;
                    str = null;
                    str3 = str2;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                inputStream = null;
            }
            final c a1022 = c.d().a(i10).a(str3).b(str).a(th).a();
            bVar.f8687h.execute(new Runnable() { // from class: com.applovin.impl.sdk.network.e.a.1
                @Override // java.lang.Runnable
                public void run() {
                    bVar.f8686g.accept(a1022);
                }
            });
        }

        private HttpURLConnection b(b bVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(bVar.f8681b).openConnection();
            httpURLConnection.setRequestMethod(bVar.f8682c);
            httpURLConnection.setConnectTimeout(bVar.f8685f);
            httpURLConnection.setReadTimeout(bVar.f8685f);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoInput(true);
            if (!bVar.f8683d.isEmpty()) {
                for (Map.Entry entry : bVar.f8683d.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            return httpURLConnection;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f8680a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        private final String f8681b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8682c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f8683d;

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f8684e;

        /* renamed from: f  reason: collision with root package name */
        private final int f8685f;

        /* renamed from: g  reason: collision with root package name */
        private final h0.a<c> f8686g;

        /* renamed from: h  reason: collision with root package name */
        private final Executor f8687h;

        /* renamed from: i  reason: collision with root package name */
        private final int f8688i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private String f8689a;

            /* renamed from: b  reason: collision with root package name */
            private String f8690b;

            /* renamed from: c  reason: collision with root package name */
            private Map<String, String> f8691c = new HashMap();

            /* renamed from: d  reason: collision with root package name */
            private byte[] f8692d;

            /* renamed from: e  reason: collision with root package name */
            private int f8693e;

            /* renamed from: f  reason: collision with root package name */
            private h0.a<c> f8694f;

            /* renamed from: g  reason: collision with root package name */
            private Executor f8695g;

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(int i10) {
                this.f8693e = i10;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(h0.a<c> aVar) {
                this.f8694f = aVar;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(String str) {
                this.f8689a = str;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(String str, String str2) {
                this.f8691c.put(str, str2);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(Map<String, String> map) {
                if (map == null) {
                    map = new HashMap<>();
                }
                this.f8691c = map;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(Executor executor) {
                this.f8695g = executor;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a a(byte[] bArr) {
                this.f8692d = bArr;
                return this;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public b a() {
                return new b(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public a b(String str) {
                this.f8690b = str;
                return this;
            }
        }

        private b(a aVar) {
            this.f8681b = aVar.f8689a;
            this.f8682c = aVar.f8690b;
            this.f8683d = aVar.f8691c != null ? aVar.f8691c : Collections.emptyMap();
            this.f8684e = aVar.f8692d;
            this.f8685f = aVar.f8693e;
            this.f8686g = aVar.f8694f;
            this.f8687h = aVar.f8695g;
            this.f8688i = f8680a.incrementAndGet();
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            return this.f8688i - bVar.f8688i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f8696a;

        /* renamed from: b  reason: collision with root package name */
        private final String f8697b;

        /* renamed from: c  reason: collision with root package name */
        private final String f8698c;

        /* renamed from: d  reason: collision with root package name */
        private final Throwable f8699d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f8700a;

            /* renamed from: b  reason: collision with root package name */
            private String f8701b;

            /* renamed from: c  reason: collision with root package name */
            private String f8702c;

            /* renamed from: d  reason: collision with root package name */
            private Throwable f8703d;

            a() {
            }

            a a(int i10) {
                this.f8700a = i10;
                return this;
            }

            a a(String str) {
                this.f8701b = str;
                return this;
            }

            a a(Throwable th) {
                this.f8703d = th;
                return this;
            }

            c a() {
                return new c(this);
            }

            a b(String str) {
                this.f8702c = str;
                return this;
            }
        }

        private c(a aVar) {
            this.f8696a = aVar.f8700a;
            this.f8697b = aVar.f8701b;
            this.f8698c = aVar.f8702c;
            this.f8699d = aVar.f8703d;
        }

        static a d() {
            return new a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int a() throws Throwable {
            Throwable th = this.f8699d;
            if (th == null) {
                return this.f8696a;
            }
            throw th;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() throws Throwable {
            Throwable th = this.f8699d;
            if (th == null) {
                return this.f8697b;
            }
            throw th;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String c() {
            return this.f8698c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(m mVar) {
        this.f8674b = mVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        for (int i10 = 0; i10 < ((Integer) this.f8674b.a(com.applovin.impl.sdk.c.b.ap)).intValue(); i10++) {
            new a(this.f8673a, i10, this.f8674b).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8673a.add(bVar);
    }
}
