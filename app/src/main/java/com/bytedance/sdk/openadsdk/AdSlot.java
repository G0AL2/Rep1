package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import o3.b;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_BANNER_NATIVE = 10;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_DRAW_FEED = 9;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;

    /* renamed from: a  reason: collision with root package name */
    private String f10510a;

    /* renamed from: b  reason: collision with root package name */
    private int f10511b;

    /* renamed from: c  reason: collision with root package name */
    private int f10512c;

    /* renamed from: d  reason: collision with root package name */
    private float f10513d;

    /* renamed from: e  reason: collision with root package name */
    private float f10514e;

    /* renamed from: f  reason: collision with root package name */
    private int f10515f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10516g;

    /* renamed from: h  reason: collision with root package name */
    private String f10517h;

    /* renamed from: i  reason: collision with root package name */
    private int f10518i;

    /* renamed from: j  reason: collision with root package name */
    private String f10519j;

    /* renamed from: k  reason: collision with root package name */
    private String f10520k;

    /* renamed from: l  reason: collision with root package name */
    private int f10521l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10522m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10523n;

    /* renamed from: o  reason: collision with root package name */
    private String f10524o;

    /* renamed from: p  reason: collision with root package name */
    private String f10525p;

    /* renamed from: q  reason: collision with root package name */
    private String f10526q;

    /* renamed from: r  reason: collision with root package name */
    private String f10527r;

    /* renamed from: s  reason: collision with root package name */
    private String f10528s;

    /* renamed from: t  reason: collision with root package name */
    private int f10529t;

    /* renamed from: u  reason: collision with root package name */
    private int f10530u;

    /* renamed from: v  reason: collision with root package name */
    private int f10531v;

    /* renamed from: w  reason: collision with root package name */
    private int f10532w;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f10533a;

        /* renamed from: h  reason: collision with root package name */
        private String f10540h;

        /* renamed from: j  reason: collision with root package name */
        private int f10542j;

        /* renamed from: k  reason: collision with root package name */
        private float f10543k;

        /* renamed from: l  reason: collision with root package name */
        private float f10544l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f10545m;

        /* renamed from: n  reason: collision with root package name */
        private String f10546n;

        /* renamed from: o  reason: collision with root package name */
        private String f10547o;

        /* renamed from: p  reason: collision with root package name */
        private String f10548p;

        /* renamed from: q  reason: collision with root package name */
        private String f10549q;

        /* renamed from: r  reason: collision with root package name */
        private String f10550r;

        /* renamed from: b  reason: collision with root package name */
        private int f10534b = 640;

        /* renamed from: c  reason: collision with root package name */
        private int f10535c = 320;

        /* renamed from: d  reason: collision with root package name */
        private boolean f10536d = true;

        /* renamed from: e  reason: collision with root package name */
        private int f10537e = 1;

        /* renamed from: f  reason: collision with root package name */
        private String f10538f = "";

        /* renamed from: g  reason: collision with root package name */
        private int f10539g = 0;

        /* renamed from: i  reason: collision with root package name */
        private String f10541i = "defaultUser";

        /* renamed from: s  reason: collision with root package name */
        private boolean f10551s = true;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.f10510a = this.f10533a;
            adSlot.f10515f = this.f10537e;
            adSlot.f10516g = this.f10536d;
            adSlot.f10511b = this.f10534b;
            adSlot.f10512c = this.f10535c;
            float f10 = this.f10543k;
            if (f10 <= 0.0f) {
                adSlot.f10513d = this.f10534b;
                adSlot.f10514e = this.f10535c;
            } else {
                adSlot.f10513d = f10;
                adSlot.f10514e = this.f10544l;
            }
            adSlot.f10517h = this.f10538f;
            adSlot.f10518i = this.f10539g;
            adSlot.f10519j = this.f10540h;
            adSlot.f10520k = this.f10541i;
            adSlot.f10521l = this.f10542j;
            adSlot.f10522m = this.f10551s;
            adSlot.f10523n = this.f10545m;
            adSlot.f10524o = this.f10546n;
            adSlot.f10525p = this.f10547o;
            adSlot.f10526q = this.f10548p;
            adSlot.f10527r = this.f10549q;
            adSlot.f10528s = this.f10550r;
            return adSlot;
        }

        public Builder isExpressAd(boolean z10) {
            this.f10545m = z10;
            return this;
        }

        public Builder setAdCount(int i10) {
            if (i10 <= 0) {
                i10 = 1;
                l.c(TTAdConstant.TAG, "setAdCount: adCount must greater than 0 ");
            }
            if (i10 > 20) {
                l.c(TTAdConstant.TAG, "setAdCount: adCount must less than or equal to 20 ");
                i10 = 20;
            }
            this.f10537e = i10;
            return this;
        }

        public Builder setAdId(String str) {
            this.f10547o = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.f10533a = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.f10548p = str;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f10, float f11) {
            this.f10543k = f10;
            this.f10544l = f11;
            return this;
        }

        public Builder setExt(String str) {
            this.f10549q = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i10, int i11) {
            this.f10534b = i10;
            this.f10535c = i11;
            return this;
        }

        public Builder setIsAutoPlay(boolean z10) {
            this.f10551s = z10;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.f10540h = str;
            return this;
        }

        public Builder setNativeAdType(int i10) {
            this.f10542j = i10;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i10) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z10) {
            return this;
        }

        public Builder setUserData(String str) {
            this.f10550r = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.f10541i = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            l.c("bidding", "AdSlot -> bidAdm=" + b.a(str));
            this.f10546n = str;
            return this;
        }
    }

    private AdSlot() {
        this.f10522m = true;
        this.f10523n = false;
        this.f10529t = 0;
        this.f10530u = 0;
        this.f10531v = 0;
    }

    public static int getPosition(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return (i10 == 3 || i10 == 4 || i10 == 7 || i10 == 8) ? 5 : 3;
            }
            return 4;
        }
        return 2;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int optInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int optInt2 = jSONObject.optInt("mImgAcceptedHeight", 320);
            double optDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double optDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(optInt, optInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(optDouble).floatValue(), Double.valueOf(optDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
        } catch (Exception unused) {
        }
        return builder.build();
    }

    public int getAdCount() {
        return this.f10515f;
    }

    public String getAdId() {
        return this.f10525p;
    }

    public String getBidAdm() {
        return this.f10524o;
    }

    public String getCodeId() {
        return this.f10510a;
    }

    public String getCreativeId() {
        return this.f10526q;
    }

    public int getDurationSlotType() {
        return this.f10532w;
    }

    public float getExpressViewAcceptedHeight() {
        return this.f10514e;
    }

    public float getExpressViewAcceptedWidth() {
        return this.f10513d;
    }

    public String getExt() {
        return this.f10527r;
    }

    public int getImgAcceptedHeight() {
        return this.f10512c;
    }

    public int getImgAcceptedWidth() {
        return this.f10511b;
    }

    public int getIsRotateBanner() {
        return this.f10529t;
    }

    public String getMediaExtra() {
        return this.f10519j;
    }

    public int getNativeAdType() {
        return this.f10521l;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.f10518i;
    }

    @Deprecated
    public String getRewardName() {
        return this.f10517h;
    }

    public int getRotateOrder() {
        return this.f10531v;
    }

    public int getRotateTime() {
        return this.f10530u;
    }

    public String getUserData() {
        return this.f10528s;
    }

    public String getUserID() {
        return this.f10520k;
    }

    public boolean isAutoPlay() {
        return this.f10522m;
    }

    public boolean isExpressAd() {
        return this.f10523n;
    }

    public boolean isSupportDeepLink() {
        return this.f10516g;
    }

    public void setAdCount(int i10) {
        this.f10515f = i10;
    }

    public void setDurationSlotType(int i10) {
        this.f10532w = i10;
    }

    public void setIsRotateBanner(int i10) {
        this.f10529t = i10;
    }

    public void setNativeAdType(int i10) {
        this.f10521l = i10;
    }

    public void setRotateOrder(int i10) {
        this.f10531v = i10;
    }

    public void setRotateTime(int i10) {
        this.f10530u = i10;
    }

    public void setUserData(String str) {
        this.f10528s = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.f10510a);
            jSONObject.put("mAdCount", this.f10515f);
            jSONObject.put("mIsAutoPlay", this.f10522m);
            jSONObject.put("mImgAcceptedWidth", this.f10511b);
            jSONObject.put("mImgAcceptedHeight", this.f10512c);
            jSONObject.put("mExpressViewAcceptedWidth", this.f10513d);
            jSONObject.put("mExpressViewAcceptedHeight", this.f10514e);
            jSONObject.put("mSupportDeepLink", this.f10516g);
            jSONObject.put("mRewardName", this.f10517h);
            jSONObject.put("mRewardAmount", this.f10518i);
            jSONObject.put("mMediaExtra", this.f10519j);
            jSONObject.put("mUserID", this.f10520k);
            jSONObject.put("mNativeAdType", this.f10521l);
            jSONObject.put("mIsExpressAd", this.f10523n);
            jSONObject.put("mAdId", this.f10525p);
            jSONObject.put("mCreativeId", this.f10526q);
            jSONObject.put("mExt", this.f10527r);
            jSONObject.put("mBidAdm", this.f10524o);
            jSONObject.put("mUserData", this.f10528s);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "AdSlot{mCodeId='" + this.f10510a + "', mImgAcceptedWidth=" + this.f10511b + ", mImgAcceptedHeight=" + this.f10512c + ", mExpressViewAcceptedWidth=" + this.f10513d + ", mExpressViewAcceptedHeight=" + this.f10514e + ", mAdCount=" + this.f10515f + ", mSupportDeepLink=" + this.f10516g + ", mRewardName='" + this.f10517h + "', mRewardAmount=" + this.f10518i + ", mMediaExtra='" + this.f10519j + "', mUserID='" + this.f10520k + "', mNativeAdType=" + this.f10521l + ", mIsAutoPlay=" + this.f10522m + ", mAdId" + this.f10525p + ", mCreativeId" + this.f10526q + ", mExt" + this.f10527r + ", mUserData" + this.f10528s + '}';
    }
}
