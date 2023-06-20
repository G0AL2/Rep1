package p8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.a;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: Id3Peeker.java */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final ea.a0 f35696a = new ea.a0(10);

    public Metadata a(j jVar, a.InterfaceC0288a interfaceC0288a) throws IOException {
        Metadata metadata = null;
        int i10 = 0;
        while (true) {
            try {
                jVar.p(this.f35696a.d(), 0, 10);
                this.f35696a.P(0);
                if (this.f35696a.G() != 4801587) {
                    break;
                }
                this.f35696a.Q(3);
                int C = this.f35696a.C();
                int i11 = C + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f35696a.d(), 0, bArr, 0, 10);
                    jVar.p(bArr, 10, C);
                    metadata = new com.google.android.exoplayer2.metadata.id3.a(interfaceC0288a).e(bArr, i11);
                } else {
                    jVar.j(C);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        jVar.f();
        jVar.j(i10);
        return metadata;
    }
}
