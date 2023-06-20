package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.a.g;
import com.bytedance.sdk.openadsdk.core.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: RewardFullBackUpEndCard.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f11735a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f11736b;

    /* renamed from: c  reason: collision with root package name */
    TTRoundRectImageView f11737c;

    /* renamed from: d  reason: collision with root package name */
    TextView f11738d;

    /* renamed from: e  reason: collision with root package name */
    TTRatingBar2 f11739e;

    /* renamed from: f  reason: collision with root package name */
    TextView f11740f;

    /* renamed from: g  reason: collision with root package name */
    TextView f11741g;

    /* renamed from: h  reason: collision with root package name */
    private final Activity f11742h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11743i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f11744j;

    /* renamed from: k  reason: collision with root package name */
    private g f11745k;

    public a(Activity activity) {
        this.f11742h = activity;
    }

    private void d() {
        Activity activity = this.f11742h;
        this.f11736b = (FrameLayout) activity.findViewById(t.e(activity, "tt_reward_full_endcard_backup_container"));
        Activity activity2 = this.f11742h;
        this.f11735a = (LinearLayout) activity2.findViewById(t.e(activity2, "tt_reward_full_endcard_backup"));
        Activity activity3 = this.f11742h;
        this.f11737c = (TTRoundRectImageView) activity3.findViewById(t.e(activity3, "tt_reward_ad_icon_backup"));
        Activity activity4 = this.f11742h;
        this.f11738d = (TextView) activity4.findViewById(t.e(activity4, "tt_reward_ad_appname_backup"));
        Activity activity5 = this.f11742h;
        this.f11739e = (TTRatingBar2) activity5.findViewById(t.e(activity5, "tt_rb_score_backup"));
        Activity activity6 = this.f11742h;
        this.f11740f = (TextView) activity6.findViewById(t.e(activity6, "tt_comment_backup"));
        Activity activity7 = this.f11742h;
        this.f11741g = (TextView) activity7.findViewById(t.e(activity7, "tt_reward_ad_download_backup"));
        Activity activity8 = this.f11742h;
        this.f11744j = (TextView) activity8.findViewById(t.e(activity8, "tt_ad_endcard_logo"));
    }

    public void b() {
        v.a((View) this.f11736b, 0);
        v.a((View) this.f11735a, 0);
        g gVar = this.f11745k;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void c() {
        TTRoundRectImageView tTRoundRectImageView = this.f11737c;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, (int) v.b(this.f11742h, 50.0f), 0, 0);
            this.f11737c.setLayoutParams(layoutParams);
        }
    }

    public void a() {
        if (this.f11743i) {
            return;
        }
        this.f11743i = true;
        d();
    }

    public void a(e eVar) {
        v.a(this.f11736b, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        this.f11741g.setOnClickListener(eVar);
        this.f11741g.setOnTouchListener(eVar);
        if (this.f11745k == null) {
            this.f11745k = new g(this.f11742h);
        }
        this.f11745k.a(eVar);
    }

    public void a(n nVar) {
        if (nVar.aw()) {
            if (this.f11745k == null) {
                this.f11745k = new g(this.f11742h);
            }
            this.f11745k.a(nVar);
            return;
        }
        if (this.f11737c != null && nVar.M() != null && !TextUtils.isEmpty(nVar.M().a())) {
            com.bytedance.sdk.openadsdk.i.d.a().a(nVar.M(), this.f11737c);
        }
        TTRatingBar2 tTRatingBar2 = this.f11739e;
        if (tTRatingBar2 != null) {
            v.a((TextView) null, tTRatingBar2, nVar, this.f11742h);
        }
        if (this.f11738d != null) {
            if (nVar.aa() != null && !TextUtils.isEmpty(nVar.aa().b())) {
                this.f11738d.setText(nVar.aa().b());
            } else {
                this.f11738d.setText(nVar.U());
            }
        }
        TextView textView = this.f11740f;
        if (textView != null) {
            v.a(textView, nVar, this.f11742h, "tt_comment_num_backup");
        }
    }

    public void a(String str) {
        TextView textView;
        if (TextUtils.isEmpty(str) || (textView = this.f11741g) == null) {
            return;
        }
        textView.setText(str);
    }

    public void a(final n nVar, final String str) {
        this.f11744j.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.a(a.this.f11742h, nVar, str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public boolean a(com.bytedance.sdk.openadsdk.component.reward.a.e eVar) {
        g gVar = this.f11745k;
        if (gVar != null && gVar.a(eVar)) {
            v.a((View) this.f11736b, 0);
            v.a((View) this.f11735a, 8);
            return true;
        }
        return false;
    }
}
