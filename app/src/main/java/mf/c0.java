package mf;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.kt */
/* loaded from: classes3.dex */
public interface c0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;

    f0 k();

    void n0(f fVar, long j10) throws IOException;
}
