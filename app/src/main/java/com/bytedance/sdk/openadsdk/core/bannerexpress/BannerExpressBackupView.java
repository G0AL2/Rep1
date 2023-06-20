package com.bytedance.sdk.openadsdk.core.bannerexpress;

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
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.k;
import com.bytedance.sdk.openadsdk.core.widget.RatioFrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.RatioImageView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ms.bd.o.Pgl.c;

/* loaded from: classes.dex */
public class BannerExpressBackupView extends BackupView {

    /* renamed from: a  reason: collision with root package name */
    public static k[] f11926a = {new k(1, 6.4f, 320, 50), new k(4, 1.2f, c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED)};

    /* renamed from: m  reason: collision with root package name */
    private View f11927m;

    /* renamed from: n  reason: collision with root package name */
    private NativeExpressView f11928n;

    /* renamed from: o  reason: collision with root package name */
    private r3.c f11929o;

    /* renamed from: p  reason: collision with root package name */
    private int f11930p;

    /* renamed from: q  reason: collision with root package name */
    private String f11931q;

    public BannerExpressBackupView(Context context) {
        super(context);
        this.f11930p = 1;
        this.f12528b = context;
    }

    public void setClosedListenerKey(String str) {
        this.f11931q = str;
    }

    private void b() {
        k a10 = a(this.f11928n.getExpectExpressWidth(), this.f11928n.getExpectExpressHeight());
        if (this.f11928n.getExpectExpressWidth() > 0 && this.f11928n.getExpectExpressHeight() > 0) {
            this.f12533g = v.e(this.f12528b, this.f11928n.getExpectExpressWidth());
            this.f12534h = v.e(this.f12528b, this.f11928n.getExpectExpressHeight());
        } else {
            int c10 = v.c(this.f12528b);
            this.f12533g = c10;
            this.f12534h = Float.valueOf(c10 / a10.f12652b).intValue();
        }
        int i10 = this.f12533g;
        if (i10 > 0 && i10 > v.c(this.f12528b)) {
            float c11 = v.c(this.f12528b) / this.f12533g;
            this.f12533g = v.c(this.f12528b);
            this.f12534h = Float.valueOf(this.f12534h * c11).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f12533g, this.f12534h);
        }
        layoutParams.width = this.f12533g;
        layoutParams.height = this.f12534h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        int i11 = a10.f12651a;
        if (i11 == 1) {
            c();
        } else if (i11 == 4) {
            d();
        } else {
            d();
        }
    }

    private void c() {
        float e10 = (this.f12534h * 1.0f) / v.e(this.f12528b, 50.0f);
        int i10 = this.f12533g;
        if ((this.f12534h * 1.0f) / i10 > 0.21875f) {
            e10 = (i10 * 1.0f) / v.e(this.f12528b, 320.0f);
        }
        View inflate = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_backup_banner_layout1"), (ViewGroup) this, true);
        this.f11927m = inflate;
        View findViewById = inflate.findViewById(t.e(this.f12528b, "tt_bu_close"));
        ImageView imageView = (ImageView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_icon"));
        TextView textView = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_title"));
        TextView textView2 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_score"));
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_score_bar"));
        TextView textView3 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_download"));
        textView.setTextSize(2, v.a(this.f12528b, textView.getTextSize()) * e10);
        textView2.setTextSize(2, v.a(this.f12528b, textView2.getTextSize()) * e10);
        textView3.setTextSize(2, v.a(this.f12528b, textView3.getTextSize()) * e10);
        View findViewById2 = this.f11927m.findViewById(t.e(this.f12528b, "tt_backup_logoLayout"));
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.a(((BackupView) BannerExpressBackupView.this).f12528b, ((BackupView) BannerExpressBackupView.this).f12529c, ((BackupView) BannerExpressBackupView.this).f12532f);
                }
            });
        }
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BannerExpressBackupView.this.a();
            }
        });
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (v.e(this.f12528b, 45.0f) * e10);
            layoutParams.height = (int) (v.e(this.f12528b, 45.0f) * e10);
        }
        if (this.f12529c.M() != null && !TextUtils.isEmpty(this.f12529c.M().a())) {
            d.a().a(this.f12529c.M().a(), imageView);
        }
        textView.setText(getTitle());
        if (!TextUtils.isEmpty(this.f12529c.W())) {
            textView3.setText(this.f12529c.W());
        } else {
            textView3.setVisibility(8);
        }
        v.a(textView2, tTRatingBar2, this.f12529c, this.f12528b);
        a((View) imageView, true);
        imageView.setTag(t.e(m.a(), "tt_id_is_video_picture"), Boolean.TRUE);
        a((View) this, true);
        a((View) textView3, true);
    }

    private void d() {
        String str;
        n nVar = this.f12529c;
        if (nVar != null) {
            int ad2 = nVar.ad();
            float e10 = (this.f12534h * 1.0f) / v.e(this.f12528b, 250.0f);
            if (this.f12529c.J() == null) {
                View inflate = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_backup_banner_layout4"), (ViewGroup) this, true);
                this.f11927m = inflate;
                View findViewById = inflate.findViewById(t.e(this.f12528b, "tt_bu_close"));
                RatioImageView ratioImageView = (RatioImageView) this.f11927m.findViewById(t.e(this.f12528b, "ratio_image_view"));
                ImageView imageView = (ImageView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_icon"));
                TextView textView = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_title"));
                TextView textView2 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_desc"));
                TextView textView3 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_name"));
                TextView textView4 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_download"));
                FrameLayout frameLayout = (FrameLayout) this.f11927m.findViewById(t.e(this.f12528b, "tt_image_layout"));
                LinearLayout linearLayout = (LinearLayout) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_total_title"));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    str = "tt_id_is_video_picture";
                    layoutParams.width = (int) (v.e(this.f12528b, 45.0f) * e10);
                    layoutParams.height = (int) (v.e(this.f12528b, 45.0f) * e10);
                } else {
                    str = "tt_id_is_video_picture";
                }
                textView.setTextSize(2, v.a(this.f12528b, textView.getTextSize()) * e10);
                textView2.setTextSize(2, v.a(this.f12528b, textView2.getTextSize()) * e10);
                textView3.setTextSize(2, v.a(this.f12528b, textView3.getTextSize()) * e10);
                textView4.setTextSize(2, v.a(this.f12528b, textView4.getTextSize()) * e10);
                try {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                    float f10 = e10 - 1.0f;
                    if (f10 > 0.0f) {
                        layoutParams2.topMargin = v.e(this.f12528b, f10 * 8.0f);
                    }
                    ((LinearLayout.LayoutParams) textView4.getLayoutParams()).setMargins(0, (int) (v.e(this.f12528b, 16.0f) * e10), 0, 0);
                } catch (Throwable unused) {
                }
                View findViewById2 = this.f11927m.findViewById(t.e(this.f12528b, "tt_backup_logoLayout"));
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            TTWebsiteActivity.a(((BackupView) BannerExpressBackupView.this).f12528b, ((BackupView) BannerExpressBackupView.this).f12529c, ((BackupView) BannerExpressBackupView.this).f12532f);
                        }
                    });
                }
                if (ad2 == 33) {
                    ratioImageView.setRatio(1.0f);
                } else {
                    ((LinearLayout.LayoutParams) frameLayout.getLayoutParams()).weight = 2.5f;
                    ratioImageView.setRatio(1.91f);
                }
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        BannerExpressBackupView.this.a();
                    }
                });
                int b10 = (int) v.b(this.f12528b, 15.0f);
                v.a(findViewById, b10, b10, b10, b10);
                a((ImageView) ratioImageView);
                if (this.f12529c.M() != null && !TextUtils.isEmpty(this.f12529c.M().a())) {
                    d.a().a(this.f12529c.M().a(), imageView);
                }
                textView3.setText(getNameOrSource());
                textView.setText(getNameOrSource());
                textView2.setText(getDescription());
                if (!TextUtils.isEmpty(this.f12529c.W())) {
                    textView4.setText(this.f12529c.W());
                } else {
                    textView4.setVisibility(8);
                }
                a((View) ratioImageView, true);
                ratioImageView.setTag(t.e(m.a(), str), Boolean.TRUE);
                a((View) this, true);
                a((View) textView4, true);
                return;
            }
            View inflate2 = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_backup_banner_layout4_video"), (ViewGroup) this, true);
            this.f11927m = inflate2;
            View findViewById3 = inflate2.findViewById(t.e(this.f12528b, "tt_bu_close"));
            TextView textView5 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_title"));
            TextView textView6 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_desc"));
            TextView textView7 = (TextView) this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_download"));
            RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.f11927m.findViewById(t.e(this.f12528b, "ratio_frame_layout"));
            textView5.setTextSize(2, v.a(this.f12528b, textView5.getTextSize()) * e10);
            textView6.setTextSize(2, v.a(this.f12528b, textView6.getTextSize()) * e10);
            textView7.setTextSize(2, v.a(this.f12528b, textView7.getTextSize()) * e10);
            View findViewById4 = this.f11927m.findViewById(t.e(this.f12528b, "tt_backup_logoLayout"));
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TTWebsiteActivity.a(((BackupView) BannerExpressBackupView.this).f12528b, ((BackupView) BannerExpressBackupView.this).f12529c, ((BackupView) BannerExpressBackupView.this).f12532f);
                    }
                });
            }
            if (ad2 == 15) {
                ratioFrameLayout.setRatio(0.5625f);
            } else if (ad2 == 5) {
                ratioFrameLayout.setRatio(1.7777778f);
            } else {
                ratioFrameLayout.setRatio(1.0f);
            }
            ratioFrameLayout.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            View videoView = getVideoView();
            if (videoView != null) {
                ratioFrameLayout.addView(videoView, layoutParams3);
            }
            textView5.setText(getNameOrSource());
            textView6.setText(getDescription());
            if (!TextUtils.isEmpty(this.f12529c.W())) {
                textView7.setText(this.f12529c.W());
            } else {
                textView7.setVisibility(8);
            }
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressBackupView.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    BannerExpressBackupView.this.a();
                }
            });
            int b11 = (int) v.b(this.f12528b, 15.0f);
            v.a(findViewById3, b11, b11, b11, b11);
            a(videoView, true);
            videoView.setTag(t.e(m.a(), "tt_id_is_video_picture"), Boolean.TRUE);
            a((View) this, true);
            a((View) textView7, true);
            a(ratioFrameLayout);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void a(View view, int i10, j jVar) {
        if (this.f11928n != null) {
            if (i10 == 1 || i10 == 2) {
                View findViewById = this.f11927m.findViewById(t.e(this.f12528b, "tt_bu_close"));
                if (i10 == 1) {
                    this.f11928n.getClickListener().b(findViewById);
                } else {
                    this.f11928n.getClickCreativeListener().b(findViewById);
                }
            }
            this.f11928n.a(view, i10, jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(n nVar, NativeExpressView nativeExpressView, r3.c cVar) {
        setBackgroundColor(-1);
        this.f12529c = nVar;
        this.f11928n = nativeExpressView;
        this.f11929o = cVar;
        this.f12532f = "banner_ad";
        nativeExpressView.addView(this, new ViewGroup.LayoutParams(-2, -2));
        b();
    }

    private void a(ImageView imageView) {
        d.a().a(this.f12529c.P().get(0), imageView);
    }

    public static k a(int i10, int i11) {
        try {
            return ((double) i11) >= Math.floor((((double) i10) * 450.0d) / 600.0d) ? f11926a[1] : f11926a[0];
        } catch (Throwable unused) {
            return f11926a[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    public void a() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f12531e;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.b bVar = this.f12530d;
        if (bVar != null) {
            bVar.showDislikeDialog();
        } else {
            TTDelegateActivity.a(this.f12529c, this.f11931q);
        }
    }
}
