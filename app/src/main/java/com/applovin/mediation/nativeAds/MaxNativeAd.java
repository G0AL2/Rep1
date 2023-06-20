package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes.dex */
public class MaxNativeAd {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final String title;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private MaxAdFormat f9002a;

        /* renamed from: b  reason: collision with root package name */
        private String f9003b;

        /* renamed from: c  reason: collision with root package name */
        private String f9004c;

        /* renamed from: d  reason: collision with root package name */
        private String f9005d;

        /* renamed from: e  reason: collision with root package name */
        private String f9006e;

        /* renamed from: f  reason: collision with root package name */
        private MaxNativeAdImage f9007f;

        /* renamed from: g  reason: collision with root package name */
        private View f9008g;

        /* renamed from: h  reason: collision with root package name */
        private View f9009h;

        /* renamed from: i  reason: collision with root package name */
        private View f9010i;

        /* renamed from: j  reason: collision with root package name */
        private MaxNativeAdImage f9011j;

        /* renamed from: k  reason: collision with root package name */
        private float f9012k;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f9002a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f9004c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f9005d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f9006e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f9007f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f9008g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f9011j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f9012k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f9010i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f9009h = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.f9003b = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class MaxNativeAdImage {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f9013a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f9014b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f9013a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f9014b = uri;
        }

        public Drawable getDrawable() {
            return this.f9013a;
        }

        public Uri getUri() {
            return this.f9014b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f9002a;
        this.title = builder.f9003b;
        this.advertiser = builder.f9004c;
        this.body = builder.f9005d;
        this.callToAction = builder.f9006e;
        this.icon = builder.f9007f;
        this.iconView = builder.f9008g;
        this.optionsView = builder.f9009h;
        this.mediaView = builder.f9010i;
        this.mainImage = builder.f9011j;
        this.mediaContentAspectRatio = builder.f9012k;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }
}
