package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.j;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.player.cache.h;
import com.fyber.inneractive.sdk.util.n0;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class d implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* renamed from: b  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.cache.a f17790b;

    /* renamed from: c  reason: collision with root package name */
    public h f17791c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f17792d;

    /* renamed from: f  reason: collision with root package name */
    public FileInputStream f17794f;

    /* renamed from: g  reason: collision with root package name */
    public FileInputStream f17795g;

    /* renamed from: h  reason: collision with root package name */
    public b f17796h;

    /* renamed from: i  reason: collision with root package name */
    public c f17797i;

    /* renamed from: j  reason: collision with root package name */
    public int f17798j;

    /* renamed from: k  reason: collision with root package name */
    public s f17799k;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17789a = false;

    /* renamed from: e  reason: collision with root package name */
    public long f17793e = 0;

    /* loaded from: classes.dex */
    public class a implements h.InterfaceC0242h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.fyber.inneractive.sdk.util.f f17800a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f17801b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f17802c;

        public a(com.fyber.inneractive.sdk.util.f fVar, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f17800a = fVar;
            this.f17801b = atomicReference;
            this.f17802c = countDownLatch;
        }

        public void a(h hVar, com.fyber.inneractive.sdk.player.cache.a aVar, Exception exc) {
            b bVar;
            d dVar = d.this;
            if (!dVar.f17789a) {
                if (exc == null) {
                    Bitmap bitmap = this.f17800a.f20263b;
                    if (bitmap != null && (bVar = dVar.f17796h) != null) {
                        ((com.fyber.inneractive.sdk.player.controller.d) bVar).C = bitmap;
                    }
                    dVar.f17790b = aVar;
                } else {
                    this.f17801b.set(exc);
                }
            }
            this.f17802c.countDown();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws IOException {
        String valueOf;
        com.fyber.inneractive.sdk.player.cache.b jVar2;
        j.d dVar;
        if (this.f17790b == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            com.fyber.inneractive.sdk.util.f fVar = new com.fyber.inneractive.sdk.util.f();
            Uri uri = jVar.f19462a;
            this.f17792d = uri;
            n nVar = n.f17852f;
            int i10 = this.f17798j;
            String uri2 = uri.toString();
            s sVar = this.f17799k;
            a aVar = new a(fVar, atomicReference, countDownLatch);
            com.fyber.inneractive.sdk.player.cache.c cVar = nVar.f17854b;
            boolean a10 = IAConfigManager.J.f16886v.f16987b.a("validateHasVideoTracks", false);
            com.fyber.inneractive.sdk.config.global.features.j jVar3 = sVar == null ? null : (com.fyber.inneractive.sdk.config.global.features.j) sVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
            if (jVar3 != null) {
                j.d dVar2 = j.d.LEGACY;
                String a11 = jVar3.a("v_type", "legacy");
                j.d[] values = j.d.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        dVar = dVar2;
                        break;
                    }
                    int i12 = length;
                    j.d dVar3 = values[i11];
                    j.d[] dVarArr = values;
                    if (TextUtils.equals(dVar3.f16966a, a11.toLowerCase(Locale.US))) {
                        dVar = dVar3;
                        break;
                    }
                    i11++;
                    length = i12;
                    values = dVarArr;
                }
                int ordinal = dVar.ordinal();
                if (ordinal == 1) {
                    jVar2 = new i();
                } else if (ordinal != 2) {
                    jVar2 = new j(a10);
                } else {
                    jVar2 = new k();
                }
            } else {
                jVar2 = new j(a10);
            }
            h hVar = new h(cVar, uri2, jVar2, i10, sVar);
            hVar.f17816g = aVar;
            nVar.f17856d.add(hVar.a());
            this.f17791c = hVar;
            hVar.f17826q = fVar;
            hVar.f17824o = true;
            HandlerThread handlerThread = hVar.f17818i;
            if (handlerThread != null) {
                handlerThread.start();
                n0 n0Var = new n0(hVar.f17818i.getLooper(), hVar);
                hVar.f17819j = n0Var;
                n0Var.post(new f(hVar));
            }
            c cVar2 = this.f17797i;
            if (cVar2 != null) {
                ((com.fyber.inneractive.sdk.player.controller.d) cVar2).F.add(this.f17791c);
            }
            try {
                countDownLatch.await(7L, TimeUnit.SECONDS);
                if (this.f17790b == null) {
                    if (atomicReference.get() == null) {
                        throw new IOException("Cache has failed to download");
                    }
                    throw new IOException((Throwable) atomicReference.get());
                }
            } catch (InterruptedException e10) {
                h hVar2 = this.f17791c;
                hVar2.a(hVar2.f17824o);
                throw new IOException(e10);
            }
        }
        this.f17793e = jVar.f19465d;
        com.fyber.inneractive.sdk.player.cache.a aVar2 = this.f17790b;
        if (aVar2.f17750c) {
            valueOf = aVar2.f17752e.get("http.file.length");
        } else {
            valueOf = String.valueOf(aVar2.a().length());
        }
        if (valueOf == null || !TextUtils.isDigitsOnly(valueOf)) {
            return -1L;
        }
        return Long.parseLong(valueOf);
    }

    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        HttpURLConnection httpURLConnection;
        String str = this.f17790b.f17749b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        int i12 = (int) this.f17793e;
        ByteBuffer b10 = com.fyber.inneractive.sdk.util.d.f20241b.b();
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (IOException e10) {
            e = e10;
            inputStream2 = null;
        } catch (Throwable unused) {
            inputStream = null;
        }
        try {
            httpURLConnection.setRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Integer.valueOf(i12)));
            httpURLConnection.connect();
        } catch (IOException e11) {
            e = e11;
            inputStream2 = null;
            httpURLConnection2 = httpURLConnection;
            try {
                throw e;
            } finally {
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused2) {
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused3) {
                    }
                }
            }
        } catch (Throwable unused4) {
            httpURLConnection2 = httpURLConnection;
            inputStream = null;
            if (inputStream2 != null) {
                inputStream3 = inputStream2;
                try {
                    inputStream3.close();
                } catch (Exception unused5) {
                }
            }
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i10, i11);
            return i11;
        }
        if (httpURLConnection.getResponseCode() == 206) {
            inputStream3 = httpURLConnection.getInputStream();
            byte[] array = b10.array();
            while (inputStream3.read(array) != -1) {
                byteArrayOutputStream.write(array);
            }
            inputStream3.close();
            httpURLConnection.disconnect();
            try {
                httpURLConnection.disconnect();
            } catch (Exception unused6) {
            }
            inputStream3.close();
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i10, i11);
            return i11;
        }
        throw new IOException("Server did not reply with proper range.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        this.f17789a = true;
        this.f17793e = 0L;
        com.fyber.inneractive.sdk.util.s.b(this.f17794f);
        com.fyber.inneractive.sdk.util.s.b(this.f17795g);
        this.f17794f = null;
        this.f17795g = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[Catch: all -> 0x00b6, TryCatch #0 {, blocks: (B:10:0x000c, B:12:0x0019, B:13:0x001d, B:15:0x001f, B:21:0x002f, B:22:0x0032, B:24:0x003f, B:25:0x0044, B:26:0x0045, B:28:0x0049, B:33:0x007f, B:35:0x0083, B:36:0x0085, B:39:0x008d, B:42:0x0098, B:43:0x009f, B:44:0x00a0, B:45:0x00ae, B:30:0x0058, B:32:0x005c), top: B:51:0x000c, inners: #1 }] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.cache.a r0 = r9.f17790b
            if (r0 != 0) goto L6
            r10 = -1
            return r10
        L6:
            if (r12 != 0) goto L9
            return r12
        L9:
            java.lang.Object r0 = r0.f17751d
            monitor-enter(r0)
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f17790b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r1 = r1.a()     // Catch: java.lang.Throwable -> Lb6
            long r1 = r1.length()     // Catch: java.lang.Throwable -> Lb6
            int r2 = (int) r1     // Catch: java.lang.Throwable -> Lb6
            if (r11 <= r2) goto L1f
            int r10 = r9.b(r10, r11, r12)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return r10
        L1f:
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f17790b     // Catch: java.lang.Throwable -> Lb6
            boolean r1 = r1.f17750c     // Catch: java.lang.Throwable -> Lb6
            r3 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L58
        L29:
            int r1 = r2 - r11
            if (r1 > 0) goto L45
            r1 = 50
            r9.wait(r3, r1)     // Catch: java.lang.InterruptedException -> L3e java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f17790b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r1 = r1.a()     // Catch: java.lang.Throwable -> Lb6
            long r1 = r1.length()     // Catch: java.lang.Throwable -> Lb6
            int r2 = (int) r1     // Catch: java.lang.Throwable -> Lb6
            goto L29
        L3e:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb6
            r11.<init>(r10)     // Catch: java.lang.Throwable -> Lb6
            throw r11     // Catch: java.lang.Throwable -> Lb6
        L45:
            java.io.FileInputStream r1 = r9.f17795g     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L7f
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.f17790b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r5 = r5.a()     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lb6
            r9.f17795g = r1     // Catch: java.lang.Throwable -> Lb6
        L56:
            r5 = 1
            goto L7f
        L58:
            java.io.FileInputStream r1 = r9.f17794f     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L7f
            java.lang.String r1 = "%s creating a single instance of fis"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> Lb6
            r7[r5] = r8     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.util.IAlog.a(r1, r7)     // Catch: java.lang.Throwable -> Lb6
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.f17790b     // Catch: java.lang.Throwable -> Lb6
            java.io.File r5 = r5.a()     // Catch: java.lang.Throwable -> Lb6
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lb6
            r9.f17794f = r1     // Catch: java.lang.Throwable -> Lb6
            java.io.FileInputStream r1 = r9.f17795g     // Catch: java.lang.Throwable -> Lb6
            com.fyber.inneractive.sdk.util.s.b(r1)     // Catch: java.lang.Throwable -> Lb6
            r1 = 0
            r9.f17795g = r1     // Catch: java.lang.Throwable -> Lb6
            goto L56
        L7f:
            java.io.FileInputStream r1 = r9.f17794f     // Catch: java.lang.Throwable -> Lb6
            if (r1 != 0) goto L85
            java.io.FileInputStream r1 = r9.f17795g     // Catch: java.lang.Throwable -> Lb6
        L85:
            long r6 = r9.f17793e     // Catch: java.lang.Throwable -> Lb6
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto La0
            if (r5 == 0) goto La0
            long r3 = r1.skip(r6)     // Catch: java.lang.Throwable -> Lb6
            long r5 = r9.f17793e     // Catch: java.lang.Throwable -> Lb6
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L98
            goto La0
        L98:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r11 = "Failed to skip the stream"
            r10.<init>(r11)     // Catch: java.lang.Throwable -> Lb6
            throw r10     // Catch: java.lang.Throwable -> Lb6
        La0:
            int r2 = r2 - r11
            int r3 = r10.length     // Catch: java.lang.Throwable -> Lb6
            int r2 = java.lang.Math.min(r3, r2)     // Catch: java.lang.Throwable -> Lb6
            int r12 = java.lang.Math.min(r2, r12)     // Catch: java.lang.Throwable -> Lb6
            int r10 = r1.read(r10, r11, r12)     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            long r11 = r9.f17793e
            long r0 = (long) r10
            long r11 = r11 + r0
            r9.f17793e = r11
            return r10
        Lb6:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.d.a(byte[], int, int):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.f17792d;
    }
}
