package fm.castbox.mediation.helper;

import android.util.Log;
import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.o;
import ed.c;
import fm.castbox.mediation.helper.AdResponseOperator;
import fm.castbox.mediation.http.HttpClient;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import fm.castbox.mediation.model.ad.bidding.BaseBid;
import fm.castbox.mediation.model.ad.bidding.facebook.AudienceNetworkBid;
import fm.castbox.mediation.model.ad.waterfall.admob.AdMobWaterfall;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class UBCReportor {
    private static final String TAG = "UBCReportor";
    private AdResponseOperator adResponseOperator;
    private HttpClient client;
    private String requestId;
    private List<Bid> bids = new ArrayList();
    private List<Waterfall> waterfalls = new ArrayList();

    /* loaded from: classes3.dex */
    public static class Metric {
        @c("ad")

        /* renamed from: ad  reason: collision with root package name */
        private HybridAd f30370ad;
        @c("ad_type")
        private UBCAdType adType;
        @c("category")
        private UBCCategory category;
        @c("clearing_price")
        private float clearingPrice;
        @c("original_payload")
        private OriginalAdResponsePayload originalAdResponsePayload;

        /* loaded from: classes3.dex */
        public static class OriginalAdResponsePayload {
            @c("bids")
            private List<Bid> bids;
            @c("id")
            private String requestId;
            @c("waterfall")
            private List<Waterfall> waterfalls;

            public OriginalAdResponsePayload(String str, List<Bid> list, List<Waterfall> list2) {
                this.requestId = str;
                this.bids = list;
                this.waterfalls = list2;
            }
        }

        public void setAd(HybridAd hybridAd) {
            this.f30370ad = hybridAd;
        }

        public void setAdType(UBCAdType uBCAdType) {
            this.adType = uBCAdType;
        }

        public void setCategory(UBCCategory uBCCategory) {
            this.category = uBCCategory;
        }

        public void setClearingPrice(float f10) {
            this.clearingPrice = f10;
        }

        public void setOriginalAdResponsePayload(OriginalAdResponsePayload originalAdResponsePayload) {
            this.originalAdResponsePayload = originalAdResponsePayload;
        }

        /* loaded from: classes3.dex */
        public static class HybridAd {
            private Object variantObj;

            public HybridAd(Bid bid) {
                this.variantObj = bid;
            }

            public static o<HybridAd> createJsonSerializer() {
                return new o<HybridAd>() { // from class: fm.castbox.mediation.helper.UBCReportor.Metric.HybridAd.1
                    @Override // com.google.gson.o
                    public h serialize(HybridAd hybridAd, Type type, n nVar) {
                        AdMobWaterfall convertToAdMobWaterfall;
                        if (!(hybridAd.variantObj instanceof Bid)) {
                            if ((hybridAd.variantObj instanceof Waterfall) && (convertToAdMobWaterfall = ((Waterfall) hybridAd.variantObj).convertToAdMobWaterfall()) != null) {
                                return nVar.b(convertToAdMobWaterfall);
                            }
                        } else {
                            AudienceNetworkBid convertAudienceNetworkBid = ((Bid) hybridAd.variantObj).convertAudienceNetworkBid();
                            if (convertAudienceNetworkBid != null) {
                                return nVar.b(convertAudienceNetworkBid);
                            }
                        }
                        return nVar.b(null);
                    }
                };
            }

            public HybridAd(Waterfall waterfall) {
                this.variantObj = waterfall;
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum UBCAdType {
        UBC_AD_TYPE_WATERFALL { // from class: fm.castbox.mediation.helper.UBCReportor.UBCAdType.1
            @Override // java.lang.Enum
            public String toString() {
                return "UBC_AD_TYPE_WATERFALL";
            }
        },
        UBC_AD_TYPE_BIDDING { // from class: fm.castbox.mediation.helper.UBCReportor.UBCAdType.2
            @Override // java.lang.Enum
            public String toString() {
                return "UBC_AD_TYPE_BIDDING";
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum UBCCategory {
        UBC_AD_NO_FILL { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.1
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_no_fill";
            }
        },
        UBC_AD_LOADED { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.2
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_loaded";
            }
        },
        UBC_AD_AUCTION_LOSS { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.3
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_auction_loss";
            }
        },
        UBC_AD_AUCTION_WIN { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.4
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_auction_win";
            }
        },
        UBC_AD_IMPRESSION { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.5
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_impression";
            }
        },
        UBC_AD_CLICKED { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.6
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_clicked";
            }
        },
        UBC_AD_REQUEST { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.7
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_request";
            }
        },
        UBC_AD_REFRESH { // from class: fm.castbox.mediation.helper.UBCReportor.UBCCategory.8
            @Override // java.lang.Enum
            public String toString() {
                return "ubc_ad_refresh";
            }
        }
    }

    public UBCReportor() {
        this.client = null;
        this.client = HttpClient.getInstance();
    }

    private void clear() {
        Log.i(TAG, "clear ubc reporter internal data");
        List<Bid> list = this.bids;
        if (list != null) {
            list.clear();
        }
        List<Waterfall> list2 = this.waterfalls;
        if (list2 != null) {
            list2.clear();
        }
        HttpClient httpClient = this.client;
        if (httpClient != null) {
            httpClient.cancelAllOngoingRequests();
        }
    }

    private void handleAuctionNotification() {
        String substituteClearingPrice;
        AdResponseOperator.CompoundEntity activeEntity = this.adResponseOperator.getActiveEntity();
        if (activeEntity == null) {
            Log.e(TAG, "impressive ad compound entity is null");
            return;
        }
        List<Bid> list = this.bids;
        if (list != null && !list.isEmpty()) {
            String str = TAG;
            Log.i(str, "start to process auction notification");
            float ecpm = activeEntity.getEcpm();
            if (activeEntity.isWaterfall()) {
                Log.i(str, "waterfall won and bidders lost during auction");
                for (Bid bid : this.bids) {
                    AudienceNetworkBid convertAudienceNetworkBid = bid.convertAudienceNetworkBid();
                    if (convertAudienceNetworkBid != null) {
                        String str2 = new String(convertAudienceNetworkBid.getLossNoticeUrl());
                        if (str2.isEmpty()) {
                            Log.e(TAG, "loss notice url is missing");
                        } else {
                            submit(UBCCategory.UBC_AD_AUCTION_LOSS, new AdResponseOperator.CompoundEntity(bid, null));
                            String substituteClearingPrice2 = substituteClearingPrice(str2, ecpm);
                            String str3 = TAG;
                            Log.i(str3, "lossNotice: " + substituteClearingPrice2);
                            this.client.fulfillWinLossNotification(substituteClearingPrice2);
                        }
                    }
                }
                return;
            } else if (activeEntity.isBid()) {
                Log.i(str, "one of bidders won and waterfalls lost during auction");
                AudienceNetworkBid convertAudienceNetworkBid2 = activeEntity.getBid().convertAudienceNetworkBid();
                for (Bid bid2 : this.bids) {
                    AudienceNetworkBid convertAudienceNetworkBid3 = bid2.convertAudienceNetworkBid();
                    if (convertAudienceNetworkBid3 == null) {
                        Log.e(TAG, "not audience network bid inside bid list");
                    } else {
                        if (convertAudienceNetworkBid2.equals((BaseBid) convertAudienceNetworkBid3)) {
                            substituteClearingPrice = substituteClearingPrice(convertAudienceNetworkBid3.getWinNoticeUrl(), ecpm);
                            submit(UBCCategory.UBC_AD_AUCTION_WIN, new AdResponseOperator.CompoundEntity(bid2, null));
                            String str4 = TAG;
                            Log.i(str4, "winNotice: " + substituteClearingPrice);
                        } else {
                            substituteClearingPrice = substituteClearingPrice(convertAudienceNetworkBid3.getWinNoticeUrl(), ecpm);
                            submit(UBCCategory.UBC_AD_AUCTION_LOSS, new AdResponseOperator.CompoundEntity(bid2, null));
                            String str5 = TAG;
                            Log.i(str5, "lossNotice: " + substituteClearingPrice);
                        }
                        this.client.fulfillWinLossNotification(substituteClearingPrice);
                    }
                }
                return;
            } else {
                Log.e(str, "current impressive ad entity is unknown");
                return;
            }
        }
        Log.i(TAG, "no bids in current ad request payload");
    }

    private boolean submit(UBCCategory uBCCategory, AdResponseOperator.CompoundEntity compoundEntity) {
        String str;
        String str2;
        String tagId;
        AdResponseOperator.CompoundEntity activeEntity = this.adResponseOperator.getActiveEntity();
        float ecpm = activeEntity != null ? activeEntity.getEcpm() : 0.0f;
        Metric.OriginalAdResponsePayload originalAdResponsePayload = new Metric.OriginalAdResponsePayload(this.requestId, this.bids, this.waterfalls);
        Metric metric = new Metric();
        metric.setOriginalAdResponsePayload(originalAdResponsePayload);
        metric.setCategory(uBCCategory);
        String str3 = null;
        if (compoundEntity != null && compoundEntity.isBid()) {
            metric.setClearingPrice(ecpm);
            UBCAdType uBCAdType = UBCAdType.UBC_AD_TYPE_BIDDING;
            metric.setAdType(uBCAdType);
            metric.setAd(new Metric.HybridAd(compoundEntity.getBid()));
            str2 = uBCAdType.toString();
            if (compoundEntity.getBid() != null) {
                str3 = compoundEntity.getBid().networkName();
                tagId = compoundEntity.getBid().getTagId();
                String str4 = str3;
                str3 = tagId;
                str = str4;
                Log.i(TAG, String.format("[%s]   submit ubc for request: '%s', tag_id: '%s', category: '%s', ad_type: '%s', network: '%s'", uBCCategory, originalAdResponsePayload.requestId, str3, uBCCategory, str2, str));
                return this.client.fulfillUBC(metric);
            }
            tagId = null;
            String str42 = str3;
            str3 = tagId;
            str = str42;
            Log.i(TAG, String.format("[%s]   submit ubc for request: '%s', tag_id: '%s', category: '%s', ad_type: '%s', network: '%s'", uBCCategory, originalAdResponsePayload.requestId, str3, uBCCategory, str2, str));
            return this.client.fulfillUBC(metric);
        } else if (compoundEntity != null && compoundEntity.isWaterfall()) {
            metric.setClearingPrice(ecpm);
            UBCAdType uBCAdType2 = UBCAdType.UBC_AD_TYPE_WATERFALL;
            metric.setAdType(uBCAdType2);
            metric.setAd(new Metric.HybridAd(compoundEntity.getWaterfall()));
            str2 = uBCAdType2.toString();
            if (compoundEntity.getWaterfall() != null) {
                str3 = compoundEntity.getWaterfall().networkName();
                tagId = compoundEntity.getWaterfall().getTagId();
                String str422 = str3;
                str3 = tagId;
                str = str422;
                Log.i(TAG, String.format("[%s]   submit ubc for request: '%s', tag_id: '%s', category: '%s', ad_type: '%s', network: '%s'", uBCCategory, originalAdResponsePayload.requestId, str3, uBCCategory, str2, str));
                return this.client.fulfillUBC(metric);
            }
            tagId = null;
            String str4222 = str3;
            str3 = tagId;
            str = str4222;
            Log.i(TAG, String.format("[%s]   submit ubc for request: '%s', tag_id: '%s', category: '%s', ad_type: '%s', network: '%s'", uBCCategory, originalAdResponsePayload.requestId, str3, uBCCategory, str2, str));
            return this.client.fulfillUBC(metric);
        } else if (UBCCategory.UBC_AD_REQUEST != uBCCategory) {
            Log.w(TAG, "no valid entity for ubc collection");
            return false;
        } else {
            str = null;
            str2 = null;
            Log.i(TAG, String.format("[%s]   submit ubc for request: '%s', tag_id: '%s', category: '%s', ad_type: '%s', network: '%s'", uBCCategory, originalAdResponsePayload.requestId, str3, uBCCategory, str2, str));
            return this.client.fulfillUBC(metric);
        }
    }

    private String substituteClearingPrice(String str, float f10) {
        return (str == null || str.isEmpty()) ? str : str.replace("${AUCTION_PRICE}", String.valueOf(f10));
    }

    public boolean meter(UBCCategory uBCCategory) {
        AdResponseOperator adResponseOperator = this.adResponseOperator;
        if (adResponseOperator == null) {
            Log.e(TAG, "ad response operator inside is null");
            return false;
        }
        AdResponseOperator.CompoundEntity compoundEntity = null;
        if (UBCCategory.UBC_AD_REQUEST != uBCCategory && (compoundEntity = adResponseOperator.getActiveEntity()) == null) {
            Log.e(TAG, "cannot retrieve active compound entity");
            return false;
        }
        if (uBCCategory == UBCCategory.UBC_AD_LOADED || uBCCategory == UBCCategory.UBC_AD_REFRESH) {
            handleAuctionNotification();
        }
        return submit(uBCCategory, compoundEntity);
    }

    public void setAdResponseOperator(AdResponseOperator adResponseOperator) {
        this.adResponseOperator = adResponseOperator;
    }

    public void setResponsePayload(String str, List<Bid> list, List<Waterfall> list2) {
        this.requestId = str;
        clear();
        if (list != null) {
            this.bids.addAll(list);
        }
        if (list2 != null) {
            this.waterfalls.addAll(list2);
        }
        String str2 = TAG;
        Object[] objArr = new Object[2];
        List<Bid> list3 = this.bids;
        objArr[0] = Integer.valueOf(list3 == null ? 0 : list3.size());
        List<Waterfall> list4 = this.waterfalls;
        objArr[1] = Integer.valueOf(list4 != null ? list4.size() : 0);
        Log.i(str2, String.format("bids are %d, waterfalls are %d", objArr));
    }
}
