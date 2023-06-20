package p8;

import java.io.IOException;

/* compiled from: ExtractorInput.java */
/* loaded from: classes2.dex */
public interface j extends da.i {
    int a(int i10) throws IOException;

    long b();

    @Override // da.i
    int c(byte[] bArr, int i10, int i11) throws IOException;

    boolean d(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    void f();

    long getPosition();

    boolean h(byte[] bArr, int i10, int i11, boolean z10) throws IOException;

    long i();

    void j(int i10) throws IOException;

    int k(byte[] bArr, int i10, int i11) throws IOException;

    void m(int i10) throws IOException;

    boolean n(int i10, boolean z10) throws IOException;

    void p(byte[] bArr, int i10, int i11) throws IOException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException;
}
