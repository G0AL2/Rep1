package s8;

import ea.a0;
import ea.w;
import j8.j2;
import j8.p1;
import s8.e;

/* compiled from: VideoTagPayloadReader.java */
/* loaded from: classes2.dex */
final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f36817b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f36818c;

    /* renamed from: d  reason: collision with root package name */
    private int f36819d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36820e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36821f;

    /* renamed from: g  reason: collision with root package name */
    private int f36822g;

    public f(p8.a0 a0Var) {
        super(a0Var);
        this.f36817b = new a0(w.f29749a);
        this.f36818c = new a0(4);
    }

    @Override // s8.e
    protected boolean b(a0 a0Var) throws e.a {
        int D = a0Var.D();
        int i10 = (D >> 4) & 15;
        int i11 = D & 15;
        if (i11 == 7) {
            this.f36822g = i10;
            return i10 != 5;
        }
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("Video format not supported: ");
        sb2.append(i11);
        throw new e.a(sb2.toString());
    }

    @Override // s8.e
    protected boolean c(a0 a0Var, long j10) throws j2 {
        int D = a0Var.D();
        long o10 = j10 + (a0Var.o() * 1000);
        if (D == 0 && !this.f36820e) {
            a0 a0Var2 = new a0(new byte[a0Var.a()]);
            a0Var.j(a0Var2.d(), 0, a0Var.a());
            com.google.android.exoplayer2.video.a b10 = com.google.android.exoplayer2.video.a.b(a0Var2);
            this.f36819d = b10.f21806b;
            this.f36816a.d(new p1.b().e0("video/avc").I(b10.f21810f).j0(b10.f21807c).Q(b10.f21808d).a0(b10.f21809e).T(b10.f21805a).E());
            this.f36820e = true;
            return false;
        } else if (D == 1 && this.f36820e) {
            int i10 = this.f36822g == 1 ? 1 : 0;
            if (this.f36821f || i10 != 0) {
                byte[] d10 = this.f36818c.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i11 = 4 - this.f36819d;
                int i12 = 0;
                while (a0Var.a() > 0) {
                    a0Var.j(this.f36818c.d(), i11, this.f36819d);
                    this.f36818c.P(0);
                    int H = this.f36818c.H();
                    this.f36817b.P(0);
                    this.f36816a.a(this.f36817b, 4);
                    this.f36816a.a(a0Var, H);
                    i12 = i12 + 4 + H;
                }
                this.f36816a.e(o10, i10, i12, 0, null);
                this.f36821f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
