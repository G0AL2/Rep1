package b9;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* compiled from: BatchBuffer.java */
/* loaded from: classes2.dex */
final class h extends m8.g {

    /* renamed from: i  reason: collision with root package name */
    private long f4930i;

    /* renamed from: j  reason: collision with root package name */
    private int f4931j;

    /* renamed from: k  reason: collision with root package name */
    private int f4932k;

    public h() {
        super(2);
        this.f4932k = 32;
    }

    private boolean v(m8.g gVar) {
        ByteBuffer byteBuffer;
        if (z()) {
            if (this.f4931j < this.f4932k && gVar.k() == k()) {
                ByteBuffer byteBuffer2 = gVar.f34290c;
                return byteBuffer2 == null || (byteBuffer = this.f34290c) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
            }
            return false;
        }
        return true;
    }

    public void A(int i10) {
        ea.a.a(i10 > 0);
        this.f4932k = i10;
    }

    @Override // m8.g, m8.a
    public void g() {
        super.g();
        this.f4931j = 0;
    }

    public boolean u(m8.g gVar) {
        ea.a.a(!gVar.r());
        ea.a.a(!gVar.j());
        ea.a.a(!gVar.l());
        if (v(gVar)) {
            int i10 = this.f4931j;
            this.f4931j = i10 + 1;
            if (i10 == 0) {
                this.f34292e = gVar.f34292e;
                if (gVar.m()) {
                    n(1);
                }
            }
            if (gVar.k()) {
                n(RecyclerView.UNDEFINED_DURATION);
            }
            ByteBuffer byteBuffer = gVar.f34290c;
            if (byteBuffer != null) {
                p(byteBuffer.remaining());
                this.f34290c.put(byteBuffer);
            }
            this.f4930i = gVar.f34292e;
            return true;
        }
        return false;
    }

    public long w() {
        return this.f34292e;
    }

    public long x() {
        return this.f4930i;
    }

    public int y() {
        return this.f4931j;
    }

    public boolean z() {
        return this.f4931j > 0;
    }
}
