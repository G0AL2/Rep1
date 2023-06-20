package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f17371c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, f> f17372a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final f f17373b = new e();

    public f a(String str) {
        try {
            if (str == null) {
                return this.f17373b;
            }
            f fVar = this.f17372a.get(str);
            if (fVar == null) {
                d dVar = new d();
                this.f17372a.put(str, dVar);
                return dVar;
            }
            return fVar;
        } catch (Exception unused) {
            return this.f17373b;
        }
    }
}
