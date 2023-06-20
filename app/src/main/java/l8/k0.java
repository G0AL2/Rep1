package l8;

import ea.n0;
import java.nio.ByteBuffer;
import l8.f;

/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes2.dex */
final class k0 extends w {

    /* renamed from: i  reason: collision with root package name */
    private int f33877i;

    /* renamed from: j  reason: collision with root package name */
    private int f33878j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f33879k;

    /* renamed from: l  reason: collision with root package name */
    private int f33880l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f33881m = n0.f29714f;

    /* renamed from: n  reason: collision with root package name */
    private int f33882n;

    /* renamed from: o  reason: collision with root package name */
    private long f33883o;

    @Override // l8.w, l8.f
    public ByteBuffer b() {
        int i10;
        if (super.d() && (i10 = this.f33882n) > 0) {
            l(i10).put(this.f33881m, 0, this.f33882n).flip();
            this.f33882n = 0;
        }
        return super.b();
    }

    @Override // l8.w, l8.f
    public boolean d() {
        return super.d() && this.f33882n == 0;
    }

    @Override // l8.f
    public void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f33880l);
        this.f33883o += min / this.f33944b.f33816d;
        this.f33880l -= min;
        byteBuffer.position(position + min);
        if (this.f33880l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f33882n + i11) - this.f33881m.length;
        ByteBuffer l10 = l(length);
        int q10 = n0.q(length, 0, this.f33882n);
        l10.put(this.f33881m, 0, q10);
        int q11 = n0.q(length - q10, 0, i11);
        byteBuffer.limit(byteBuffer.position() + q11);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - q11;
        int i13 = this.f33882n - q10;
        this.f33882n = i13;
        byte[] bArr = this.f33881m;
        System.arraycopy(bArr, q10, bArr, 0, i13);
        byteBuffer.get(this.f33881m, this.f33882n, i12);
        this.f33882n += i12;
        l10.flip();
    }

    @Override // l8.w
    public f.a h(f.a aVar) throws f.b {
        if (aVar.f33815c == 2) {
            this.f33879k = true;
            return (this.f33877i == 0 && this.f33878j == 0) ? f.a.f33812e : aVar;
        }
        throw new f.b(aVar);
    }

    @Override // l8.w
    protected void i() {
        if (this.f33879k) {
            this.f33879k = false;
            int i10 = this.f33878j;
            int i11 = this.f33944b.f33816d;
            this.f33881m = new byte[i10 * i11];
            this.f33880l = this.f33877i * i11;
        }
        this.f33882n = 0;
    }

    @Override // l8.w
    protected void j() {
        int i10;
        if (this.f33879k) {
            if (this.f33882n > 0) {
                this.f33883o += i10 / this.f33944b.f33816d;
            }
            this.f33882n = 0;
        }
    }

    @Override // l8.w
    protected void k() {
        this.f33881m = n0.f29714f;
    }

    public long m() {
        return this.f33883o;
    }

    public void n() {
        this.f33883o = 0L;
    }

    public void o(int i10, int i11) {
        this.f33877i = i10;
        this.f33878j = i11;
    }
}
