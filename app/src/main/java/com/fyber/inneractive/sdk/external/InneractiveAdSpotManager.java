package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class InneractiveAdSpotManager {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, InneractiveAdSpot> f17147a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static InneractiveAdSpotManager f17148a = new InneractiveAdSpotManager();
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().f17147a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public static InneractiveAdSpotManager get() {
        return a.f17148a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f17147a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        m mVar = new m();
        this.f17147a.put(mVar.f17258a, mVar);
        return mVar;
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.f17147a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.f17147a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
