package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ElfZipFileChannel.java */
/* loaded from: classes.dex */
public class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f16517a;

    /* renamed from: b  reason: collision with root package name */
    private final ZipEntry f16518b;

    /* renamed from: c  reason: collision with root package name */
    private final ZipFile f16519c;

    /* renamed from: d  reason: collision with root package name */
    private final long f16520d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16521e = true;

    /* renamed from: f  reason: collision with root package name */
    private long f16522f = 0;

    public h(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f16519c = zipFile;
        this.f16518b = zipEntry;
        this.f16520d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f16517a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // com.facebook.soloader.f
    public int G(ByteBuffer byteBuffer, long j10) throws IOException {
        if (this.f16517a != null) {
            int remaining = byteBuffer.remaining();
            long j11 = this.f16520d - j10;
            if (j11 <= 0) {
                return -1;
            }
            int i10 = (int) j11;
            if (remaining > i10) {
                remaining = i10;
            }
            a(j10);
            if (byteBuffer.hasArray()) {
                this.f16517a.read(byteBuffer.array(), 0, remaining);
                byteBuffer.position(byteBuffer.position() + remaining);
            } else {
                byte[] bArr = new byte[remaining];
                this.f16517a.read(bArr, 0, remaining);
                byteBuffer.put(bArr, 0, remaining);
            }
            this.f16522f += remaining;
            return remaining;
        }
        throw new IOException("InputStream is null");
    }

    public f a(long j10) throws IOException {
        InputStream inputStream = this.f16517a;
        if (inputStream != null) {
            long j11 = this.f16522f;
            if (j10 == j11) {
                return this;
            }
            long j12 = this.f16520d;
            if (j10 > j12) {
                j10 = j12;
            }
            if (j10 >= j11) {
                inputStream.skip(j10 - j11);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f16519c.getInputStream(this.f16518b);
                this.f16517a = inputStream2;
                if (inputStream2 != null) {
                    inputStream2.skip(j10);
                } else {
                    throw new IOException(this.f16518b.getName() + "'s InputStream is null");
                }
            }
            this.f16522f = j10;
            return this;
        }
        throw new IOException(this.f16518b.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f16517a;
        if (inputStream != null) {
            inputStream.close();
            this.f16521e = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f16521e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return G(byteBuffer, this.f16522f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
