package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public final a0<? super q> f19515a;

    /* renamed from: b  reason: collision with root package name */
    public RandomAccessFile f19516b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f19517c;

    /* renamed from: d  reason: collision with root package name */
    public long f19518d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19519e;

    /* loaded from: classes2.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public q(a0<? super q> a0Var) {
        this.f19515a = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws a {
        try {
            this.f19517c = jVar.f19462a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.f19462a.getPath(), "r");
            this.f19516b = randomAccessFile;
            randomAccessFile.seek(jVar.f19465d);
            long j10 = jVar.f19466e;
            if (j10 == -1) {
                j10 = this.f19516b.length() - jVar.f19465d;
            }
            this.f19518d = j10;
            if (j10 >= 0) {
                this.f19519e = true;
                a0<? super q> a0Var = this.f19515a;
                if (a0Var != null) {
                    ((l) a0Var).a(this, jVar);
                }
                return this.f19518d;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws a {
        this.f19517c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f19516b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } finally {
            this.f19516b = null;
            if (this.f19519e) {
                this.f19519e = false;
                a0<? super q> a0Var = this.f19515a;
                if (a0Var != null) {
                    ((l) a0Var).a(this);
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19518d;
        if (j10 == 0) {
            return -1;
        }
        try {
            int read = this.f19516b.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                long j11 = read;
                this.f19518d -= j11;
                a0<? super q> a0Var = this.f19515a;
                if (a0Var != null) {
                    l lVar = (l) a0Var;
                    synchronized (lVar) {
                        lVar.f19480d += j11;
                    }
                }
            }
            return read;
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.f19517c;
    }
}
