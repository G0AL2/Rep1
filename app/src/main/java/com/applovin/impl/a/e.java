package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f6750c = Arrays.asList("video/mp4", "video/webm", "video/3gpp", "video/x-matroska");

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f6752b;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f6753d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f6754e;

    /* renamed from: f  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f6755f;

    /* renamed from: a  reason: collision with root package name */
    protected List<r> f6751a = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final long f6756g = System.currentTimeMillis();

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.m mVar) {
        this.f6752b = mVar;
        this.f6753d = jSONObject;
        this.f6754e = jSONObject2;
        this.f6755f = bVar;
    }

    public int a() {
        return this.f6751a.size();
    }

    public List<r> b() {
        return this.f6751a;
    }

    public JSONObject c() {
        return this.f6753d;
    }

    public JSONObject d() {
        return this.f6754e;
    }

    public com.applovin.impl.sdk.ad.b e() {
        return this.f6755f;
    }

    public long f() {
        return this.f6756g;
    }

    public List<String> g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f6753d, "vast_preferred_video_types", null));
        return !explode.isEmpty() ? explode : f6750c;
    }

    public int h() {
        return Utils.getVideoCompletionPercent(this.f6753d);
    }
}
