package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PropsAnimatedNode.java */
/* loaded from: classes.dex */
class m extends b {

    /* renamed from: e  reason: collision with root package name */
    private int f15295e = -1;

    /* renamed from: f  reason: collision with root package name */
    private final l f15296f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Integer> f15297g;

    /* renamed from: h  reason: collision with root package name */
    private final JavaOnlyMap f15298h;

    /* renamed from: i  reason: collision with root package name */
    private UIManager f15299i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(ReadableMap readableMap, l lVar) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f15297g = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f15297g.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f15298h = new JavaOnlyMap();
        this.f15296f = lVar;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PropsAnimatedNode[");
        sb2.append(this.f15238d);
        sb2.append("] connectedViewTag: ");
        sb2.append(this.f15295e);
        sb2.append(" mPropNodeMapping: ");
        Map<String, Integer> map = this.f15297g;
        sb2.append(map != null ? map.toString() : "null");
        sb2.append(" mPropMap: ");
        JavaOnlyMap javaOnlyMap = this.f15298h;
        sb2.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb2.toString();
    }

    public void h(int i10, UIManager uIManager) {
        if (this.f15295e == -1) {
            this.f15295e = i10;
            this.f15299i = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f15238d + " is already attached to a view: " + this.f15295e);
    }

    public void i(int i10) {
        int i11 = this.f15295e;
        if (i11 != i10 && i11 != -1) {
            throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i10 + " but is connected to view " + this.f15295e);
        }
        this.f15295e = -1;
    }

    public void j() {
        int i10 = this.f15295e;
        if (i10 == -1 || x6.a.a(i10) == 2) {
            return;
        }
        ReadableMapKeySetIterator keySetIterator = this.f15298h.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.f15298h.putNull(keySetIterator.nextKey());
        }
        this.f15299i.synchronouslyUpdateViewOnUIThread(this.f15295e, this.f15298h);
    }

    public final void k() {
        if (this.f15295e == -1) {
            return;
        }
        for (Map.Entry<String, Integer> entry : this.f15297g.entrySet()) {
            b o10 = this.f15296f.o(entry.getValue().intValue());
            if (o10 != null) {
                if (o10 instanceof o) {
                    ((o) o10).h(this.f15298h);
                } else if (o10 instanceof s) {
                    s sVar = (s) o10;
                    Object j10 = sVar.j();
                    if (j10 instanceof String) {
                        this.f15298h.putString(entry.getKey(), (String) j10);
                    } else {
                        this.f15298h.putDouble(entry.getKey(), sVar.k());
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + o10.getClass());
                }
            } else {
                throw new IllegalArgumentException("Mapped property node does not exists");
            }
        }
        this.f15299i.synchronouslyUpdateViewOnUIThread(this.f15295e, this.f15298h);
    }
}
