package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StyleAnimatedNode.java */
/* loaded from: classes.dex */
public class o extends b {

    /* renamed from: e  reason: collision with root package name */
    private final l f15318e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Integer> f15319f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(ReadableMap readableMap, l lVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f15319f = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f15319f.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f15318e = lVar;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StyleAnimatedNode[");
        sb2.append(this.f15238d);
        sb2.append("] mPropMapping: ");
        Map<String, Integer> map = this.f15319f;
        sb2.append(map != null ? map.toString() : "null");
        return sb2.toString();
    }

    public void h(JavaOnlyMap javaOnlyMap) {
        for (Map.Entry<String, Integer> entry : this.f15319f.entrySet()) {
            b o10 = this.f15318e.o(entry.getValue().intValue());
            if (o10 != null) {
                if (o10 instanceof r) {
                    ((r) o10).h(javaOnlyMap);
                } else if (o10 instanceof s) {
                    javaOnlyMap.putDouble(entry.getKey(), ((s) o10).k());
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + o10.getClass());
                }
            } else {
                throw new IllegalArgumentException("Mapped style node does not exists");
            }
        }
    }
}
