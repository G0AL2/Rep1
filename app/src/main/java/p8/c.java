package p8;

/* compiled from: CeaUtil.java */
/* loaded from: classes2.dex */
public final class c {
    public static void a(long j10, ea.a0 a0Var, a0[] a0VarArr) {
        while (true) {
            if (a0Var.a() <= 1) {
                return;
            }
            int c10 = c(a0Var);
            int c11 = c(a0Var);
            int e10 = a0Var.e() + c11;
            if (c11 == -1 || c11 > a0Var.a()) {
                ea.r.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                e10 = a0Var.f();
            } else if (c10 == 4 && c11 >= 8) {
                int D = a0Var.D();
                int J = a0Var.J();
                int n10 = J == 49 ? a0Var.n() : 0;
                int D2 = a0Var.D();
                if (J == 47) {
                    a0Var.Q(1);
                }
                boolean z10 = D == 181 && (J == 49 || J == 47) && D2 == 3;
                if (J == 49) {
                    z10 &= n10 == 1195456820;
                }
                if (z10) {
                    b(j10, a0Var, a0VarArr);
                }
            }
            a0Var.P(e10);
        }
    }

    public static void b(long j10, ea.a0 a0Var, a0[] a0VarArr) {
        int D = a0Var.D();
        if ((D & 64) != 0) {
            a0Var.Q(1);
            int i10 = (D & 31) * 3;
            int e10 = a0Var.e();
            for (a0 a0Var2 : a0VarArr) {
                a0Var.P(e10);
                a0Var2.a(a0Var, i10);
                if (j10 != -9223372036854775807L) {
                    a0Var2.e(j10, 1, i10, 0, null);
                }
            }
        }
    }

    private static int c(ea.a0 a0Var) {
        int i10 = 0;
        while (a0Var.a() != 0) {
            int D = a0Var.D();
            i10 += D;
            if (D != 255) {
                return i10;
            }
        }
        return -1;
    }
}
