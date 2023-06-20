package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.b;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class NativeVideoTsView extends FrameLayout implements c.a, x.a, b.a {

    /* renamed from: v  reason: collision with root package name */
    private static Integer f12864v = 0;

    /* renamed from: w  reason: collision with root package name */
    private static Integer f12865w = 1;
    private long A;
    private boolean B;
    private final x C;
    private boolean D;
    private final String E;
    private ViewStub F;
    private c.InterfaceC0450c G;
    private boolean H;
    private final AtomicBoolean I;
    private boolean J;
    private AtomicBoolean K;

    /* renamed from: a  reason: collision with root package name */
    protected final n f12866a;

    /* renamed from: b  reason: collision with root package name */
    protected m3.c f12867b;

    /* renamed from: c  reason: collision with root package name */
    protected FrameLayout f12868c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f12869d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12870e;

    /* renamed from: f  reason: collision with root package name */
    public j f12871f;

    /* renamed from: g  reason: collision with root package name */
    protected RelativeLayout f12872g;

    /* renamed from: h  reason: collision with root package name */
    protected ImageView f12873h;

    /* renamed from: i  reason: collision with root package name */
    protected ImageView f12874i;

    /* renamed from: j  reason: collision with root package name */
    protected ImageView f12875j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f12876k;

    /* renamed from: l  reason: collision with root package name */
    protected String f12877l;

    /* renamed from: m  reason: collision with root package name */
    protected int f12878m;

    /* renamed from: n  reason: collision with root package name */
    AtomicBoolean f12879n;

    /* renamed from: o  reason: collision with root package name */
    boolean f12880o;

    /* renamed from: p  reason: collision with root package name */
    public b f12881p;

    /* renamed from: q  reason: collision with root package name */
    private final Context f12882q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup f12883r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f12884s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f12885t;

    /* renamed from: u  reason: collision with root package name */
    private String f12886u;

    /* renamed from: x  reason: collision with root package name */
    private boolean f12887x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f12888y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12889z;

    /* loaded from: classes.dex */
    public interface a {
        void a(View view, int i10);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10, long j10, long j11, long j12, boolean z11);
    }

    public NativeVideoTsView(Context context, n nVar, boolean z10, j jVar) {
        this(context, nVar, z10, "embeded_ad", false, false, jVar);
    }

    private boolean A() {
        return this.f12885t;
    }

    private void B() {
        v.e(this.f12874i);
        v.e(this.f12872g);
    }

    private void d() {
        a(0L, 0);
        this.G = null;
    }

    private void e() {
        addView(a(this.f12882q));
        o();
    }

    private void n() {
        if (!(this instanceof NativeDrawVideoTsView) || this.f12879n.get() || h.d().r() == null) {
            return;
        }
        this.f12875j.setImageBitmap(h.d().r());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12875j.getLayoutParams();
        int b10 = (int) v.b(getContext(), this.f12878m);
        layoutParams.width = b10;
        layoutParams.height = b10;
        this.f12875j.setLayoutParams(layoutParams);
        this.f12879n.set(true);
    }

    private void o() {
        this.f12867b = new com.bytedance.sdk.openadsdk.core.video.nativevideo.b(this.f12882q, this.f12868c, this.f12866a, this.f12877l, !A(), this.f12887x, this.f12888y, this.f12871f);
        p();
        this.f12883r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NativeVideoTsView nativeVideoTsView;
                m3.c cVar;
                if (NativeVideoTsView.this.f12883r == null || NativeVideoTsView.this.f12883r.getViewTreeObserver() == null || (cVar = (nativeVideoTsView = NativeVideoTsView.this).f12867b) == null) {
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.video.nativevideo.b) cVar).a(nativeVideoTsView.f12883r.getWidth(), NativeVideoTsView.this.f12883r.getHeight());
                NativeVideoTsView.this.f12883r.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    private void p() {
        m3.c cVar = this.f12867b;
        if (cVar == null) {
            return;
        }
        cVar.d(this.f12884s);
        ((com.bytedance.sdk.openadsdk.core.video.nativevideo.b) this.f12867b).a((b.a) this);
        this.f12867b.a(this);
    }

    private void q() {
        m3.c cVar = this.f12867b;
        if (cVar == null) {
            o();
        } else if ((cVar instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.b) && !A()) {
            ((com.bytedance.sdk.openadsdk.core.video.nativevideo.b) this.f12867b).v();
        }
        if (this.f12867b == null || !this.I.get()) {
            return;
        }
        this.I.set(false);
        b();
        if (h()) {
            v.a((View) this.f12872g, 8);
            ImageView imageView = this.f12874i;
            if (imageView != null) {
                v.a((View) imageView, 8);
            }
            n nVar = this.f12866a;
            if (nVar != null && nVar.J() != null) {
                l3.c a10 = n.a(CacheDirFactory.getICacheDir(this.f12866a.aD()).a(), this.f12866a);
                a10.j(this.f12866a.Y());
                a10.b(this.f12883r.getWidth());
                a10.i(this.f12883r.getHeight());
                a10.m(this.f12866a.ac());
                a10.c(0L);
                a10.g(z());
                this.f12867b.a(a10);
                this.f12867b.c(false);
                return;
            }
            l.e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
        } else if (this.f12867b.q()) {
            l.b("NativeVideoAdView", "attachTask-mNativeVideoController.isPlayComplete()=" + this.f12867b.q());
            b(true);
        } else {
            l.c("NativeVideoAdView", "attachTask.......mRlImgCover.....VISIBLE");
            g();
            v.a((View) this.f12872g, 0);
        }
    }

    private void r() {
        this.f12881p = null;
        i();
        a(false);
        s();
    }

    private void s() {
        if (!this.I.get()) {
            this.I.set(true);
            m3.c cVar = this.f12867b;
            if (cVar != null) {
                cVar.a(true, 3);
            }
        }
        this.K.set(false);
    }

    private void t() {
        a(j(), f12864v.intValue());
        this.C.sendEmptyMessageDelayed(1, 500L);
    }

    private boolean u() {
        if (A()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void v() {
        if (A()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    private void w() {
        if (this.f12867b == null || A() || !com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", false)) {
            return;
        }
        boolean a10 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_native_video_complete", false);
        long a11 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_current_play_position", 0L);
        long a12 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_total_play_duration", this.f12867b.j() + this.f12867b.h());
        long a13 = com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_duration", this.f12867b.j());
        this.f12867b.c(a10);
        this.f12867b.a(a11);
        this.f12867b.b(a12);
        this.f12867b.c(a13);
        com.bytedance.sdk.openadsdk.multipro.d.a.a("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
        l.e("MultiProcess", "onResumeFeedNativeVideoControllerData-isComplete=" + a10 + ",position=" + a11 + ",totalPlayDuration=" + a12 + ",duration=" + a13);
    }

    private boolean x() {
        return 2 == m.h().c(u.f(this.f12866a));
    }

    private boolean y() {
        return 5 == m.h().c(u.f(this.f12866a));
    }

    private boolean z() {
        return this.f12869d;
    }

    @Override // m3.c.a
    public void a() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        n nVar = this.f12866a;
        if (nVar == null) {
            return;
        }
        int f10 = u.f(nVar);
        int c10 = m.h().c(f10);
        int c11 = o.c(m.a());
        if (c10 == 1) {
            this.f12884s = u.e(c11);
        } else if (c10 == 2) {
            this.f12884s = u.f(c11) || u.e(c11) || u.g(c11);
        } else if (c10 == 3) {
            this.f12884s = false;
        } else if (c10 == 4) {
            this.f12880o = true;
        } else if (c10 == 5) {
            this.f12884s = u.e(c11) || u.g(c11);
        }
        if (!this.f12885t) {
            if (!this.f12870e || !com.bytedance.sdk.openadsdk.core.nativeexpress.o.b(this.f12877l)) {
                this.f12869d = m.h().a(f10);
            }
        } else {
            this.f12869d = false;
        }
        if ("open_ad".equals(this.f12877l)) {
            this.f12884s = true;
            this.f12869d = true;
        }
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.d(this.f12884s);
        }
        this.f12870e = true;
    }

    @Override // m3.c.a
    public void b(long j10, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        if (k()) {
            return;
        }
        m();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.b.a
    public void f() {
        c.InterfaceC0450c interfaceC0450c = this.G;
        if (interfaceC0450c != null) {
            interfaceC0450c.a_();
        }
    }

    public void g() {
        ViewStub viewStub;
        if (this.f12882q == null || (viewStub = this.F) == null || viewStub.getParent() == null || this.f12866a == null || this.f12872g != null) {
            return;
        }
        this.f12872g = (RelativeLayout) this.F.inflate();
        this.f12873h = (ImageView) findViewById(t.e(this.f12882q, "tt_native_video_img_id"));
        ImageView imageView = (ImageView) findViewById(t.e(this.f12882q, "tt_native_video_play"));
        this.f12875j = imageView;
        if (this.f12876k) {
            v.a((View) imageView, 0);
        }
        if (this.f12866a.J() != null && this.f12866a.J().w() != null) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12866a.J().w(), this.f12873h);
        }
        ImageView imageView2 = this.f12875j;
        if (imageView2 != null) {
            imageView2.setClickable(true);
            this.f12875j.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NativeVideoTsView.this.c();
                }
            });
        }
        n();
    }

    public double getCurrentPlayTime() {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            return (cVar.g() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public m3.c getNativeVideoController() {
        return this.f12867b;
    }

    public boolean h() {
        return this.f12884s;
    }

    public void i() {
        m3.b o10;
        m3.c cVar = this.f12867b;
        if (cVar == null || (o10 = cVar.o()) == null) {
            return;
        }
        o10.a();
        View c10 = o10.c();
        if (c10 != null) {
            c10.setVisibility(8);
            if (c10.getParent() != null) {
                ((ViewGroup) c10.getParent()).removeView(c10);
            }
        }
    }

    boolean j() {
        return com.bytedance.sdk.openadsdk.core.x.a(this, 50, com.bytedance.sdk.openadsdk.core.nativeexpress.o.b(this.f12877l) ? 1 : 5);
    }

    public boolean k() {
        boolean z10 = false;
        if (o.c(m.a()) == 0) {
            return false;
        }
        if (this.f12867b.n() != null && this.f12867b.n().l()) {
            a(false, f12864v.intValue());
            x xVar = this.C;
            z10 = true;
            if (xVar != null) {
                xVar.removeMessages(1);
            }
        }
        return z10;
    }

    public void l() {
        if (getNativeVideoController() == null || !(getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.b)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.video.nativevideo.b bVar = (com.bytedance.sdk.openadsdk.core.video.nativevideo.b) getNativeVideoController();
        bVar.a(bVar.o(), this);
    }

    public void m() {
        if (o.c(m.a()) != 0 && j()) {
            if (this.f12867b.n() != null && this.f12867b.n().m()) {
                a(true, f12865w.intValue());
                b();
                x xVar = this.C;
                if (xVar != null) {
                    xVar.sendEmptyMessageDelayed(1, 500L);
                }
            } else if (h() || this.K.get()) {
            } else {
                this.K.set(true);
                B();
                n nVar = this.f12866a;
                if (nVar != null && nVar.J() != null) {
                    B();
                    this.f12866a.J();
                    l3.c a10 = n.a(CacheDirFactory.getICacheDir(this.f12866a.aD()).a(), this.f12866a);
                    a10.j(this.f12866a.Y());
                    a10.b(this.f12883r.getWidth());
                    a10.i(this.f12883r.getHeight());
                    a10.m(this.f12866a.ac());
                    a10.c(this.A);
                    a10.g(z());
                    a10.d(CacheDirFactory.getICacheDir(this.f12866a.aD()).a());
                    this.f12867b.a(a10);
                }
                x xVar2 = this.C;
                if (xVar2 != null) {
                    xVar2.sendEmptyMessageDelayed(1, 500L);
                }
                a(false);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        q();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        m3.c cVar;
        if (!this.f12885t && (bVar = this.f12881p) != null && (cVar = this.f12867b) != null) {
            bVar.a(cVar.q(), this.f12867b.j(), this.f12867b.k(), this.f12867b.g(), this.f12884s);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        r();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        m3.c cVar;
        m3.c cVar2;
        m3.c cVar3;
        m3.c cVar4;
        super.onWindowFocusChanged(z10);
        w();
        if (u() && (cVar4 = this.f12867b) != null && cVar4.q()) {
            v();
            v.a((View) this.f12872g, 8);
            b(true);
            d();
            return;
        }
        b();
        if (!A() && h() && (cVar2 = this.f12867b) != null && !cVar2.m()) {
            if (this.C != null) {
                if (z10 && (cVar3 = this.f12867b) != null && !cVar3.q()) {
                    this.C.obtainMessage(1).sendToTarget();
                    return;
                }
                this.C.removeMessages(1);
                a(false, f12864v.intValue());
            }
        } else if (h()) {
        } else {
            if (!z10 && (cVar = this.f12867b) != null && cVar.n() != null && this.f12867b.n().l()) {
                this.C.removeMessages(1);
                a(false, f12864v.intValue());
            } else if (z10) {
                this.C.obtainMessage(1).sendToTarget();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        m3.c cVar;
        n nVar;
        m3.c cVar2;
        m3.c cVar3;
        super.onWindowVisibilityChanged(i10);
        w();
        if (this.J) {
            this.J = i10 == 0;
        }
        if (u() && (cVar3 = this.f12867b) != null && cVar3.q()) {
            v();
            v.a((View) this.f12872g, 8);
            b(true);
            d();
            return;
        }
        b();
        if (A() || !h() || (cVar = this.f12867b) == null || cVar.m() || (nVar = this.f12866a) == null) {
            return;
        }
        if (this.f12889z && nVar.J() != null) {
            this.f12866a.J();
            l3.c a10 = n.a(CacheDirFactory.getICacheDir(this.f12866a.aD()).a(), this.f12866a);
            a10.j(this.f12866a.Y());
            a10.b(this.f12883r.getWidth());
            a10.i(this.f12883r.getHeight());
            a10.m(this.f12866a.ac());
            a10.c(this.A);
            a10.g(z());
            this.f12867b.a(a10);
            this.f12889z = false;
            v.a((View) this.f12872g, 8);
        } else {
            l.e("NativeVideoAdView", "attachTask materialMeta.getVideo() is null !!");
        }
        if (i10 != 0 || this.C == null || (cVar2 = this.f12867b) == null || cVar2.q()) {
            return;
        }
        this.C.obtainMessage(1).sendToTarget();
    }

    public void setAdCreativeClickListener(a aVar) {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            ((com.bytedance.sdk.openadsdk.core.video.nativevideo.b) cVar).a(aVar);
        }
    }

    public void setControllerStatusCallBack(b bVar) {
        this.f12881p = bVar;
    }

    public void setIsAutoPlay(boolean z10) {
        if (this.D) {
            return;
        }
        int c10 = m.h().c(u.f(this.f12866a));
        if (z10 && c10 != 4 && (!o.e(this.f12882q) ? !(!o.f(this.f12882q) ? o.d(this.f12882q) : x() || y()) : !x())) {
            z10 = false;
        }
        this.f12884s = z10;
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.d(z10);
        }
        if (!this.f12884s) {
            g();
            RelativeLayout relativeLayout = this.f12872g;
            if (relativeLayout != null) {
                v.a((View) relativeLayout, 0);
                n nVar = this.f12866a;
                if (nVar != null && nVar.J() != null) {
                    com.bytedance.sdk.openadsdk.i.d.a().a(this.f12866a.J().w(), this.f12873h);
                }
            }
        } else {
            v.a((View) this.f12872g, 8);
        }
        this.D = true;
    }

    public void setIsNeedShowDetail(boolean z10) {
        this.H = z10;
    }

    public void setIsQuiet(boolean z10) {
        this.f12869d = z10;
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.b(z10);
        }
    }

    public void setNativeVideoAdListener(c.a aVar) {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.a(aVar);
        }
    }

    public void setNativeVideoController(m3.c cVar) {
        this.f12867b = cVar;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z10) {
        this.f12876k = z10;
    }

    public void setVideoAdClickListenerTTNativeAd(TTNativeAd tTNativeAd) {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            ((com.bytedance.sdk.openadsdk.core.video.nativevideo.b) cVar).a(tTNativeAd);
        }
    }

    public void setVideoAdInteractionListener(c.InterfaceC0450c interfaceC0450c) {
        this.G = interfaceC0450c;
    }

    public void setVideoAdLoadListener(c.d dVar) {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.a(dVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.f12886u = str;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 4 || i10 == 8) {
            s();
        }
    }

    public NativeVideoTsView(Context context, n nVar, String str, boolean z10, boolean z11, j jVar) {
        this(context, nVar, false, str, z10, z11, jVar);
    }

    @Override // m3.c.a
    public void a(long j10, int i10) {
        c.InterfaceC0450c interfaceC0450c = this.G;
        if (interfaceC0450c != null) {
            interfaceC0450c.d_();
        }
    }

    public NativeVideoTsView(Context context, n nVar, j jVar) {
        this(context, nVar, false, jVar);
    }

    public NativeVideoTsView(Context context, n nVar, boolean z10, String str, boolean z11, boolean z12, j jVar) {
        super(context);
        this.f12884s = true;
        this.f12869d = true;
        this.f12885t = false;
        this.f12870e = false;
        this.f12887x = false;
        this.f12888y = true;
        this.f12876k = true;
        this.f12877l = "embeded_ad";
        this.f12878m = 50;
        this.f12889z = true;
        this.f12879n = new AtomicBoolean(false);
        this.B = false;
        this.C = new x(this);
        this.D = false;
        this.E = Build.MODEL;
        this.f12880o = false;
        this.H = true;
        this.I = new AtomicBoolean(false);
        this.J = true;
        this.K = new AtomicBoolean(false);
        if (jVar != null) {
            this.f12871f = jVar;
        }
        this.f12877l = str;
        this.f12882q = context;
        this.f12866a = nVar;
        this.f12885t = z10;
        setContentDescription("NativeVideoAdView");
        this.f12887x = z11;
        this.f12888y = z12;
        b();
        e();
    }

    @Override // m3.c.a
    public void a(long j10, long j11) {
        c.InterfaceC0450c interfaceC0450c = this.G;
        if (interfaceC0450c != null) {
            interfaceC0450c.a(j10, j11);
        }
    }

    private View a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setId(t.e(this.f12882q, "tt_native_video_layout"));
        layoutParams.gravity = 17;
        frameLayout.setVisibility(8);
        this.f12883r = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(t.e(this.f12882q, "tt_native_video_frame"));
        layoutParams2.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout.addView(frameLayout2);
        this.f12868c = frameLayout2;
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(t.e(this.f12882q, "tt_native_video_img_cover_viewStub"));
        viewStub.setLayoutResource(t.f(this.f12882q, "tt_native_video_img_cover_layout"));
        viewStub.setLayoutParams(layoutParams3);
        frameLayout.addView(viewStub);
        this.F = viewStub;
        return frameLayout;
    }

    public void b(boolean z10) {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.c(z10);
            m3.b o10 = this.f12867b.o();
            if (o10 != null) {
                o10.b();
                View c10 = o10.c();
                if (c10 != null) {
                    if (c10.getParent() != null) {
                        ((ViewGroup) c10.getParent()).removeView(c10);
                    }
                    c10.setVisibility(0);
                    addView(c10);
                    o10.a(this.f12866a, new WeakReference<>(this.f12882q), false);
                }
            }
        }
    }

    public boolean a(long j10, boolean z10, boolean z11) {
        boolean z12 = false;
        this.f12883r.setVisibility(0);
        if (this.f12867b == null) {
            this.f12867b = new com.bytedance.sdk.openadsdk.core.video.nativevideo.b(this.f12882q, this.f12868c, this.f12866a, this.f12877l, this.f12887x, this.f12888y, this.f12871f);
            p();
        }
        this.A = j10;
        if (A()) {
            this.f12867b.a(false);
            n nVar = this.f12866a;
            if (nVar != null && nVar.J() != null) {
                l3.c a10 = n.a(CacheDirFactory.getICacheDir(this.f12866a.aD()).a(), this.f12866a);
                a10.j(this.f12866a.Y());
                a10.b(this.f12883r.getWidth());
                a10.i(this.f12883r.getHeight());
                a10.m(this.f12866a.ac());
                a10.c(j10);
                a10.g(z());
                if (z11) {
                    this.f12867b.b(a10);
                    return true;
                }
                z12 = this.f12867b.a(a10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (((i10 > 0 && !z10 && !z11) || (i10 > 0 && z10 && !this.B)) && this.f12867b != null) {
                o.a aVar = new o.a();
                aVar.a(this.f12867b.g());
                aVar.c(this.f12867b.j());
                aVar.b(this.f12867b.h());
                com.bytedance.sdk.openadsdk.b.b.a.a.b(this.f12867b.o(), aVar);
            }
            return z12;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message.what != 1) {
            return;
        }
        t();
    }

    private void a(boolean z10, int i10) {
        if (this.f12866a == null || this.f12867b == null) {
            return;
        }
        boolean u10 = u();
        v();
        if (u10 && this.f12867b.q()) {
            l.b("NativeVideoAdView", "changeVideoStatus---isFromDetailPage()=" + u10 + "，mNativeVideoController.isPlayComplete()=" + this.f12867b.q());
            b(true);
            d();
        } else if (z10 && !this.f12867b.q() && !this.f12867b.m()) {
            if (this.f12867b.n() != null && this.f12867b.n().m()) {
                if (this.f12884s || i10 == 1) {
                    m3.c cVar = this.f12867b;
                    if (cVar != null) {
                        setIsQuiet(cVar.p());
                    }
                    if ("ALP-AL00".equals(this.E)) {
                        this.f12867b.d();
                    } else {
                        if (!h.d().q()) {
                            u10 = true;
                        }
                        ((com.bytedance.sdk.openadsdk.core.video.nativevideo.b) this.f12867b).h(u10);
                    }
                    a(false);
                    c.InterfaceC0450c interfaceC0450c = this.G;
                    if (interfaceC0450c != null) {
                        interfaceC0450c.c_();
                    }
                }
            } else if (this.f12884s && this.f12867b.n() == null) {
                if (!this.I.get()) {
                    this.I.set(true);
                }
                this.K.set(false);
                q();
            }
        } else if (this.f12867b.n() == null || !this.f12867b.n().l()) {
        } else {
            this.f12867b.b();
            a(true);
            c.InterfaceC0450c interfaceC0450c2 = this.G;
            if (interfaceC0450c2 != null) {
                interfaceC0450c2.b_();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.b.a
    public void a(int i10) {
        b();
    }

    protected void a(boolean z10) {
        if (this.f12874i == null) {
            this.f12874i = new ImageView(getContext());
            if (h.d().r() != null) {
                this.f12874i.setImageBitmap(h.d().r());
            } else {
                this.f12874i.setImageResource(t.d(m.a(), "tt_new_play_video"));
            }
            this.f12874i.setScaleType(ImageView.ScaleType.FIT_XY);
            int b10 = (int) v.b(getContext(), this.f12878m);
            int b11 = (int) v.b(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b10, b10);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = b11;
            layoutParams.bottomMargin = b11;
            this.f12883r.addView(this.f12874i, layoutParams);
            this.f12874i.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NativeVideoTsView.this.m();
                }
            });
        }
        if (z10) {
            this.f12874i.setVisibility(0);
        } else {
            this.f12874i.setVisibility(8);
        }
    }
}
