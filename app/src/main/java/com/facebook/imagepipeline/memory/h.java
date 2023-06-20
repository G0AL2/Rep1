package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;

/* compiled from: MemoryChunk.java */
/* loaded from: classes.dex */
public interface h {
    long a();

    int b(int i10, byte[] bArr, int i11, int i12);

    int c(int i10, byte[] bArr, int i11, int i12);

    void close();

    ByteBuffer d();

    void e(int i10, h hVar, int i11, int i12);

    byte f(int i10);

    int getSize();

    long h() throws UnsupportedOperationException;

    boolean isClosed();
}
