package com.fyber.inneractive.sdk.player.cache;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f17754a = new HashMap();

    /* loaded from: classes.dex */
    public enum a {
        OK,
        PARTIAL_CANNOT_VALIDATE,
        INVALID
    }

    public abstract a a(com.fyber.inneractive.sdk.player.cache.a aVar, String str);
}
