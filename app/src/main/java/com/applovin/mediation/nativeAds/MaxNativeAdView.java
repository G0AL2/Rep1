package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.R;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.ref.WeakReference;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final View f9016a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f9017b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f9018c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f9019d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageView f9020e;

    /* renamed from: f  reason: collision with root package name */
    private final FrameLayout f9021f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f9022g;

    /* renamed from: h  reason: collision with root package name */
    private final FrameLayout f9023h;

    /* renamed from: i  reason: collision with root package name */
    private final ViewGroup f9024i;

    /* renamed from: j  reason: collision with root package name */
    private final FrameLayout f9025j;

    /* renamed from: k  reason: collision with root package name */
    private final Button f9026k;

    /* renamed from: l  reason: collision with root package name */
    private b f9027l;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f9016a = view;
        } else {
            this.f9016a = LayoutInflater.from(context).inflate(z10 ? a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, (ViewGroup) this, false);
        }
        addView(this.f9016a);
        this.f9017b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f9018c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f9019d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f9020e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f9021f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f9022g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f9023h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f9024i = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f9025j = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.f9026k = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd r3, java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>(r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.R.id.native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.R.id.native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.R.id.options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if ("medium_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    private void a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final WeakReference weakReference = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) weakReference.get();
                    if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
                        m mVar = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                        if (v.a()) {
                            mVar.A().d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                        }
                    } else {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    }
                    weakReference.clear();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        this.f9017b.setText(maxNativeAd.getTitle());
        if (this.f9018c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f9018c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f9018c.setVisibility(8);
            }
        }
        if (this.f9019d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f9019d.setText(maxNativeAd.getBody());
            } else {
                this.f9019d.setVisibility(4);
            }
        }
        if (this.f9026k != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f9026k.setText(maxNativeAd.getCallToAction());
            } else {
                this.f9026k.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f9021f;
        if (frameLayout != null) {
            if (icon == null || this.f9020e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f9021f.removeAllViews();
                    this.f9021f.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f9020e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f9021f.setVisibility(8);
            } else {
                this.f9020e.setImageURI(icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f9023h;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f9023h.addView(optionsView);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f9025j != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9025j.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f9025j.setVisibility(8);
            }
        }
        a();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, Constants.MIN_PROGRESS_TIME);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (this.f9017b != null) {
            if (StringUtils.isValidString(maxNativeAd.getTitle())) {
                this.f9017b.setText(maxNativeAd.getTitle());
            } else {
                this.f9017b.setText((CharSequence) null);
            }
        }
        String body = maxNativeAd.getBody();
        if (this.f9019d != null) {
            if (StringUtils.isValidString(body)) {
                this.f9019d.setText(body);
            } else {
                this.f9019d.setText((CharSequence) null);
            }
        }
        String advertiser = maxNativeAd.getAdvertiser();
        if (this.f9018c != null) {
            if (StringUtils.isValidString(advertiser)) {
                this.f9018c.setText(advertiser);
            } else {
                this.f9018c.setText((CharSequence) null);
            }
        }
        String callToAction = maxNativeAd.getCallToAction();
        if (this.f9026k != null) {
            if (StringUtils.isValidString(callToAction)) {
                this.f9026k.setText(callToAction);
            } else {
                this.f9026k.setText((CharSequence) null);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f9020e;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f9020e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f9020e.setImageURI(icon.getUri());
            } else {
                this.f9020e.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f9024i;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9024i.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f9022g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f9022g.addView(optionsView);
            }
        }
    }

    public b getAdViewTracker() {
        return this.f9027l;
    }

    public TextView getAdvertiserTextView() {
        return this.f9018c;
    }

    public TextView getBodyTextView() {
        return this.f9019d;
    }

    public Button getCallToActionButton() {
        return this.f9026k;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f9021f;
    }

    public ImageView getIconImageView() {
        return this.f9020e;
    }

    public View getMainView() {
        return this.f9016a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f9025j;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f9024i;
        return viewGroup != null ? viewGroup : this.f9025j;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f9023h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f9022g;
        return viewGroup != null ? viewGroup : this.f9023h;
    }

    public TextView getTitleTextView() {
        return this.f9017b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f9027l;
        if (bVar != null) {
            bVar.b();
        }
        if (isHardwareAccelerated() || !v.a()) {
            return;
        }
        v.h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        b bVar = this.f9027l;
        if (bVar != null) {
            bVar.a();
            this.f9027l = null;
        }
        View view = this.f9016a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f9016a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f9016a);
    }

    public void render(d dVar, a.InterfaceC0115a interfaceC0115a, m mVar) {
        recycle();
        if (!dVar.y().get() || !dVar.x().get()) {
            this.f9027l = new b(dVar, interfaceC0115a, mVar);
        }
        MaxNativeAd nativeAd = dVar.getNativeAd();
        if (StringUtils.isValidString(dVar.v())) {
            a(nativeAd);
        } else {
            b(nativeAd);
        }
    }
}
