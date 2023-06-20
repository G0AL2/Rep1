package m8;

import j8.m1;
import java.nio.ByteBuffer;

/* compiled from: DecoderInputBuffer.java */
/* loaded from: classes2.dex */
public class g extends m8.a {

    /* renamed from: b  reason: collision with root package name */
    public final c f34289b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f34290c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f34291d;

    /* renamed from: e  reason: collision with root package name */
    public long f34292e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f34293f;

    /* renamed from: g  reason: collision with root package name */
    private final int f34294g;

    /* renamed from: h  reason: collision with root package name */
    private final int f34295h;

    /* compiled from: DecoderInputBuffer.java */
    /* loaded from: classes2.dex */
    public static final class a extends IllegalStateException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " < "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m8.g.a.<init>(int, int):void");
        }
    }

    static {
        m1.a("goog.exo.decoder");
    }

    public g(int i10) {
        this(i10, 0);
    }

    private ByteBuffer o(int i10) {
        int i11 = this.f34294g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f34290c;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static g s() {
        return new g(0);
    }

    @Override // m8.a
    public void g() {
        super.g();
        ByteBuffer byteBuffer = this.f34290c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f34293f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f34291d = false;
    }

    public void p(int i10) {
        int i11 = i10 + this.f34295h;
        ByteBuffer byteBuffer = this.f34290c;
        if (byteBuffer == null) {
            this.f34290c = o(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f34290c = byteBuffer;
            return;
        }
        ByteBuffer o10 = o(i12);
        o10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            o10.put(byteBuffer);
        }
        this.f34290c = o10;
    }

    public final void q() {
        ByteBuffer byteBuffer = this.f34290c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f34293f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean r() {
        return i(1073741824);
    }

    public void t(int i10) {
        ByteBuffer byteBuffer = this.f34293f;
        if (byteBuffer != null && byteBuffer.capacity() >= i10) {
            this.f34293f.clear();
        } else {
            this.f34293f = ByteBuffer.allocate(i10);
        }
    }

    public g(int i10, int i11) {
        this.f34289b = new c();
        this.f34294g = i10;
        this.f34295h = i11;
    }
}
