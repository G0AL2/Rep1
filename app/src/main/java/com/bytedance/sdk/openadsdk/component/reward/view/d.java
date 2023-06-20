package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.a.e;
import com.bytedance.sdk.openadsdk.core.b.g;
import com.bytedance.sdk.openadsdk.core.e.l;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.c;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RewardFullVideoLayout.java */
/* loaded from: classes.dex */
public class d {
    private String A;
    private int B;

    /* renamed from: b  reason: collision with root package name */
    Activity f11760b;

    /* renamed from: c  reason: collision with root package name */
    n f11761c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.c f11762d;

    /* renamed from: e  reason: collision with root package name */
    public View f11763e;

    /* renamed from: f  reason: collision with root package name */
    RelativeLayout f11764f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f11765g;

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f11766h;

    /* renamed from: i  reason: collision with root package name */
    TTRoundRectImageView f11767i;

    /* renamed from: j  reason: collision with root package name */
    TextView f11768j;

    /* renamed from: k  reason: collision with root package name */
    TextView f11769k;

    /* renamed from: l  reason: collision with root package name */
    TextView f11770l;

    /* renamed from: m  reason: collision with root package name */
    FrameLayout f11771m;

    /* renamed from: n  reason: collision with root package name */
    FrameLayout f11772n;

    /* renamed from: o  reason: collision with root package name */
    FrameLayout f11773o;

    /* renamed from: p  reason: collision with root package name */
    TTRatingBar2 f11774p;

    /* renamed from: q  reason: collision with root package name */
    TextView f11775q;

    /* renamed from: r  reason: collision with root package name */
    TextView f11776r;

    /* renamed from: s  reason: collision with root package name */
    RelativeLayout f11777s;

    /* renamed from: t  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.a.d f11778t;

    /* renamed from: x  reason: collision with root package name */
    public l f11782x;

    /* renamed from: z  reason: collision with root package name */
    private boolean f11784z;

    /* renamed from: a  reason: collision with root package name */
    int f11759a = 3;

    /* renamed from: u  reason: collision with root package name */
    boolean f11779u = true;

    /* renamed from: v  reason: collision with root package name */
    protected int f11780v = 0;

    /* renamed from: w  reason: collision with root package name */
    protected final AtomicBoolean f11781w = new AtomicBoolean(false);

    /* renamed from: y  reason: collision with root package name */
    Runnable f11783y = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.d.6
        @Override // java.lang.Runnable
        public void run() {
            RelativeLayout relativeLayout;
            try {
                d dVar = d.this;
                if (dVar.f11762d == null || (relativeLayout = dVar.f11766h) == null) {
                    return;
                }
                int[] iArr = new int[2];
                relativeLayout.getLocationOnScreen(iArr);
                d.this.f11762d.b(iArr[0]);
            } catch (Exception unused) {
            }
        }
    };
    private boolean C = false;

    public d(Activity activity) {
        this.f11760b = activity;
    }

    private void a(com.bytedance.sdk.openadsdk.core.j.a aVar) {
    }

    private void s() {
        RelativeLayout relativeLayout;
        Activity activity = this.f11760b;
        this.f11763e = activity.findViewById(t.e(activity, "tt_reward_root"));
        Activity activity2 = this.f11760b;
        this.f11764f = (RelativeLayout) activity2.findViewById(t.e(activity2, "tt_video_reward_bar"));
        Activity activity3 = this.f11760b;
        this.f11770l = (TextView) activity3.findViewById(t.e(activity3, "tt_reward_ad_download"));
        Activity activity4 = this.f11760b;
        this.f11767i = (TTRoundRectImageView) activity4.findViewById(t.e(activity4, "tt_reward_ad_icon"));
        Activity activity5 = this.f11760b;
        this.f11768j = (TextView) activity5.findViewById(t.e(activity5, "tt_reward_ad_appname"));
        Activity activity6 = this.f11760b;
        this.f11769k = (TextView) activity6.findViewById(t.e(activity6, "tt_comment_vertical"));
        Activity activity7 = this.f11760b;
        this.f11775q = (TextView) activity7.findViewById(t.e(activity7, "tt_ad_logo"));
        Activity activity8 = this.f11760b;
        this.f11765g = (ImageView) activity8.findViewById(t.e(activity8, "tt_video_ad_close"));
        Activity activity9 = this.f11760b;
        this.f11766h = (RelativeLayout) activity9.findViewById(t.e(activity9, "tt_video_ad_close_layout"));
        Activity activity10 = this.f11760b;
        this.f11771m = (FrameLayout) activity10.findViewById(t.e(activity10, "tt_video_reward_container"));
        Activity activity11 = this.f11760b;
        this.f11772n = (FrameLayout) activity11.findViewById(t.e(activity11, "tt_click_upper_non_content_layout"));
        Activity activity12 = this.f11760b;
        this.f11773o = (FrameLayout) activity12.findViewById(t.e(activity12, "tt_click_lower_non_content_layout"));
        Activity activity13 = this.f11760b;
        this.f11774p = (TTRatingBar2) activity13.findViewById(t.e(activity13, "tt_rb_score"));
        Activity activity14 = this.f11760b;
        this.f11777s = (RelativeLayout) activity14.findViewById(t.e(activity14, "tt_full_reward_video_loading_container"));
        TTRatingBar2 tTRatingBar2 = this.f11774p;
        if (tTRatingBar2 != null) {
            v.a((TextView) null, tTRatingBar2, this.f11761c, this.f11760b);
        }
        com.bytedance.sdk.openadsdk.component.reward.a.d dVar = this.f11778t;
        if (dVar != null && dVar.d() && this.f11778t.c() != null && (relativeLayout = this.f11777s) != null) {
            relativeLayout.addView(this.f11778t.c(), new LinearLayout.LayoutParams(-1, -1));
            this.f11778t.a();
        }
        n nVar = this.f11761c;
        if (nVar == null || !nVar.aw()) {
            return;
        }
        Activity activity15 = this.f11760b;
        this.f11776r = (TextView) activity15.findViewById(t.e(activity15, "tt_reward_ad_description"));
    }

    private String t() {
        n nVar = this.f11761c;
        if (nVar == null) {
            return null;
        }
        return nVar.L() != 4 ? "View" : "Install";
    }

    protected boolean a() {
        return true;
    }

    public void b() {
        v.a((View) this.f11771m, 8);
        v.a((View) this.f11772n, 8);
        v.a((View) this.f11773o, 8);
        v.a((View) this.f11764f, 8);
        v.a((View) this.f11768j, 8);
        v.a((View) this.f11767i, 8);
        v.a((View) this.f11769k, 8);
        v.a((View) this.f11774p, 8);
        v.a((View) this.f11765g, 8);
        v.a((View) this.f11766h, 8);
        v.a((View) this.f11770l, 8);
        v.a((View) this.f11775q, 8);
        v.a((View) this.f11777s, 8);
    }

    void c() {
        int z10 = this.f11761c.z();
        this.f11759a = z10;
        if (z10 == -200) {
            f h10 = m.h();
            this.f11759a = h10.k(u.f(this.f11761c) + "");
        }
        if (this.f11759a == -1 && this.f11779u) {
            v.a((View) this.f11764f, 0);
        }
    }

    void d() {
        if (this.f11761c.v() == 3) {
            int[] iArr = {Color.parseColor("#0070FF")};
            c.a e10 = new c.a().a(iArr[0]).b(Color.parseColor("#80000000")).a(iArr).c(v.e(this.f11760b, 17.0f)).d(0).e(v.e(this.f11760b, 3.0f));
            Activity activity = this.f11760b;
            com.bytedance.sdk.openadsdk.core.widget.c.a((LinearLayout) activity.findViewById(t.e(activity, "tt_reward_ad_download_layout")), e10);
        }
    }

    protected String e() {
        String j10 = u.j(this.f11760b);
        if (j10 == null) {
            j10 = "";
        }
        boolean z10 = false;
        boolean z11 = true;
        try {
            if (!j10.equals(Locale.CHINESE.getLanguage()) && !j10.equals(Locale.CHINA.getLanguage()) && !j10.equals(Locale.TRADITIONAL_CHINESE.getLanguage())) {
                z11 = false;
            }
            z10 = j10.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
        }
        n nVar = this.f11761c;
        String str = "Install";
        if (nVar == null) {
            return "Install";
        }
        if (TextUtils.isEmpty(nVar.W())) {
            if (this.f11761c.L() != 4) {
                str = "View";
            }
        } else {
            str = this.f11761c.W();
            if (str == null || !u.i(str) || str.length() <= 2) {
                if (str != null && !u.i(str) && str.length() > 7 && (z11 || z10)) {
                    str = t();
                }
            } else if (z11 || z10) {
                str = t();
            }
        }
        if (z10 && !u.i(str)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f11770l.getLayoutParams();
            layoutParams.bottomMargin = v.e(this.f11760b, 4.0f);
            this.f11770l.setLayoutParams(layoutParams);
        }
        return str;
    }

    protected void f() {
        TextView textView = this.f11769k;
        if (textView == null) {
            return;
        }
        v.a(textView, this.f11761c, this.f11760b, "tt_comment_num");
    }

    protected void g() {
        if (this.f11767i != null && this.f11761c.M() != null && !TextUtils.isEmpty(this.f11761c.M().a())) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f11761c.M(), this.f11767i);
            if (this.f11761c.ax() != null && this.f11761c.ax().b() != null) {
                this.f11761c.ax().b().b(0L);
            }
        }
        if (this.f11768j != null) {
            if (this.B == 1 && this.f11761c.aa() != null && !TextUtils.isEmpty(this.f11761c.aa().b())) {
                this.f11768j.setText(this.f11761c.aa().b());
            } else {
                this.f11768j.setText(this.f11761c.U());
            }
        }
        TextView textView = this.f11776r;
        if (textView != null) {
            textView.setText(this.f11761c.V());
        }
    }

    public FrameLayout h() {
        return this.f11771m;
    }

    protected void i() {
        if (this.f11764f == null) {
            return;
        }
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe ofFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f11764f, PropertyValuesHolder.ofKeyframe("scaleX", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe("scaleY", ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6));
        ofPropertyValuesHolder.setDuration(1000L);
        ofPropertyValuesHolder.start();
    }

    public boolean j() {
        ImageView imageView = this.f11765g;
        return imageView != null && this.f11766h != null && imageView.getVisibility() == 0 && this.f11766h.getVisibility() == 0;
    }

    public View k() {
        return this.f11766h;
    }

    public View l() {
        return this.f11764f;
    }

    public void m() {
        RelativeLayout relativeLayout;
        try {
            com.bytedance.sdk.openadsdk.component.reward.a.d dVar = this.f11778t;
            if (dVar != null) {
                dVar.b();
            }
            View view = this.f11763e;
            if (view == null || (relativeLayout = this.f11777s) == null) {
                return;
            }
            ((ViewGroup) view).removeView(relativeLayout);
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.f11777s;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void n() {
        l lVar = this.f11782x;
        if (lVar != null) {
            lVar.e();
        }
        RelativeLayout relativeLayout = this.f11766h;
        if (relativeLayout != null) {
            relativeLayout.removeCallbacks(this.f11783y);
        }
    }

    public void o() {
        l lVar = this.f11782x;
        if (lVar != null) {
            lVar.f();
        }
    }

    public void p() {
        l lVar = this.f11782x;
        if (lVar != null) {
            lVar.g();
        }
    }

    public void q() {
        l lVar = this.f11782x;
        if (lVar != null) {
            lVar.h();
        }
    }

    public void r() {
        RelativeLayout relativeLayout = this.f11764f;
        if (relativeLayout != null) {
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            this.f11764f.setLayoutParams(layoutParams);
            this.f11764f.setVisibility(0);
        }
    }

    public void a(n nVar, String str, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.reward.a.c cVar) {
        if (this.C) {
            return;
        }
        this.C = true;
        this.f11761c = nVar;
        this.A = str;
        this.B = i10;
        this.f11784z = z10;
        this.f11762d = cVar;
        if (this.f11760b != null && a()) {
            com.bytedance.sdk.openadsdk.component.reward.a.d dVar = new com.bytedance.sdk.openadsdk.component.reward.a.d(this.f11760b);
            this.f11778t = dVar;
            dVar.a(nVar, this.A, this.B);
        }
        s();
        l lVar = new l(this.f11760b, this.f11761c, str, this.f11771m);
        this.f11782x = lVar;
        lVar.a();
    }

    public void c(int i10) {
        int i11 = this.f11759a;
        if (i11 == -1 || i10 != i11 || this.f11781w.get()) {
            return;
        }
        this.f11764f.setVisibility(0);
        this.f11781w.set(true);
        i();
    }

    private int b(String str) {
        Resources resources = this.f11760b.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID));
        }
        return 0;
    }

    public void a(String str, boolean z10) {
        g();
        v.a((View) this.f11775q, p.i(this.f11761c) ? 8 : 0);
        f();
        a(str);
        a(z10);
        d();
        if (this.f11784z) {
            c();
        }
        n nVar = this.f11761c;
        if (nVar == null || nVar.ax() == null) {
            return;
        }
        a(this.f11761c.ax());
    }

    public void d(int i10) {
        v.a((View) this.f11765g, i10);
        v.a((View) this.f11766h, i10);
        RelativeLayout relativeLayout = this.f11766h;
        if (relativeLayout != null) {
            relativeLayout.post(this.f11783y);
        }
    }

    public void b(boolean z10) {
        this.f11779u = z10;
    }

    public void b(int i10) {
        v.a((View) this.f11775q, i10);
    }

    public void a(int i10, int i11) {
        FrameLayout frameLayout;
        if (!this.f11779u) {
            a(4);
        }
        try {
            if (this.B == 2 && this.f11761c.v() == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11770l.getLayoutParams();
                layoutParams.height = (int) v.b(this.f11760b, 55.0f);
                layoutParams.topMargin = (int) v.b(this.f11760b, 20.0f);
                this.f11770l.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f11764f.getLayoutParams();
                layoutParams2.bottomMargin = (int) v.b(this.f11760b, 12.0f);
                this.f11764f.setLayoutParams(layoutParams2);
            }
        } catch (Throwable unused) {
        }
        n nVar = this.f11761c;
        if (nVar == null || nVar.v() != 1 || (frameLayout = this.f11771m) == null || !(frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            return;
        }
        int c10 = v.c((Context) this.f11760b);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f11771m.getLayoutParams();
        layoutParams3.width = c10;
        int i12 = (c10 * 9) / 16;
        layoutParams3.height = i12;
        this.f11771m.setLayoutParams(layoutParams3);
        this.f11780v = (v.d((Context) this.f11760b) - i12) / 2;
        com.bytedance.sdk.component.utils.l.e("RewardFullVideoLayout", "NonContentAreaHeight:" + this.f11780v);
    }

    public void a(com.bytedance.sdk.openadsdk.core.b.c cVar, View.OnTouchListener onTouchListener, final View.OnClickListener onClickListener, final e eVar) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        n nVar;
        n nVar2 = this.f11761c;
        if (nVar2 != null && nVar2.w() != null) {
            if (this.f11761c.v() != 5) {
                if (this.f11761c.w().f12037e) {
                    this.f11770l.setOnClickListener(cVar);
                    this.f11770l.setOnTouchListener(onTouchListener);
                } else {
                    this.f11770l.setOnClickListener(onClickListener);
                }
            }
            if (this.f11761c.v() == 1) {
                if (this.f11761c.w().f12033a) {
                    v.a((View) this.f11764f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                    v.a(this.f11764f, onTouchListener, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f11768j.setOnClickListener(cVar);
                    this.f11768j.setOnTouchListener(onTouchListener);
                    this.f11769k.setOnClickListener(cVar);
                    this.f11769k.setOnTouchListener(onTouchListener);
                    this.f11774p.setOnClickListener(cVar);
                    this.f11774p.setOnTouchListener(onTouchListener);
                    this.f11767i.setOnClickListener(cVar);
                    this.f11767i.setOnTouchListener(onTouchListener);
                } else {
                    v.a(this.f11764f, onClickListener, "TTBaseVideoActivity#mRlDownloadBar");
                    this.f11768j.setOnClickListener(onClickListener);
                    this.f11769k.setOnClickListener(onClickListener);
                    this.f11774p.setOnClickListener(onClickListener);
                    this.f11767i.setOnClickListener(onClickListener);
                }
            } else if (this.f11761c.v() == 5) {
                if (this.f11761c.w().f12037e) {
                    g gVar = new g("VAST_ACTION_BUTTON", this.f11761c.ax(), cVar) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.d.1
                        @Override // com.bytedance.sdk.openadsdk.core.b.g
                        public void a() {
                            n nVar3 = d.this.f11761c;
                            if (nVar3 == null || nVar3.ax() == null) {
                                return;
                            }
                            d.this.f11761c.ax().a().g(eVar.s());
                        }
                    };
                    g gVar2 = new g("VAST_ICON", this.f11761c.ax(), cVar) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.d.2
                        @Override // com.bytedance.sdk.openadsdk.core.b.g
                        public void a() {
                            n nVar3 = d.this.f11761c;
                            if (nVar3 == null || nVar3.ax() == null || d.this.f11761c.ax().b() == null) {
                                return;
                            }
                            d.this.f11761c.ax().b().a(eVar.s());
                        }
                    };
                    TextView textView = this.f11770l;
                    if (textView != null) {
                        textView.setOnClickListener(gVar);
                        this.f11770l.setOnTouchListener(gVar);
                    }
                    TTRoundRectImageView tTRoundRectImageView = this.f11767i;
                    if (tTRoundRectImageView != null) {
                        tTRoundRectImageView.setOnClickListener(gVar2);
                        this.f11767i.setOnTouchListener(gVar2);
                    }
                    TextView textView2 = this.f11768j;
                    if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                        this.f11768j.setOnClickListener(gVar);
                        this.f11768j.setOnTouchListener(gVar);
                    }
                    TextView textView3 = this.f11776r;
                    if (textView3 != null && !TextUtils.isEmpty(textView3.getText())) {
                        this.f11776r.setOnClickListener(gVar);
                        this.f11776r.setOnTouchListener(gVar);
                    }
                } else {
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.d.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            View.OnClickListener onClickListener3 = onClickListener;
                            if (onClickListener3 != null) {
                                onClickListener3.onClick(view);
                            }
                            n nVar3 = d.this.f11761c;
                            if (nVar3 == null || nVar3.ax() == null) {
                                return;
                            }
                            d.this.f11761c.ax().a().g(eVar.s());
                        }
                    };
                    TextView textView4 = this.f11770l;
                    if (textView4 != null) {
                        textView4.setOnClickListener(onClickListener2);
                    }
                    TextView textView5 = this.f11768j;
                    if (textView5 != null && !TextUtils.isEmpty(textView5.getText())) {
                        this.f11768j.setOnClickListener(onClickListener2);
                    }
                    TextView textView6 = this.f11776r;
                    if (textView6 != null && !TextUtils.isEmpty(textView6.getText())) {
                        this.f11776r.setOnClickListener(onClickListener2);
                    }
                    TTRoundRectImageView tTRoundRectImageView2 = this.f11767i;
                    if (tTRoundRectImageView2 != null) {
                        tTRoundRectImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.d.4
                            @Override // android.view.View.OnClickListener
                            public void onClick(View view) {
                                View.OnClickListener onClickListener3 = onClickListener;
                                if (onClickListener3 != null) {
                                    onClickListener3.onClick(view);
                                }
                                n nVar3 = d.this.f11761c;
                                if (nVar3 == null || nVar3.ax() == null || d.this.f11761c.ax().b() == null) {
                                    return;
                                }
                                d.this.f11761c.ax().b().a(eVar.s());
                            }
                        });
                    }
                }
            } else if (this.f11761c.w().f12035c) {
                v.a((View) this.f11764f, (View.OnClickListener) cVar, "TTBaseVideoActivity#mRlDownloadBar");
                v.a(this.f11764f, onTouchListener, "TTBaseVideoActivity#mRlDownloadBar");
            } else {
                v.a(this.f11764f, onClickListener, "TTBaseVideoActivity#mRlDownloadBar");
            }
        }
        if (this.f11771m != null && (nVar = this.f11761c) != null && nVar.w() != null) {
            if (this.f11761c.w().f12038f && !l.b(this.f11761c)) {
                a((View.OnClickListener) cVar);
                a(cVar);
            } else {
                a(onClickListener);
            }
        }
        n nVar3 = this.f11761c;
        if (nVar3 != null && nVar3.v() == 1) {
            if (this.f11761c.w() != null && (frameLayout2 = this.f11772n) != null) {
                v.a((View) frameLayout2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f11772n.getLayoutParams();
                layoutParams.height = this.f11780v;
                this.f11772n.setLayoutParams(layoutParams);
                if (this.f11761c.w().f12034b) {
                    this.f11772n.setOnClickListener(cVar);
                    this.f11772n.setOnTouchListener(onTouchListener);
                } else {
                    this.f11772n.setOnClickListener(onClickListener);
                }
            }
            if (this.f11761c.w() != null && (frameLayout = this.f11773o) != null) {
                v.a((View) frameLayout, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f11773o.getLayoutParams();
                layoutParams2.height = this.f11780v;
                this.f11773o.setLayoutParams(layoutParams2);
                if (this.f11761c.w().f12036d) {
                    this.f11773o.setOnClickListener(cVar);
                    this.f11773o.setOnTouchListener(onTouchListener);
                } else {
                    this.f11773o.setOnClickListener(onClickListener);
                }
            }
        }
        TextView textView7 = this.f11775q;
        if (textView7 != null) {
            textView7.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.d.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    com.bytedance.sdk.component.utils.l.c("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        d dVar = d.this;
                        TTWebsiteActivity.a(dVar.f11760b, dVar.f11761c, dVar.A);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    void a(boolean z10) {
        if (this.B == 1) {
            TextView textView = this.f11768j;
            if (textView != null) {
                textView.setMaxWidth((int) v.b(this.f11760b, 153.0f));
            }
        } else {
            TextView textView2 = this.f11768j;
            if (textView2 != null) {
                textView2.setMaxWidth((int) v.b(this.f11760b, 404.0f));
            }
            RelativeLayout relativeLayout = this.f11766h;
            if (relativeLayout != null && z10) {
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    int b10 = b("status_bar_height");
                    int b11 = b("navigation_bar_height");
                    if (b10 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b10 > marginLayoutParams.topMargin) {
                            marginLayoutParams.topMargin = b10;
                            this.f11762d.a(b10);
                        }
                    }
                    if (b11 > 0) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (b11 > marginLayoutParams2.rightMargin) {
                            marginLayoutParams2.rightMargin = b11;
                        }
                    }
                }
            }
        }
        if (this.f11784z) {
            return;
        }
        v.a((View) this.f11764f, 0);
    }

    protected void a(String str) {
        TextView textView;
        if (this.f11761c.aw()) {
            if (this.f11761c.ax() == null || !TextUtils.isEmpty(this.f11761c.ax().f()) || (textView = this.f11770l) == null) {
                return;
            }
            v.a((View) textView, 8);
            return;
        }
        TextView textView2 = this.f11770l;
        if (textView2 != null) {
            if (this.f11761c.v() == 3) {
                str = e();
            }
            textView2.setText(str);
        }
    }

    public void a(int i10) {
        v.a((View) this.f11764f, i10);
    }

    public int a(n nVar) {
        int f10 = t.f(this.f11760b, "tt_activity_full_reward_video_default_style");
        if (l.b(nVar)) {
            nVar.k(4);
            return t.f(this.f11760b, "tt_activity_full_reward_video_landingpage_style");
        } else if (l.c(nVar)) {
            nVar.k(4);
            return t.f(this.f11760b, "tt_activity_full_reward_landingpage_style");
        } else {
            int v10 = nVar.v();
            if (v10 != 0) {
                if (v10 == 1) {
                    return p.i(this.f11761c) ? t.f(this.f11760b, "tt_activity_full_reward_video_default_style") : t.f(this.f11760b, "tt_activity_full_reward_video_no_bar_style");
                } else if (v10 != 3) {
                    return v10 != 5 ? f10 : t.f(this.f11760b, "tt_activity_full_reward_video_vast_bar_style");
                } else {
                    return t.f(this.f11760b, "tt_activity_full_reward_video_new_bar_style");
                }
            }
            return t.f(this.f11760b, "tt_activity_full_reward_video_default_style");
        }
    }

    public void a(View.OnClickListener onClickListener) {
        v.a(this.f11771m, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void a(com.bytedance.sdk.openadsdk.core.b.c cVar) {
        v.a((View) this.f11771m, (View.OnTouchListener) cVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void a(float f10) {
        v.a(this.f11765g, f10);
        v.a(this.f11766h, f10);
    }

    public void a(Animation animation) {
        RelativeLayout relativeLayout = this.f11777s;
        if (relativeLayout != null) {
            relativeLayout.setAnimation(animation);
        }
    }
}
