package com.bytedance.sdk.openadsdk.component.reward.b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.view.RatioImageView;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.HashMap;
import java.util.List;

/* compiled from: RewardFullTypeImage.java */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: i  reason: collision with root package name */
    protected View f11548i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f11549j;

    /* renamed from: k  reason: collision with root package name */
    private int f11550k;

    /* renamed from: l  reason: collision with root package name */
    private RatioImageView f11551l;

    /* renamed from: m  reason: collision with root package name */
    private TTRoundRectImageView f11552m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f11553n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f11554o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f11555p;

    /* renamed from: q  reason: collision with root package name */
    private TTRatingBar2 f11556q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f11557r;

    /* renamed from: s  reason: collision with root package name */
    private n f11558s;

    /* renamed from: t  reason: collision with root package name */
    private String f11559t;

    public b(Activity activity, n nVar, int i10, int i11) {
        super(activity, nVar, i10, i11);
        this.f11549j = false;
        this.f11550k = 33;
        this.f11559t = "fullscreen_interstitial_ad";
        this.f11558s = nVar;
        this.f11550k = nVar.ad();
        this.f11549j = this.f11544e == 2;
    }

    private void d() {
        boolean z10 = this.f11544e == 2;
        this.f11549j = z10;
        if (z10) {
            int i10 = this.f11550k;
            if (i10 == 3) {
                f();
                return;
            } else if (i10 != 33) {
                j();
                return;
            } else {
                h();
                return;
            }
        }
        int i11 = this.f11550k;
        if (i11 == 3) {
            e();
        } else if (i11 != 33) {
            i();
        } else {
            g();
        }
    }

    private void e() {
        this.f11548i = LayoutInflater.from(this.f11540a).inflate(t.f(this.f11540a, "tt_activity_full_image_model_3_191_v"), (ViewGroup) null, true);
        k();
    }

    private void f() {
        View inflate = LayoutInflater.from(this.f11540a).inflate(t.f(this.f11540a, "tt_activity_full_image_model_3_191_h"), (ViewGroup) null, true);
        this.f11548i = inflate;
        this.f11551l = (RatioImageView) inflate.findViewById(t.e(this.f11540a, "tt_ratio_image_view"));
        this.f11552m = (TTRoundRectImageView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_icon"));
        this.f11553n = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_app_name"));
        this.f11554o = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_desc"));
        this.f11555p = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_comment"));
        this.f11557r = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_download"));
        final View findViewById = this.f11548i.findViewById(t.e(this.f11540a, "tt_image_full_bar"));
        a((View) this.f11551l);
        a((View) this.f11552m);
        a(this.f11553n);
        a(this.f11554o);
        a(this.f11555p);
        a(this.f11557r);
        ((TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    b bVar = b.this;
                    TTWebsiteActivity.a(bVar.f11540a, bVar.f11558s, b.this.f11559t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        this.f11557r.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                ViewGroup.LayoutParams layoutParams;
                int i10;
                int width = findViewById.getWidth() / 2;
                if (width < v.d(m.a(), 90.0f) || (i10 = (layoutParams = b.this.f11557r.getLayoutParams()).width) <= 0) {
                    return;
                }
                layoutParams.width = Math.min(width, i10);
                b.this.f11557r.setLayoutParams(layoutParams);
            }
        });
    }

    private void g() {
        this.f11548i = LayoutInflater.from(this.f11540a).inflate(t.f(this.f11540a, "tt_activity_full_image_model_33_v"), (ViewGroup) null, true);
        k();
    }

    private void h() {
        this.f11548i = LayoutInflater.from(this.f11540a).inflate(t.f(this.f11540a, "tt_activity_full_image_model_33_h"), (ViewGroup) null, true);
        k();
    }

    private void i() {
        View inflate = LayoutInflater.from(this.f11540a).inflate(t.f(this.f11540a, "tt_activity_full_image_model_173_v"), (ViewGroup) null, true);
        this.f11548i = inflate;
        this.f11551l = (RatioImageView) inflate.findViewById(t.e(this.f11540a, "tt_ratio_image_view"));
        this.f11552m = (TTRoundRectImageView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_icon"));
        this.f11553n = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_app_name"));
        this.f11554o = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_desc"));
        this.f11557r = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_download"));
        a((View) this.f11551l);
        a((View) this.f11552m);
        a(this.f11553n);
        a(this.f11554o);
        a(this.f11557r);
        ((TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.b.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    b bVar = b.this;
                    TTWebsiteActivity.a(bVar.f11540a, bVar.f11558s, b.this.f11559t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void j() {
        this.f11548i = LayoutInflater.from(this.f11540a).inflate(t.f(this.f11540a, "tt_activity_full_image_model_173_h"), (ViewGroup) null, true);
        k();
    }

    private void k() {
        View view = this.f11548i;
        if (view == null) {
            return;
        }
        this.f11551l = (RatioImageView) view.findViewById(t.e(this.f11540a, "tt_ratio_image_view"));
        this.f11552m = (TTRoundRectImageView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_icon"));
        this.f11553n = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_app_name"));
        this.f11554o = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_desc"));
        this.f11555p = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_comment"));
        this.f11556q = (TTRatingBar2) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_rb_score"));
        this.f11557r = (TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_full_ad_download"));
        a((View) this.f11551l);
        a((View) this.f11552m);
        a(this.f11553n);
        a(this.f11554o);
        a(this.f11555p);
        a((View) this.f11556q);
        a(this.f11557r);
        ((TextView) this.f11548i.findViewById(t.e(this.f11540a, "tt_ad_logo"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.b.b.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                try {
                    b bVar = b.this;
                    TTWebsiteActivity.a(bVar.f11540a, bVar.f11558s, b.this.f11559t);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void l() {
        TTRatingBar2 tTRatingBar2 = this.f11556q;
        if (tTRatingBar2 == null) {
            return;
        }
        v.a((TextView) null, tTRatingBar2, this.f11541b, this.f11540a);
    }

    private void m() {
        n nVar;
        TextView textView = this.f11555p;
        if (textView == null || (nVar = this.f11558s) == null) {
            return;
        }
        v.a(textView, nVar, this.f11540a, "tt_comment_num_backup");
    }

    private boolean n() {
        n nVar = this.f11558s;
        return nVar != null && nVar.l() == 2;
    }

    public static boolean c(n nVar) {
        return (nVar == null || n.c(nVar) || nVar.an() != 100.0f) ? false : true;
    }

    protected String a(n nVar) {
        if (nVar == null) {
            return "";
        }
        if (nVar.aa() != null && !TextUtils.isEmpty(nVar.aa().b())) {
            return nVar.aa().b();
        }
        if (TextUtils.isEmpty(nVar.K())) {
            return !TextUtils.isEmpty(nVar.U()) ? nVar.U() : "";
        }
        return nVar.K();
    }

    protected String b(n nVar) {
        if (nVar == null) {
            return "";
        }
        if (TextUtils.isEmpty(nVar.U())) {
            return !TextUtils.isEmpty(nVar.V()) ? nVar.V() : "";
        }
        return nVar.U();
    }

    private r3.c e(n nVar) {
        if (nVar.L() == 4) {
            return new r3.b(m.a(), nVar, this.f11559t);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public boolean c() {
        return n();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public boolean b() {
        return n();
    }

    private void a(ImageView imageView) {
        List<k> P;
        n nVar = this.f11558s;
        if (nVar == null || (P = nVar.P()) == null || P.size() <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.d.a.a(P.get(0)).a(imageView);
    }

    private void d(n nVar) {
        if (nVar == null) {
            return;
        }
        RatioImageView ratioImageView = this.f11551l;
        if (ratioImageView != null) {
            int i10 = this.f11550k;
            if (i10 == 33) {
                ratioImageView.setRatio(1.0f);
            } else if (i10 == 3) {
                ratioImageView.setRatio(1.91f);
            } else {
                ratioImageView.setRatio(0.56f);
            }
            a((ImageView) this.f11551l);
        }
        if (this.f11552m != null && this.f11558s.M() != null && !TextUtils.isEmpty(this.f11558s.M().a())) {
            d.a().a(this.f11558s.M().a(), this.f11552m);
        }
        TextView textView = this.f11553n;
        if (textView != null) {
            textView.setText(a(this.f11558s));
        }
        TextView textView2 = this.f11554o;
        if (textView2 != null) {
            textView2.setText(b(this.f11558s));
        }
        l();
        m();
    }

    protected void a(View view) {
        if (view == null || this.f11540a == null || this.f11558s == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.b.b bVar = this.f11547h;
        if (bVar == null) {
            Activity activity = this.f11540a;
            n nVar = this.f11558s;
            String str = this.f11559t;
            bVar = new com.bytedance.sdk.openadsdk.core.b.a(activity, nVar, str, u.a(str));
            bVar.a(e(this.f11558s));
            HashMap hashMap = new HashMap();
            if (p.i(this.f11541b)) {
                hashMap.put("click_scence", 3);
            } else {
                hashMap.put("click_scence", 1);
            }
            bVar.a(hashMap);
        }
        Activity activity2 = this.f11540a;
        if (activity2 != null) {
            bVar.a(activity2);
        }
        view.setOnTouchListener(bVar);
        view.setOnClickListener(bVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public void a(FrameLayout frameLayout) {
        d();
        d(this.f11558s);
        frameLayout.addView(this.f11548i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.b.a
    public void a(com.bytedance.sdk.openadsdk.component.reward.a.c cVar, com.bytedance.sdk.openadsdk.component.reward.view.d dVar) {
        dVar.b(8);
        dVar.a(8);
        cVar.c(false);
        cVar.d(false);
        if (this.f11541b.l() == 2) {
            cVar.a(false);
            dVar.d(8);
            return;
        }
        cVar.a(this.f11541b.ap());
        dVar.d(0);
        cVar.d();
    }
}
