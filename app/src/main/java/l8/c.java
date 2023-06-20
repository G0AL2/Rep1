package l8;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import j8.p1;
import java.nio.ByteBuffer;

/* compiled from: Ac4Util.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f33773a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, DownloadResource.STATUS_BAD_REQUEST, DownloadResource.STATUS_BAD_REQUEST, 2048};

    /* compiled from: Ac4Util.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f33774a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33775b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33776c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33777d;

        private b(int i10, int i11, int i12, int i13, int i14) {
            this.f33775b = i11;
            this.f33774a = i12;
            this.f33776c = i13;
            this.f33777d = i14;
        }
    }

    public static void a(int i10, ea.a0 a0Var) {
        a0Var.L(7);
        byte[] d10 = a0Var.d();
        d10[0] = -84;
        d10[1] = 64;
        d10[2] = -1;
        d10[3] = -1;
        d10[4] = (byte) ((i10 >> 16) & 255);
        d10[5] = (byte) ((i10 >> 8) & 255);
        d10[6] = (byte) (i10 & 255);
    }

    public static p1 b(ea.a0 a0Var, String str, String str2, DrmInitData drmInitData) {
        a0Var.Q(1);
        return new p1.b().S(str).e0("audio/ac4").H(2).f0(((a0Var.D() & 32) >> 5) == 1 ? 48000 : 44100).M(drmInitData).V(str2).E();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return d(new ea.z(bArr)).f33777d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        if (r10 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        if (r10 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
        if (r10 != 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l8.c.b d(ea.z r10) {
        /*
            r0 = 16
            int r1 = r10.h(r0)
            int r0 = r10.h(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.h(r0)
            r3 = 7
            goto L19
        L18:
            r3 = 4
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.h(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = f(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.h(r1)
            boolean r5 = r10.g()
            if (r5 == 0) goto L45
            int r5 = r10.h(r3)
            if (r5 <= 0) goto L45
            r10.r(r0)
        L45:
            boolean r5 = r10.g()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L55
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L58
        L55:
            r9 = 44100(0xac44, float:6.1797E-41)
        L58:
            int r10 = r10.h(r2)
            r5 = 0
            if (r9 != r8) goto L69
            r8 = 13
            if (r10 != r8) goto L69
            int[] r0 = l8.c.f33773a
            r10 = r0[r10]
            r8 = r10
            goto L99
        L69:
            if (r9 != r6) goto L98
            int[] r6 = l8.c.f33773a
            int r8 = r6.length
            if (r10 >= r8) goto L98
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8e
            r8 = 11
            if (r1 == r0) goto L89
            if (r1 == r3) goto L8e
            if (r1 == r2) goto L82
            goto L93
        L82:
            if (r10 == r3) goto L95
            if (r10 == r6) goto L95
            if (r10 != r8) goto L93
            goto L95
        L89:
            if (r10 == r6) goto L95
            if (r10 != r8) goto L93
            goto L95
        L8e:
            if (r10 == r3) goto L95
            if (r10 != r6) goto L93
            goto L95
        L93:
            r8 = r5
            goto L99
        L95:
            int r5 = r5 + 1
            goto L93
        L98:
            r8 = 0
        L99:
            l8.c$b r10 = new l8.c$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.c.d(ea.z):l8.c$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        if (i12 == 65535) {
            i12 = ((bArr[4] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & fq.i.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int f(ea.z zVar, int i10) {
        int i11 = 0;
        while (true) {
            int h10 = i11 + zVar.h(i10);
            if (!zVar.g()) {
                return h10;
            }
            i11 = (h10 + 1) << i10;
        }
    }
}
