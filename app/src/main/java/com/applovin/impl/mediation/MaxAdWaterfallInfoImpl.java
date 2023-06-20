package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.a f7145a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7146b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7147c;

    /* renamed from: d  reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f7148d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7149e;

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, long j10, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.m(), aVar.n(), j10, list);
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, String str, String str2, long j10, List<MaxNetworkResponseInfo> list) {
        this.f7145a = aVar;
        this.f7146b = str;
        this.f7147c = str2;
        this.f7148d = list;
        this.f7149e = j10;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f7149e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f7145a;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f7146b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f7148d;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f7147c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f7146b + ", testName=" + this.f7147c + ", networkResponses=" + this.f7148d + ", latencyMillis=" + this.f7149e + '}';
    }
}
