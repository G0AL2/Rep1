package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: ElfFileChannel.java */
/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private File f16514a;

    /* renamed from: b  reason: collision with root package name */
    private FileInputStream f16515b;

    /* renamed from: c  reason: collision with root package name */
    private FileChannel f16516c;

    public g(File file) throws IOException {
        this.f16514a = file;
        a();
    }

    @Override // com.facebook.soloader.f
    public int G(ByteBuffer byteBuffer, long j10) throws IOException {
        return this.f16516c.read(byteBuffer, j10);
    }

    public void a() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(this.f16514a);
        this.f16515b = fileInputStream;
        this.f16516c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16515b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f16516c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f16516c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f16516c.write(byteBuffer);
    }
}
