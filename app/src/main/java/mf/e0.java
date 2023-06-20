package mf;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source.kt */
/* loaded from: classes3.dex */
public interface e0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long e0(f fVar, long j10) throws IOException;

    f0 k();
}
