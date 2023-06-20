package com.brentvatne.exoplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ba.u;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.SubtitleView;
import fa.v;
import i9.y0;
import j8.b2;
import j8.j3;
import j8.m;
import j8.m2;
import j8.n3;
import j8.o2;
import j8.p;
import j8.p2;
import j8.q2;
import j8.x1;
import java.util.List;

/* compiled from: ExoPlayerView.java */
@TargetApi(16)
/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f9106a;

    /* renamed from: b  reason: collision with root package name */
    private final View f9107b;

    /* renamed from: c  reason: collision with root package name */
    private final SubtitleView f9108c;

    /* renamed from: d  reason: collision with root package name */
    private final com.brentvatne.exoplayer.a f9109d;

    /* renamed from: e  reason: collision with root package name */
    private final b f9110e;

    /* renamed from: f  reason: collision with root package name */
    private p f9111f;

    /* renamed from: g  reason: collision with root package name */
    private Context f9112g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup.LayoutParams f9113h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9114i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9115j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9116k;

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f9117l;

    /* compiled from: ExoPlayerView.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d.this.getHeight(), 1073741824));
            d dVar2 = d.this;
            dVar2.layout(dVar2.getLeft(), d.this.getTop(), d.this.getRight(), d.this.getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExoPlayerView.java */
    /* loaded from: classes.dex */
    public final class b implements p2.d {
        private b() {
        }

        @Override // j8.p2.d
        public void C(boolean z10) {
        }

        @Override // j8.p2.d
        public /* synthetic */ void D(p2.b bVar) {
            q2.a(this, bVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void E(m mVar) {
            q2.c(this, mVar);
        }

        @Override // j8.p2.d
        public /* synthetic */ void H(int i10, boolean z10) {
            q2.d(this, i10, z10);
        }

        @Override // j8.p2.d
        public void J() {
            d.this.f9107b.setVisibility(4);
        }

        @Override // j8.p2.d
        public void K(m2 m2Var) {
        }

        @Override // j8.p2.d
        public /* synthetic */ void N(b2 b2Var) {
            q2.j(this, b2Var);
        }

        @Override // j8.p2.d
        public void O(n3 n3Var) {
            d.this.i();
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
        }

        @Override // j8.p2.d
        public void W(boolean z10) {
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
        public void d(o2 o2Var) {
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
        public void g0(j3 j3Var, int i10) {
        }

        @Override // j8.p2.d
        public void h0(boolean z10, int i10) {
        }

        @Override // j8.p2.d
        public void j(v vVar) {
            boolean z10 = d.this.f9109d.getAspectRatio() == 0.0f;
            com.brentvatne.exoplayer.a aVar = d.this.f9109d;
            int i10 = vVar.f30293b;
            aVar.setAspectRatio(i10 == 0 ? 1.0f : (vVar.f30292a * vVar.f30295d) / i10);
            if (z10) {
                d dVar = d.this;
                dVar.post(dVar.f9117l);
            }
        }

        @Override // j8.p2.d
        public void k(List<r9.b> list) {
            d.this.f9108c.k(list);
        }

        @Override // j8.p2.d
        public /* synthetic */ void k0(boolean z10) {
            q2.g(this, z10);
        }

        @Override // j8.p2.d
        public void r(int i10) {
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
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }
    }

    public d(Context context) {
        this(context, null);
    }

    private void f() {
        View view = this.f9106a;
        if (view instanceof TextureView) {
            this.f9111f.J((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f9111f.V((SurfaceView) view);
        }
    }

    private void h() {
        View view = this.f9106a;
        if (view instanceof TextureView) {
            this.f9111f.z((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f9111f.h((SurfaceView) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        p pVar = this.f9111f;
        if (pVar == null) {
            return;
        }
        u A = pVar.A();
        for (int i10 = 0; i10 < A.f5137a; i10++) {
            if (this.f9111f.B(i10) == 2 && A.a(i10) != null) {
                return;
            }
        }
        this.f9107b.setVisibility(this.f9116k ? 4 : 0);
    }

    private void j() {
        this.f9107b.setVisibility(this.f9116k ? 4 : 0);
    }

    private void k() {
        View view;
        if (this.f9114i && !this.f9115j) {
            view = new TextureView(this.f9112g);
        } else {
            SurfaceView surfaceView = new SurfaceView(this.f9112g);
            view = surfaceView;
            if (this.f9115j) {
                surfaceView.setSecure(true);
                view = surfaceView;
            }
        }
        view.setLayoutParams(this.f9113h);
        this.f9106a = view;
        if (this.f9109d.getChildAt(0) != null) {
            this.f9109d.removeViewAt(0);
        }
        this.f9109d.addView(this.f9106a, 0, this.f9113h);
        if (this.f9111f != null) {
            h();
        }
    }

    public void g() {
        this.f9109d.a();
    }

    public View getVideoSurfaceView() {
        return this.f9106a;
    }

    public void l(boolean z10) {
        if (z10 != this.f9115j) {
            this.f9115j = z10;
            k();
        }
    }

    public void setHideShutterView(boolean z10) {
        this.f9116k = z10;
        j();
    }

    public void setPlayer(p pVar) {
        p pVar2 = this.f9111f;
        if (pVar2 == pVar) {
            return;
        }
        if (pVar2 != null) {
            pVar2.p(this.f9110e);
            f();
        }
        this.f9111f = pVar;
        this.f9107b.setVisibility(this.f9116k ? 4 : 0);
        if (pVar != null) {
            h();
            pVar.i(this.f9110e);
        }
    }

    public void setResizeMode(int i10) {
        if (this.f9109d.getResizeMode() != i10) {
            this.f9109d.setResizeMode(i10);
            post(this.f9117l);
        }
    }

    public void setUseTextureView(boolean z10) {
        if (z10 != this.f9114i) {
            this.f9114i = z10;
            k();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f9114i = true;
        this.f9115j = false;
        this.f9116k = false;
        this.f9117l = new a();
        this.f9112g = context;
        this.f9113h = new ViewGroup.LayoutParams(-1, -1);
        this.f9110e = new b(this, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        com.brentvatne.exoplayer.a aVar = new com.brentvatne.exoplayer.a(context);
        this.f9109d = aVar;
        aVar.setLayoutParams(layoutParams);
        View view = new View(getContext());
        this.f9107b = view;
        view.setLayoutParams(this.f9113h);
        view.setBackgroundColor(androidx.core.content.b.d(context, 17170444));
        SubtitleView subtitleView = new SubtitleView(context);
        this.f9108c = subtitleView;
        subtitleView.setLayoutParams(this.f9113h);
        subtitleView.G();
        subtitleView.L();
        k();
        aVar.addView(view, 1, this.f9113h);
        aVar.addView(subtitleView, 2, this.f9113h);
        addViewInLayout(aVar, 0, layoutParams);
    }
}
