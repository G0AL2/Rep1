package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.b.e;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.List;

/* loaded from: classes.dex */
public class FullInteractionStyleView extends BackupView {

    /* renamed from: a  reason: collision with root package name */
    private float f11717a;

    /* renamed from: m  reason: collision with root package name */
    private boolean f11718m;

    /* renamed from: n  reason: collision with root package name */
    private int f11719n;

    /* renamed from: o  reason: collision with root package name */
    private int f11720o;

    /* renamed from: p  reason: collision with root package name */
    private int f11721p;

    /* renamed from: q  reason: collision with root package name */
    private View f11722q;

    /* renamed from: r  reason: collision with root package name */
    private View f11723r;

    /* renamed from: s  reason: collision with root package name */
    private FrameLayout f11724s;

    /* renamed from: t  reason: collision with root package name */
    private e f11725t;

    public FullInteractionStyleView(Context context, String str) {
        super(context, str);
        this.f11721p = 1;
        this.f12528b = context;
    }

    private void g() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_2_3_h"), (ViewGroup) this, true);
        d();
        f();
    }

    private float getHeightDp() {
        return v.d(this.f12528b, v.h(this.f12528b));
    }

    private float getWidthDp() {
        return v.d(this.f12528b, v.i(this.f12528b));
    }

    private void h() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_3_2_h"), (ViewGroup) this, true);
        d();
    }

    private void i() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_9_16_h"), (ViewGroup) this, true);
        d();
        f();
    }

    private void j() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_16_9_h"), (ViewGroup) this, true);
        d();
    }

    private void k() {
        View inflate = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_3_2"), (ViewGroup) this, true);
        this.f11722q = inflate;
        this.f11724s = (FrameLayout) inflate.findViewById(t.e(this.f12528b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f11722q.findViewById(t.e(this.f12528b, "tt_bu_img"));
        TextView textView = (TextView) this.f11722q.findViewById(t.e(this.f12528b, "tt_bu_desc"));
        a(this.f11724s, imageView);
        textView.setText(getDescription());
        b(this.f11724s);
        b(imageView);
        b(textView);
        ((LinearLayout) this.f11722q.findViewById(t.e(this.f12528b, "tt_ad_logo_layout"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(((BackupView) FullInteractionStyleView.this).f12528b, ((BackupView) FullInteractionStyleView.this).f12529c, ((BackupView) FullInteractionStyleView.this).f12532f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void l() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_9_16_v"), (ViewGroup) this, true);
        d();
    }

    private void m() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_16_9_v"), (ViewGroup) this, true);
        d();
        f();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void a(View view, int i10, j jVar) {
    }

    public View getInteractionStyleRootView() {
        return this.f11722q;
    }

    public FrameLayout getVideoContainer() {
        return this.f11724s;
    }

    public void setDownloadListener(e eVar) {
        this.f11725t = eVar;
    }

    public void setIsMute(boolean z10) {
        this.f11718m = z10;
        View view = this.f11723r;
        if (view != null && (view instanceof NativeVideoTsView)) {
            ((NativeVideoTsView) view).setIsQuiet(z10);
        }
    }

    private void b() {
        this.f12533g = v.e(this.f12528b, this.f11719n);
        this.f12534h = v.e(this.f12528b, this.f11720o);
        int i10 = (int) (this.f11717a * 1000.0f);
        if (this.f11721p == 1) {
            if (i10 == 666) {
                e();
            } else if (i10 == 1000) {
                c();
            } else if (i10 == 1500) {
                k();
            } else if (i10 != 1777) {
                a(0.562f);
                l();
            } else {
                m();
            }
        } else if (i10 == 562) {
            i();
        } else if (i10 == 666) {
            g();
        } else if (i10 == 1000) {
            c();
        } else if (i10 != 1500) {
            a(1.777f);
            j();
        } else {
            h();
        }
    }

    private void c() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_1_1"), (ViewGroup) this, true);
        d();
        f();
    }

    private void d() {
        this.f11724s = (FrameLayout) this.f11722q.findViewById(t.e(this.f12528b, "tt_ad_container"));
        ImageView imageView = (ImageView) this.f11722q.findViewById(t.e(this.f12528b, "tt_full_img"));
        TTRoundRectImageView tTRoundRectImageView = (TTRoundRectImageView) this.f11722q.findViewById(t.e(this.f12528b, "tt_full_ad_icon"));
        TextView textView = (TextView) this.f11722q.findViewById(t.e(this.f12528b, "tt_full_ad_app_name"));
        TextView textView2 = (TextView) this.f11722q.findViewById(t.e(this.f12528b, "tt_full_ad_download"));
        LinearLayout linearLayout = (LinearLayout) this.f11722q.findViewById(t.e(this.f12528b, "tt_ad_logo_layout"));
        if (!TextUtils.isEmpty(this.f12529c.W())) {
            textView2.setText(this.f12529c.W());
        }
        a(this.f11724s, imageView);
        if (this.f12529c.M() != null && !TextUtils.isEmpty(this.f12529c.M().a())) {
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12529c.M().a(), tTRoundRectImageView);
        }
        textView.setText(getTitle());
        b(this.f11724s);
        b(imageView);
        b(tTRoundRectImageView);
        b(textView);
        b(textView2);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.FullInteractionStyleView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(((BackupView) FullInteractionStyleView.this).f12528b, ((BackupView) FullInteractionStyleView.this).f12529c, ((BackupView) FullInteractionStyleView.this).f12532f);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void e() {
        this.f11722q = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_interaction_style_2_3"), (ViewGroup) this, true);
        d();
        f();
    }

    private void f() {
        TextView textView = (TextView) this.f11722q.findViewById(t.e(this.f12528b, "tt_full_ad_desc"));
        if (textView != null) {
            textView.setText(getDescription());
            b(textView);
        }
    }

    public void a(n nVar, float f10, int i10, int i11, int i12) {
        this.f11717a = f10;
        this.f11721p = i10;
        this.f12529c = nVar;
        this.f12532f = "fullscreen_interstitial_ad";
        this.f11719n = i11;
        this.f11720o = i12;
        a(this.f12535i);
        b();
    }

    private void a(FrameLayout frameLayout, ImageView imageView) {
        n nVar = this.f12529c;
        if (nVar == null) {
            return;
        }
        boolean c10 = n.c(nVar);
        if (this.f12529c.J() != null && c10) {
            v.a((View) imageView, 8);
            v.a((View) frameLayout, 0);
            return;
        }
        a(imageView);
        v.a((View) imageView, 0);
        v.a((View) frameLayout, 8);
    }

    private void a(ImageView imageView) {
        List<k> P;
        n nVar = this.f12529c;
        if (nVar == null || (P = nVar.P()) == null || P.size() <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.d.a.a(P.get(0)).a(imageView);
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.b.a aVar = this.f11725t;
        if (aVar == null) {
            Context context = this.f12528b;
            n nVar = this.f12529c;
            String str = this.f12532f;
            aVar = new com.bytedance.sdk.openadsdk.core.b.a(context, nVar, str, u.a(str));
            aVar.a(a(this.f12529c, this.f12528b));
        }
        view.setOnTouchListener(aVar);
        view.setOnClickListener(aVar);
    }

    private r3.c a(n nVar, Context context) {
        if (nVar != null && nVar.L() == 4) {
            return new r3.b(context, nVar, this.f12532f);
        }
        return null;
    }

    private void a(float f10) {
        float min;
        float max;
        int max2;
        int i10;
        float heightDp = getHeightDp();
        float widthDp = getWidthDp();
        if (this.f11721p == 2) {
            min = Math.max(heightDp, widthDp);
            max = Math.min(heightDp, widthDp);
        } else {
            min = Math.min(heightDp, widthDp);
            max = Math.max(heightDp, widthDp);
        }
        if (this.f11721p != 2 && v.c((Activity) this.f12528b)) {
            Context context = this.f12528b;
            max -= v.d(context, v.j(context));
        }
        int i11 = 20;
        int i12 = 0;
        if (this.f11721p != 2) {
            if (f10 != 0.0f && f10 != 100.0f) {
                float f11 = 20;
                i10 = (int) Math.max((max - (((min - f11) - f11) / f10)) / 2.0f, 0.0f);
                i11 = i10;
                max2 = 20;
                i12 = 20;
            }
            i10 = 0;
            max2 = 0;
            i11 = 0;
        } else {
            if (f10 != 0.0f && f10 != 100.0f) {
                float f12 = 20;
                max2 = (int) Math.max((min - (((max - f12) - f12) * f10)) / 2.0f, 0.0f);
                i12 = max2;
                i10 = 20;
            }
            i10 = 0;
            max2 = 0;
            i11 = 0;
        }
        ((Activity) this.f12528b).getWindow().getDecorView().setPadding(v.e(this.f12528b, i12), v.e(this.f12528b, i11), v.e(this.f12528b, max2), v.e(this.f12528b, i10));
    }
}
