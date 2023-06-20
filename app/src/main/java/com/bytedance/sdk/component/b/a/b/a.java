package com.bytedance.sdk.component.b.a.b;

import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public final class a implements b, c, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f10005c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    e f10006a;

    /* renamed from: b  reason: collision with root package name */
    long f10007b;

    public boolean a() {
        return this.f10007b == 0;
    }

    public byte b() {
        long j10 = this.f10007b;
        if (j10 != 0) {
            e eVar = this.f10006a;
            int i10 = eVar.f10015b;
            int i11 = eVar.f10016c;
            int i12 = i10 + 1;
            byte b10 = eVar.f10014a[i10];
            this.f10007b = j10 - 1;
            if (i12 == i11) {
                this.f10006a = eVar.b();
                f.a(eVar);
            } else {
                eVar.f10015b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    public String c() {
        try {
            return a(this.f10007b, i.f10025a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    /* renamed from: d */
    public a clone() {
        a aVar = new a();
        if (this.f10007b == 0) {
            return aVar;
        }
        e a10 = this.f10006a.a();
        aVar.f10006a = a10;
        a10.f10020g = a10;
        a10.f10019f = a10;
        e eVar = this.f10006a;
        while (true) {
            eVar = eVar.f10019f;
            if (eVar != this.f10006a) {
                aVar.f10006a.f10020g.a(eVar.a());
            } else {
                aVar.f10007b = this.f10007b;
                return aVar;
            }
        }
    }

    public final d e() {
        long j10 = this.f10007b;
        if (j10 <= 2147483647L) {
            return d((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f10007b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            long j10 = this.f10007b;
            if (j10 != aVar.f10007b) {
                return false;
            }
            long j11 = 0;
            if (j10 == 0) {
                return true;
            }
            e eVar = this.f10006a;
            e eVar2 = aVar.f10006a;
            int i10 = eVar.f10015b;
            int i11 = eVar2.f10015b;
            while (j11 < this.f10007b) {
                long min = Math.min(eVar.f10016c - i10, eVar2.f10016c - i11);
                int i12 = 0;
                while (i12 < min) {
                    int i13 = i10 + 1;
                    int i14 = i11 + 1;
                    if (eVar.f10014a[i10] != eVar2.f10014a[i11]) {
                        return false;
                    }
                    i12++;
                    i10 = i13;
                    i11 = i14;
                }
                if (i10 == eVar.f10016c) {
                    eVar = eVar.f10019f;
                    i10 = eVar.f10015b;
                }
                if (i11 == eVar2.f10016c) {
                    eVar2 = eVar2.f10019f;
                    i11 = eVar2.f10015b;
                }
                j11 += min;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        e eVar = this.f10006a;
        if (eVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = eVar.f10016c;
            for (int i12 = eVar.f10015b; i12 < i11; i12++) {
                i10 = (i10 * 31) + eVar.f10014a[i12];
            }
            eVar = eVar.f10019f;
        } while (eVar != this.f10006a);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        e eVar = this.f10006a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eVar.f10016c - eVar.f10015b);
        byteBuffer.put(eVar.f10014a, eVar.f10015b, min);
        int i10 = eVar.f10015b + min;
        eVar.f10015b = i10;
        this.f10007b -= min;
        if (i10 == eVar.f10016c) {
            this.f10006a = eVar.b();
            f.a(eVar);
        }
        return min;
    }

    public String toString() {
        return e().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                e c10 = c(1);
                int min = Math.min(i10, 8192 - c10.f10016c);
                byteBuffer.get(c10.f10014a, c10.f10016c, min);
                i10 -= min;
                c10.f10016c += min;
            }
            this.f10007b += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public String a(long j10, Charset charset) throws EOFException {
        i.a(this.f10007b, 0L, j10);
        if (charset != null) {
            if (j10 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
            } else if (j10 == 0) {
                return "";
            } else {
                e eVar = this.f10006a;
                int i10 = eVar.f10015b;
                if (i10 + j10 > eVar.f10016c) {
                    return new String(a(j10), charset);
                }
                String str = new String(eVar.f10014a, i10, (int) j10, charset);
                int i11 = (int) (eVar.f10015b + j10);
                eVar.f10015b = i11;
                this.f10007b -= j10;
                if (i11 == eVar.f10016c) {
                    this.f10006a = eVar.b();
                    f.a(eVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    e c(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            e eVar = this.f10006a;
            if (eVar == null) {
                e a10 = f.a();
                this.f10006a = a10;
                a10.f10020g = a10;
                a10.f10019f = a10;
                return a10;
            }
            e eVar2 = eVar.f10020g;
            return (eVar2.f10016c + i10 > 8192 || !eVar2.f10018e) ? eVar2.a(f.a()) : eVar2;
        }
        throw new IllegalArgumentException();
    }

    public final d d(int i10) {
        if (i10 == 0) {
            return d.f10010c;
        }
        return new g(this, i10);
    }

    public a b(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            i.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                e c10 = c(1);
                int min = Math.min(i12 - i10, 8192 - c10.f10016c);
                System.arraycopy(bArr, i10, c10.f10014a, c10.f10016c, min);
                i10 += min;
                c10.f10016c += min;
            }
            this.f10007b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] a(long j10) throws EOFException {
        i.a(this.f10007b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    public void a(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int a10 = a(bArr, i10, bArr.length - i10);
            if (a10 == -1) {
                throw new EOFException();
            }
            i10 += a10;
        }
    }

    public a b(int i10) {
        e c10 = c(1);
        byte[] bArr = c10.f10014a;
        int i11 = c10.f10016c;
        c10.f10016c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f10007b++;
        return this;
    }

    public int a(byte[] bArr, int i10, int i11) {
        i.a(bArr.length, i10, i11);
        e eVar = this.f10006a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(i11, eVar.f10016c - eVar.f10015b);
        System.arraycopy(eVar.f10014a, eVar.f10015b, bArr, i10, min);
        int i12 = eVar.f10015b + min;
        eVar.f10015b = i12;
        this.f10007b -= min;
        if (i12 == eVar.f10016c) {
            this.f10006a = eVar.b();
            f.a(eVar);
        }
        return min;
    }

    public a b(long j10) {
        if (j10 == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        e c10 = c(numberOfTrailingZeros);
        byte[] bArr = c10.f10014a;
        int i10 = c10.f10016c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f10005c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        c10.f10016c += numberOfTrailingZeros;
        this.f10007b += numberOfTrailingZeros;
        return this;
    }

    public a a(String str) {
        return a(str, 0, str.length());
    }

    public a a(String str, int i10, int i11) {
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException("beginIndex < 0: " + i10);
            } else if (i11 >= i10) {
                if (i11 > str.length()) {
                    throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
                }
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt < 128) {
                        e c10 = c(1);
                        byte[] bArr = c10.f10014a;
                        int i12 = c10.f10016c - i10;
                        int min = Math.min(i11, 8192 - i12);
                        int i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) charAt;
                        while (i13 < min) {
                            char charAt2 = str.charAt(i13);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i13 + i12] = (byte) charAt2;
                            i13++;
                        }
                        int i14 = c10.f10016c;
                        int i15 = (i12 + i13) - i14;
                        c10.f10016c = i14 + i15;
                        this.f10007b += i15;
                        i10 = i13;
                    } else {
                        if (charAt < 2048) {
                            b((charAt >> 6) | DownloadResource.STATUS_RUNNING);
                            b((charAt & '?') | 128);
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i16 = i10 + 1;
                            char charAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                            if (charAt <= 56319 && charAt3 >= 56320 && charAt3 <= 57343) {
                                int i17 = (((charAt & 10239) << 10) | (9215 & charAt3)) + Constants.MIN_PROGRESS_STEP;
                                b((i17 >> 18) | 240);
                                b(((i17 >> 12) & 63) | 128);
                                b(((i17 >> 6) & 63) | 128);
                                b((i17 & 63) | 128);
                                i10 += 2;
                            } else {
                                b(63);
                                i10 = i16;
                            }
                        } else {
                            b((charAt >> '\f') | 224);
                            b(((charAt >> 6) & 63) | 128);
                            b((charAt & '?') | 128);
                        }
                        i10++;
                    }
                }
                return this;
            } else {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public a a(int i10) {
        if (i10 < 128) {
            b(i10);
        } else if (i10 < 2048) {
            b((i10 >> 6) | DownloadResource.STATUS_RUNNING);
            b((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                b(63);
            } else {
                b((i10 >> 12) | 224);
                b(((i10 >> 6) & 63) | 128);
                b((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            b((i10 >> 18) | 240);
            b(((i10 >> 12) & 63) | 128);
            b(((i10 >> 6) & 63) | 128);
            b((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    public a a(String str, int i10, int i11, Charset charset) {
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i10);
            } else if (i11 >= i10) {
                if (i11 <= str.length()) {
                    if (charset != null) {
                        if (charset.equals(i.f10025a)) {
                            return a(str, i10, i11);
                        }
                        byte[] bytes = str.substring(i10, i11).getBytes(charset);
                        return b(bytes, 0, bytes.length);
                    }
                    throw new IllegalArgumentException("charset == null");
                }
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            } else {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            }
        }
        throw new IllegalArgumentException("string == null");
    }
}
