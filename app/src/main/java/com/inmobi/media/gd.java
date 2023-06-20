package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: RootConfig.java */
@ik
/* loaded from: classes3.dex */
public class gd extends fr {
    private static final long DEFAULT_EXPIRY = 86400;
    private static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_RETRY_INTERVAL = 60;
    private static final String DEFAULT_URL = "";
    private static final int DEFAULT_WAIT_TIME = 3;
    private static final Object sAcquisitionLock = new Object();
    private List<a> components;
    private b gdpr;
    c latestSdkInfo;
    private int maxRetries;
    private boolean monetizationDisabled;
    private int retryInterval;
    int waitTime;

    /* compiled from: RootConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class a {
        long expiry;
        String fallbackUrl = gd.DEFAULT_FALLBACK_URL;
        String type;
        String url;
    }

    /* compiled from: RootConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class b {
        boolean transmitRequest = true;
    }

    /* compiled from: RootConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class c {
        String version = hp.b();
        String url = hp.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gd(String str) {
        super(str);
        this.maxRetries = 3;
        this.retryInterval = 60;
        this.waitTime = 3;
        this.monetizationDisabled = false;
        this.components = new ArrayList();
        this.latestSdkInfo = new c();
        this.gdpr = new b();
    }

    public static ij<gd> a() {
        return new ij().a(new io("components", gd.class), (in) new il(new Constructor<List<a>>() { // from class: com.inmobi.media.gd.1
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ List<a> construct() {
                return new ArrayList();
            }
        }, a.class));
    }

    @Override // com.inmobi.media.fr
    public String b() {
        return "root";
    }

    public String b(String str) {
        synchronized (sAcquisitionLock) {
            for (int i10 = 0; i10 < this.components.size(); i10++) {
                a aVar = this.components.get(i10);
                if (str.equals(aVar.type)) {
                    return aVar.url;
                }
            }
            return "";
        }
    }

    @Override // com.inmobi.media.fr
    public JSONObject c() {
        return a().a((ij<gd>) this);
    }

    @Override // com.inmobi.media.fr
    public boolean d() {
        if (this.components != null && this.maxRetries >= 0 && this.retryInterval >= 0 && this.waitTime >= 0 && this.latestSdkInfo.version.trim().length() != 0 && (this.latestSdkInfo.url.startsWith("http://") || this.latestSdkInfo.url.startsWith("https://"))) {
            synchronized (sAcquisitionLock) {
                for (int i10 = 0; i10 < this.components.size(); i10++) {
                    a aVar = this.components.get(i10);
                    if (aVar.type != null && Long.valueOf(aVar.expiry) != null) {
                        if (aVar.type.trim().length() == 0) {
                            return false;
                        }
                        long j10 = aVar.expiry;
                        if (j10 >= 0 && j10 <= 864000) {
                            if (c(aVar.url)) {
                                return false;
                            }
                            if ("root".equals(aVar.type) && c(aVar.fallbackUrl)) {
                                return false;
                            }
                        }
                        return false;
                    }
                    return false;
                }
                return this.gdpr != null;
            }
        }
        return false;
    }

    public int e() {
        return this.maxRetries;
    }

    public int h() {
        return this.retryInterval;
    }

    public boolean i() {
        return this.monetizationDisabled;
    }

    public boolean j() {
        b bVar = this.gdpr;
        return bVar == null || bVar.transmitRequest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String k() {
        synchronized (sAcquisitionLock) {
            for (a aVar : this.components) {
                if ("root".equals(aVar.type)) {
                    return aVar.fallbackUrl;
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }

    private static boolean c(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return (str.startsWith("http://") || str.startsWith("https://")) ? false : true;
    }

    public boolean a(gd gdVar) {
        return ((g() == null && gdVar.g() == null) || (g() != null && g().equals(gdVar.g()))) && gdVar.maxRetries == this.maxRetries && gdVar.retryInterval == this.retryInterval && gdVar.waitTime == this.waitTime && gdVar.monetizationDisabled == this.monetizationDisabled;
    }

    public long a(String str) {
        synchronized (sAcquisitionLock) {
            for (int i10 = 0; i10 < this.components.size(); i10++) {
                a aVar = this.components.get(i10);
                if (str.equals(aVar.type)) {
                    return aVar.expiry;
                }
            }
            return DEFAULT_EXPIRY;
        }
    }
}
