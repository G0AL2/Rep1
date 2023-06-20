package l8;

import com.inmobi.media.fq;
import ea.n0;
import java.nio.ByteBuffer;
import l8.f;

/* compiled from: FloatResamplingAudioProcessor.java */
/* loaded from: classes2.dex */
final class c0 extends w {

    /* renamed from: i  reason: collision with root package name */
    private static final int f33778i = Float.floatToIntBits(Float.NaN);

    private static void m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f33778i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // l8.f
    public void e(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f33944b.f33815c;
        if (i11 == 536870912) {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 2) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24), l10);
                position += 3;
            }
        } else if (i11 == 805306368) {
            l10 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(position + 1) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 2) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 3) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24), l10);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }

    @Override // l8.w
    public f.a h(f.a aVar) throws f.b {
        int i10 = aVar.f33815c;
        if (n0.t0(i10)) {
            if (i10 != 4) {
                return new f.a(aVar.f33813a, aVar.f33814b, 4);
            }
            return f.a.f33812e;
        }
        throw new f.b(aVar);
    }
}
