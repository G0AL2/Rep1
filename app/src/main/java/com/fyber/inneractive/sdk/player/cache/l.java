package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class l implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f17845a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f17846b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f17847c;

    /* renamed from: d  reason: collision with root package name */
    public int f17848d;

    /* renamed from: e  reason: collision with root package name */
    public int f17849e;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                    i10 = i11;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, l.this.f17846b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public l(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(m.f17851a)) {
                this.f17845a = inputStream;
                this.f17846b = charset;
                this.f17847c = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f17845a;
        byte[] bArr = this.f17847c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f17848d = 0;
            this.f17849e = read;
            return;
        }
        throw new EOFException();
    }

    public String b() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f17845a) {
            if (this.f17847c != null) {
                if (this.f17848d >= this.f17849e) {
                    a();
                }
                for (int i12 = this.f17848d; i12 != this.f17849e; i12++) {
                    byte[] bArr2 = this.f17847c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f17848d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f17846b.name());
                                this.f17848d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f17846b.name());
                        this.f17848d = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f17849e - this.f17848d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f17847c;
                    int i14 = this.f17848d;
                    aVar.write(bArr3, i14, this.f17849e - i14);
                    this.f17849e = -1;
                    a();
                    i10 = this.f17848d;
                    while (i10 != this.f17849e) {
                        bArr = this.f17847c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f17848d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f17848d = i10 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f17845a) {
            if (this.f17847c != null) {
                this.f17847c = null;
                this.f17845a.close();
            }
        }
    }
}
