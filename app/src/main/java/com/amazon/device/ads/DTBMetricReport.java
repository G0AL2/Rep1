package com.amazon.device.ads;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DTBMetricReport {
    private static final String ADAPTER_VERSION = "adapter_version";
    private static final String ADSERVER = "mediation";
    private static final String APP_NAME = "app_id";
    private static final String CONNECTION = "connection";
    private static final String LATENCY = "latency";
    private static final String LOG_TAG = "DTBMetricReport";
    private static final String PROJECT = "project";
    private static final String PROJECT_NAME = "aps_mobile";
    private static final String SDK = "sdk";
    private static final String TIME = "time";
    private static final String TYPE = "type";
    private BidWrapper bidWrapper;
    private int latency;
    private JSONObject propertiesMap;
    private String type;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class BidWrapper {
        String bidId;
        String hostname;

        /* JADX INFO: Access modifiers changed from: package-private */
        public BidWrapper(String str, String str2) {
            this.bidId = str;
            this.hostname = str2;
        }
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper, int i10) {
        this.latency = -1;
        this.bidWrapper = bidWrapper;
        this.latency = i10;
        setStandardProperties(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BidWrapper addBid(String str, String str2) {
        return new BidWrapper(str, str2);
    }

    private void addExtraProperties(Map<String, Object> map) {
        try {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj instanceof String) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Integer) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Long) {
                    this.propertiesMap.put(str, obj);
                } else if (obj instanceof Boolean) {
                    this.propertiesMap.put(str, obj);
                }
            }
        } catch (JSONException e10) {
            String str2 = LOG_TAG;
            DtbLog.error(str2, "Invalid JSON conversion:" + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithBidIdAndType(BidWrapper bidWrapper, String str) {
        return new DTBMetricReport(str, bidWrapper);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithBidTypeLatency(BidWrapper bidWrapper, String str, int i10) {
        return new DTBMetricReport(str, bidWrapper, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map) {
        return new DTBMetricReport(str, map);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0050
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void setStandardProperties(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "getVersion"
            r5.type = r6
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r5.propertiesMap = r1
            java.lang.String r2 = "type"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> Lb7
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "9.3.0"
            r6.put(r1, r2)     // Catch: org.json.JSONException -> Lb7
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r1 = "app_id"
            java.lang.String r2 = com.amazon.device.ads.AdRegistration.getAppKey()     // Catch: org.json.JSONException -> Lb7
            r6.put(r1, r2)     // Catch: org.json.JSONException -> Lb7
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r1 = "project"
            java.lang.String r2 = "aps_mobile"
            r6.put(r1, r2)     // Catch: org.json.JSONException -> Lb7
            int r6 = r5.latency     // Catch: org.json.JSONException -> Lb7
            if (r6 <= 0) goto L38
            org.json.JSONObject r1 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r2 = "latency"
            r1.put(r2, r6)     // Catch: org.json.JSONException -> Lb7
        L38:
            r6 = 0
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: org.json.JSONException -> Lb7
            r1 = 0
            java.lang.Class<k2.a> r2 = k2.a.class
            java.lang.String r3 = "admob"
            java.lang.reflect.Method r2 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L51
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Exception -> L51
            boolean r4 = r2 instanceof java.lang.String     // Catch: java.lang.Exception -> L51
            if (r4 == 0) goto L6a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L51
            r1 = r2
            goto L6a
        L50:
            r3 = r1
        L51:
            java.lang.String r2 = "com.amazon.mopub_adapter.APSMopubAdapter"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L69
            java.lang.String r3 = "mopub"
            java.lang.reflect.Method r6 = r2.getMethod(r0, r6)     // Catch: java.lang.Exception -> L69
            java.lang.Object r6 = r6.invoke(r1, r1)     // Catch: java.lang.Exception -> L69
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L6a
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L69
            r1 = r6
            goto L6a
        L69:
        L6a:
            if (r3 == 0) goto L73
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = "mediation"
            r6.put(r0, r3)     // Catch: org.json.JSONException -> Lb7
        L73:
            com.amazon.device.ads.DtbDeviceData r6 = com.amazon.device.ads.DtbDeviceData.getDeviceDataInstance()     // Catch: org.json.JSONException -> Lb7
            java.lang.String r6 = r6.getConnectionType()     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = "Wifi"
            boolean r0 = r6.equals(r0)     // Catch: org.json.JSONException -> Lb7
            if (r0 == 0) goto L86
            java.lang.String r6 = "wifi"
            goto L93
        L86:
            java.lang.String r0 = "0"
            boolean r6 = r6.equals(r0)     // Catch: org.json.JSONException -> Lb7
            if (r6 == 0) goto L91
            java.lang.String r6 = "unknown"
            goto L93
        L91:
            java.lang.String r6 = "cellular"
        L93:
            org.json.JSONObject r0 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r2 = "connection"
            r0.put(r2, r6)     // Catch: org.json.JSONException -> Lb7
            if (r1 == 0) goto La3
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = "adapter_version"
            r6.put(r0, r1)     // Catch: org.json.JSONException -> Lb7
        La3:
            org.json.JSONObject r6 = r5.propertiesMap     // Catch: org.json.JSONException -> Lb7
            java.lang.String r0 = "time"
            java.util.Date r1 = new java.util.Date     // Catch: org.json.JSONException -> Lb7
            r1.<init>()     // Catch: org.json.JSONException -> Lb7
            long r1 = r1.getTime()     // Catch: org.json.JSONException -> Lb7
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r6.put(r0, r1)     // Catch: org.json.JSONException -> Lb7
            goto Ld2
        Lb7:
            r6 = move-exception
            java.lang.String r0 = com.amazon.device.ads.DTBMetricReport.LOG_TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JSON conversion error:"
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.amazon.device.ads.DtbLog.warn(r0, r6)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBMetricReport.setStandardProperties(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getBidId() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.bidId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getHostname() {
        BidWrapper bidWrapper = this.bidWrapper;
        if (bidWrapper == null) {
            return null;
        }
        return bidWrapper.hostname;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toEncodedString() throws UnsupportedEncodingException {
        return URLEncoder.encode(this.propertiesMap.toString(), "UTF-8");
    }

    public String toString() {
        return this.propertiesMap.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBMetricReport reportWithTypeAndExtraProperties(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        return new DTBMetricReport(str, map, bidWrapper);
    }

    private DTBMetricReport(String str, BidWrapper bidWrapper) {
        this.latency = -1;
        this.bidWrapper = bidWrapper;
        setStandardProperties(str);
    }

    private DTBMetricReport(String str, Map<String, Object> map) {
        this.latency = -1;
        setStandardProperties(str);
        addExtraProperties(map);
    }

    private DTBMetricReport(String str, Map<String, Object> map, BidWrapper bidWrapper) {
        this(str, map);
        this.bidWrapper = bidWrapper;
    }
}
