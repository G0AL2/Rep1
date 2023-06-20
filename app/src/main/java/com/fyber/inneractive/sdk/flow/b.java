package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.response.e;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b<T extends com.fyber.inneractive.sdk.response.e> extends com.fyber.inneractive.sdk.metrics.a {

    /* renamed from: e  reason: collision with root package name */
    public static final String f17191e = String.valueOf(24);

    /* renamed from: f  reason: collision with root package name */
    public static final String f17192f = String.valueOf(1);

    /* renamed from: b  reason: collision with root package name */
    public final T f17193b;

    /* renamed from: c  reason: collision with root package name */
    public final InneractiveAdRequest f17194c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONArray f17195d;

    public b(T t10, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f17193b = t10;
        this.f17194c = inneractiveAdRequest;
        this.f17195d = jSONArray;
    }
}
