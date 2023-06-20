package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TransformAnimatedNode.java */
/* loaded from: classes.dex */
public class r extends com.facebook.react.animated.b {

    /* renamed from: e  reason: collision with root package name */
    private final l f15327e;

    /* renamed from: f  reason: collision with root package name */
    private final List<d> f15328f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode.java */
    /* loaded from: classes.dex */
    public class b extends d {

        /* renamed from: b  reason: collision with root package name */
        public int f15329b;

        private b(r rVar) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode.java */
    /* loaded from: classes.dex */
    public class c extends d {

        /* renamed from: b  reason: collision with root package name */
        public double f15330b;

        private c(r rVar) {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public String f15331a;

        private d(r rVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(ReadableMap readableMap, l lVar) {
        ReadableArray array = readableMap.getArray("transforms");
        this.f15328f = new ArrayList(array.size());
        for (int i10 = 0; i10 < array.size(); i10++) {
            ReadableMap map = array.getMap(i10);
            String string = map.getString("property");
            if (map.getString("type").equals("animated")) {
                b bVar = new b();
                bVar.f15331a = string;
                bVar.f15329b = map.getInt("nodeTag");
                this.f15328f.add(bVar);
            } else {
                c cVar = new c();
                cVar.f15331a = string;
                cVar.f15330b = map.getDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                this.f15328f.add(cVar);
            }
        }
        this.f15327e = lVar;
    }

    @Override // com.facebook.react.animated.b
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TransformAnimatedNode[");
        sb2.append(this.f15238d);
        sb2.append("]: mTransformConfigs: ");
        List<d> list = this.f15328f;
        sb2.append(list != null ? list.toString() : "null");
        return sb2.toString();
    }

    public void h(JavaOnlyMap javaOnlyMap) {
        double d10;
        ArrayList arrayList = new ArrayList(this.f15328f.size());
        for (d dVar : this.f15328f) {
            if (dVar instanceof b) {
                com.facebook.react.animated.b o10 = this.f15327e.o(((b) dVar).f15329b);
                if (o10 != null) {
                    if (o10 instanceof s) {
                        d10 = ((s) o10).k();
                    } else {
                        throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + o10.getClass());
                    }
                } else {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                }
            } else {
                d10 = ((c) dVar).f15330b;
            }
            arrayList.add(JavaOnlyMap.of(dVar.f15331a, Double.valueOf(d10)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
