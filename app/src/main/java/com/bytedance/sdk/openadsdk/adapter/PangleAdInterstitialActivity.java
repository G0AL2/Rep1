package com.bytedance.sdk.openadsdk.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.CustomEventInterstitialListener;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PangleAdInterstitialActivity extends Activity {
    public static final String INTENT_TYPE = "intent_type";
    public static final int INTENT_TYPE_IMAGE_2_3 = 2;
    public static final int INTENT_TYPE_IMAGE_3_2 = 1;

    /* renamed from: n  reason: collision with root package name */
    private static CustomEventInterstitialListener f10959n;

    /* renamed from: o  reason: collision with root package name */
    private static TTNativeAd f10960o;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f10961a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f10962b;

    /* renamed from: c  reason: collision with root package name */
    private NiceImageView f10963c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f10964d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f10965e;

    /* renamed from: f  reason: collision with root package name */
    private Button f10966f;

    /* renamed from: g  reason: collision with root package name */
    private TTRatingBar2 f10967g;

    /* renamed from: h  reason: collision with root package name */
    private Intent f10968h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f10969i;

    /* renamed from: j  reason: collision with root package name */
    private RelativeLayout f10970j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f10971k;

    /* renamed from: l  reason: collision with root package name */
    private float f10972l;

    /* renamed from: m  reason: collision with root package name */
    private float f10973m;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.b():void");
    }

    private void c() {
        this.f10962b.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PangleAdInterstitialActivity.this.finish();
                if (PangleAdInterstitialActivity.f10959n != null) {
                    PangleAdInterstitialActivity.f10959n.onInterstitialDismissed();
                }
            }
        });
    }

    private void d() {
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) findViewById(t.e(this, "tt_pangle_ad_score"));
        this.f10967g = tTRatingBar2;
        if (tTRatingBar2 != null) {
            v.a((TextView) null, tTRatingBar2, f10960o.getAppScore(), this);
        }
        this.f10961a = (ImageView) findViewById(t.e(this, "tt_pangle_ad_main_img"));
        this.f10962b = (RelativeLayout) findViewById(t.e(this, "tt_pangle_ad_close_layout"));
        this.f10963c = (NiceImageView) findViewById(t.e(this, "tt_pangle_ad_icon"));
        this.f10964d = (TextView) findViewById(t.e(this, "tt_pangle_ad_title"));
        this.f10965e = (TextView) findViewById(t.e(this, "tt_pangle_ad_content"));
        this.f10966f = (Button) findViewById(t.e(this, "tt_pangle_ad_btn"));
        this.f10969i = (ViewGroup) findViewById(t.e(this, "tt_pangle_ad_content_layout"));
        this.f10970j = (RelativeLayout) findViewById(t.e(this, "tt_pangle_ad_image_layout"));
        this.f10971k = (ViewGroup) findViewById(t.e(this, "tt_pangle_ad_root"));
    }

    public static void showAd(Context context, TTNativeAd tTNativeAd, int i10, CustomEventInterstitialListener customEventInterstitialListener) {
        f10960o = tTNativeAd;
        f10959n = customEventInterstitialListener;
        Intent intent = new Intent(context, PangleAdInterstitialActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(INTENT_TYPE, i10);
        b.a(context, intent, new b.a() { // from class: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.1
            @Override // com.bytedance.sdk.component.utils.b.a
            public void a() {
            }

            @Override // com.bytedance.sdk.component.utils.b.a
            public void a(Throwable th) {
                if (PangleAdInterstitialActivity.f10959n != null) {
                    PangleAdInterstitialActivity.f10959n.onInterstitialShowFail();
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10968h = getIntent();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        f10960o = null;
        f10959n = null;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f10972l = v.c((Context) this);
        this.f10973m = v.d((Context) this);
        if (this.f10968h.getIntExtra(INTENT_TYPE, 0) == 2) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f10968h != null) {
            b();
        }
    }

    private void a(int i10) {
        ViewGroup.LayoutParams layoutParams = this.f10970j.getLayoutParams();
        layoutParams.height = i10;
        this.f10970j.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f10969i.getLayoutParams();
        layoutParams2.height = (int) (this.f10973m - i10);
        this.f10969i.setLayoutParams(layoutParams2);
    }

    private void a(TTNativeAd tTNativeAd) {
        TTImage tTImage;
        if (tTNativeAd != null) {
            if (f10960o.getImageList() != null && !f10960o.getImageList().isEmpty() && (tTImage = f10960o.getImageList().get(0)) != null && tTImage.isValid()) {
                d.a().a(tTImage.getImageUrl(), this.f10961a);
            }
            if (f10960o.getIcon() != null && f10960o.getIcon().isValid() && f10960o.getIcon().getImageUrl() != null) {
                d.a().a(f10960o.getIcon().getImageUrl(), this.f10963c);
            }
            this.f10964d.setText(f10960o.getTitle());
            this.f10965e.setText(f10960o.getDescription());
            this.f10966f.setText(f10960o.getButtonText());
            c();
            b(tTNativeAd);
        }
    }

    private void b(TTNativeAd tTNativeAd) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f10961a);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f10966f);
        tTNativeAd.registerViewForInteraction(this.f10971k, arrayList, arrayList2, this.f10962b, new TTNativeAd.AdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.2
            @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
            public void onAdClicked(View view, TTNativeAd tTNativeAd2) {
                l.b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.f10959n != null) {
                    PangleAdInterstitialActivity.f10959n.onInterstitialClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
            public void onAdCreativeClick(View view, TTNativeAd tTNativeAd2) {
                l.b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.f10959n != null) {
                    PangleAdInterstitialActivity.f10959n.onInterstitialClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener
            public void onAdShow(TTNativeAd tTNativeAd2) {
                l.b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdShow....");
                if (PangleAdInterstitialActivity.f10959n != null) {
                    PangleAdInterstitialActivity.f10959n.onInterstitialShown();
                }
            }
        });
    }
}
