package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f7468a;

    /* renamed from: b  reason: collision with root package name */
    private DTBAdSize f7469b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public b(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f7468a = str;
        this.f7469b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    private DTBAdSize a(int i10, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i10) {
                return new DTBAdSize.DTBVideo(320, 480, str);
            }
            if (a.DISPLAY.ordinal() == i10) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i10) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    public DTBAdSize a() {
        return this.f7469b;
    }
}
