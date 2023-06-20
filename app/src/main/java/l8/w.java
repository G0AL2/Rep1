package l8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l8.f;

/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes2.dex */
public abstract class w implements f {

    /* renamed from: b  reason: collision with root package name */
    protected f.a f33944b;

    /* renamed from: c  reason: collision with root package name */
    protected f.a f33945c;

    /* renamed from: d  reason: collision with root package name */
    private f.a f33946d;

    /* renamed from: e  reason: collision with root package name */
    private f.a f33947e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f33948f;

    /* renamed from: g  reason: collision with root package name */
    private ByteBuffer f33949g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33950h;

    public w() {
        ByteBuffer byteBuffer = f.f33811a;
        this.f33948f = byteBuffer;
        this.f33949g = byteBuffer;
        f.a aVar = f.a.f33812e;
        this.f33946d = aVar;
        this.f33947e = aVar;
        this.f33944b = aVar;
        this.f33945c = aVar;
    }

    @Override // l8.f
    public boolean a() {
        return this.f33947e != f.a.f33812e;
    }

    @Override // l8.f
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f33949g;
        this.f33949g = f.f33811a;
        return byteBuffer;
    }

    @Override // l8.f
    public final f.a c(f.a aVar) throws f.b {
        this.f33946d = aVar;
        this.f33947e = h(aVar);
        return a() ? this.f33947e : f.a.f33812e;
    }

    @Override // l8.f
    public boolean d() {
        return this.f33950h && this.f33949g == f.f33811a;
    }

    @Override // l8.f
    public final void f() {
        this.f33950h = true;
        j();
    }

    @Override // l8.f
    public final void flush() {
        this.f33949g = f.f33811a;
        this.f33950h = false;
        this.f33944b = this.f33946d;
        this.f33945c = this.f33947e;
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return this.f33949g.hasRemaining();
    }

    protected abstract f.a h(f.a aVar) throws f.b;

    protected void i() {
    }

    protected void j() {
    }

    protected void k() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer l(int i10) {
        if (this.f33948f.capacity() < i10) {
            this.f33948f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f33948f.clear();
        }
        ByteBuffer byteBuffer = this.f33948f;
        this.f33949g = byteBuffer;
        return byteBuffer;
    }

    @Override // l8.f
    public final void reset() {
        flush();
        this.f33948f = f.f33811a;
        f.a aVar = f.a.f33812e;
        this.f33946d = aVar;
        this.f33947e = aVar;
        this.f33944b = aVar;
        this.f33945c = aVar;
        k();
    }
}
