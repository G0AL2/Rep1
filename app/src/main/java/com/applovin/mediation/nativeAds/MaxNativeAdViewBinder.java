package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final View f9032a;

        /* renamed from: b  reason: collision with root package name */
        private final int f9033b;

        /* renamed from: c  reason: collision with root package name */
        private int f9034c;

        /* renamed from: d  reason: collision with root package name */
        private int f9035d;

        /* renamed from: e  reason: collision with root package name */
        private int f9036e;

        /* renamed from: f  reason: collision with root package name */
        private int f9037f;

        /* renamed from: g  reason: collision with root package name */
        private int f9038g;

        /* renamed from: h  reason: collision with root package name */
        private int f9039h;

        /* renamed from: i  reason: collision with root package name */
        private int f9040i;

        /* renamed from: j  reason: collision with root package name */
        private int f9041j;

        /* renamed from: k  reason: collision with root package name */
        private int f9042k;

        /* renamed from: l  reason: collision with root package name */
        private int f9043l;

        /* renamed from: m  reason: collision with root package name */
        private String f9044m;

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f9034c = -1;
            this.f9035d = -1;
            this.f9036e = -1;
            this.f9037f = -1;
            this.f9038g = -1;
            this.f9039h = -1;
            this.f9040i = -1;
            this.f9041j = -1;
            this.f9042k = -1;
            this.f9043l = -1;
            this.f9033b = i10;
            this.f9032a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f9032a, this.f9033b, this.f9034c, this.f9035d, this.f9036e, this.f9037f, this.f9038g, this.f9039h, this.f9040i, this.f9041j, this.f9042k, this.f9043l, this.f9044m);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f9035d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f9036e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f9043l = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f9038g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f9037f = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.f9042k = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f9041j = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f9040i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f9039h = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f9044m = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f9034c = i10;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.optionsContentViewGroupId = i16;
        this.optionsContentFrameLayoutId = i17;
        this.mediaContentViewGroupId = i18;
        this.mediaContentFrameLayoutId = i19;
        this.callToActionButtonId = i20;
        this.templateType = str;
    }
}
