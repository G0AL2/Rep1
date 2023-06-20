package com.bytedance.sdk.openadsdk.component.reward.a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.v;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullVideoLoadingManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    TTRoundRectImageView f11439a;

    /* renamed from: b  reason: collision with root package name */
    TextView f11440b;

    /* renamed from: c  reason: collision with root package name */
    ProgressBar f11441c;

    /* renamed from: d  reason: collision with root package name */
    TextView f11442d;

    /* renamed from: e  reason: collision with root package name */
    private n f11443e;

    /* renamed from: f  reason: collision with root package name */
    private Context f11444f;

    /* renamed from: h  reason: collision with root package name */
    private View f11446h;

    /* renamed from: j  reason: collision with root package name */
    private LinearLayout f11448j;

    /* renamed from: k  reason: collision with root package name */
    private TwoSemicirclesView f11449k;

    /* renamed from: l  reason: collision with root package name */
    private TwoSemicirclesView f11450l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f11451m;

    /* renamed from: n  reason: collision with root package name */
    private String f11452n;

    /* renamed from: o  reason: collision with root package name */
    private int f11453o;

    /* renamed from: p  reason: collision with root package name */
    private AnimatorSet f11454p;

    /* renamed from: q  reason: collision with root package name */
    private AnimatorSet f11455q;

    /* renamed from: g  reason: collision with root package name */
    private int f11445g = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11447i = false;

    public d(Context context) {
        this.f11444f = context;
    }

    private void e() {
        View inflate = LayoutInflater.from(this.f11444f).inflate(t.f(this.f11444f, "tt_full_reward_video_loading"), (ViewGroup) null, false);
        this.f11446h = inflate;
        this.f11439a = (TTRoundRectImageView) inflate.findViewById(t.e(this.f11444f, "tt_loading_icon"));
        this.f11440b = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_loading_appname"));
        this.f11441c = (ProgressBar) this.f11446h.findViewById(t.e(this.f11444f, "tt_loading_progressbar"));
        this.f11442d = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_loading_progress_number"));
        this.f11451m = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_ad_loading_logo"));
        if (this.f11453o == 1 && this.f11443e.aa() != null && !TextUtils.isEmpty(this.f11443e.aa().b())) {
            this.f11440b.setText(this.f11443e.aa().b());
        } else if (!TextUtils.isEmpty(this.f11443e.U())) {
            this.f11440b.setText(this.f11443e.U());
        } else {
            this.f11440b.setVisibility(8);
        }
        m();
        this.f11451m.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f11444f, d.this.f11443e, d.this.f11452n);
            }
        });
    }

    private void f() {
        View inflate = LayoutInflater.from(this.f11444f).inflate(t.f(this.f11444f, "tt_full_reward_video_loading2"), (ViewGroup) null, false);
        this.f11446h = inflate;
        this.f11439a = (TTRoundRectImageView) inflate.findViewById(t.e(this.f11444f, "tt_loading_icon"));
        this.f11442d = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_loading_progress_number"));
        this.f11451m = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_ad_loading_logo"));
        m();
        this.f11451m.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f11444f, d.this.f11443e, d.this.f11452n);
            }
        });
    }

    private void g() {
        View inflate = LayoutInflater.from(this.f11444f).inflate(t.f(this.f11444f, "tt_full_reward_video_loading3"), (ViewGroup) null, false);
        this.f11446h = inflate;
        this.f11448j = (LinearLayout) inflate.findViewById(t.e(this.f11444f, "wave_container"));
        this.f11442d = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_ad_loading_logo"));
        this.f11451m = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f11444f, d.this.f11443e, d.this.f11452n);
            }
        });
    }

    private void h() {
        View inflate = LayoutInflater.from(this.f11444f).inflate(t.f(this.f11444f, "tt_full_reward_video_loading4"), (ViewGroup) null, false);
        this.f11446h = inflate;
        this.f11449k = (TwoSemicirclesView) inflate.findViewById(t.e(this.f11444f, "inner_circle"));
        this.f11450l = (TwoSemicirclesView) this.f11446h.findViewById(t.e(this.f11444f, "outer_circle"));
        this.f11449k.setRadius(v.e(this.f11444f, 80.0f));
        Paint paintTwo = this.f11449k.getPaintTwo();
        paintTwo.setColor(Color.parseColor("#C4C4C4"));
        this.f11449k.setPaintTwo(paintTwo);
        this.f11450l.setRadius(v.e(this.f11444f, 95.0f));
        Paint paintTwo2 = this.f11450l.getPaintTwo();
        paintTwo2.setStrokeWidth(6.0f);
        paintTwo2.setColor(Color.parseColor("#118BFF"));
        this.f11450l.setPaintTwo(paintTwo2);
        this.f11442d = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_loading_progress_number"));
        TextView textView = (TextView) this.f11446h.findViewById(t.e(this.f11444f, "tt_ad_loading_logo"));
        this.f11451m = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.a(d.this.f11444f, d.this.f11443e, d.this.f11452n);
            }
        });
    }

    private void i() {
        n();
    }

    private void j() {
        Context context = this.f11444f;
        this.f11439a.setAnimation(AnimationUtils.loadAnimation(context, t.l(context, "tt_loading_two_icon_scale")));
        n();
    }

    private void k() {
        this.f11454p = new AnimatorSet();
        LinearLayout linearLayout = this.f11448j;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            duration.setRepeatMode(2);
            duration.setRepeatCount(-1);
            AnimatorSet.Builder play = this.f11454p.play(duration);
            for (int i10 = 1; i10 < this.f11448j.getChildCount(); i10++) {
                float f10 = i10 % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f11448j.getChildAt(i10), "translationY", -f10, f10).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.f11454p.start();
        }
        n();
    }

    private void l() {
        this.f11454p = new AnimatorSet();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f11449k, "rotation", 0.0f, 360.0f).setDuration(1500L);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f11450l, "rotation", 0.0f, 360.0f).setDuration(2500L);
        duration2.setRepeatCount(-1);
        this.f11454p.playTogether(duration, duration2);
        this.f11454p.start();
        n();
    }

    private void m() {
        if (this.f11443e.M() != null && !TextUtils.isEmpty(this.f11443e.M().a())) {
            try {
                com.bytedance.sdk.openadsdk.d.a.a(this.f11443e.M()).a(new com.bytedance.sdk.component.d.n<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.5
                    @Override // com.bytedance.sdk.component.d.n
                    public void a(j<Bitmap> jVar) {
                        if (jVar != null) {
                            try {
                                if (jVar.b() != null) {
                                    d.this.f11439a.setImageBitmap(jVar.b());
                                }
                            } catch (Throwable unused) {
                                d.this.f11439a.setVisibility(8);
                                return;
                            }
                        }
                        d.this.f11439a.setVisibility(8);
                    }

                    @Override // com.bytedance.sdk.component.d.n
                    public void a(int i10, String str, Throwable th) {
                        d.this.f11439a.setVisibility(8);
                    }
                });
                return;
            } catch (Throwable unused) {
                this.f11439a.setVisibility(8);
                return;
            }
        }
        this.f11439a.setVisibility(8);
    }

    private void n() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(Constants.MIN_PROGRESS_TIME);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ProgressBar progressBar = d.this.f11441c;
                if (progressBar != null) {
                    progressBar.setProgress(intValue);
                }
                d.this.f11442d.setText(String.valueOf(intValue));
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(3000L);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.a.d.7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ProgressBar progressBar = d.this.f11441c;
                if (progressBar != null) {
                    progressBar.setProgress(intValue);
                }
                d.this.f11442d.setText(String.valueOf(intValue));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofInt).before(ofInt2);
        animatorSet.start();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f11455q = animatorSet2;
        animatorSet2.play(ofInt).before(ofInt2);
        this.f11455q.start();
    }

    public boolean d() {
        return this.f11447i;
    }

    public void a(n nVar, String str, int i10) {
        if (nVar == null) {
            return;
        }
        try {
            this.f11443e = nVar;
            if (!n.c(nVar) || p.i(this.f11443e)) {
                return;
            }
            try {
                this.f11445g = new JSONObject(this.f11443e.G().g()).optInt("loading_page_type", 0);
            } catch (JSONException unused) {
            }
            this.f11452n = str;
            this.f11453o = i10;
            this.f11447i = true;
            int i11 = this.f11445g;
            if (i11 == 1) {
                e();
            } else if (i11 == 2) {
                f();
            } else if (i11 == 3) {
                g();
            } else if (i11 != 4) {
                this.f11447i = false;
            } else {
                h();
            }
        } catch (Throwable unused2) {
            this.f11447i = false;
        }
    }

    public void b() {
        AnimatorSet animatorSet = this.f11454p;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f11455q;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public View c() {
        return this.f11446h;
    }

    public void a() {
        try {
            int i10 = this.f11445g;
            if (i10 == 1) {
                i();
            } else if (i10 == 2) {
                j();
            } else if (i10 == 3) {
                k();
            } else if (i10 == 4) {
                l();
            }
        } catch (Throwable unused) {
        }
    }
}
