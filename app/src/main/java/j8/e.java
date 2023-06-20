package j8;

import com.google.android.gms.common.api.Api;
import j8.j3;

/* compiled from: BasePlayer.java */
/* loaded from: classes2.dex */
public abstract class e implements p2 {

    /* renamed from: a  reason: collision with root package name */
    protected final j3.c f32377a = new j3.c();

    private int i0() {
        int W = W();
        if (W == 1) {
            return 0;
        }
        return W;
    }

    private void m0(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        N(Math.max(currentPosition, 0L));
    }

    @Override // j8.p2
    public final boolean L() {
        return h0() != -1;
    }

    @Override // j8.p2
    public final void N(long j10) {
        C(T(), j10);
    }

    @Override // j8.p2
    public final boolean R() {
        j3 w10 = w();
        return !w10.q() && w10.n(T(), this.f32377a).f32526h;
    }

    @Override // j8.p2
    public final void Z() {
        m0(O());
    }

    @Override // j8.p2
    public final void a0() {
        m0(-c0());
    }

    @Override // j8.p2
    public final boolean e0() {
        j3 w10 = w();
        return !w10.q() && w10.n(T(), this.f32377a).g();
    }

    @Override // j8.p2
    public final void f() {
        j(0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public final long f0() {
        j3 w10 = w();
        if (w10.q()) {
            return -9223372036854775807L;
        }
        return w10.n(T(), this.f32377a).f();
    }

    @Override // j8.p2
    public final int g() {
        long Q = Q();
        long duration = getDuration();
        if (Q == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return ea.n0.q((int) ((Q * 100) / duration), 0, 100);
    }

    public final int g0() {
        j3 w10 = w();
        if (w10.q()) {
            return -1;
        }
        return w10.e(T(), i0(), X());
    }

    public final int h0() {
        j3 w10 = w();
        if (w10.q()) {
            return -1;
        }
        return w10.l(T(), i0(), X());
    }

    @Override // j8.p2
    public final boolean isPlaying() {
        return S() == 3 && E() && u() == 0;
    }

    public final void j0() {
        k0(T());
    }

    @Override // j8.p2
    public final void k() {
        if (w().q() || d()) {
            return;
        }
        boolean L = L();
        if (e0() && !R()) {
            if (L) {
                n0();
            }
        } else if (L && getCurrentPosition() <= H()) {
            n0();
        } else {
            N(0L);
        }
    }

    public final void k0(int i10) {
        C(i10, -9223372036854775807L);
    }

    public final void l0() {
        int g02 = g0();
        if (g02 != -1) {
            k0(g02);
        }
    }

    public final void n0() {
        int h02 = h0();
        if (h02 != -1) {
            k0(h02);
        }
    }

    @Override // j8.p2
    public final boolean o() {
        return g0() != -1;
    }

    @Override // j8.p2
    public final void pause() {
        m(false);
    }

    @Override // j8.p2
    public final void play() {
        m(true);
    }

    @Override // j8.p2
    public final boolean s(int i10) {
        return D().b(i10);
    }

    @Override // j8.p2
    public final boolean t() {
        j3 w10 = w();
        return !w10.q() && w10.n(T(), this.f32377a).f32527i;
    }

    @Override // j8.p2
    public final void y() {
        if (w().q() || d()) {
            return;
        }
        if (o()) {
            l0();
        } else if (e0() && t()) {
            j0();
        }
    }
}
