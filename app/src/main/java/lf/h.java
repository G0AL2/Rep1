package lf;

import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import mf.f;
import mf.i;
import qe.k;

/* compiled from: WebSocketWriter.kt */
/* loaded from: classes3.dex */
public final class h implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final mf.f f34121a;

    /* renamed from: b  reason: collision with root package name */
    private final mf.f f34122b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34123c;

    /* renamed from: d  reason: collision with root package name */
    private a f34124d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f34125e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a f34126f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f34127g;

    /* renamed from: h  reason: collision with root package name */
    private final mf.g f34128h;

    /* renamed from: i  reason: collision with root package name */
    private final Random f34129i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f34130j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f34131k;

    /* renamed from: l  reason: collision with root package name */
    private final long f34132l;

    public h(boolean z10, mf.g gVar, Random random, boolean z11, boolean z12, long j10) {
        k.f(gVar, "sink");
        k.f(random, "random");
        this.f34127g = z10;
        this.f34128h = gVar;
        this.f34129i = random;
        this.f34130j = z11;
        this.f34131k = z12;
        this.f34132l = j10;
        this.f34121a = new mf.f();
        this.f34122b = gVar.j();
        this.f34125e = z10 ? new byte[4] : null;
        this.f34126f = z10 ? new f.a() : null;
    }

    private final void b(int i10, i iVar) throws IOException {
        if (!this.f34123c) {
            int A = iVar.A();
            if (((long) A) <= 125) {
                this.f34122b.writeByte(i10 | 128);
                if (this.f34127g) {
                    this.f34122b.writeByte(A | 128);
                    Random random = this.f34129i;
                    byte[] bArr = this.f34125e;
                    k.c(bArr);
                    random.nextBytes(bArr);
                    this.f34122b.write(this.f34125e);
                    if (A > 0) {
                        long C0 = this.f34122b.C0();
                        this.f34122b.Y(iVar);
                        mf.f fVar = this.f34122b;
                        f.a aVar = this.f34126f;
                        k.c(aVar);
                        fVar.Z(aVar);
                        this.f34126f.d(C0);
                        f.f34104a.b(this.f34126f, this.f34125e);
                        this.f34126f.close();
                    }
                } else {
                    this.f34122b.writeByte(A);
                    this.f34122b.Y(iVar);
                }
                this.f34128h.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException(RNAdsEvents.EVENT_CLOSED);
    }

    public final void a(int i10, i iVar) throws IOException {
        i iVar2 = i.f34461d;
        if (i10 != 0 || iVar != null) {
            if (i10 != 0) {
                f.f34104a.c(i10);
            }
            mf.f fVar = new mf.f();
            fVar.writeShort(i10);
            if (iVar != null) {
                fVar.Y(iVar);
            }
            iVar2 = fVar.g0();
        }
        try {
            b(8, iVar2);
        } finally {
            this.f34123c = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.f34124d;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void d(int i10, i iVar) throws IOException {
        k.f(iVar, "data");
        if (!this.f34123c) {
            this.f34121a.Y(iVar);
            int i11 = i10 | 128;
            if (this.f34130j && iVar.A() >= this.f34132l) {
                a aVar = this.f34124d;
                if (aVar == null) {
                    aVar = new a(this.f34131k);
                    this.f34124d = aVar;
                }
                aVar.a(this.f34121a);
                i11 |= 64;
            }
            long C0 = this.f34121a.C0();
            this.f34122b.writeByte(i11);
            int i12 = this.f34127g ? 128 : 0;
            if (C0 <= 125) {
                this.f34122b.writeByte(((int) C0) | i12);
            } else if (C0 <= 65535) {
                this.f34122b.writeByte(i12 | 126);
                this.f34122b.writeShort((int) C0);
            } else {
                this.f34122b.writeByte(i12 | 127);
                this.f34122b.c1(C0);
            }
            if (this.f34127g) {
                Random random = this.f34129i;
                byte[] bArr = this.f34125e;
                k.c(bArr);
                random.nextBytes(bArr);
                this.f34122b.write(this.f34125e);
                if (C0 > 0) {
                    mf.f fVar = this.f34121a;
                    f.a aVar2 = this.f34126f;
                    k.c(aVar2);
                    fVar.Z(aVar2);
                    this.f34126f.d(0L);
                    f.f34104a.b(this.f34126f, this.f34125e);
                    this.f34126f.close();
                }
            }
            this.f34122b.n0(this.f34121a, C0);
            this.f34128h.u();
            return;
        }
        throw new IOException(RNAdsEvents.EVENT_CLOSED);
    }

    public final void e(i iVar) throws IOException {
        k.f(iVar, "payload");
        b(9, iVar);
    }

    public final void h(i iVar) throws IOException {
        k.f(iVar, "payload");
        b(10, iVar);
    }
}
