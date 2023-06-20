package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ba.u;
import ca.n;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.c;
import com.inmobi.media.jh;
import ea.n0;
import fa.v;
import i9.y0;
import j8.b2;
import j8.j3;
import j8.m2;
import j8.n3;
import j8.o2;
import j8.p2;
import j8.q2;
import j8.x1;
import java.util.ArrayList;
import java.util.List;
import jb.s;

/* compiled from: PlayerView.java */
@Deprecated
/* loaded from: classes2.dex */
public class d extends FrameLayout {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final a f21717a;

    /* renamed from: b  reason: collision with root package name */
    private final AspectRatioFrameLayout f21718b;

    /* renamed from: c  reason: collision with root package name */
    private final View f21719c;

    /* renamed from: d  reason: collision with root package name */
    private final View f21720d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f21721e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f21722f;

    /* renamed from: g  reason: collision with root package name */
    private final SubtitleView f21723g;

    /* renamed from: h  reason: collision with root package name */
    private final View f21724h;

    /* renamed from: i  reason: collision with root package name */
    private final TextView f21725i;

    /* renamed from: j  reason: collision with root package name */
    private final c f21726j;

    /* renamed from: k  reason: collision with root package name */
    private final FrameLayout f21727k;

    /* renamed from: l  reason: collision with root package name */
    private final FrameLayout f21728l;

    /* renamed from: m  reason: collision with root package name */
    private p2 f21729m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21730n;

    /* renamed from: o  reason: collision with root package name */
    private c.e f21731o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f21732p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f21733q;

    /* renamed from: r  reason: collision with root package name */
    private int f21734r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21735s;

    /* renamed from: t  reason: collision with root package name */
    private ea.j<? super m2> f21736t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f21737u;

    /* renamed from: v  reason: collision with root package name */
    private int f21738v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f21739w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f21740x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f21741y;

    /* renamed from: z  reason: collision with root package name */
    private int f21742z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerView.java */
    /* loaded from: classes2.dex */
    public final class a implements p2.d, View.OnLayoutChangeListener, View.OnClickListener, c.e {

        /* renamed from: a  reason: collision with root package name */
        private final j3.b f21743a = new j3.b();

        /* renamed from: b  reason: collision with root package name */
        private Object f21744b;

        public a() {
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

        @Override // j8.p2.d
        public /* synthetic */ void H(int i10, boolean z10) {
            q2.d(this, i10, z10);
        }

        @Override // j8.p2.d
        public void J() {
            if (d.this.f21719c != null) {
                d.this.f21719c.setVisibility(4);
            }
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
        public void O(n3 n3Var) {
            p2 p2Var = (p2) ea.a.e(d.this.f21729m);
            j3 w10 = p2Var.w();
            if (w10.q()) {
                this.f21744b = null;
            } else if (!p2Var.v().a().isEmpty()) {
                this.f21744b = w10.g(p2Var.I(), this.f21743a, true).f32509b;
            } else {
                Object obj = this.f21744b;
                if (obj != null) {
                    int b10 = w10.b(obj);
                    if (b10 != -1) {
                        if (p2Var.T() == w10.f(b10, this.f21743a).f32510c) {
                            return;
                        }
                    }
                    this.f21744b = null;
                }
            }
            d.this.L(false);
        }

        @Override // j8.p2.d
        public /* synthetic */ void P(int i10, int i11) {
            q2.z(this, i10, i11);
        }

        @Override // j8.p2.d
        public /* synthetic */ void T(p2 p2Var, p2.c cVar) {
            q2.e(this, p2Var, cVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void U(int i10) {
            q2.s(this, i10);
        }

        @Override // j8.p2.d
        public void V(p2.e eVar, p2.e eVar2, int i10) {
            if (d.this.w() && d.this.f21740x) {
                d.this.u();
            }
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

        @Override // j8.p2.d
        public void h0(boolean z10, int i10) {
            d.this.H();
            d.this.J();
        }

        @Override // j8.p2.d
        public void j(v vVar) {
            d.this.G();
        }

        @Override // j8.p2.d
        public void k(List<r9.b> list) {
            if (d.this.f21723g != null) {
                d.this.f21723g.setCues(list);
            }
        }

        @Override // j8.p2.d
        public /* synthetic */ void k0(boolean z10) {
            q2.g(this, z10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.F();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            d.o((TextureView) view, d.this.f21742z);
        }

        @Override // com.google.android.exoplayer2.ui.c.e
        public void onVisibilityChange(int i10) {
            d.this.I();
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
        public void z(int i10) {
            d.this.H();
            d.this.K();
            d.this.J();
        }
    }

    public d(Context context) {
        this(context, null);
    }

    private boolean A(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                y(this.f21718b, intrinsicWidth / intrinsicHeight);
                this.f21722f.setImageDrawable(drawable);
                this.f21722f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void B(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean C() {
        p2 p2Var = this.f21729m;
        if (p2Var == null) {
            return true;
        }
        int S = p2Var.S();
        return this.f21739w && (S == 1 || S == 4 || !this.f21729m.E());
    }

    private void E(boolean z10) {
        if (N()) {
            this.f21726j.setShowTimeoutMs(z10 ? 0 : this.f21738v);
            this.f21726j.P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F() {
        if (!N() || this.f21729m == null) {
            return false;
        }
        if (!this.f21726j.I()) {
            x(true);
        } else if (this.f21741y) {
            this.f21726j.F();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        p2 p2Var = this.f21729m;
        v K = p2Var != null ? p2Var.K() : v.f30291e;
        int i10 = K.f30292a;
        int i11 = K.f30293b;
        int i12 = K.f30294c;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * K.f30295d) / i11;
        View view = this.f21720d;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.f21742z != 0) {
                view.removeOnLayoutChangeListener(this.f21717a);
            }
            this.f21742z = i12;
            if (i12 != 0) {
                this.f21720d.addOnLayoutChangeListener(this.f21717a);
            }
            o((TextureView) this.f21720d, this.f21742z);
        }
        y(this.f21718b, this.f21721e ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        int i10;
        if (this.f21724h != null) {
            p2 p2Var = this.f21729m;
            boolean z10 = true;
            if (p2Var == null || p2Var.S() != 2 || ((i10 = this.f21734r) != 2 && (i10 != 1 || !this.f21729m.E()))) {
                z10 = false;
            }
            this.f21724h.setVisibility(z10 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        c cVar = this.f21726j;
        if (cVar != null && this.f21730n) {
            if (cVar.getVisibility() == 0) {
                setContentDescription(this.f21741y ? getResources().getString(ca.m.f5381a) : null);
                return;
            } else {
                setContentDescription(getResources().getString(ca.m.f5385e));
                return;
            }
        }
        setContentDescription(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (w() && this.f21740x) {
            u();
        } else {
            x(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        ea.j<? super m2> jVar;
        TextView textView = this.f21725i;
        if (textView != null) {
            CharSequence charSequence = this.f21737u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f21725i.setVisibility(0);
                return;
            }
            p2 p2Var = this.f21729m;
            m2 l10 = p2Var != null ? p2Var.l() : null;
            if (l10 != null && (jVar = this.f21736t) != null) {
                this.f21725i.setText((CharSequence) jVar.a(l10).second);
                this.f21725i.setVisibility(0);
                return;
            }
            this.f21725i.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(boolean z10) {
        p2 p2Var = this.f21729m;
        if (p2Var != null && p2Var.s(30) && !p2Var.v().a().isEmpty()) {
            if (z10 && !this.f21735s) {
                p();
            }
            if (p2Var.v().b(2)) {
                t();
                return;
            }
            p();
            if (M() && (z(p2Var.b0()) || A(this.f21733q))) {
                return;
            }
            t();
        } else if (this.f21735s) {
        } else {
            t();
            p();
        }
    }

    private boolean M() {
        if (this.f21732p) {
            ea.a.h(this.f21722f);
            return true;
        }
        return false;
    }

    private boolean N() {
        if (this.f21730n) {
            ea.a.h(this.f21726j);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void p() {
        View view = this.f21719c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void q(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(ca.i.f5352f));
        imageView.setBackgroundColor(resources.getColor(ca.h.f5346a));
    }

    private static void r(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(ca.i.f5352f, null));
        imageView.setBackgroundColor(resources.getColor(ca.h.f5346a, null));
    }

    private void t() {
        ImageView imageView = this.f21722f;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f21722f.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean v(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w() {
        p2 p2Var = this.f21729m;
        return p2Var != null && p2Var.d() && this.f21729m.E();
    }

    private void x(boolean z10) {
        if (!(w() && this.f21740x) && N()) {
            boolean z11 = this.f21726j.I() && this.f21726j.getShowTimeoutMs() <= 0;
            boolean C = C();
            if (z10 || z11 || C) {
                E(C);
            }
        }
    }

    private boolean z(b2 b2Var) {
        byte[] bArr = b2Var.f32286k;
        if (bArr == null) {
            return false;
        }
        return A(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    public void D() {
        E(C());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        p2 p2Var = this.f21729m;
        if (p2Var != null && p2Var.d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean v10 = v(keyEvent.getKeyCode());
        if (v10 && N() && !this.f21726j.I()) {
            x(true);
        } else if (!s(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (v10 && N()) {
                x(true);
                return false;
            }
            return false;
        } else {
            x(true);
        }
        return true;
    }

    public List<ca.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f21728l;
        if (frameLayout != null) {
            arrayList.add(new ca.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        c cVar = this.f21726j;
        if (cVar != null) {
            arrayList.add(new ca.a(cVar, 1));
        }
        return s.p(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) ea.a.i(this.f21727k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f21739w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f21741y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f21738v;
    }

    public Drawable getDefaultArtwork() {
        return this.f21733q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f21728l;
    }

    public p2 getPlayer() {
        return this.f21729m;
    }

    public int getResizeMode() {
        ea.a.h(this.f21718b);
        return this.f21718b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f21723g;
    }

    public boolean getUseArtwork() {
        return this.f21732p;
    }

    public boolean getUseController() {
        return this.f21730n;
    }

    public View getVideoSurfaceView() {
        return this.f21720d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!N() || this.f21729m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.A) {
                this.A = false;
                performClick();
                return true;
            }
            return false;
        }
        this.A = true;
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!N() || this.f21729m == null) {
            return false;
        }
        x(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return F();
    }

    public boolean s(KeyEvent keyEvent) {
        return N() && this.f21726j.A(keyEvent);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        ea.a.h(this.f21718b);
        this.f21718b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f21739w = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f21740x = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21741y = z10;
        I();
    }

    public void setControllerShowTimeoutMs(int i10) {
        ea.a.h(this.f21726j);
        this.f21738v = i10;
        if (this.f21726j.I()) {
            D();
        }
    }

    public void setControllerVisibilityListener(c.e eVar) {
        ea.a.h(this.f21726j);
        c.e eVar2 = this.f21731o;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            this.f21726j.J(eVar2);
        }
        this.f21731o = eVar;
        if (eVar != null) {
            this.f21726j.y(eVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ea.a.f(this.f21725i != null);
        this.f21737u = charSequence;
        K();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f21733q != drawable) {
            this.f21733q = drawable;
            L(false);
        }
    }

    public void setErrorMessageProvider(ea.j<? super m2> jVar) {
        if (this.f21736t != jVar) {
            this.f21736t = jVar;
            K();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f21735s != z10) {
            this.f21735s = z10;
            L(false);
        }
    }

    public void setPlayer(p2 p2Var) {
        ea.a.f(Looper.myLooper() == Looper.getMainLooper());
        ea.a.a(p2Var == null || p2Var.x() == Looper.getMainLooper());
        p2 p2Var2 = this.f21729m;
        if (p2Var2 == p2Var) {
            return;
        }
        if (p2Var2 != null) {
            p2Var2.p(this.f21717a);
            if (p2Var2.s(27)) {
                View view = this.f21720d;
                if (view instanceof TextureView) {
                    p2Var2.J((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    p2Var2.V((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f21723g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f21729m = p2Var;
        if (N()) {
            this.f21726j.setPlayer(p2Var);
        }
        H();
        K();
        L(true);
        if (p2Var != null) {
            if (p2Var.s(27)) {
                View view2 = this.f21720d;
                if (view2 instanceof TextureView) {
                    p2Var.z((TextureView) view2);
                } else if (view2 instanceof SurfaceView) {
                    p2Var.h((SurfaceView) view2);
                }
                G();
            }
            if (this.f21723g != null && p2Var.s(28)) {
                this.f21723g.setCues(p2Var.q());
            }
            p2Var.i(this.f21717a);
            x(false);
            return;
        }
        u();
    }

    public void setRepeatToggleModes(int i10) {
        ea.a.h(this.f21726j);
        this.f21726j.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        ea.a.h(this.f21718b);
        this.f21718b.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f21734r != i10) {
            this.f21734r = i10;
            H();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21726j.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21726j.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21726j.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21726j.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21726j.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        ea.a.h(this.f21726j);
        this.f21726j.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f21719c;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        ea.a.f((z10 && this.f21722f == null) ? false : true);
        if (this.f21732p != z10) {
            this.f21732p = z10;
            L(false);
        }
    }

    public void setUseController(boolean z10) {
        ea.a.f((z10 && this.f21726j == null) ? false : true);
        if (this.f21730n == z10) {
            return;
        }
        this.f21730n = z10;
        if (N()) {
            this.f21726j.setPlayer(this.f21729m);
        } else {
            c cVar = this.f21726j;
            if (cVar != null) {
                cVar.F();
                this.f21726j.setPlayer(null);
            }
        }
        I();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f21720d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void u() {
        c cVar = this.f21726j;
        if (cVar != null) {
            cVar.F();
        }
    }

    protected void y(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        boolean z17;
        a aVar = new a();
        this.f21717a = aVar;
        if (isInEditMode()) {
            this.f21718b = null;
            this.f21719c = null;
            this.f21720d = null;
            this.f21721e = false;
            this.f21722f = null;
            this.f21723g = null;
            this.f21724h = null;
            this.f21725i = null;
            this.f21726j = null;
            this.f21727k = null;
            this.f21728l = null;
            ImageView imageView = new ImageView(context);
            if (n0.f29709a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i17 = ca.l.f5380c;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.B, i10, 0);
            try {
                int i18 = n.L;
                boolean hasValue = obtainStyledAttributes.hasValue(i18);
                int color = obtainStyledAttributes.getColor(i18, 0);
                int resourceId = obtainStyledAttributes.getResourceId(n.H, i17);
                boolean z18 = obtainStyledAttributes.getBoolean(n.N, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(n.D, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(n.O, true);
                int i19 = obtainStyledAttributes.getInt(n.M, 1);
                int i20 = obtainStyledAttributes.getInt(n.I, 0);
                int i21 = obtainStyledAttributes.getInt(n.K, jh.DEFAULT_BITMAP_TIMEOUT);
                boolean z20 = obtainStyledAttributes.getBoolean(n.F, true);
                boolean z21 = obtainStyledAttributes.getBoolean(n.C, true);
                i13 = obtainStyledAttributes.getInteger(n.J, 0);
                this.f21735s = obtainStyledAttributes.getBoolean(n.G, this.f21735s);
                boolean z22 = obtainStyledAttributes.getBoolean(n.E, true);
                obtainStyledAttributes.recycle();
                z12 = z20;
                z10 = z21;
                i12 = i20;
                z15 = z19;
                i16 = resourceId2;
                z14 = z18;
                z13 = hasValue;
                i15 = color;
                i14 = i19;
                i17 = resourceId;
                i11 = i21;
                z11 = z22;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = jh.DEFAULT_BITMAP_TIMEOUT;
            z10 = true;
            i12 = 0;
            z11 = true;
            i13 = 0;
            z12 = true;
            i14 = 1;
            i15 = 0;
            z13 = false;
            z14 = true;
            i16 = 0;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(ca.j.f5356d);
        this.f21718b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            B(aspectRatioFrameLayout, i12);
        }
        View findViewById = findViewById(ca.j.f5373u);
        this.f21719c = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout != null && i14 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                this.f21720d = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    this.f21720d = (View) Class.forName("ga.l").getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.f21720d.setLayoutParams(layoutParams);
                    this.f21720d.setOnClickListener(aVar);
                    this.f21720d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f21720d, 0);
                    z16 = z17;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i14 != 4) {
                this.f21720d = new SurfaceView(context);
            } else {
                try {
                    this.f21720d = (View) Class.forName("fa.f").getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z17 = false;
            this.f21720d.setLayoutParams(layoutParams);
            this.f21720d.setOnClickListener(aVar);
            this.f21720d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f21720d, 0);
            z16 = z17;
        } else {
            this.f21720d = null;
            z16 = false;
        }
        this.f21721e = z16;
        this.f21727k = (FrameLayout) findViewById(ca.j.f5353a);
        this.f21728l = (FrameLayout) findViewById(ca.j.f5363k);
        ImageView imageView2 = (ImageView) findViewById(ca.j.f5354b);
        this.f21722f = imageView2;
        this.f21732p = z14 && imageView2 != null;
        if (i16 != 0) {
            this.f21733q = androidx.core.content.b.f(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(ca.j.f5374v);
        this.f21723g = subtitleView;
        if (subtitleView != null) {
            subtitleView.G();
            subtitleView.L();
        }
        View findViewById2 = findViewById(ca.j.f5355c);
        this.f21724h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f21734r = i13;
        TextView textView = (TextView) findViewById(ca.j.f5360h);
        this.f21725i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i22 = ca.j.f5357e;
        c cVar = (c) findViewById(i22);
        View findViewById3 = findViewById(ca.j.f5358f);
        if (cVar != null) {
            this.f21726j = cVar;
        } else if (findViewById3 != null) {
            c cVar2 = new c(context, null, 0, attributeSet);
            this.f21726j = cVar2;
            cVar2.setId(i22);
            cVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(cVar2, indexOfChild);
        } else {
            this.f21726j = null;
        }
        c cVar3 = this.f21726j;
        this.f21738v = cVar3 != null ? i11 : 0;
        this.f21741y = z12;
        this.f21739w = z10;
        this.f21740x = z11;
        this.f21730n = z15 && cVar3 != null;
        u();
        I();
        c cVar4 = this.f21726j;
        if (cVar4 != null) {
            cVar4.y(aVar);
        }
    }
}
