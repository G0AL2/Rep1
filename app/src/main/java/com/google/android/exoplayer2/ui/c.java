package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ba.u;
import ca.n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.l;
import com.inmobi.media.jh;
import ea.d0;
import ea.n0;
import fa.v;
import i9.y0;
import j8.b2;
import j8.j3;
import j8.m1;
import j8.m2;
import j8.n3;
import j8.o2;
import j8.p2;
import j8.q2;
import j8.x1;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PlayerControlView.java */
/* loaded from: classes2.dex */
public class c extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private p2 G;
    private d H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private long U;
    private long[] V;
    private boolean[] W;

    /* renamed from: a */
    private final View$OnClickListenerC0292c f21685a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<e> f21686b;

    /* renamed from: c */
    private final View f21687c;

    /* renamed from: d */
    private final View f21688d;

    /* renamed from: e */
    private final View f21689e;

    /* renamed from: f */
    private final View f21690f;

    /* renamed from: g */
    private final View f21691g;

    /* renamed from: g0 */
    private long[] f21692g0;

    /* renamed from: h */
    private final View f21693h;

    /* renamed from: h0 */
    private boolean[] f21694h0;

    /* renamed from: i */
    private final ImageView f21695i;

    /* renamed from: i0 */
    private long f21696i0;

    /* renamed from: j */
    private final ImageView f21697j;

    /* renamed from: j0 */
    private long f21698j0;

    /* renamed from: k */
    private final View f21699k;

    /* renamed from: k0 */
    private long f21700k0;

    /* renamed from: l */
    private final TextView f21701l;

    /* renamed from: m */
    private final TextView f21702m;

    /* renamed from: n */
    private final l f21703n;

    /* renamed from: o */
    private final StringBuilder f21704o;

    /* renamed from: p */
    private final Formatter f21705p;

    /* renamed from: q */
    private final j3.b f21706q;

    /* renamed from: r */
    private final j3.c f21707r;

    /* renamed from: s */
    private final Runnable f21708s;

    /* renamed from: t */
    private final Runnable f21709t;

    /* renamed from: u */
    private final Drawable f21710u;

    /* renamed from: v */
    private final Drawable f21711v;

    /* renamed from: w */
    private final Drawable f21712w;

    /* renamed from: x */
    private final String f21713x;

    /* renamed from: y */
    private final String f21714y;

    /* renamed from: z */
    private final String f21715z;

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: com.google.android.exoplayer2.ui.c$c */
    /* loaded from: classes2.dex */
    public final class View$OnClickListenerC0292c implements p2.d, l.a, View.OnClickListener {
        private View$OnClickListenerC0292c() {
            c.this = r1;
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void A(l lVar, long j10, boolean z10) {
            c.this.L = false;
            if (z10 || c.this.G == null) {
                return;
            }
            c cVar = c.this;
            cVar.N(cVar.G, j10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void C(boolean z10) {
            q2.x(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void D(p2.b bVar) {
            q2.a(this, bVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void E(j8.m mVar) {
            q2.c(this, mVar);
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void F(l lVar, long j10) {
            c.this.L = true;
            if (c.this.f21702m != null) {
                c.this.f21702m.setText(n0.i0(c.this.f21704o, c.this.f21705p, j10));
            }
        }

        @Override // j8.p2.d
        public /* synthetic */ void H(int i10, boolean z10) {
            q2.d(this, i10, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void J() {
            q2.u(this);
        }

        @Override // j8.p2.d
        public /* synthetic */ void K(m2 m2Var) {
            q2.p(this, m2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void N(b2 b2Var) {
            q2.j(this, b2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void O(n3 n3Var) {
            q2.C(this, n3Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void P(int i10, int i11) {
            q2.z(this, i10, i11);
        }

        @Override // j8.p2.d
        public void T(p2 p2Var, p2.c cVar) {
            if (cVar.b(4, 5)) {
                c.this.T();
            }
            if (cVar.b(4, 5, 7)) {
                c.this.U();
            }
            if (cVar.a(8)) {
                c.this.V();
            }
            if (cVar.a(9)) {
                c.this.W();
            }
            if (cVar.b(8, 9, 11, 0, 13)) {
                c.this.S();
            }
            if (cVar.b(11, 0)) {
                c.this.X();
            }
        }

        @Override // j8.p2.d
        public /* synthetic */ void U(int i10) {
            q2.s(this, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void V(p2.e eVar, p2.e eVar2, int i10) {
            q2.t(this, eVar, eVar2, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void W(boolean z10) {
            q2.f(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void X() {
            q2.w(this);
        }

        @Override // j8.p2.d
        public /* synthetic */ void Y(float f10) {
            q2.E(this, f10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void Z(y0 y0Var, u uVar) {
            q2.B(this, y0Var, uVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void a(boolean z10) {
            q2.y(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void d(o2 o2Var) {
            q2.m(this, o2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void d0(boolean z10, int i10) {
            q2.r(this, z10, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void e0(m2 m2Var) {
            q2.q(this, m2Var);
        }

        @Override // j8.p2.d
        public /* synthetic */ void g(Metadata metadata) {
            q2.k(this, metadata);
        }

        @Override // j8.p2.d
        public /* synthetic */ void g0(j3 j3Var, int i10) {
            q2.A(this, j3Var, i10);
        }

        @Override // com.google.android.exoplayer2.ui.l.a
        public void h(l lVar, long j10) {
            if (c.this.f21702m != null) {
                c.this.f21702m.setText(n0.i0(c.this.f21704o, c.this.f21705p, j10));
            }
        }

        @Override // j8.p2.d
        public /* synthetic */ void h0(boolean z10, int i10) {
            q2.l(this, z10, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void j(v vVar) {
            q2.D(this, vVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void k(List list) {
            q2.b(this, list);
        }

        @Override // j8.p2.d
        public /* synthetic */ void k0(boolean z10) {
            q2.g(this, z10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p2 p2Var = c.this.G;
            if (p2Var == null) {
                return;
            }
            if (c.this.f21688d != view) {
                if (c.this.f21687c != view) {
                    if (c.this.f21691g != view) {
                        if (c.this.f21693h != view) {
                            if (c.this.f21689e == view) {
                                c.this.C(p2Var);
                                return;
                            } else if (c.this.f21690f == view) {
                                c.this.B(p2Var);
                                return;
                            } else if (c.this.f21695i != view) {
                                if (c.this.f21697j == view) {
                                    p2Var.F(!p2Var.X());
                                    return;
                                }
                                return;
                            } else {
                                p2Var.U(d0.a(p2Var.W(), c.this.O));
                                return;
                            }
                        }
                        p2Var.a0();
                        return;
                    } else if (p2Var.S() != 4) {
                        p2Var.Z();
                        return;
                    } else {
                        return;
                    }
                }
                p2Var.k();
                return;
            }
            p2Var.y();
        }

        @Override // j8.p2.d
        public /* synthetic */ void r(int i10) {
            q2.v(this, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void w(int i10) {
            q2.o(this, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void x(boolean z10) {
            q2.h(this, z10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void y(x1 x1Var, int i10) {
            q2.i(this, x1Var, i10);
        }

        @Override // j8.p2.d
        public /* synthetic */ void z(int i10) {
            q2.n(this, i10);
        }
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes2.dex */
    public interface d {
        void onProgressUpdate(long j10, long j11);
    }

    /* compiled from: PlayerControlView.java */
    /* loaded from: classes2.dex */
    public interface e {
        void onVisibilityChange(int i10);
    }

    static {
        m1.a("goog.exo.ui");
    }

    public c(Context context) {
        this(context, null);
    }

    public void B(p2 p2Var) {
        p2Var.pause();
    }

    public void C(p2 p2Var) {
        int S = p2Var.S();
        if (S == 1) {
            p2Var.a();
        } else if (S == 4) {
            M(p2Var, p2Var.T(), -9223372036854775807L);
        }
        p2Var.play();
    }

    private void D(p2 p2Var) {
        int S = p2Var.S();
        if (S != 1 && S != 4 && p2Var.E()) {
            B(p2Var);
        } else {
            C(p2Var);
        }
    }

    private static int E(TypedArray typedArray, int i10) {
        return typedArray.getInt(n.f5422t, i10);
    }

    private void G() {
        removeCallbacks(this.f21709t);
        if (this.M > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i10 = this.M;
            this.U = uptimeMillis + i10;
            if (this.I) {
                postDelayed(this.f21709t, i10);
                return;
            }
            return;
        }
        this.U = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean H(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private void K() {
        View view;
        View view2;
        boolean O = O();
        if (!O && (view2 = this.f21689e) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (!O || (view = this.f21690f) == null) {
        } else {
            view.sendAccessibilityEvent(8);
        }
    }

    private void L() {
        View view;
        View view2;
        boolean O = O();
        if (!O && (view2 = this.f21689e) != null) {
            view2.requestFocus();
        } else if (!O || (view = this.f21690f) == null) {
        } else {
            view.requestFocus();
        }
    }

    private void M(p2 p2Var, int i10, long j10) {
        p2Var.C(i10, j10);
    }

    public void N(p2 p2Var, long j10) {
        int T;
        j3 w10 = p2Var.w();
        if (this.K && !w10.q()) {
            int p10 = w10.p();
            T = 0;
            while (true) {
                long f10 = w10.n(T, this.f21707r).f();
                if (j10 < f10) {
                    break;
                } else if (T == p10 - 1) {
                    j10 = f10;
                    break;
                } else {
                    j10 -= f10;
                    T++;
                }
            }
        } else {
            T = p2Var.T();
        }
        M(p2Var, T, j10);
        U();
    }

    private boolean O() {
        p2 p2Var = this.G;
        return (p2Var == null || p2Var.S() == 4 || this.G.S() == 1 || !this.G.E()) ? false : true;
    }

    private void Q() {
        T();
        S();
        V();
        W();
        X();
    }

    private void R(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.C : this.D);
        view.setVisibility(z10 ? 0 : 8);
    }

    public void S() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (I() && this.I) {
            p2 p2Var = this.G;
            boolean z14 = false;
            if (p2Var != null) {
                boolean s10 = p2Var.s(5);
                boolean s11 = p2Var.s(7);
                z12 = p2Var.s(11);
                z13 = p2Var.s(12);
                z10 = p2Var.s(9);
                z11 = s10;
                z14 = s11;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            R(this.R, z14, this.f21687c);
            R(this.P, z12, this.f21693h);
            R(this.Q, z13, this.f21691g);
            R(this.S, z10, this.f21688d);
            l lVar = this.f21703n;
            if (lVar != null) {
                lVar.setEnabled(z11);
            }
        }
    }

    public void T() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (I() && this.I) {
            boolean O = O();
            View view = this.f21689e;
            boolean z13 = true;
            if (view != null) {
                z10 = (O && view.isFocused()) | false;
                if (n0.f29709a < 21) {
                    z12 = z10;
                } else {
                    z12 = O && b.a(this.f21689e);
                }
                z11 = z12 | false;
                this.f21689e.setVisibility(O ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f21690f;
            if (view2 != null) {
                z10 |= !O && view2.isFocused();
                if (n0.f29709a < 21) {
                    z13 = z10;
                } else if (O || !b.a(this.f21690f)) {
                    z13 = false;
                }
                z11 |= z13;
                this.f21690f.setVisibility(O ? 0 : 8);
            }
            if (z10) {
                L();
            }
            if (z11) {
                K();
            }
        }
    }

    public void U() {
        long j10;
        float f10;
        if (I() && this.I) {
            p2 p2Var = this.G;
            long j11 = 0;
            if (p2Var != null) {
                j11 = this.f21696i0 + p2Var.P();
                j10 = this.f21696i0 + p2Var.Y();
            } else {
                j10 = 0;
            }
            boolean z10 = j11 != this.f21698j0;
            boolean z11 = j10 != this.f21700k0;
            this.f21698j0 = j11;
            this.f21700k0 = j10;
            TextView textView = this.f21702m;
            if (textView != null && !this.L && z10) {
                textView.setText(n0.i0(this.f21704o, this.f21705p, j11));
            }
            l lVar = this.f21703n;
            if (lVar != null) {
                lVar.setPosition(j11);
                this.f21703n.setBufferedPosition(j10);
            }
            d dVar = this.H;
            if (dVar != null && (z10 || z11)) {
                dVar.onProgressUpdate(j11, j10);
            }
            removeCallbacks(this.f21708s);
            int S = p2Var == null ? 1 : p2Var.S();
            if (p2Var == null || !p2Var.isPlaying()) {
                if (S == 4 || S == 1) {
                    return;
                }
                postDelayed(this.f21708s, 1000L);
                return;
            }
            l lVar2 = this.f21703n;
            long min = Math.min(lVar2 != null ? lVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
            postDelayed(this.f21708s, n0.r(p2Var.c().f32664a > 0.0f ? ((float) min) / f10 : 1000L, this.N, 1000L));
        }
    }

    public void V() {
        ImageView imageView;
        if (I() && this.I && (imageView = this.f21695i) != null) {
            if (this.O == 0) {
                R(false, false, imageView);
                return;
            }
            p2 p2Var = this.G;
            if (p2Var == null) {
                R(true, false, imageView);
                this.f21695i.setImageDrawable(this.f21710u);
                this.f21695i.setContentDescription(this.f21713x);
                return;
            }
            R(true, true, imageView);
            int W = p2Var.W();
            if (W == 0) {
                this.f21695i.setImageDrawable(this.f21710u);
                this.f21695i.setContentDescription(this.f21713x);
            } else if (W == 1) {
                this.f21695i.setImageDrawable(this.f21711v);
                this.f21695i.setContentDescription(this.f21714y);
            } else if (W == 2) {
                this.f21695i.setImageDrawable(this.f21712w);
                this.f21695i.setContentDescription(this.f21715z);
            }
            this.f21695i.setVisibility(0);
        }
    }

    public void W() {
        ImageView imageView;
        String str;
        if (I() && this.I && (imageView = this.f21697j) != null) {
            p2 p2Var = this.G;
            if (!this.T) {
                R(false, false, imageView);
            } else if (p2Var == null) {
                R(true, false, imageView);
                this.f21697j.setImageDrawable(this.B);
                this.f21697j.setContentDescription(this.F);
            } else {
                R(true, true, imageView);
                this.f21697j.setImageDrawable(p2Var.X() ? this.A : this.B);
                ImageView imageView2 = this.f21697j;
                if (p2Var.X()) {
                    str = this.E;
                } else {
                    str = this.F;
                }
                imageView2.setContentDescription(str);
            }
        }
    }

    public void X() {
        int i10;
        j3.c cVar;
        p2 p2Var = this.G;
        if (p2Var == null) {
            return;
        }
        boolean z10 = true;
        this.K = this.J && z(p2Var.w(), this.f21707r);
        long j10 = 0;
        this.f21696i0 = 0L;
        j3 w10 = p2Var.w();
        if (w10.q()) {
            i10 = 0;
        } else {
            int T = p2Var.T();
            boolean z11 = this.K;
            int i11 = z11 ? 0 : T;
            int p10 = z11 ? w10.p() - 1 : T;
            long j11 = 0;
            i10 = 0;
            while (true) {
                if (i11 > p10) {
                    break;
                }
                if (i11 == T) {
                    this.f21696i0 = n0.Z0(j11);
                }
                w10.n(i11, this.f21707r);
                j3.c cVar2 = this.f21707r;
                if (cVar2.f32532n == -9223372036854775807L) {
                    ea.a.f(this.K ^ z10);
                    break;
                }
                int i12 = cVar2.f32533o;
                while (true) {
                    cVar = this.f21707r;
                    if (i12 <= cVar.f32534p) {
                        w10.f(i12, this.f21706q);
                        int e10 = this.f21706q.e();
                        for (int q10 = this.f21706q.q(); q10 < e10; q10++) {
                            long h10 = this.f21706q.h(q10);
                            if (h10 == Long.MIN_VALUE) {
                                long j12 = this.f21706q.f32511d;
                                if (j12 != -9223372036854775807L) {
                                    h10 = j12;
                                }
                            }
                            long p11 = h10 + this.f21706q.p();
                            if (p11 >= 0) {
                                long[] jArr = this.V;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.V = Arrays.copyOf(jArr, length);
                                    this.W = Arrays.copyOf(this.W, length);
                                }
                                this.V[i10] = n0.Z0(j11 + p11);
                                this.W[i10] = this.f21706q.r(q10);
                                i10++;
                            }
                        }
                        i12++;
                    }
                }
                j11 += cVar.f32532n;
                i11++;
                z10 = true;
            }
            j10 = j11;
        }
        long Z0 = n0.Z0(j10);
        TextView textView = this.f21701l;
        if (textView != null) {
            textView.setText(n0.i0(this.f21704o, this.f21705p, Z0));
        }
        l lVar = this.f21703n;
        if (lVar != null) {
            lVar.setDuration(Z0);
            int length2 = this.f21692g0.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.V;
            if (i13 > jArr2.length) {
                this.V = Arrays.copyOf(jArr2, i13);
                this.W = Arrays.copyOf(this.W, i13);
            }
            System.arraycopy(this.f21692g0, 0, this.V, i10, length2);
            System.arraycopy(this.f21694h0, 0, this.W, i10, length2);
            this.f21703n.b(this.V, this.W, i13);
        }
        U();
    }

    public static /* synthetic */ void a(c cVar) {
        cVar.U();
    }

    private static boolean z(j3 j3Var, j3.c cVar) {
        if (j3Var.p() > 100) {
            return false;
        }
        int p10 = j3Var.p();
        for (int i10 = 0; i10 < p10; i10++) {
            if (j3Var.n(i10, cVar).f32532n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        p2 p2Var = this.G;
        if (p2Var == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (p2Var.S() != 4) {
                    p2Var.Z();
                    return true;
                }
                return true;
            } else if (keyCode == 89) {
                p2Var.a0();
                return true;
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    D(p2Var);
                    return true;
                } else if (keyCode == 87) {
                    p2Var.y();
                    return true;
                } else if (keyCode == 88) {
                    p2Var.k();
                    return true;
                } else if (keyCode == 126) {
                    C(p2Var);
                    return true;
                } else if (keyCode != 127) {
                    return true;
                } else {
                    B(p2Var);
                    return true;
                }
            } else {
                return true;
            }
        }
        return true;
    }

    public void F() {
        if (I()) {
            setVisibility(8);
            Iterator<e> it = this.f21686b.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.f21708s);
            removeCallbacks(this.f21709t);
            this.U = -9223372036854775807L;
        }
    }

    public boolean I() {
        return getVisibility() == 0;
    }

    public void J(e eVar) {
        this.f21686b.remove(eVar);
    }

    public void P() {
        if (!I()) {
            setVisibility(0);
            Iterator<e> it = this.f21686b.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            Q();
            L();
            K();
        }
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f21709t);
        } else if (motionEvent.getAction() == 1) {
            G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public p2 getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        View view = this.f21699k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        long j10 = this.U;
        if (j10 != -9223372036854775807L) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                F();
            } else {
                postDelayed(this.f21709t, uptimeMillis);
            }
        } else if (I()) {
            G();
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        removeCallbacks(this.f21708s);
        removeCallbacks(this.f21709t);
    }

    public void setPlayer(p2 p2Var) {
        boolean z10 = true;
        ea.a.f(Looper.myLooper() == Looper.getMainLooper());
        if (p2Var != null && p2Var.x() != Looper.getMainLooper()) {
            z10 = false;
        }
        ea.a.a(z10);
        p2 p2Var2 = this.G;
        if (p2Var2 == p2Var) {
            return;
        }
        if (p2Var2 != null) {
            p2Var2.p(this.f21685a);
        }
        this.G = p2Var;
        if (p2Var != null) {
            p2Var.i(this.f21685a);
        }
        Q();
    }

    public void setProgressUpdateListener(d dVar) {
        this.H = dVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.O = i10;
        p2 p2Var = this.G;
        if (p2Var != null) {
            int W = p2Var.W();
            if (i10 == 0 && W != 0) {
                this.G.U(0);
            } else if (i10 == 1 && W == 2) {
                this.G.U(1);
            } else if (i10 == 2 && W == 1) {
                this.G.U(2);
            }
        }
        V();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.Q = z10;
        S();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.J = z10;
        X();
    }

    public void setShowNextButton(boolean z10) {
        this.S = z10;
        S();
    }

    public void setShowPreviousButton(boolean z10) {
        this.R = z10;
        S();
    }

    public void setShowRewindButton(boolean z10) {
        this.P = z10;
        S();
    }

    public void setShowShuffleButton(boolean z10) {
        this.T = z10;
        W();
    }

    public void setShowTimeoutMs(int i10) {
        this.M = i10;
        if (I()) {
            G();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f21699k;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.N = n0.q(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f21699k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            R(getShowVrButton(), onClickListener != null, this.f21699k);
        }
    }

    public void y(e eVar) {
        ea.a.e(eVar);
        this.f21686b.add(eVar);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11 = ca.l.f5379b;
        this.M = jh.DEFAULT_BITMAP_TIMEOUT;
        this.O = 0;
        this.N = 200;
        this.U = -9223372036854775807L;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, n.f5420r, i10, 0);
            try {
                this.M = obtainStyledAttributes.getInt(n.f5428z, this.M);
                i11 = obtainStyledAttributes.getResourceId(n.f5421s, i11);
                this.O = E(obtainStyledAttributes, this.O);
                this.P = obtainStyledAttributes.getBoolean(n.f5426x, this.P);
                this.Q = obtainStyledAttributes.getBoolean(n.f5423u, this.Q);
                this.R = obtainStyledAttributes.getBoolean(n.f5425w, this.R);
                this.S = obtainStyledAttributes.getBoolean(n.f5424v, this.S);
                this.T = obtainStyledAttributes.getBoolean(n.f5427y, this.T);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(n.A, this.N));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f21686b = new CopyOnWriteArrayList<>();
        this.f21706q = new j3.b();
        this.f21707r = new j3.c();
        StringBuilder sb2 = new StringBuilder();
        this.f21704o = sb2;
        this.f21705p = new Formatter(sb2, Locale.getDefault());
        this.V = new long[0];
        this.W = new boolean[0];
        this.f21692g0 = new long[0];
        this.f21694h0 = new boolean[0];
        View$OnClickListenerC0292c view$OnClickListenerC0292c = new View$OnClickListenerC0292c();
        this.f21685a = view$OnClickListenerC0292c;
        this.f21708s = new Runnable() { // from class: ca.g
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.a(com.google.android.exoplayer2.ui.c.this);
            }
        };
        this.f21709t = new Runnable() { // from class: ca.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.ui.c.this.F();
            }
        };
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        int i12 = ca.j.f5368p;
        l lVar = (l) findViewById(i12);
        View findViewById = findViewById(ca.j.f5369q);
        if (lVar != null) {
            this.f21703n = lVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i12);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f21703n = defaultTimeBar;
        } else {
            this.f21703n = null;
        }
        this.f21701l = (TextView) findViewById(ca.j.f5359g);
        this.f21702m = (TextView) findViewById(ca.j.f5366n);
        l lVar2 = this.f21703n;
        if (lVar2 != null) {
            lVar2.a(view$OnClickListenerC0292c);
        }
        View findViewById2 = findViewById(ca.j.f5365m);
        this.f21689e = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(view$OnClickListenerC0292c);
        }
        View findViewById3 = findViewById(ca.j.f5364l);
        this.f21690f = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(view$OnClickListenerC0292c);
        }
        View findViewById4 = findViewById(ca.j.f5367o);
        this.f21687c = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(view$OnClickListenerC0292c);
        }
        View findViewById5 = findViewById(ca.j.f5362j);
        this.f21688d = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(view$OnClickListenerC0292c);
        }
        View findViewById6 = findViewById(ca.j.f5371s);
        this.f21693h = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(view$OnClickListenerC0292c);
        }
        View findViewById7 = findViewById(ca.j.f5361i);
        this.f21691g = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(view$OnClickListenerC0292c);
        }
        ImageView imageView = (ImageView) findViewById(ca.j.f5370r);
        this.f21695i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(view$OnClickListenerC0292c);
        }
        ImageView imageView2 = (ImageView) findViewById(ca.j.f5372t);
        this.f21697j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(view$OnClickListenerC0292c);
        }
        View findViewById8 = findViewById(ca.j.f5375w);
        this.f21699k = findViewById8;
        setShowVrButton(false);
        R(false, false, findViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(ca.k.f5377b) / 100.0f;
        this.D = resources.getInteger(ca.k.f5376a) / 100.0f;
        this.f21710u = resources.getDrawable(ca.i.f5348b);
        this.f21711v = resources.getDrawable(ca.i.f5349c);
        this.f21712w = resources.getDrawable(ca.i.f5347a);
        this.A = resources.getDrawable(ca.i.f5351e);
        this.B = resources.getDrawable(ca.i.f5350d);
        this.f21713x = resources.getString(ca.m.f5383c);
        this.f21714y = resources.getString(ca.m.f5384d);
        this.f21715z = resources.getString(ca.m.f5382b);
        this.E = resources.getString(ca.m.f5387g);
        this.F = resources.getString(ca.m.f5386f);
        this.f21698j0 = -9223372036854775807L;
        this.f21700k0 = -9223372036854775807L;
    }
}
