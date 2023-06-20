package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f19376a;

    /* renamed from: b  reason: collision with root package name */
    public final a0<? super c> f19377b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f19378c;

    /* renamed from: d  reason: collision with root package name */
    public InputStream f19379d;

    /* renamed from: e  reason: collision with root package name */
    public long f19380e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19381f;

    /* loaded from: classes2.dex */
    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public c(Context context, a0<? super c> a0Var) {
        this.f19376a = context.getAssets();
        this.f19377b = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws a {
        try {
            Uri uri = jVar.f19462a;
            this.f19378c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f19376a.open(path, 1);
            this.f19379d = open;
            if (open.skip(jVar.f19465d) >= jVar.f19465d) {
                long j10 = jVar.f19466e;
                if (j10 != -1) {
                    this.f19380e = j10;
                } else {
                    long available = this.f19379d.available();
                    this.f19380e = available;
                    if (available == 2147483647L) {
                        this.f19380e = -1L;
                    }
                }
                this.f19381f = true;
                a0<? super c> a0Var = this.f19377b;
                if (a0Var != null) {
                    ((l) a0Var).a(this, jVar);
                }
                return this.f19380e;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws a {
        this.f19378c = null;
        try {
            try {
                InputStream inputStream = this.f19379d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10);
            }
        } finally {
            this.f19379d = null;
            if (this.f19381f) {
                this.f19381f = false;
                a0<? super c> a0Var = this.f19377b;
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
        long j10 = this.f19380e;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int read = this.f19379d.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f19380e == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f19380e;
        if (j11 != -1) {
            this.f19380e = j11 - read;
        }
        a0<? super c> a0Var = this.f19377b;
        if (a0Var != null) {
            l lVar = (l) a0Var;
            synchronized (lVar) {
                lVar.f19480d += read;
            }
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.f19378c;
    }
}
