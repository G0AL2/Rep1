package p8;

import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import ea.n0;
import j8.j2;
import java.io.IOException;

/* compiled from: FlacFrameReader.java */
/* loaded from: classes2.dex */
public final class o {

    /* compiled from: FlacFrameReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f35674a;
    }

    private static boolean a(ea.a0 a0Var, r rVar, int i10) {
        int j10 = j(a0Var, i10);
        return j10 != -1 && j10 <= rVar.f35679b;
    }

    private static boolean b(ea.a0 a0Var, int i10) {
        return a0Var.D() == n0.u(a0Var.d(), i10, a0Var.e() - 1, 0);
    }

    private static boolean c(ea.a0 a0Var, r rVar, boolean z10, a aVar) {
        try {
            long K = a0Var.K();
            if (!z10) {
                K *= rVar.f35679b;
            }
            aVar.f35674a = K;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(ea.a0 a0Var, r rVar, int i10, a aVar) {
        int e10 = a0Var.e();
        long F = a0Var.F();
        long j10 = F >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) (15 & (F >> 4)), rVar) && f((int) ((F >> 1) & 7), rVar) && !(((F & 1) > 1L ? 1 : ((F & 1) == 1L ? 0 : -1)) == 0) && c(a0Var, rVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(a0Var, rVar, (int) ((F >> 12) & 15)) && e(a0Var, rVar, (int) ((F >> 8) & 15)) && b(a0Var, e10);
    }

    private static boolean e(ea.a0 a0Var, r rVar, int i10) {
        int i11 = rVar.f35682e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == rVar.f35683f;
        } else if (i10 == 12) {
            return a0Var.D() * 1000 == i11;
        } else if (i10 <= 14) {
            int J = a0Var.J();
            if (i10 == 14) {
                J *= 10;
            }
            return J == i11;
        } else {
            return false;
        }
    }

    private static boolean f(int i10, r rVar) {
        return i10 == 0 || i10 == rVar.f35686i;
    }

    private static boolean g(int i10, r rVar) {
        return i10 <= 7 ? i10 == rVar.f35684g - 1 : i10 <= 10 && rVar.f35684g == 2;
    }

    public static boolean h(j jVar, r rVar, int i10, a aVar) throws IOException {
        long i11 = jVar.i();
        byte[] bArr = new byte[2];
        jVar.p(bArr, 0, 2);
        if ((((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) != i10) {
            jVar.f();
            jVar.j((int) (i11 - jVar.getPosition()));
            return false;
        }
        ea.a0 a0Var = new ea.a0(16);
        System.arraycopy(bArr, 0, a0Var.d(), 0, 2);
        a0Var.O(l.c(jVar, a0Var.d(), 2, 14));
        jVar.f();
        jVar.j((int) (i11 - jVar.getPosition()));
        return d(a0Var, rVar, i10, aVar);
    }

    public static long i(j jVar, r rVar) throws IOException {
        jVar.f();
        jVar.j(1);
        byte[] bArr = new byte[1];
        jVar.p(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        jVar.j(2);
        int i10 = z10 ? 7 : 6;
        ea.a0 a0Var = new ea.a0(i10);
        a0Var.O(l.c(jVar, a0Var.d(), 0, i10));
        jVar.f();
        a aVar = new a();
        if (c(a0Var, rVar, z10, aVar)) {
            return aVar.f35674a;
        }
        throw j2.a(null, null);
    }

    public static int j(ea.a0 a0Var, int i10) {
        switch (i10) {
            case 1:
                return DownloadResource.STATUS_RUNNING;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a0Var.D() + 1;
            case 7:
                return a0Var.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
