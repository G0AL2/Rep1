package l8;

import java.nio.ByteBuffer;
import l8.f;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes2.dex */
final class x extends w {

    /* renamed from: i  reason: collision with root package name */
    private int[] f33951i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f33952j;

    @Override // l8.f
    public void e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ea.a.e(this.f33952j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f33944b.f33816d) * this.f33945c.f33816d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f33944b.f33816d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // l8.w
    public f.a h(f.a aVar) throws f.b {
        int[] iArr = this.f33951i;
        if (iArr == null) {
            return f.a.f33812e;
        }
        if (aVar.f33815c == 2) {
            boolean z10 = aVar.f33814b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 >= aVar.f33814b) {
                    throw new f.b(aVar);
                }
                z10 |= i11 != i10;
                i10++;
            }
            if (z10) {
                return new f.a(aVar.f33813a, iArr.length, 2);
            }
            return f.a.f33812e;
        }
        throw new f.b(aVar);
    }

    @Override // l8.w
    protected void i() {
        this.f33952j = this.f33951i;
    }

    @Override // l8.w
    protected void k() {
        this.f33952j = null;
        this.f33951i = null;
    }

    public void m(int[] iArr) {
        this.f33951i = iArr;
    }
}
