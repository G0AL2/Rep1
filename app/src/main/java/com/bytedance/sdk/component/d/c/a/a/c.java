package com.bytedance.sdk.component.d.c.a.a;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f10144a;

    /* renamed from: b  reason: collision with root package name */
    private final Charset f10145b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f10146c;

    /* renamed from: d  reason: collision with root package name */
    private int f10147d;

    /* renamed from: e  reason: collision with root package name */
    private int f10148e;

    public c(InputStream inputStream, Charset charset) {
        this(inputStream, Constants.BUFFER_SIZE, charset);
    }

    private void c() throws IOException {
        InputStream inputStream = this.f10144a;
        byte[] bArr = this.f10146c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f10147d = 0;
            this.f10148e = read;
            return;
        }
        throw new EOFException();
    }

    public boolean b() {
        return this.f10148e == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f10144a) {
            if (this.f10146c != null) {
                this.f10146c = null;
                this.f10144a.close();
            }
        }
    }

    public c(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(d.f10150a)) {
                this.f10144a = inputStream;
                this.f10145b = charset;
                this.f10146c = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    public String a() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f10144a) {
            if (this.f10146c != null) {
                if (this.f10147d >= this.f10148e) {
                    c();
                }
                for (int i12 = this.f10147d; i12 != this.f10148e; i12++) {
                    byte[] bArr2 = this.f10146c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f10147d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f10145b.name());
                                this.f10147d = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f10145b.name());
                        this.f10147d = i12 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f10148e - this.f10147d) + 80) { // from class: com.bytedance.sdk.component.d.c.a.a.c.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i14 = ((ByteArrayOutputStream) this).count;
                        if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                            i14--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i14, c.this.f10145b.name());
                        } catch (UnsupportedEncodingException e10) {
                            throw new AssertionError(e10);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.f10146c;
                    int i14 = this.f10147d;
                    byteArrayOutputStream.write(bArr3, i14, this.f10148e - i14);
                    this.f10148e = -1;
                    c();
                    i10 = this.f10147d;
                    while (i10 != this.f10148e) {
                        bArr = this.f10146c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f10147d;
                if (i10 != i15) {
                    byteArrayOutputStream.write(bArr, i15, i10 - i15);
                }
                this.f10147d = i10 + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
