package mf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.kt */
/* loaded from: classes3.dex */
public interface g extends c0, WritableByteChannel {
    g D() throws IOException;

    g M(String str) throws IOException;

    g M0(long j10) throws IOException;

    g S(String str, int i10, int i11) throws IOException;

    g Y(i iVar) throws IOException;

    OutputStream e1();

    @Override // mf.c0, java.io.Flushable
    void flush() throws IOException;

    f j();

    g k0(long j10) throws IOException;

    long t(e0 e0Var) throws IOException;

    g u() throws IOException;

    g write(byte[] bArr) throws IOException;

    g write(byte[] bArr, int i10, int i11) throws IOException;

    g writeByte(int i10) throws IOException;

    g writeInt(int i10) throws IOException;

    g writeShort(int i10) throws IOException;
}
