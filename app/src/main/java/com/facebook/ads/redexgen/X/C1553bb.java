package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1553bb extends AbstractC06352t {
    public static String[] A02 = {"f2MNSWDlL1YMuTPGOAjONPZtO", "cmMTh0pUaJ1RDNo0mFNR3IJYAK2Mf6gB", "4dFqjoT4qnH4w96CQtkjoCAuJyqtgp11", "6XB3g70NG5Gd02gyy8Ab40YcxuzvQEqb", "wwGHlt0jZwPrQfekoFOvLm8zPwbBrmxC", "1Rqxvwj8Vs8GuK5", "NKSqZWGd9qA279w", "7JvmemziLS26U2JKZlqSRSAl5nA0imSt"};
    public List<NativeAd> A00 = new ArrayList();
    public final /* synthetic */ C5N A01;

    public C1553bb(C5N c5n) {
        this.A01 = c5n;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06352t
    public final int A05() {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06352t
    public final int A06(Object obj) {
        int indexOf = this.A00.indexOf(obj);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06352t
    public final Object A08(ViewGroup viewGroup, int i10) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdView.Type type;
        C1400Xy c1400Xy;
        NativeAdViewAttributes nativeAdViewAttributes;
        View render;
        C1400Xy c1400Xy2;
        NativeAdView.Type type2;
        NativeAdViewAttributes nativeAdViewAttributes2;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        adViewProvider = this.A01.A01;
        if (adViewProvider != null) {
            adViewProvider2 = this.A01.A01;
            List<NativeAd> list = this.A00;
            String[] strArr = A02;
            if (strArr[7].charAt(19) == strArr[4].charAt(19)) {
                throw new RuntimeException();
            }
            A02[2] = "d9x9bMDlXKa90r8XaToMTFuUxNqAoP43";
            render = adViewProvider2.createView(list.get(i10), i10);
        } else {
            type = this.A01.A02;
            if (type != null) {
                c1400Xy2 = this.A01.A06;
                type2 = this.A01.A02;
                nativeAdViewAttributes2 = this.A01.A03;
                render = NativeAdView.render(c1400Xy2, this.A00.get(i10), type2, nativeAdViewAttributes2);
            } else {
                c1400Xy = this.A01.A06;
                nativeAdViewAttributes = this.A01.A03;
                render = NativeAdView.render(c1400Xy, this.A00.get(i10), nativeAdViewAttributes);
            }
        }
        viewGroup.addView(render);
        return render;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06352t
    public final void A0B(ViewGroup viewGroup, int i10, Object obj) {
        NativeAdScrollView.AdViewProvider adViewProvider;
        NativeAdScrollView.AdViewProvider adViewProvider2;
        if (i10 < this.A00.size()) {
            adViewProvider = this.A01.A01;
            if (adViewProvider != null) {
                adViewProvider2 = this.A01.A01;
                adViewProvider2.destroyView(this.A00.get(i10), (View) obj);
            } else {
                List<NativeAd> list = this.A00;
                if (A02[0].length() != 25) {
                    throw new RuntimeException();
                }
                A02[0] = "BErMlyrXrYPfhoDWoAGZwiXdk";
                list.get(i10).unregisterView();
            }
        }
        viewGroup.removeView((View) obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC06352t
    public final boolean A0C(View view, Object obj) {
        return view == obj;
    }

    public final void A0D() {
        int i10;
        NativeAdsManager nativeAdsManager;
        NativeAdsManager nativeAdsManager2;
        this.A00.clear();
        i10 = this.A01.A00;
        nativeAdsManager = this.A01.A04;
        int min = Math.min(i10, nativeAdsManager.getUniqueNativeAdCount());
        for (int i11 = 0; i11 < min; i11++) {
            nativeAdsManager2 = this.A01.A04;
            NativeAd nextNativeAd = nativeAdsManager2.nextNativeAd();
            UB.A0L(nextNativeAd.getInternalNativeAd()).A1a(true);
            this.A00.add(nextNativeAd);
        }
        A09();
    }
}
