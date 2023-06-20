package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.e;
import com.bytedance.sdk.openadsdk.utils.v;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import m3.b;

/* compiled from: NativeVideoDetailLayout.java */
/* loaded from: classes.dex */
public class c extends d {
    private TextView H;
    private ImageView I;
    private View J;
    private TextView K;
    private TextView L;
    private TextView M;
    private ImageView N;
    private View O;
    private ImageView P;
    private TextView Q;
    private View R;
    private SeekBar S;
    private TextView T;
    private TextView U;
    private ImageView V;
    private final x W;
    private boolean X;
    private boolean Y;
    private int Z;

    /* renamed from: aa  reason: collision with root package name */
    private int f12921aa;

    /* renamed from: ab  reason: collision with root package name */
    private int f12922ab;

    /* renamed from: ac  reason: collision with root package name */
    private int f12923ac;

    /* renamed from: ad  reason: collision with root package name */
    private int f12924ad;

    /* renamed from: ae  reason: collision with root package name */
    private final Rect f12925ae;

    /* renamed from: af  reason: collision with root package name */
    private ColorStateList f12926af;
    private float ag;
    private final Rect ah;
    private int ai;
    private boolean aj;
    private int ak;
    private int al;
    private com.bytedance.sdk.openadsdk.core.widget.d am;
    private boolean an;
    private final View.OnTouchListener ao;
    private float ap;
    private ColorStateList aq;
    private float ar;
    private final Rect as;
    private float at;
    private ColorStateList au;
    private float av;
    private final Rect aw;
    private final Rect ax;
    private boolean ay;
    private boolean az;

    public c(Context context, View view, boolean z10, EnumSet<b.a> enumSet, n nVar, m3.c cVar, boolean z11) {
        super(context, view, z10, enumSet, nVar, cVar, z11);
        this.W = new x(this);
        this.X = false;
        this.Y = false;
        this.Z = 0;
        this.f12921aa = 0;
        this.f12922ab = 0;
        this.f12923ac = 0;
        this.f12924ad = 0;
        this.f12925ae = new Rect();
        this.ah = new Rect();
        this.ai = 0;
        this.ak = 0;
        this.al = 0;
        this.am = null;
        this.an = false;
        this.ao = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.7

            /* renamed from: b  reason: collision with root package name */
            private float f12934b;

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                float x10 = motionEvent.getX();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        c.this.an = Math.abs(this.f12934b - motionEvent.getX()) < 10.0f;
                    } else if (actionMasked == 2) {
                        view2.getParent().requestDisallowInterceptTouchEvent(true);
                    } else if (actionMasked == 3) {
                        view2.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    this.f12934b = x10;
                }
                return false;
            }
        };
        this.as = new Rect();
        this.aw = new Rect();
        this.ax = new Rect();
        this.f12959y = m.a().getApplicationContext();
        d(z11);
        this.f12935a = view;
        this.f12954t = z10;
        com.bytedance.sdk.openadsdk.core.widget.d dVar = new com.bytedance.sdk.openadsdk.core.widget.d(this);
        this.am = dVar;
        dVar.a(this.f12954t);
        DisplayMetrics displayMetrics = this.f12959y.getResources().getDisplayMetrics();
        this.ak = displayMetrics.widthPixels;
        this.al = displayMetrics.heightPixels;
        this.f12957w = enumSet == null ? EnumSet.noneOf(b.a.class) : enumSet;
        this.D = cVar;
        this.f12958x = nVar;
        c(8);
        a(context, this.f12935a);
        d();
        p();
    }

    private void y() {
        DisplayMetrics displayMetrics = this.f12959y.getResources().getDisplayMetrics();
        TextView textView = this.U;
        if (textView != null) {
            this.ap = textView.getTextSize();
            this.U.setTextSize(2, 14.0f);
            ColorStateList textColors = this.U.getTextColors();
            this.aq = textColors;
            if (textColors != null) {
                this.U.setTextColor(t.j(this.f12959y, "tt_ssxinzi15"));
            }
            this.ar = this.U.getAlpha();
            this.U.setAlpha(0.85f);
            this.U.setShadowLayer(0.0f, v.b(this.f12959y, 0.5f), v.b(this.f12959y, 0.5f), t.j(this.f12959y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams = this.U.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.as.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                v.b(this.U, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.as.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.as.bottom);
            }
        }
        TextView textView2 = this.T;
        if (textView2 != null) {
            this.at = textView2.getTextSize();
            this.T.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.T.getTextColors();
            this.au = textColors2;
            if (textColors2 != null) {
                this.T.setTextColor(t.j(this.f12959y, "tt_ssxinzi15"));
            }
            this.av = this.T.getAlpha();
            this.T.setAlpha(0.85f);
            this.T.setShadowLayer(0.0f, v.b(this.f12959y, 0.5f), v.b(this.f12959y, 0.5f), t.j(this.f12959y, "tt_video_shaoow_color_fullscreen"));
            ViewGroup.LayoutParams layoutParams2 = this.T.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.aw.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                Rect rect = this.aw;
                v.b(this.T, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.ax.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.V;
                Rect rect2 = this.ax;
                v.b(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.ax.bottom);
            }
        }
        ImageView imageView3 = this.V;
        if (imageView3 != null) {
            imageView3.setImageDrawable(t.c(this.f12959y, "tt_shrink_fullscreen"));
        }
        TextView textView3 = this.L;
        if (textView3 != null) {
            ColorStateList textColors3 = textView3.getTextColors();
            this.f12926af = textColors3;
            if (textColors3 != null) {
                this.L.setTextColor(t.j(this.f12959y, "tt_ssxinzi15"));
            }
            this.ag = this.L.getAlpha();
            this.L.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.L.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.ah.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                Rect rect3 = this.aw;
                v.b(this.L, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.ai = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.J.setLayoutParams(layoutParams5);
            this.J.setBackgroundResource(t.d(this.f12959y, "tt_shadow_fullscreen_top"));
        }
        b(this.aj, true);
    }

    private void z() {
        TextView textView = this.U;
        if (textView != null) {
            textView.setTextSize(0, this.ap);
            ColorStateList colorStateList = this.aq;
            if (colorStateList != null) {
                this.U.setTextColor(colorStateList);
            }
            this.U.setAlpha(this.ar);
            this.U.setShadowLayer(v.b(this.f12959y, 1.0f), 0.0f, 0.0f, t.j(this.f12959y, "tt_video_shadow_color"));
            TextView textView2 = this.U;
            Rect rect = this.as;
            v.b(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.T;
        if (textView3 != null) {
            textView3.setTextSize(0, this.at);
            ColorStateList colorStateList2 = this.au;
            if (colorStateList2 != null) {
                this.T.setTextColor(colorStateList2);
            }
            this.T.setAlpha(this.av);
            this.T.setShadowLayer(v.b(this.f12959y, 1.0f), 0.0f, 0.0f, t.j(this.f12959y, "tt_video_shadow_color"));
            TextView textView4 = this.T;
            Rect rect2 = this.aw;
            v.b(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.V;
        if (imageView != null) {
            Rect rect3 = this.ax;
            v.b(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(t.c(this.f12959y, "tt_enlarge_video"));
        }
        TextView textView5 = this.L;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.f12926af;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.L.setAlpha(this.ag);
            TextView textView6 = this.L;
            Rect rect4 = this.aw;
            v.b(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.J;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.ai;
            this.J.setLayoutParams(layoutParams);
            this.J.setBackgroundResource(t.d(this.f12959y, "tt_video_black_desc_gradient"));
        }
        b(this.aj, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, m3.b
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void a(Object obj, WeakReference weakReference, boolean z10) {
        a((n) obj, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void b(boolean z10) {
        int i10 = j() ? this.al : this.f12950p;
        int i11 = j() ? this.ak : this.f12951q;
        if (this.f12953s <= 0 || this.f12952r <= 0 || i10 <= 0) {
            return;
        }
        if (!k() && !j() && !this.f12957w.contains(b.a.fixedSize)) {
            i11 = this.f12959y.getResources().getDimensionPixelSize(t.i(this.f12959y, "tt_video_container_maxheight"));
        }
        int i12 = this.f12952r;
        int i13 = this.f12953s;
        int i14 = (int) (i13 * ((i10 * 1.0f) / i12));
        if (i14 > i11) {
            i10 = (int) (i12 * ((i11 * 1.0f) / i13));
        } else {
            i11 = i14;
        }
        if (!z10 && !j()) {
            i10 = this.f12950p;
            i11 = this.f12951q;
        }
        this.f12936b.a(i10, i11);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void c(boolean z10) {
        TextView textView = this.K;
        if (textView != null) {
            if (this.f12954t) {
                v.a((View) textView, 8);
            } else {
                v.a((View) textView, z10 ? 0 : 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    protected void d() {
        super.d();
        this.am.a(this.f12935a);
        int i10 = 8;
        v.a((View) this.I, (this.f12954t || this.f12957w.contains(b.a.hideCloseBtn)) ? 8 : 0);
        this.I.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.t()) {
                    c cVar = c.this;
                    cVar.A.c(cVar, view);
                }
            }
        });
        v.a((View) this.H, (!this.f12954t || this.f12957w.contains(b.a.alwayShowBackBtn)) ? 0 : 0);
        this.H.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.t()) {
                    c cVar = c.this;
                    cVar.A.d(cVar, view);
                }
            }
        });
        this.N.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.t()) {
                    c cVar = c.this;
                    cVar.A.e(cVar, view);
                }
            }
        });
        this.P.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                c.this.b(false, true);
                c.this.h();
                c.this.g();
                if (c.this.t()) {
                    c cVar = c.this;
                    cVar.A.f(cVar, view);
                }
            }
        });
        this.V.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.t()) {
                    c cVar = c.this;
                    cVar.A.b(cVar, view);
                }
            }
        });
        this.S.setThumbOffset(0);
        this.S.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.c.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i11, boolean z10) {
                if (c.this.t()) {
                    c cVar = c.this;
                    cVar.A.a(cVar, i11, z10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!c.this.X && c.this.f12959y != null) {
                    seekBar.setThumb(t.c(m.a(), "tt_seek_thumb_press"));
                }
                if (c.this.t()) {
                    seekBar.setThumbOffset(0);
                    c cVar = c.this;
                    cVar.A.b(cVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!c.this.X && c.this.f12959y != null) {
                    seekBar.setThumb(t.c(m.a(), "tt_seek_thumb_normal"));
                }
                if (c.this.t()) {
                    seekBar.setThumbOffset(0);
                    c cVar = c.this;
                    cVar.A.a(cVar, seekBar.getProgress());
                }
            }
        });
        this.S.setOnTouchListener(this.ao);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void e() {
        this.W.removeMessages(1);
        this.W.sendMessageDelayed(this.W.obtainMessage(1), Constants.MIN_PROGRESS_TIME);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void f() {
        this.W.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void g() {
        n nVar;
        v.f(this.f12938d);
        v.f(this.f12939e);
        v.e(this.O);
        if (this.f12940f != null && (nVar = this.f12958x) != null && nVar.J() != null && this.f12958x.J().w() != null) {
            v.f(this.f12940f);
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12958x.J().w(), this.f12940f);
        }
        if (this.f12937c.getVisibility() == 0) {
            v.a((View) this.f12937c, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void h() {
        v.e(this.f12938d);
        v.e(this.O);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void i() {
        this.S.setProgress(0);
        this.S.setSecondaryProgress(0);
        this.T.setText(t.b(this.f12959y, "tt_00_00"));
        this.U.setText(t.b(this.f12959y, "tt_00_00"));
        c(8);
        if (x()) {
            this.f12936b.setVisibility(8);
        }
        ImageView imageView = this.f12940f;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        c(8);
        v.a(this.R, 8);
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

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, com.bytedance.sdk.openadsdk.core.widget.e.b
    public boolean j() {
        return this.X;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public boolean k() {
        return this.f12954t;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, com.bytedance.sdk.openadsdk.core.widget.e.b
    public void l() {
        a(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public boolean m() {
        return this.f12955u;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, com.bytedance.sdk.openadsdk.core.widget.d.a
    public void n() {
        l();
        c(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, com.bytedance.sdk.openadsdk.core.widget.d.a
    public boolean o() {
        e eVar = this.f12960z;
        return eVar != null && eVar.a();
    }

    private void e(boolean z10) {
        if (z10) {
            y();
        } else {
            z();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    protected void a(Context context, View view) {
        super.a(context, view);
        this.H = (TextView) view.findViewById(t.e(context, "tt_video_back"));
        this.I = (ImageView) view.findViewById(t.e(context, "tt_video_close"));
        this.J = view.findViewById(t.e(context, "tt_video_top_layout"));
        this.N = (ImageView) view.findViewById(t.e(context, "tt_video_fullscreen_back"));
        this.K = (TextView) view.findViewById(t.e(context, "tt_video_title"));
        this.L = (TextView) view.findViewById(t.e(context, "tt_video_top_title"));
        this.M = (TextView) view.findViewById(t.e(context, "tt_video_current_time"));
        this.O = view.findViewById(t.e(context, "tt_video_loading_retry"));
        this.P = (ImageView) view.findViewById(t.e(context, "tt_video_retry"));
        TextView textView = (TextView) view.findViewById(t.e(context, "tt_video_retry_des"));
        this.Q = textView;
        textView.setText(t.a(context, "tt_video_retry_des_txt"));
        this.S = (SeekBar) view.findViewById(t.e(context, "tt_video_seekbar"));
        this.T = (TextView) view.findViewById(t.e(context, "tt_video_time_left_time"));
        this.U = (TextView) view.findViewById(t.e(context, "tt_video_time_play"));
        this.R = view.findViewById(t.e(context, "tt_video_ad_bottom_layout"));
        this.V = (ImageView) view.findViewById(t.e(context, "tt_video_ad_full_screen"));
        this.f12941g = (ViewStub) view.findViewById(t.e(context, "tt_video_ad_cover"));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void c(int i10) {
        this.f12956v = i10;
        v.a(this.f12935a, i10);
        if (i10 != 0) {
            this.az = false;
        } else if (this.ay) {
            this.az = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void b(ViewGroup viewGroup) {
        View view;
        l.e("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (view = this.f12935a) == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.X = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12935a.getLayoutParams();
        marginLayoutParams.width = this.f12922ab;
        marginLayoutParams.height = this.f12923ac;
        marginLayoutParams.leftMargin = this.f12921aa;
        marginLayoutParams.topMargin = this.Z;
        this.f12935a.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.f12924ad);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.f12925ae;
            v.b(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        b(true);
        this.V.setImageDrawable(t.c(this.f12959y, "tt_enlarge_video"));
        this.S.setThumb(t.c(this.f12959y, "tt_seek_thumb_normal"));
        this.S.setThumbOffset(0);
        h3.a.c(this.f12935a, true);
        e(this.X);
        v.a(this.J, 8);
        if (this.f12957w.contains(b.a.alwayShowBackBtn)) {
            v.a((View) this.H, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(String str) {
        TextView textView = this.K;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.L;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(int i10) {
        View view = this.R;
        if (view == null || view.getVisibility() != 0) {
            this.S.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(long j10, long j11) {
        this.T.setText(h3.a.b(j11));
        this.U.setText(h3.a.b(j10));
        this.S.setProgress(h3.a.a(j10, j11));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, m3.b
    public void a() {
        a(false, this.f12954t);
        w();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(long j10) {
        this.U.setText(h3.a.b(j10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    @SuppressLint({"ClickableViewAccessibility"})
    public void a(n nVar, WeakReference<Context> weakReference, boolean z10) {
        String V;
        String a10;
        n nVar2;
        if (nVar == null) {
            return;
        }
        a(this.f12935a, m.a());
        a(false, this.f12954t);
        v.a(this.f12942h, 0);
        v.a((View) this.f12943i, 0);
        v.a(this.f12944j, 0);
        if (this.f12943i != null && (nVar2 = this.f12958x) != null && nVar2.J() != null && this.f12958x.J().w() != null) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12958x.J().w(), this.f12943i);
        }
        if (!TextUtils.isEmpty(nVar.K())) {
            V = nVar.K();
        } else if (!TextUtils.isEmpty(nVar.U())) {
            V = nVar.U();
        } else {
            V = !TextUtils.isEmpty(nVar.V()) ? nVar.V() : "";
        }
        n nVar3 = this.f12958x;
        if (nVar3 != null && nVar3.M() != null && this.f12958x.M().a() != null) {
            v.a((View) this.f12945k, 0);
            v.a((View) this.f12946l, 4);
            if (this.f12945k != null) {
                com.bytedance.sdk.openadsdk.i.d.a().a(this.f12958x.M(), this.f12945k);
                this.f12945k.setOnClickListener(this.E);
                this.f12945k.setOnTouchListener(this.E);
            }
        } else if (!TextUtils.isEmpty(V)) {
            v.a((View) this.f12945k, 4);
            v.a((View) this.f12946l, 0);
            TextView textView = this.f12946l;
            if (textView != null) {
                textView.setText(V.substring(0, 1));
                this.f12946l.setOnClickListener(this.E);
                this.f12946l.setOnTouchListener(this.E);
            }
        }
        if (this.f12947m != null && !TextUtils.isEmpty(V)) {
            this.f12947m.setText(V);
        }
        v.a((View) this.f12947m, 0);
        v.a((View) this.f12948n, 0);
        int L = nVar.L();
        if (L == 2 || L == 3) {
            a10 = t.a(this.f12959y, "tt_video_mobile_go_detail");
        } else if (L == 4) {
            a10 = t.a(this.f12959y, "tt_video_download_apk");
        } else if (L != 5) {
            a10 = t.a(this.f12959y, "tt_video_mobile_go_detail");
        } else {
            a10 = t.a(this.f12959y, "tt_video_dial_phone");
        }
        TextView textView2 = this.f12948n;
        if (textView2 != null) {
            textView2.setText(a10);
            this.f12948n.setOnClickListener(this.E);
            this.f12948n.setOnTouchListener(this.E);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public boolean b(int i10) {
        SeekBar seekBar = this.S;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(ViewGroup viewGroup) {
        if (viewGroup != null && (this.f12935a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.X = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12935a.getLayoutParams();
            this.f12921aa = marginLayoutParams.leftMargin;
            this.Z = marginLayoutParams.topMargin;
            this.f12922ab = marginLayoutParams.width;
            this.f12923ac = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.f12935a.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.f12924ad = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f12925ae.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                v.b(viewGroup, 0, 0, 0, 0);
            }
            b(true);
            this.V.setImageDrawable(t.c(this.f12959y, "tt_shrink_video"));
            this.S.setThumb(t.c(this.f12959y, "tt_seek_thumb_fullscreen_selector"));
            this.S.setThumbOffset(0);
            h3.a.c(this.f12935a, false);
            e(this.X);
            v.a(this.J, 8);
            if (!this.f12954t) {
                v.a((View) this.I, 8);
                v.a((View) this.H, 8);
            } else if (this.f12957w.contains(b.a.hideCloseBtn)) {
                v.a((View) this.I, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message.what != 1) {
            return;
        }
        l();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(boolean z10, boolean z11, boolean z12) {
        v.a(this.R, 0);
        if (this.X) {
            v.a(this.J, 0);
            v.a((View) this.L, 0);
        } else if (z12) {
            v.a(this.J, 8);
        }
        v.a((View) this.f12937c, (!z10 || this.f12938d.getVisibility() == 0) ? 8 : 0);
        if (!this.f12954t && !this.X) {
            if (!this.f12957w.contains(b.a.hideCloseBtn) && !z12) {
                v.a((View) this.I, 0);
            }
            v.a((View) this.H, z12 ? 8 : 0);
        }
        v.a((View) this.T, 0);
        v.a((View) this.U, 0);
        v.a((View) this.S, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d
    public void a(boolean z10, boolean z11) {
        v.a(this.R, 8);
        v.a(this.J, 8);
        v.a((View) this.f12937c, 8);
        if (!this.f12954t && !this.X) {
            v.a((View) this.I, 8);
            if (!this.f12957w.contains(b.a.alwayShowBackBtn)) {
                v.a((View) this.H, 8);
            }
        } else if (this.f12957w.contains(b.a.hideCloseBtn)) {
            v.a((View) this.I, 8);
        }
        if (z11) {
            v.a((View) this.I, 8);
            v.a((View) this.H, 8);
        }
        c(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.d, com.bytedance.sdk.openadsdk.core.widget.d.a
    public void a(View view, boolean z10) {
        if (j()) {
            String format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            n nVar = this.f12958x;
            if (nVar != null && !TextUtils.isEmpty(nVar.U())) {
                a(this.f12958x.U());
            }
            this.M.setText(format);
        } else {
            a("");
            this.M.setText("");
        }
        if (this.B) {
            return;
        }
        c(this.f12954t && !this.X);
        if (t()) {
            this.A.a(this, view, true, this.f12938d.getVisibility() != 0);
        }
    }
}
