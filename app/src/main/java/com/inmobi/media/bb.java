package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdSet.java */
@ik
/* loaded from: classes3.dex */
public final class bb {
    static final String BUYER_PRICE = "buyerPrice";
    public static final String CTX_HASH_KEY = "ctxHash";
    private static final long INVALID_AD_EXPIRY = -1;
    private static final String KEY_ADS = "ads";
    private static final String KEY_AD_SET_EXPIRY = "expiry";
    private static final String KEY_IMPRESSION_ID = "impressionId";
    private static final String KEY_MACROS = "macros";
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String MACRO_ADV_PRICE = "${advPrice}";
    public static final String MACRO_CTX_HASH = "${ctxhash}";
    private static final String TAG = "bb";
    private String mAdType;
    private boolean mCanLoadBeforeShow;
    private JSONObject mMacros;
    private long mPlacementId;
    private String adSetId = "";
    private String requestId = "";
    private boolean isAuctionClosed = true;
    private boolean isPod = false;
    private LinkedList<au> ads = new LinkedList<>();
    private String adSetAuctionMeta = null;

    public static ij<bb> a() {
        return new ij().a(new io(KEY_ADS, bb.class), (in) new il(new Constructor<List<au>>() { // from class: com.inmobi.media.bb.1
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ List<au> construct() {
                return new LinkedList();
            }
        }, au.class));
    }

    public final LinkedList<au> b() {
        return this.ads;
    }

    public final boolean c() {
        return this.isAuctionClosed;
    }

    public final boolean d() {
        return this.isPod;
    }

    public final String e() {
        return this.adSetId;
    }

    public final String f() {
        return this.mAdType;
    }

    public final String g() {
        return this.adSetAuctionMeta;
    }

    public final String h() {
        return this.requestId;
    }

    public final long i() {
        return this.mPlacementId;
    }

    public final boolean j() {
        return this.mCanLoadBeforeShow;
    }

    public final au k() {
        try {
            if (!this.ads.isEmpty()) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        return l();
    }

    public final au l() {
        try {
            if (this.ads.isEmpty()) {
                return null;
            }
            return this.ads.getFirst();
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject m() {
        return this.mMacros;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        com.inmobi.media.ay.a(r5, r1.getJSONObject(r10), r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.inmobi.media.bb a(org.json.JSONObject r8, long r9, java.lang.String r11, java.lang.String r12) {
        /*
            r0 = 0
            java.lang.String r1 = "expiry"
            r2 = -1
            long r4 = r8.optLong(r1, r2)     // Catch: org.json.JSONException -> La8
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L10
            goto L16
        L10:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: org.json.JSONException -> La8
            long r2 = r1.toMillis(r4)     // Catch: org.json.JSONException -> La8
        L16:
            java.lang.String r1 = "ads"
            org.json.JSONArray r1 = r8.getJSONArray(r1)     // Catch: org.json.JSONException -> La8
            int r4 = r1.length()     // Catch: org.json.JSONException -> La8
            if (r4 != 0) goto L23
            return r0
        L23:
            com.inmobi.media.ij r4 = a()     // Catch: org.json.JSONException -> La8
            java.lang.Class<com.inmobi.media.bb> r5 = com.inmobi.media.bb.class
            java.lang.Object r8 = r4.a(r8, r5)     // Catch: org.json.JSONException -> La8
            com.inmobi.media.bb r8 = (com.inmobi.media.bb) r8     // Catch: org.json.JSONException -> La8
            if (r8 == 0) goto La8
            java.lang.String r4 = r8.adSetId     // Catch: org.json.JSONException -> La8
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> La8
            if (r4 != 0) goto La8
            r8.mPlacementId = r9     // Catch: org.json.JSONException -> La8
            r8.requestId = r12     // Catch: org.json.JSONException -> La8
            r8.mAdType = r11     // Catch: org.json.JSONException -> La8
            r9 = 0
            r10 = 0
        L41:
            int r12 = r1.length()     // Catch: org.json.JSONException -> La8
            if (r10 >= r12) goto L8e
            org.json.JSONObject r12 = r1.getJSONObject(r10)     // Catch: org.json.JSONException -> La8
            java.util.LinkedList<com.inmobi.media.au> r4 = r8.ads     // Catch: org.json.JSONException -> La8
            java.util.Iterator r4 = r4.iterator()     // Catch: org.json.JSONException -> La8
        L51:
            boolean r5 = r4.hasNext()     // Catch: org.json.JSONException -> La8
            if (r5 == 0) goto L83
            java.lang.Object r5 = r4.next()     // Catch: org.json.JSONException -> La8
            com.inmobi.media.au r5 = (com.inmobi.media.au) r5     // Catch: org.json.JSONException -> La8
            java.lang.String r6 = "impressionId"
            java.lang.String r6 = r12.optString(r6)     // Catch: org.json.JSONException -> La8
            java.lang.String r7 = r5.f()     // Catch: org.json.JSONException -> La8
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> La8
            if (r6 == 0) goto L51
            org.json.JSONObject r12 = r1.getJSONObject(r10)     // Catch: java.lang.Exception -> L75
            com.inmobi.media.ay.a(r5, r12, r11, r2)     // Catch: java.lang.Exception -> L75
            goto L83
        L75:
            r12 = move-exception
            com.inmobi.media.gg r4 = com.inmobi.media.gg.a()     // Catch: org.json.JSONException -> La8
            com.inmobi.media.hg r6 = new com.inmobi.media.hg     // Catch: org.json.JSONException -> La8
            r6.<init>(r12)     // Catch: org.json.JSONException -> La8
            r4.a(r6)     // Catch: org.json.JSONException -> La8
            goto L84
        L83:
            r5 = r0
        L84:
            if (r5 == 0) goto L8b
            java.util.LinkedList<com.inmobi.media.au> r12 = r8.ads     // Catch: org.json.JSONException -> La8
            r12.remove(r5)     // Catch: org.json.JSONException -> La8
        L8b:
            int r10 = r10 + 1
            goto L41
        L8e:
            java.util.LinkedList<com.inmobi.media.au> r10 = r8.ads     // Catch: org.json.JSONException -> La8
            boolean r10 = r10.isEmpty()     // Catch: org.json.JSONException -> La8
            if (r10 != 0) goto La4
            java.util.LinkedList<com.inmobi.media.au> r11 = r8.ads     // Catch: org.json.JSONException -> La8
            java.lang.Object r9 = r11.get(r9)     // Catch: org.json.JSONException -> La8
            com.inmobi.media.au r9 = (com.inmobi.media.au) r9     // Catch: org.json.JSONException -> La8
            boolean r9 = r9.k()     // Catch: org.json.JSONException -> La8
            r8.mCanLoadBeforeShow = r9     // Catch: org.json.JSONException -> La8
        La4:
            if (r10 == 0) goto La7
            return r0
        La7:
            return r8
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.bb.a(org.json.JSONObject, long, java.lang.String, java.lang.String):com.inmobi.media.bb");
    }

    private au a(String str) {
        Iterator<au> it = this.ads.iterator();
        while (it.hasNext()) {
            au next = it.next();
            if (str.equals(next.f())) {
                return next;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject, fq fqVar) throws JSONException {
        if (!this.isAuctionClosed) {
            String string = jSONObject.getString(KEY_REQUEST_ID);
            JSONArray jSONArray = jSONObject.getJSONArray(KEY_ADS);
            if (this.requestId.equals(string)) {
                int length = jSONArray.length();
                if (length != 0) {
                    LinkedList linkedList = new LinkedList();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        String string2 = jSONObject2.getString(KEY_IMPRESSION_ID);
                        this.mMacros = jSONObject2.optJSONObject(KEY_MACROS);
                        au a10 = a(string2);
                        if (a10 != null) {
                            a10.a(this.mMacros);
                            try {
                                a10 = ay.a(a10, fqVar);
                            } catch (br unused) {
                            }
                            if (a10 != null) {
                                JSONObject jSONObject3 = this.mMacros;
                                if (jSONObject3 != null) {
                                    if (jSONObject3.has(MACRO_ADV_PRICE)) {
                                        String string3 = this.mMacros.getString(MACRO_ADV_PRICE);
                                        try {
                                            JSONObject jSONObject4 = a10.transaction;
                                            if (jSONObject4 != null) {
                                                jSONObject4.put(BUYER_PRICE, Double.parseDouble(string3));
                                                a10.mAdContent.put("transaction", a10.transaction);
                                            }
                                        } catch (Exception e10) {
                                            gg.a().a(new hg(e10));
                                        }
                                    }
                                    if (this.mMacros.has(MACRO_CTX_HASH)) {
                                        String string4 = this.mMacros.getString(MACRO_CTX_HASH);
                                        try {
                                            JSONObject jSONObject5 = a10.transaction;
                                            if (jSONObject5 != null) {
                                                jSONObject5.put(CTX_HASH_KEY, string4);
                                                a10.mAdContent.put("transaction", a10.transaction);
                                            }
                                        } catch (JSONException e11) {
                                            gg.a().a(new hg(e11));
                                        }
                                    }
                                }
                                linkedList.add(a10);
                            }
                        }
                    }
                    this.ads.clear();
                    this.ads.addAll(linkedList);
                    if (!this.ads.isEmpty()) {
                        this.isAuctionClosed = true;
                        return;
                    }
                    throw new IllegalArgumentException("No matching ads to render");
                }
                throw new IllegalArgumentException("UAS response supplied doesn't have any ads");
            }
            throw new IllegalArgumentException("UAS response supplied was of a different requestId");
        }
        throw new IllegalStateException("Auction was already closed. Can't process UAS response");
    }

    public final void a(final fq fqVar, final dr drVar) {
        final au l10 = l();
        if (l10 != null) {
            final dq a10 = dq.a();
            a10.f25156a.execute(new Runnable() { // from class: com.inmobi.media.dq.1
                @Override // java.lang.Runnable
                public final void run() {
                    dq.a(a10, l10, fqVar, drVar);
                }
            });
        }
    }

    public final void a(au auVar) {
        try {
            if (l() != null) {
                this.ads.removeFirst();
            }
        } catch (Exception unused) {
        }
        this.ads.addFirst(auVar);
    }
}
