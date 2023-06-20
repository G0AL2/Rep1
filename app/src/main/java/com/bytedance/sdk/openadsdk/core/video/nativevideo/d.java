package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.core.widget.d;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import h3.b;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import m3.b;

/* compiled from: NativeVideoLayout.java */
/* loaded from: classes.dex */
public class d implements k3.a, m3.b<n>, p3.a, x.a, d.a, e.b {
    a A;
    boolean B;
    r3.c C;
    m3.c D;
    com.bytedance.sdk.openadsdk.core.b.a E;
    com.bytedance.sdk.openadsdk.core.b.a F;
    boolean G;
    private View H;
    private TextView I;
    private TextView J;
    private NativeVideoTsView.a K;
    private final String L;

    /* renamed from: a  reason: collision with root package name */
    View f12935a;

    /* renamed from: b  reason: collision with root package name */
    com.bykv.vk.openvk.component.video.api.renderview.a f12936b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f12937c;

    /* renamed from: d  reason: collision with root package name */
    View f12938d;

    /* renamed from: e  reason: collision with root package name */
    View f12939e;

    /* renamed from: f  reason: collision with root package name */
    ImageView f12940f;

    /* renamed from: g  reason: collision with root package name */
    ViewStub f12941g;

    /* renamed from: h  reason: collision with root package name */
    View f12942h;

    /* renamed from: i  reason: collision with root package name */
    ImageView f12943i;

    /* renamed from: j  reason: collision with root package name */
    View f12944j;

    /* renamed from: k  reason: collision with root package name */
    RoundImageView f12945k;

    /* renamed from: l  reason: collision with root package name */
    TextView f12946l;

    /* renamed from: m  reason: collision with root package name */
    TextView f12947m;

    /* renamed from: n  reason: collision with root package name */
    TextView f12948n;

    /* renamed from: o  reason: collision with root package name */
    ViewStub f12949o;

    /* renamed from: p  reason: collision with root package name */
    int f12950p;

    /* renamed from: q  reason: collision with root package name */
    int f12951q;

    /* renamed from: r  reason: collision with root package name */
    int f12952r;

    /* renamed from: s  reason: collision with root package name */
    int f12953s;

    /* renamed from: t  reason: collision with root package name */
    boolean f12954t;

    /* renamed from: u  reason: collision with root package name */
    boolean f12955u;

    /* renamed from: v  reason: collision with root package name */
    int f12956v;

    /* renamed from: w  reason: collision with root package name */
    EnumSet<b.a> f12957w;

    /* renamed from: x  reason: collision with root package name */
    n f12958x;

    /* renamed from: y  reason: collision with root package name */
    Context f12959y;

    /* renamed from: z  reason: collision with root package name */
    e f12960z;

    public d(Context context, View view, boolean z10, EnumSet<b.a> enumSet, n nVar, m3.c cVar, boolean z11) {
        this.f12954t = true;
        this.B = true;
        this.G = true;
        this.L = Build.MODEL;
        if (this instanceof c) {
            return;
        }
        this.f12959y = m.a().getApplicationContext();
        d(z11);
        this.f12935a = view;
        this.f12954t = z10;
        this.f12957w = enumSet == null ? EnumSet.noneOf(b.a.class) : enumSet;
        this.D = cVar;
        this.f12958x = nVar;
        c(8);
        a(context, this.f12935a);
        d();
        p();
    }

    private void b(View view, Context context) {
        ViewStub viewStub;
        if (view == null || context == null || (viewStub = this.f12949o) == null || viewStub.getParent() == null || this.H != null) {
            return;
        }
        this.f12949o.inflate();
        this.H = view.findViewById(t.e(context, "tt_video_ad_cover_center_layout_draw"));
        this.I = (TextView) view.findViewById(t.e(context, "tt_video_ad_button_draw"));
        this.J = (TextView) view.findViewById(t.e(context, "tt_video_ad_replay"));
    }

    private int e(int i10) {
        if (this.f12952r <= 0 || this.f12953s <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.f12959y.getResources().getDimensionPixelSize(t.i(this.f12959y, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.f12959y.getResources().getDimensionPixelSize(t.i(this.f12959y, "tt_video_container_minheight"));
        int i11 = (int) (this.f12953s * ((i10 * 1.0f) / this.f12952r));
        return i11 > dimensionPixelSize ? dimensionPixelSize : i11 < dimensionPixelSize2 ? dimensionPixelSize2 : i11;
    }

    private void f(int i10) {
        v.a(this.f12944j, i10);
        v.a(this.H, i10);
    }

    private boolean y() {
        return n.c(this.f12958x) && this.f12958x.G() == null && this.f12958x.p() == 1;
    }

    private void z() {
        if (this.f12959y == null || this.f12935a == null) {
            return;
        }
        View view = new View(this.f12959y) { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.4
            private void a() {
            }

            private void b() {
            }

            @Override // android.view.View
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                b();
            }

            @Override // android.view.View
            public void onFinishTemporaryDetach() {
                super.onFinishTemporaryDetach();
                a();
            }

            @Override // android.view.View
            public void onStartTemporaryDetach() {
                super.onStartTemporaryDetach();
                b();
            }
        };
        View view2 = this.f12935a;
        if (view2 instanceof ViewGroup) {
            ((ViewGroup) view2).addView(view, 0, new RelativeLayout.LayoutParams(0, 0));
        }
    }

    public void a(long j10) {
    }

    public void a(long j10, long j11) {
    }

    public void a(Message message) {
    }

    public void a(View view, boolean z10) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public void a(String str) {
    }

    @Override // p3.a
    public void b(SurfaceTexture surfaceTexture) {
    }

    @Override // p3.a
    public void b(SurfaceTexture surfaceTexture, int i10, int i11) {
    }

    public void b(ViewGroup viewGroup) {
    }

    public void b(boolean z10) {
    }

    public boolean b(int i10) {
        return false;
    }

    public void c(int i10, int i11) {
        this.f12952r = i10;
        this.f12953s = i11;
    }

    public void c(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f12936b.a(this);
        this.f12937c.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (d.this.t()) {
                    TextView textView = d.this.f12948n;
                    if (textView == null || textView.getVisibility() != 0) {
                        d dVar = d.this;
                        dVar.A.a(dVar, view);
                    }
                }
            }
        });
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
        n nVar;
        v.f(this.f12938d);
        v.f(this.f12939e);
        if (this.f12940f != null && (nVar = this.f12958x) != null && nVar.J() != null && this.f12958x.J().w() != null) {
            v.f(this.f12940f);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12958x.J().w(), this.f12940f);
        }
        if (this.f12937c.getVisibility() == 0) {
            v.a((View) this.f12937c, 8);
        }
    }

    public void h() {
        v.e(this.f12938d);
    }

    public void i() {
        c(8);
        if (x()) {
            this.f12936b.setVisibility(8);
        }
        ImageView imageView = this.f12940f;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        c(8);
        v.a(this.f12942h, 8);
        v.a((View) this.f12943i, 8);
        v.a(this.f12944j, 8);
        v.a((View) this.f12945k, 8);
        v.a((View) this.f12946l, 8);
        v.a((View) this.f12947m, 8);
        e eVar = this.f12960z;
        if (eVar != null) {
            eVar.a(true);
        }
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this.f12954t;
    }

    public void l() {
        a(true, false);
    }

    public boolean m() {
        return this.f12955u;
    }

    public void n() {
    }

    public boolean o() {
        e eVar = this.f12960z;
        return eVar != null && eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        String str;
        int i10;
        com.bytedance.sdk.openadsdk.core.b.a aVar;
        String str2 = this.B ? "embeded_ad" : "embeded_ad_landingpage";
        if (u.b(this.f12958x)) {
            str = this.B ? "draw_ad" : "draw_ad_landingpage";
            i10 = 6;
        } else if (u.c(this.f12958x)) {
            str = "rewarded_video";
            i10 = 7;
        } else if (u.d(this.f12958x)) {
            str = "fullscreen_interstitial_ad";
            i10 = 5;
        } else {
            str = str2;
            i10 = 1;
        }
        if (this.f12958x.L() == 4) {
            this.C = r3.d.a(this.f12959y, this.f12958x, str);
        }
        z();
        com.bytedance.sdk.openadsdk.core.b.a aVar2 = new com.bytedance.sdk.openadsdk.core.b.a(this.f12959y, this.f12958x, str, i10);
        this.E = aVar2;
        aVar2.b(true);
        if (this.B) {
            this.E.a(true);
        } else {
            this.E.a(false);
            this.E.c(true);
        }
        this.E.a(this.D);
        this.E.d(true);
        this.E.a(new b.a() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.1
            @Override // com.bytedance.sdk.openadsdk.core.b.b.a
            public void a(View view, int i11) {
                if (d.this.K != null) {
                    d.this.K.a(view, i11);
                }
            }
        });
        r3.c cVar = this.C;
        if (cVar != null && (aVar = this.E) != null) {
            aVar.a(cVar);
        }
        if (y()) {
            com.bytedance.sdk.openadsdk.core.b.a aVar3 = new com.bytedance.sdk.openadsdk.core.b.a(this.f12959y, this.f12958x, str, i10) { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.2
                @Override // com.bytedance.sdk.openadsdk.core.b.a
                public boolean b() {
                    e eVar = d.this.f12960z;
                    boolean a10 = eVar != null ? eVar.a() : false;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("isVisible=");
                    sb2.append(a10);
                    sb2.append(",mPlayBtn.getVisibility() == VISIBLE->");
                    sb2.append(d.this.f12937c.getVisibility() == 0);
                    l.c("ClickCreativeListener", sb2.toString());
                    return a10 || d.this.f12937c.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.b.a
                public boolean c() {
                    View view;
                    RoundImageView roundImageView;
                    TextView textView;
                    View view2 = d.this.f12942h;
                    return (view2 != null && view2.getVisibility() == 0) || ((view = d.this.f12944j) != null && view.getVisibility() == 0) || (((roundImageView = d.this.f12945k) != null && roundImageView.getVisibility() == 0) || ((textView = d.this.f12946l) != null && textView.getVisibility() == 0));
                }
            };
            this.F = aVar3;
            aVar3.a(new b.a() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.3
                @Override // com.bytedance.sdk.openadsdk.core.b.b.a
                public void a(View view, int i11) {
                    if (d.this.K != null) {
                        d.this.K.a(view, i11);
                    }
                }
            });
            this.F.b(true);
            if (this.B) {
                this.F.a(true);
            } else {
                this.F.a(false);
            }
            this.F.a(this.D);
            this.F.d(true);
            r3.c cVar2 = this.C;
            if (cVar2 != null) {
                this.F.a(cVar2);
            }
            View view = this.f12935a;
            if (view != null) {
                view.setOnClickListener(this.F);
                this.f12935a.setOnTouchListener(this.F);
            }
        }
    }

    public com.bykv.vk.openvk.component.video.api.renderview.a q() {
        return this.f12936b;
    }

    void r() {
        if (this.A == null || this.f12960z != null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        e eVar = new e();
        this.f12960z = eVar;
        eVar.a(this.f12959y, this.f12935a);
        this.f12960z.a(this.A, this);
        l.b("useTime", "mVideoTrafficTipLayout use time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void s() {
        e eVar = this.f12960z;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        if (this.A == null) {
            l.e("NewLiveViewLayout", "callback is null");
            return false;
        }
        return true;
    }

    public void u() {
        v.f(this.f12938d);
        v.f(this.f12939e);
        if (this.f12937c.getVisibility() == 0) {
            v.a((View) this.f12937c, 8);
        }
    }

    @TargetApi(14)
    public void v() {
        v.a(this.f12935a, 0);
        com.bykv.vk.openvk.component.video.api.renderview.a aVar = this.f12936b;
        if (aVar != null) {
            v.a(aVar.getView(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        try {
            v.a(this.f12942h, 8);
            v.a((View) this.f12943i, 8);
            v.a(this.f12944j, 8);
            v.a((View) this.f12945k, 8);
            v.a((View) this.f12946l, 8);
            v.a((View) this.f12947m, 8);
            v.a((View) this.f12948n, 8);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return !this.f12957w.contains(b.a.alwayShowMediaView) || this.f12954t;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void a(Object obj, WeakReference weakReference, boolean z10) {
        a((n) obj, (WeakReference<Context>) weakReference, z10);
    }

    public void a(NativeVideoTsView.a aVar) {
        this.K = aVar;
    }

    public void c(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.f12935a.getParent() == null) {
            viewGroup.addView(this.f12935a);
        }
        c(0);
    }

    public void d(int i10) {
        v.a(this.f12935a, 0);
        com.bykv.vk.openvk.component.video.api.renderview.a aVar = this.f12936b;
        if (aVar != null) {
            aVar.setVisibility(i10);
        }
    }

    public void a(TTNativeAd tTNativeAd) {
        com.bytedance.sdk.openadsdk.core.b.a aVar = this.E;
        if (aVar != null) {
            aVar.a(tTNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar2 = this.F;
        if (aVar2 != null) {
            aVar2.a(tTNativeAd);
        }
    }

    @Override // m3.b
    public View c() {
        return this.f12935a;
    }

    public void d(boolean z10) {
        this.B = z10;
        if (z10) {
            com.bytedance.sdk.openadsdk.core.b.a aVar = this.E;
            if (aVar != null) {
                aVar.a(true);
            }
            com.bytedance.sdk.openadsdk.core.b.a aVar2 = this.F;
            if (aVar2 != null) {
                aVar2.a(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar3 = this.E;
        if (aVar3 != null) {
            aVar3.a(false);
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar4 = this.F;
        if (aVar4 != null) {
            aVar4.a(false);
        }
    }

    public void b(boolean z10, boolean z11) {
        ImageView imageView = this.f12937c;
        if (imageView != null) {
            if (z10) {
                imageView.setImageResource(t.d(this.f12959y, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageResource(t.d(this.f12959y, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void c(int i10) {
        this.f12956v = i10;
        v.a(this.f12935a, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView] */
    public void a(Context context, View view) {
        SSRenderSurfaceView sSRenderSurfaceView;
        long currentTimeMillis = System.currentTimeMillis();
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        m3.c cVar = this.D;
        if (cVar != null && cVar.s()) {
            ?? sSRenderTextureView = new SSRenderTextureView(this.f12959y);
            l.b("NewLiveViewLayout", "use TextureView......");
            sSRenderSurfaceView = sSRenderTextureView;
        } else {
            SSRenderSurfaceView sSRenderSurfaceView2 = new SSRenderSurfaceView(this.f12959y);
            l.b("NewLiveViewLayout", "use SurfaceView......");
            sSRenderSurfaceView = sSRenderSurfaceView2;
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(sSRenderSurfaceView, 0, layoutParams);
        }
        v.a((View) sSRenderSurfaceView, 8);
        this.f12936b = sSRenderSurfaceView;
        this.f12937c = (ImageView) view.findViewById(t.e(context, "tt_video_play"));
        this.f12938d = view.findViewById(t.e(context, "tt_video_loading_retry_layout"));
        this.f12939e = view.findViewById(t.e(context, "tt_video_loading_progress"));
        this.f12940f = (ImageView) view.findViewById(t.e(context, "tt_video_loading_cover_image"));
        this.f12941g = (ViewStub) view.findViewById(t.e(context, "tt_video_ad_cover"));
        this.f12949o = (ViewStub) view.findViewById(t.e(context, "tt_video_draw_layout_viewStub"));
        l.b("useTime", "NativeVideoLayout**findViews use time :" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void b(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = this.f12935a.getLayoutParams();
        if (i10 == -1 || i10 == -2 || i10 > 0) {
            layoutParams.width = i10;
        }
        if (i11 == -1 || i11 == -2 || i11 > 0) {
            layoutParams.height = i11;
        }
        this.f12935a.setLayoutParams(layoutParams);
    }

    @Override // m3.b
    public void b() {
        v.e(this.f12938d);
        v.e(this.f12939e);
        ImageView imageView = this.f12940f;
        if (imageView != null) {
            v.e(imageView);
        }
    }

    public d(Context context, View view, boolean z10, EnumSet<b.a> enumSet, n nVar, m3.c cVar) {
        this(context, view, z10, enumSet, nVar, cVar, true);
    }

    @Override // p3.a
    public void b(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f12936b.getHolder()) {
            return;
        }
        this.f12955u = false;
        if (t()) {
            this.A.b(this, surfaceHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, Context context) {
        ViewStub viewStub;
        if (view == null || context == null || (viewStub = this.f12941g) == null || viewStub.getParent() == null || this.f12942h != null) {
            return;
        }
        this.f12942h = this.f12941g.inflate();
        this.f12943i = (ImageView) view.findViewById(t.e(context, "tt_video_ad_finish_cover_image"));
        this.f12944j = view.findViewById(t.e(context, "tt_video_ad_cover_center_layout"));
        this.f12945k = (RoundImageView) view.findViewById(t.e(context, "tt_video_ad_logo_image"));
        this.f12946l = (TextView) view.findViewById(t.e(context, "tt_video_btn_ad_image_tv"));
        this.f12947m = (TextView) view.findViewById(t.e(context, "tt_video_ad_name"));
        this.f12948n = (TextView) view.findViewById(t.e(context, "tt_video_ad_button"));
    }

    public boolean a(int i10, l3.b bVar, boolean z10) {
        e eVar = this.f12960z;
        return eVar == null || eVar.a(i10, bVar, z10);
    }

    public void a(m3.a aVar) {
        if (aVar instanceof a) {
            this.A = (a) aVar;
            r();
        }
    }

    public void a(int i10, int i11) {
        if (i10 == -1) {
            i10 = v.c(this.f12959y);
        }
        if (i10 <= 0) {
            return;
        }
        this.f12950p = i10;
        if (!k() && !j() && !this.f12957w.contains(b.a.fixedSize)) {
            this.f12951q = e(i10);
        } else {
            this.f12951q = i11;
        }
        b(this.f12950p, this.f12951q);
    }

    public void a(int i10) {
        l.c("Progress", "setSeekProgress-percent=" + i10);
    }

    public void a() {
        a(false, this.f12954t);
        w();
    }

    @Override // m3.b
    public void a(boolean z10) {
        this.G = z10;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(n nVar, WeakReference<Context> weakReference, boolean z10) {
        n nVar2;
        String V;
        n nVar3;
        n nVar4;
        if (nVar == null) {
            return;
        }
        a(false, this.f12954t);
        a(this.f12935a, m.a());
        View view = this.f12942h;
        if (view != null) {
            v.a(view, 0);
        }
        ImageView imageView = this.f12943i;
        if (imageView != null) {
            v.a((View) imageView, 0);
        }
        if (u.b(this.f12958x)) {
            b(this.f12935a, m.a());
            v.a(this.f12944j, 8);
            v.a((View) this.f12943i, 0);
            v.a(this.H, 0);
            v.a((View) this.I, 0);
            v.a((View) this.J, 0);
            if (this.J != null && o.c(m.a()) == 0) {
                v.a((View) this.J, 8);
            }
            View view2 = this.f12942h;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        m3.c cVar = d.this.D;
                        if (cVar != null) {
                            ((m3.a) cVar).a();
                        }
                    }
                });
            }
            if (this.f12943i != null && (nVar4 = this.f12958x) != null && nVar4.J() != null && this.f12958x.J().w() != null) {
                h3.b.a((long) this.f12958x.J().r(), this.f12958x.J().y(), new b.InterfaceC0398b() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.d.7
                    @Override // h3.b.InterfaceC0398b
                    public void a(Bitmap bitmap) {
                        if (bitmap != null) {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) d.this.f12943i.getLayoutParams();
                            if (bitmap.getWidth() > bitmap.getHeight()) {
                                layoutParams.width = v.c(m.a());
                                layoutParams.height = (bitmap.getHeight() * v.c(m.a())) / bitmap.getWidth();
                                layoutParams.addRule(13);
                                d.this.f12943i.setLayoutParams(layoutParams);
                            }
                            d.this.f12943i.setImageBitmap(bitmap);
                            return;
                        }
                        com.bytedance.sdk.openadsdk.i.d.a().a(d.this.f12958x.J().w(), d.this.f12943i);
                    }
                });
            }
        } else {
            v.a(this.f12944j, 0);
            if (this.f12943i != null && (nVar2 = this.f12958x) != null && nVar2.J() != null && this.f12958x.J().w() != null) {
                com.bytedance.sdk.openadsdk.i.d.a().a(this.f12958x.J().w(), this.f12943i);
            }
        }
        if (!TextUtils.isEmpty(nVar.K())) {
            V = nVar.K();
        } else if (!TextUtils.isEmpty(nVar.U())) {
            V = nVar.U();
        } else {
            V = !TextUtils.isEmpty(nVar.V()) ? nVar.V() : "";
        }
        if (this.f12945k != null && (nVar3 = this.f12958x) != null && nVar3.M() != null && this.f12958x.M().a() != null) {
            v.a((View) this.f12945k, 0);
            v.a((View) this.f12946l, 4);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12958x.M(), this.f12945k);
            if (y()) {
                this.f12945k.setOnClickListener(this.F);
                this.f12945k.setOnTouchListener(this.F);
            } else {
                this.f12945k.setOnClickListener(this.E);
                this.f12945k.setOnTouchListener(this.E);
            }
        } else if (!TextUtils.isEmpty(V)) {
            v.a((View) this.f12945k, 4);
            v.a((View) this.f12946l, 0);
            TextView textView = this.f12946l;
            if (textView != null) {
                textView.setText(V.substring(0, 1));
                if (y()) {
                    this.f12946l.setOnClickListener(this.F);
                    this.f12946l.setOnTouchListener(this.F);
                } else {
                    this.f12946l.setOnClickListener(this.E);
                    this.f12946l.setOnTouchListener(this.E);
                }
            }
        }
        if (this.f12947m != null && !TextUtils.isEmpty(V)) {
            this.f12947m.setText(V);
        }
        v.a((View) this.f12947m, 0);
        v.a((View) this.f12948n, 0);
        String W = nVar.W();
        if (TextUtils.isEmpty(W)) {
            int L = nVar.L();
            if (L == 2 || L == 3) {
                W = t.a(this.f12959y, "tt_video_mobile_go_detail");
            } else if (L == 4) {
                W = t.a(this.f12959y, "tt_video_download_apk");
            } else if (L != 5) {
                W = t.a(this.f12959y, "tt_video_mobile_go_detail");
            } else {
                W = t.a(this.f12959y, "tt_video_dial_phone");
            }
        }
        TextView textView2 = this.f12948n;
        if (textView2 != null) {
            textView2.setText(W);
            this.f12948n.setOnClickListener(this.E);
            this.f12948n.setOnTouchListener(this.E);
        }
        TextView textView3 = this.I;
        if (textView3 != null) {
            textView3.setText(W);
            this.I.setOnClickListener(this.E);
            this.I.setOnTouchListener(this.E);
        }
        if (this.G) {
            return;
        }
        f(4);
    }

    @Override // p3.a
    public void a(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.f12936b.getHolder()) {
            return;
        }
        this.f12955u = true;
        if (t()) {
            this.A.a(this, surfaceHolder);
        }
    }

    @Override // p3.a
    public void a(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        if (surfaceHolder == this.f12936b.getHolder() && t()) {
            this.A.a(this, surfaceHolder, i10, i11, i12);
        }
    }

    @Override // p3.a
    public void a(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f12955u = true;
        if (t()) {
            this.A.a(this, surfaceTexture);
        }
    }

    @Override // p3.a
    public boolean a(SurfaceTexture surfaceTexture) {
        this.f12955u = false;
        if (t()) {
            this.A.b(this, surfaceTexture);
            return true;
        }
        return true;
    }

    public void a(boolean z10, boolean z11, boolean z12) {
        v.a((View) this.f12937c, (!z10 || this.f12938d.getVisibility() == 0) ? 8 : 0);
    }

    public void a(boolean z10, boolean z11) {
        v.a((View) this.f12937c, 8);
    }

    @Override // m3.b
    public void a(Drawable drawable) {
        View view = this.f12935a;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
        }
    }
}
