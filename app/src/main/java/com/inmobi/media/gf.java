package com.inmobi.media;

import com.inmobi.commons.utils.json.Constructor;
import com.inmobi.media.gc;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: TelemetryConfig.java */
@ik
/* loaded from: classes3.dex */
public class gf extends fr {
    private static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    private static final long DEFAULT_EVENT_TTL_SEC = 604800;
    private static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    private static final boolean DEFAULT_IS_ENABLED = true;
    private static final int DEFAULT_MAX_BATCH_SIZE = 20;
    private static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    private static final int DEFAULT_MAX_RETRIES = 1;
    private static final int DEFAULT_MIN_BATCH_SIZE = 5;
    private static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    private static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    private static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    private static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";
    public a assetReporting;
    public b base;
    public boolean disableAllGeneralEvents;
    private long eventTTL;
    public int maxEventsToPersist;
    private int maxRetryCount;
    public gc networkType;
    public List<String> priorityEvents;
    private long processingInterval;
    public double samplingFactor;
    public String telemetryUrl;
    private long txLatency;

    /* compiled from: TelemetryConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class a {
        public boolean gif;
        public boolean image;
        public boolean video;
    }

    /* compiled from: TelemetryConfig.java */
    @ik
    /* loaded from: classes3.dex */
    public static final class b {
        public boolean enabled;

        private b() {
            this.enabled = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public gf(String str) {
        super(str);
        this.telemetryUrl = DEFAULT_URL;
        this.processingInterval = DEFAULT_PROCESSING_INTERVAL_SEC;
        this.maxRetryCount = 1;
        this.maxEventsToPersist = 1000;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.disableAllGeneralEvents = false;
        this.txLatency = DEFAULT_INGESTION_LATENCY_SEC;
        this.samplingFactor = DEFAULT_SAMPLING_FACTOR;
        LinkedList linkedList = new LinkedList();
        linkedList.add("SessionStarted");
        linkedList.add("ServerFill");
        linkedList.add("ServerNoFill");
        linkedList.add("ServerError");
        linkedList.add("AdLoadFailed");
        linkedList.add("AdLoadSuccessful");
        linkedList.add("BlockAutoRedirection");
        linkedList.add("AssetDownloaded");
        linkedList.add("CrashEventOccurred");
        linkedList.add("InvalidConfig");
        linkedList.add("ConfigFetched");
        linkedList.add("SdkInitialized");
        linkedList.add("AdGetSignalsFailed");
        linkedList.add("AdGetSignalsSucceeded");
        linkedList.add("AdShowFailed");
        linkedList.add("AdLoadCalled");
        linkedList.add("AdLoadDroppedAtSDK");
        linkedList.add("AdShowCalled");
        linkedList.add("AdShowSuccessful");
        this.priorityEvents = linkedList;
        this.base = new b();
        gc gcVar = new gc();
        this.networkType = gcVar;
        gcVar.wifi = new gc.a();
        gc gcVar2 = this.networkType;
        gc.a aVar = gcVar2.wifi;
        aVar.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        aVar.minBatchSize = 5;
        aVar.maxBatchSize = 20;
        gcVar2.others = new gc.a();
        gc.a aVar2 = this.networkType.others;
        aVar2.retryInterval = DEFAULT_RETRY_INTERVAL_SEC;
        aVar2.minBatchSize = 5;
        aVar2.maxBatchSize = 20;
        a aVar3 = new a();
        aVar3.video = true;
        aVar3.image = false;
        aVar3.gif = false;
        this.assetReporting = aVar3;
    }

    public static ij<gf> a() {
        return new ij().a(new io("priorityEvents", gf.class), (in) new il(new Constructor<List<String>>() { // from class: com.inmobi.media.gf.1
            @Override // com.inmobi.commons.utils.json.Constructor
            public final /* synthetic */ List<String> construct() {
                return new LinkedList();
            }
        }, String.class));
    }

    @Override // com.inmobi.media.fr
    public String b() {
        return "telemetry";
    }

    @Override // com.inmobi.media.fr
    public JSONObject c() {
        return a().a((ij<gf>) this);
    }

    @Override // com.inmobi.media.fr
    public boolean d() {
        if (this.telemetryUrl.trim().length() != 0 && (this.telemetryUrl.startsWith("http://") || this.telemetryUrl.startsWith("https://"))) {
            long j10 = this.txLatency;
            if (j10 >= this.processingInterval && j10 <= this.eventTTL && this.networkType.a(this.maxEventsToPersist) && this.processingInterval > 0 && this.maxRetryCount >= 0 && this.txLatency > 0 && this.eventTTL > 0 && this.maxEventsToPersist > 0 && this.samplingFactor >= DEFAULT_SAMPLING_FACTOR) {
                return true;
            }
        }
        return false;
    }

    public final gk e() {
        int i10 = this.maxRetryCount;
        long j10 = this.eventTTL;
        long j11 = this.processingInterval;
        long j12 = this.txLatency;
        gc gcVar = this.networkType;
        gc.a aVar = gcVar.wifi;
        int i11 = aVar.minBatchSize;
        int i12 = aVar.maxBatchSize;
        gc.a aVar2 = gcVar.others;
        return new gk(i10, j10, j11, j12, i11, i12, aVar2.minBatchSize, aVar2.maxBatchSize, aVar.retryInterval, aVar2.retryInterval);
    }
}
