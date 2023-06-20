package fm.castbox.mediation.http;

import android.util.Log;
import com.google.gson.GsonBuilder;
import fm.castbox.mediation.BuildConfig;
import fm.castbox.mediation.error.AdError;
import fm.castbox.mediation.helper.AdResponseOperator;
import fm.castbox.mediation.helper.UBCReportor;
import fm.castbox.mediation.model.AdRequestParams;
import fm.castbox.mediation.model.AdResponseParams;
import fm.castbox.mediation.model.ad.Bid;
import fm.castbox.mediation.model.ad.Waterfall;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import ye.b0;
import ye.c0;
import ye.d0;
import ye.e;
import ye.f;
import ye.x;
import ye.z;

/* loaded from: classes3.dex */
public class HttpClient {
    private static final String GURUX_ROUTER_KEY = "X-Gurux-Pool-Routing-Token";
    private static volatile HttpClient INSTANCE = null;
    private static final String TAG = "HttpClient";
    private z client;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Bucket {
        private String requestId = null;
        private List<Bid> bids = null;
        private List<Waterfall> waterfalls = null;

        public List<Bid> getBids() {
            return this.bids;
        }

        public String getRequestId() {
            return this.requestId;
        }

        public List<Waterfall> getWaterfalls() {
            return this.waterfalls;
        }

        public void setBids(List<Bid> list) {
            this.bids = list;
        }

        public void setRequestId(String str) {
            this.requestId = str;
        }

        public void setWaterfalls(List<Waterfall> list) {
            this.waterfalls = list;
        }
    }

    private HttpClient() {
        this.client = null;
        z.a aVar = new z.a();
        aVar.a(new GzipRequestInterceptor());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.f(5L, timeUnit).X(5L, timeUnit).T(5L, timeUnit).e(10L, timeUnit).d(null);
        this.client = aVar.c();
        Log.i(TAG, "GURUX_AD_REQUEST_ENDPOINT: https://gurux.fungame.studio/api/v1.1/ad/request");
        Log.i(TAG, "GURUX_AD_DISPLAY_ENDPOINT: https://gurux.fungame.studio/api/v1.1/ad/display");
        Log.i(TAG, "GZIP: true");
    }

    public static HttpClient getInstance() {
        if (INSTANCE == null) {
            synchronized (HttpClient.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HttpClient();
                }
            }
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bucket handleAdResponse(d0 d0Var) throws IOException {
        String str;
        List<Waterfall> list = null;
        if (d0Var.a() == null) {
            Log.e(TAG, "cannot get response body");
            return null;
        }
        String w10 = d0Var.a().w();
        d0Var.close();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Ad Response - ");
        if (w10 == null) {
            str = "0 bytes";
        } else {
            str = w10.length() + " bytes";
        }
        sb2.append(str);
        Log.d(TAG, sb2.toString());
        AdResponseParams adResponseParams = (AdResponseParams) new GsonBuilder().serializeNulls().registerTypeAdapter(Bid.class, Bid.createJsonDeserializer()).registerTypeAdapter(Waterfall.class, Waterfall.createJsonDeserializer()).create().fromJson(w10, (Class<Object>) AdResponseParams.class);
        Log.d(TAG, "[-] " + adResponseParams.toString());
        if (adResponseParams.getStatus() == 0 && adResponseParams.getAd() != null && (adResponseParams.getAd().getBids() != null || adResponseParams.getAd().getWaterfall() != null)) {
            String id2 = adResponseParams.getAd().getId();
            List<Bid> bids = (adResponseParams.getAd().getBids() == null || adResponseParams.getAd().getBids().isEmpty()) ? null : adResponseParams.getAd().getBids();
            if (adResponseParams.getAd().getWaterfall() != null && !adResponseParams.getAd().getWaterfall().isEmpty()) {
                list = adResponseParams.getAd().getWaterfall();
            }
            Bucket bucket = new Bucket();
            bucket.setRequestId(id2);
            bucket.setBids(bids);
            bucket.setWaterfalls(list);
            return bucket;
        }
        Log.e(TAG, String.format("invalid ad response received from gurux, status = %d", Integer.valueOf(adResponseParams.getStatus())));
        Log.d(TAG, String.format("content received : %s", adResponseParams));
        return null;
    }

    public void cancelAllOngoingRequests() {
        this.client.p().a();
    }

    public void fulfillAdDisplay(AdResponseOperator.AdDisplayRequestPayload adDisplayRequestPayload, final DisplayNotificationListener displayNotificationListener) {
        b0 b10 = new b0.a().k(TAG).a(GURUX_ROUTER_KEY, UUID.randomUUID().toString()).l(BuildConfig.GURUX_AD_DISPLAY_ENDPOINT).h(c0.create(new GsonBuilder().serializeNulls().create().toJson(adDisplayRequestPayload), x.f("application/json; charset=utf-8"))).b();
        Log.i(TAG, "HttpClient: send out ad display report http request");
        this.client.a(b10).i1(new f() { // from class: fm.castbox.mediation.http.HttpClient.2
            @Override // ye.f
            public void onFailure(e eVar, IOException iOException) {
                Log.e(HttpClient.TAG, String.format("HttpClient: ad display request failure - %s", iOException.getMessage()));
                if (eVar.isCanceled()) {
                    Log.i(HttpClient.TAG, "HttpClient: ad display http request is canceled, no need to inform about it");
                    return;
                }
                DisplayNotificationListener displayNotificationListener2 = displayNotificationListener;
                if (displayNotificationListener2 != null) {
                    displayNotificationListener2.onFailure(new AdError(32, String.format("failed to send out display notification due to %s", iOException.getMessage()), "ad.network"));
                }
            }

            @Override // ye.f
            public void onResponse(e eVar, d0 d0Var) throws IOException {
                Log.i(HttpClient.TAG, "HttpClient: display notification sent out successfully");
                DisplayNotificationListener displayNotificationListener2 = displayNotificationListener;
                if (displayNotificationListener2 != null) {
                    displayNotificationListener2.onSuccess();
                }
            }
        });
    }

    public void fulfillAdRequest(AdRequestParams adRequestParams, final AdRequestListener adRequestListener) {
        b0 b10 = new b0.a().k(TAG).a(GURUX_ROUTER_KEY, UUID.randomUUID().toString()).l(BuildConfig.GURUX_AD_REQUEST_ENDPOINT).h(c0.create(new GsonBuilder().serializeNulls().create().toJson(adRequestParams), x.f("application/json; charset=utf-8"))).b();
        Log.i(TAG, "HttpClient: start to load ad metadata");
        this.client.a(b10).i1(new f() { // from class: fm.castbox.mediation.http.HttpClient.1
            @Override // ye.f
            public void onFailure(e eVar, IOException iOException) {
                Log.e(HttpClient.TAG, String.format("HttpClient: ad request failure - %s", iOException.getMessage()));
                if (eVar.isCanceled()) {
                    Log.i(HttpClient.TAG, "HttpClient: ad request http request is canceled, no need to inform about it.");
                    return;
                }
                AdRequestListener adRequestListener2 = adRequestListener;
                if (adRequestListener2 != null) {
                    adRequestListener2.onFailure(new AdError(16, String.format("failed to fetch ad due to %s", iOException.getMessage()), "ad.network"));
                }
            }

            @Override // ye.f
            public void onResponse(e eVar, d0 d0Var) throws IOException {
                try {
                    Bucket handleAdResponse = HttpClient.this.handleAdResponse(d0Var);
                    if (handleAdResponse == null) {
                        Log.i(HttpClient.TAG, "HttpClient: failed to fetch ad content with empty bucket");
                        AdRequestListener adRequestListener2 = adRequestListener;
                        if (adRequestListener2 != null) {
                            adRequestListener2.onFailure(new AdError(16, "no bucket composed by ad response payload", "ad.network"));
                            return;
                        }
                        return;
                    }
                    Log.i(HttpClient.TAG, "HttpClient: ad metadata is received successfully");
                    if (handleAdResponse.getBids() == null && handleAdResponse.getWaterfalls() == null) {
                        AdRequestListener adRequestListener3 = adRequestListener;
                        if (adRequestListener3 != null) {
                            adRequestListener3.onFailure(new AdError(18, "no payload in ad request body", "ad.network"));
                            return;
                        }
                        return;
                    }
                    AdRequestListener adRequestListener4 = adRequestListener;
                    if (adRequestListener4 != null) {
                        adRequestListener4.onResponse(handleAdResponse.getRequestId(), handleAdResponse.getBids(), handleAdResponse.getWaterfalls());
                    }
                } catch (Exception e10) {
                    Log.e(HttpClient.TAG, "HttpClient: exception occurs during processing ad response");
                    AdRequestListener adRequestListener5 = adRequestListener;
                    if (adRequestListener5 != null) {
                        adRequestListener5.onFailure(new AdError(16, String.format("network error occurs with error of '%s'", e10), "ad.network"));
                    }
                }
            }
        });
    }

    public void fulfillDisplayNotification(final String str) {
        if (str != null && !"".equals(str)) {
            b0 b10 = new b0.a().k(TAG).a(GURUX_ROUTER_KEY, UUID.randomUUID().toString()).l(str).d().b();
            Log.i(TAG, "send out display notification http request");
            this.client.a(b10).i1(new f() { // from class: fm.castbox.mediation.http.HttpClient.3
                @Override // ye.f
                public void onFailure(e eVar, IOException iOException) {
                    if (eVar.isCanceled()) {
                        Log.i(HttpClient.TAG, "ad display notification http request is canceled, no need to inform about it");
                    } else {
                        Log.e(HttpClient.TAG, String.format("display notification failure %s - %s", str, iOException));
                    }
                }

                @Override // ye.f
                public void onResponse(e eVar, d0 d0Var) throws IOException {
                    Log.d(HttpClient.TAG, "display notification success - " + str);
                }
            });
            return;
        }
        Log.e(TAG, "empty display notification url");
    }

    public boolean fulfillUBC(UBCReportor.Metric metric) {
        if (metric == null) {
            Log.i(TAG, "cannot submit metric because it is null");
            return false;
        }
        b0 b10 = new b0.a().k(TAG).a(GURUX_ROUTER_KEY, UUID.randomUUID().toString()).l(BuildConfig.GURUX_UBC_ENDPOINT).h(c0.create(new GsonBuilder().serializeNulls().setPrettyPrinting().registerTypeAdapter(Bid.class, Bid.createJsonSerializer()).registerTypeAdapter(Waterfall.class, Waterfall.createJsonSerializer()).registerTypeAdapter(UBCReportor.Metric.HybridAd.class, UBCReportor.Metric.HybridAd.createJsonSerializer()).create().toJson(metric), x.f("application/json; charset=utf-8"))).b();
        Log.i(TAG, "send out ubc http request");
        this.client.a(b10).i1(new f() { // from class: fm.castbox.mediation.http.HttpClient.5
            @Override // ye.f
            public void onFailure(e eVar, IOException iOException) {
                if (eVar.isCanceled()) {
                    Log.i(HttpClient.TAG, "ubc http request is canceled, no need to inform about it");
                    return;
                }
                Log.e(HttpClient.TAG, "ubc http request failure due to " + iOException);
            }

            @Override // ye.f
            public void onResponse(e eVar, d0 d0Var) throws IOException {
                Log.d(HttpClient.TAG, "ubc submission succeeded");
            }
        });
        return true;
    }

    public void fulfillWinLossNotification(String str) {
        if (str == null) {
            return;
        }
        b0 b10 = new b0.a().k(TAG).a(GURUX_ROUTER_KEY, UUID.randomUUID().toString()).l(str).d().b();
        Log.i(TAG, "HttpClient: send out ad win-loss notification http request");
        this.client.a(b10).i1(new f() { // from class: fm.castbox.mediation.http.HttpClient.4
            @Override // ye.f
            public void onFailure(e eVar, IOException iOException) {
                Log.e(HttpClient.TAG, String.format("HttpClient: win-loss notification request failure - %s", iOException.getMessage()));
                if (eVar.isCanceled()) {
                    Log.i(HttpClient.TAG, "HttpClient: win-loss http request is canceled, no need to inform about it");
                }
            }

            @Override // ye.f
            public void onResponse(e eVar, d0 d0Var) throws IOException {
                Log.i(HttpClient.TAG, "HttpClient: win-loss notification sent out successfully");
            }
        });
    }
}
