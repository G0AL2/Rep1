package com.RNFetchBlob;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNFetchBlobConfig.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f5594a;

    /* renamed from: b  reason: collision with root package name */
    public String f5595b;

    /* renamed from: c  reason: collision with root package name */
    public String f5596c;

    /* renamed from: d  reason: collision with root package name */
    public ReadableMap f5597d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f5598e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f5599f;

    /* renamed from: g  reason: collision with root package name */
    public String f5600g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f5601h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f5602i;

    /* renamed from: j  reason: collision with root package name */
    public long f5603j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f5604k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f5605l;

    /* renamed from: m  reason: collision with root package name */
    public ReadableArray f5606m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ReadableMap readableMap) {
        Boolean bool = Boolean.FALSE;
        this.f5599f = bool;
        Boolean bool2 = Boolean.TRUE;
        this.f5602i = bool2;
        this.f5603j = 60000L;
        this.f5604k = bool;
        this.f5605l = bool2;
        this.f5606m = null;
        if (readableMap == null) {
            return;
        }
        this.f5594a = Boolean.valueOf(readableMap.hasKey("fileCache") ? readableMap.getBoolean("fileCache") : false);
        this.f5595b = readableMap.hasKey("path") ? readableMap.getString("path") : null;
        this.f5596c = readableMap.hasKey("appendExt") ? readableMap.getString("appendExt") : "";
        this.f5598e = Boolean.valueOf(readableMap.hasKey("trusty") ? readableMap.getBoolean("trusty") : false);
        this.f5599f = Boolean.valueOf(readableMap.hasKey("wifiOnly") ? readableMap.getBoolean("wifiOnly") : false);
        if (readableMap.hasKey("addAndroidDownloads")) {
            this.f5597d = readableMap.getMap("addAndroidDownloads");
        }
        if (readableMap.hasKey("binaryContentTypes")) {
            this.f5606m = readableMap.getArray("binaryContentTypes");
        }
        String str = this.f5595b;
        if (str != null && str.toLowerCase().contains("?append=true")) {
            this.f5602i = bool;
        }
        if (readableMap.hasKey("overwrite")) {
            this.f5602i = Boolean.valueOf(readableMap.getBoolean("overwrite"));
        }
        if (readableMap.hasKey("followRedirect")) {
            this.f5605l = Boolean.valueOf(readableMap.getBoolean("followRedirect"));
        }
        this.f5600g = readableMap.hasKey("key") ? readableMap.getString("key") : null;
        if (readableMap.hasKey("contentType")) {
            readableMap.getString("contentType");
        }
        this.f5604k = Boolean.valueOf(readableMap.hasKey("increment") ? readableMap.getBoolean("increment") : false);
        this.f5601h = Boolean.valueOf(readableMap.hasKey("auto") ? readableMap.getBoolean("auto") : false);
        if (readableMap.hasKey("timeout")) {
            this.f5603j = readableMap.getInt("timeout");
        }
    }
}
