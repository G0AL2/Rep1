package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class b implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.f {

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a f19382a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19383b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19384c;

    /* renamed from: d  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.j f19385d;

    /* renamed from: e  reason: collision with root package name */
    public File f19386e;

    /* renamed from: f  reason: collision with root package name */
    public OutputStream f19387f;

    /* renamed from: g  reason: collision with root package name */
    public FileOutputStream f19388g;

    /* renamed from: h  reason: collision with root package name */
    public long f19389h;

    /* renamed from: i  reason: collision with root package name */
    public long f19390i;

    /* renamed from: j  reason: collision with root package name */
    public o f19391j;

    /* loaded from: classes2.dex */
    public static class a extends a.C0261a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar, long j10, int i10) {
        this.f19382a = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(aVar);
        this.f19383b = j10;
        this.f19384c = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws a {
        if (jVar.f19466e == -1 && !jVar.a(2)) {
            this.f19385d = null;
            return;
        }
        this.f19385d = jVar;
        this.f19390i = 0L;
        try {
            b();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    public final void b() throws IOException {
        long j10 = this.f19385d.f19466e;
        long min = j10 == -1 ? this.f19383b : Math.min(j10 - this.f19390i, this.f19383b);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar = this.f19382a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar = this.f19385d;
        this.f19386e = aVar.a(jVar.f19467f, this.f19390i + jVar.f19464c, min);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f19386e);
        this.f19388g = fileOutputStream;
        if (this.f19384c > 0) {
            o oVar = this.f19391j;
            if (oVar == null) {
                this.f19391j = new o(this.f19388g, this.f19384c);
            } else {
                oVar.a(fileOutputStream);
            }
            this.f19387f = this.f19391j;
        } else {
            this.f19387f = fileOutputStream;
        }
        this.f19389h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.f
    public void close() throws a {
        if (this.f19385d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.f
    public void a(byte[] bArr, int i10, int i11) throws a {
        if (this.f19385d == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f19389h == this.f19383b) {
                    a();
                    b();
                }
                int min = (int) Math.min(i11 - i12, this.f19383b - this.f19389h);
                this.f19387f.write(bArr, i10 + i12, min);
                i12 += min;
                long j10 = min;
                this.f19389h += j10;
                this.f19390i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.f19387f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.f19388g.getFD().sync();
            u.a(this.f19387f);
            this.f19387f = null;
            File file = this.f19386e;
            this.f19386e = null;
            this.f19382a.a(file);
        } catch (Throwable th) {
            u.a(this.f19387f);
            this.f19387f = null;
            File file2 = this.f19386e;
            this.f19386e = null;
            file2.delete();
            throw th;
        }
    }
}
