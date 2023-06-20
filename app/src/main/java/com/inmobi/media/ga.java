package com.inmobi.media;

import com.inmobi.media.gc;
import org.json.JSONObject;

/* compiled from: CrashConfig.java */
@ik
/* loaded from: classes3.dex */
public class ga extends fr {
    private static final boolean DEFAULT_CATCH_ENABLED = false;
    private static final boolean DEFAULT_CRASH_ENABLED = true;
    private static final long DEFAULT_EVENT_TTL_SEC = 259200;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final int DEFAULT_MAX_BATCH_SIZE = 2;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_MIN_BATCH_SIZE = 1;
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    private static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public boolean catchEnabled;
    public boolean crashEnabled;
    public long eventTTL;
    public int maxEventsToPersist;
    public int maxRetryCount;
    public gc networkType;
    public long processingInterval;
    public long txLatency;
    public String url;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ga(String str) {
        super(str);
        this.url = DEFAULT_URL;
        this.processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
        this.maxRetryCount = 3;
        this.maxEventsToPersist = 50;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.txLatency = DEFAULT_INGESTION_LATENCY_SEC;
        this.crashEnabled = true;
        this.catchEnabled = false;
        gc gcVar = new gc();
        this.networkType = gcVar;
        gcVar.wifi = new gc.a();
        gc gcVar2 = this.networkType;
        gc.a aVar = gcVar2.wifi;
        aVar.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        aVar.minBatchSize = 1;
        aVar.maxBatchSize = 2;
        gcVar2.others = new gc.a();
        gc.a aVar2 = this.networkType.others;
        aVar2.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        aVar2.minBatchSize = 1;
        aVar2.maxBatchSize = 2;
    }

    public static ij<ga> a() {
        return new ij<>();
    }

    @Override // com.inmobi.media.fr
    public String b() {
        return "crashReporting";
    }

    @Override // com.inmobi.media.fr
    public JSONObject c() {
        return new ij().a((ij) this);
    }

    @Override // com.inmobi.media.fr
    public boolean d() {
        if (this.url.trim().length() != 0 && (this.url.startsWith("http://") || this.url.startsWith("https://"))) {
            long j10 = this.txLatency;
            if (j10 >= this.processingInterval && j10 <= this.eventTTL && this.networkType.a(this.maxEventsToPersist) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0) {
                return true;
            }
        }
        return false;
    }
}
