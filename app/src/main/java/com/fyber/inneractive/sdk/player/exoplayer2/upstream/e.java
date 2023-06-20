package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f19448a;

    /* renamed from: b  reason: collision with root package name */
    public final a0<? super e> f19449b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f19450c;

    /* renamed from: d  reason: collision with root package name */
    public AssetFileDescriptor f19451d;

    /* renamed from: e  reason: collision with root package name */
    public InputStream f19452e;

    /* renamed from: f  reason: collision with root package name */
    public long f19453f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19454g;

    /* loaded from: classes2.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public e(Context context, a0<? super e> a0Var) {
        this.f19448a = context.getContentResolver();
        this.f19449b = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws a {
        try {
            Uri uri = jVar.f19462a;
            this.f19450c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f19448a.openAssetFileDescriptor(uri, "r");
            this.f19451d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f19452e = new FileInputStream(this.f19451d.getFileDescriptor());
                long startOffset = this.f19451d.getStartOffset();
                if (this.f19452e.skip(jVar.f19465d + startOffset) - startOffset == jVar.f19465d) {
                    long j10 = jVar.f19466e;
                    if (j10 != -1) {
                        this.f19453f = j10;
                    } else {
                        long length = this.f19451d.getLength();
                        this.f19453f = length;
                        if (length == -1) {
                            long available = this.f19452e.available();
                            this.f19453f = available;
                            if (available == 0) {
                                this.f19453f = -1L;
                            }
                        }
                    }
                    this.f19454g = true;
                    a0<? super e> a0Var = this.f19449b;
                    if (a0Var != null) {
                        ((l) a0Var).a(this, jVar);
                    }
                    return this.f19453f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f19450c);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws a {
        this.f19450c = null;
        try {
            try {
                InputStream inputStream = this.f19452e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f19452e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f19451d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f19451d = null;
                        if (this.f19454g) {
                            this.f19454g = false;
                            a0<? super e> a0Var = this.f19449b;
                            if (a0Var != null) {
                                ((l) a0Var).a(this);
                            }
                        }
                    }
                } catch (IOException e10) {
                    throw new a(e10);
                }
            } catch (IOException e11) {
                throw new a(e11);
            }
        } catch (Throwable th) {
            this.f19452e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f19451d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f19451d = null;
                    if (this.f19454g) {
                        this.f19454g = false;
                        a0<? super e> a0Var2 = this.f19449b;
                        if (a0Var2 != null) {
                            ((l) a0Var2).a(this);
                        }
                    }
                    throw th;
                } finally {
                    this.f19451d = null;
                    if (this.f19454g) {
                        this.f19454g = false;
                        a0<? super e> a0Var3 = this.f19449b;
                        if (a0Var3 != null) {
                            ((l) a0Var3).a(this);
                        }
                    }
                }
            } catch (IOException e12) {
                throw new a(e12);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19453f;
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
        int read = this.f19452e.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f19453f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j11 = this.f19453f;
        if (j11 != -1) {
            this.f19453f = j11 - read;
        }
        a0<? super e> a0Var = this.f19449b;
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
        return this.f19450c;
    }
}
