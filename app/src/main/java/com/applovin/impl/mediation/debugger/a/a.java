package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class a implements DTBAdCallback {

    /* renamed from: a  reason: collision with root package name */
    private final MaxAdFormat f7465a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0118a f7466b;

    /* renamed from: c  reason: collision with root package name */
    private DTBAdRequest f7467c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0118a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public a(b bVar, MaxAdFormat maxAdFormat, InterfaceC0118a interfaceC0118a) {
        this(Arrays.asList(bVar), maxAdFormat, interfaceC0118a);
    }

    public a(List<b> list, MaxAdFormat maxAdFormat, InterfaceC0118a interfaceC0118a) {
        this.f7465a = maxAdFormat;
        this.f7466b = interfaceC0118a;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                dTBAdSizeArr[i10] = list.get(i10).a();
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f7467c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        this.f7467c.loadAd(this);
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public void onFailure(AdError adError) {
        this.f7466b.onAdLoadFailed(adError, this.f7465a);
    }

    @Override // com.amazon.device.ads.DTBAdCallback
    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f7466b.onAdResponseLoaded(dTBAdResponse, this.f7465a);
    }
}
