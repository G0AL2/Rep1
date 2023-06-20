package mf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.kt */
/* loaded from: classes3.dex */
public interface h extends e0, ReadableByteChannel {
    String F(long j10) throws IOException;

    String J0(Charset charset) throws IOException;

    boolean N(long j10, i iVar) throws IOException;

    void O0(long j10) throws IOException;

    long P(i iVar) throws IOException;

    boolean W(long j10) throws IOException;

    int X(u uVar) throws IOException;

    String a0() throws IOException;

    byte[] b0(long j10) throws IOException;

    long f0(i iVar) throws IOException;

    long f1() throws IOException;

    InputStream h1();

    f j();

    void j0(long j10) throws IOException;

    i o0(long j10) throws IOException;

    f p();

    h peek();

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    byte[] u0() throws IOException;

    boolean w0() throws IOException;

    long x0() throws IOException;

    void y0(f fVar, long j10) throws IOException;
}
