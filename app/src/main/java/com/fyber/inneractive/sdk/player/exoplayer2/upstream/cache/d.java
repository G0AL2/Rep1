package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a f19394a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f19395b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f19396c;

    /* renamed from: d  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f19397d;

    /* renamed from: e  reason: collision with root package name */
    public final a f19398e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19399f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f19400g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f19401h;

    /* renamed from: i  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.g f19402i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19403j;

    /* renamed from: k  reason: collision with root package name */
    public Uri f19404k;

    /* renamed from: l  reason: collision with root package name */
    public int f19405l;

    /* renamed from: m  reason: collision with root package name */
    public String f19406m;

    /* renamed from: n  reason: collision with root package name */
    public long f19407n;

    /* renamed from: o  reason: collision with root package name */
    public long f19408o;

    /* renamed from: p  reason: collision with root package name */
    public g f19409p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f19410q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f19411r;

    /* renamed from: s  reason: collision with root package name */
    public long f19412s;

    /* loaded from: classes2.dex */
    public interface a {
        void a(long j10, long j11);
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar2, com.fyber.inneractive.sdk.player.exoplayer2.upstream.f fVar, int i10, a aVar2) {
        this.f19394a = aVar;
        this.f19395b = gVar2;
        this.f19399f = (i10 & 1) != 0;
        this.f19400g = (i10 & 2) != 0;
        this.f19401h = (i10 & 4) != 0;
        this.f19397d = gVar;
        if (fVar != null) {
            this.f19396c = new z(gVar, fVar);
        } else {
            this.f19396c = null;
        }
        this.f19398e = aVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws IOException {
        try {
            Uri uri = jVar.f19462a;
            this.f19404k = uri;
            this.f19405l = jVar.f19468g;
            String str = jVar.f19467f;
            if (str == null) {
                str = uri.toString();
            }
            this.f19406m = str;
            this.f19407n = jVar.f19465d;
            boolean z10 = (this.f19400g && this.f19410q) || (jVar.f19466e == -1 && this.f19401h);
            this.f19411r = z10;
            long j10 = jVar.f19466e;
            if (j10 == -1 && !z10) {
                long a10 = this.f19394a.a(str);
                this.f19408o = a10;
                if (a10 != -1) {
                    long j11 = a10 - jVar.f19465d;
                    this.f19408o = j11;
                    if (j11 <= 0) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.h(0);
                    }
                }
                a(true);
                return this.f19408o;
            }
            this.f19408o = j10;
            a(true);
            return this.f19408o;
        } catch (IOException e10) {
            a(e10);
            throw e10;
        }
    }

    public final void b() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.f19402i;
        if (gVar == null) {
            return;
        }
        try {
            gVar.close();
            this.f19402i = null;
            this.f19403j = false;
        } finally {
            g gVar2 = this.f19409p;
            if (gVar2 != null) {
                this.f19394a.b(gVar2);
                this.f19409p = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        this.f19404k = null;
        a aVar = this.f19398e;
        if (aVar != null && this.f19412s > 0) {
            aVar.a(this.f19394a.a(), this.f19412s);
            this.f19412s = 0L;
        }
        try {
            b();
        } catch (IOException e10) {
            a(e10);
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f19408o == 0) {
            return -1;
        }
        try {
            int a10 = this.f19402i.a(bArr, i10, i11);
            if (a10 >= 0) {
                if (this.f19402i == this.f19395b) {
                    this.f19412s += a10;
                }
                long j10 = a10;
                this.f19407n += j10;
                long j11 = this.f19408o;
                if (j11 != -1) {
                    this.f19408o = j11 - j10;
                }
            } else {
                if (this.f19403j) {
                    long j12 = this.f19407n;
                    if (this.f19402i == this.f19396c) {
                        this.f19394a.a(this.f19406m, j12);
                    }
                    this.f19408o = 0L;
                }
                b();
                long j13 = this.f19408o;
                if ((j13 > 0 || j13 == -1) && a(false)) {
                    return a(bArr, i10, i11);
                }
            }
            return a10;
        } catch (IOException e10) {
            a(e10);
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.f19402i;
        return gVar == this.f19397d ? gVar.a() : this.f19404k;
    }

    public final boolean a(boolean z10) throws IOException {
        g b10;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar;
        IOException iOException = null;
        if (this.f19411r) {
            b10 = null;
        } else if (this.f19399f) {
            try {
                b10 = this.f19394a.b(this.f19406m, this.f19407n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            b10 = this.f19394a.c(this.f19406m, this.f19407n);
        }
        boolean z11 = true;
        if (b10 == null) {
            this.f19402i = this.f19397d;
            Uri uri = this.f19404k;
            long j10 = this.f19407n;
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri, null, j10, j10, this.f19408o, this.f19406m, this.f19405l);
        } else if (b10.f19420d) {
            Uri fromFile = Uri.fromFile(b10.f19421e);
            long j11 = this.f19407n - b10.f19418b;
            long j12 = b10.f19419c - j11;
            long j13 = this.f19408o;
            if (j13 != -1) {
                j12 = Math.min(j12, j13);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(fromFile, null, this.f19407n, j11, j12, this.f19406m, this.f19405l);
            this.f19402i = this.f19395b;
            jVar = jVar2;
        } else {
            long j14 = b10.f19419c;
            if (j14 == -1) {
                j14 = this.f19408o;
            } else {
                long j15 = this.f19408o;
                if (j15 != -1) {
                    j14 = Math.min(j14, j15);
                }
            }
            Uri uri2 = this.f19404k;
            long j16 = this.f19407n;
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri2, null, j16, j16, j14, this.f19406m, this.f19405l);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.f19396c;
            if (gVar != null) {
                this.f19402i = gVar;
                this.f19409p = b10;
            } else {
                this.f19402i = this.f19397d;
                this.f19394a.b(b10);
            }
        }
        this.f19403j = jVar.f19466e == -1;
        long j17 = 0;
        try {
            j17 = this.f19402i.a(jVar);
        } catch (IOException e10) {
            if (!z10 && this.f19403j) {
                for (Throwable th = e10; th != null; th = th.getCause()) {
                    if ((th instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.h) && ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.h) th).f19455a == 0) {
                        break;
                    }
                }
            }
            iOException = e10;
            if (iOException != null) {
                throw iOException;
            }
            z11 = false;
        }
        if (this.f19403j && j17 != -1) {
            this.f19408o = j17;
            long j18 = jVar.f19465d + j17;
            if (this.f19402i == this.f19396c) {
                this.f19394a.a(this.f19406m, j18);
            }
        }
        return z11;
    }

    public final void a(IOException iOException) {
        if (this.f19402i == this.f19395b || (iOException instanceof a.C0261a)) {
            this.f19410q = true;
        }
    }
}
