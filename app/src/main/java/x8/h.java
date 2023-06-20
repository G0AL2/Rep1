package x8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ea.a0;
import j8.j2;
import j8.p1;
import java.util.Arrays;
import java.util.List;
import jb.s;
import l8.f0;
import p8.d0;
import x8.i;

/* compiled from: OpusReader.java */
/* loaded from: classes2.dex */
final class h extends i {

    /* renamed from: n  reason: collision with root package name */
    private static final byte[] f38737n = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f38738o = {79, 112, 117, 115, 84, 97, 103, 115};

    private long n(byte[] bArr) {
        int i10 = bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = bArr[1] & 63;
        }
        int i13 = i10 >> 3;
        int i14 = i13 & 3;
        return i12 * (i13 >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i14 : i13 >= 12 ? 10000 << (i14 & 1) : i14 == 3 ? 60000 : 10000 << i14);
    }

    private static boolean o(a0 a0Var, byte[] bArr) {
        if (a0Var.a() < bArr.length) {
            return false;
        }
        int e10 = a0Var.e();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.j(bArr2, 0, bArr.length);
        a0Var.P(e10);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean p(a0 a0Var) {
        return o(a0Var, f38737n);
    }

    @Override // x8.i
    protected long f(a0 a0Var) {
        return c(n(a0Var.d()));
    }

    @Override // x8.i
    protected boolean h(a0 a0Var, long j10, i.b bVar) throws j2 {
        if (o(a0Var, f38737n)) {
            byte[] copyOf = Arrays.copyOf(a0Var.d(), a0Var.f());
            int c10 = f0.c(copyOf);
            List<byte[]> a10 = f0.a(copyOf);
            ea.a.f(bVar.f38752a == null);
            bVar.f38752a = new p1.b().e0("audio/opus").H(c10).f0(48000).T(a10).E();
            return true;
        }
        byte[] bArr = f38738o;
        if (o(a0Var, bArr)) {
            ea.a.h(bVar.f38752a);
            a0Var.Q(bArr.length);
            Metadata c11 = d0.c(s.q(d0.j(a0Var, false, false).f35632a));
            if (c11 == null) {
                return true;
            }
            bVar.f38752a = bVar.f38752a.b().X(c11.e(bVar.f38752a.f32707j)).E();
            return true;
        }
        ea.a.h(bVar.f38752a);
        return false;
    }
}
