package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.r;
import java.util.Map;

/* compiled from: SerializationUtils.java */
/* loaded from: classes3.dex */
class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Float> a(a aVar) {
        return h6.e.g("top", Float.valueOf(r.a(aVar.f28446a)), "right", Float.valueOf(r.a(aVar.f28447b)), "bottom", Float.valueOf(r.a(aVar.f28448c)), "left", Float.valueOf(r.a(aVar.f28449d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap b(a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", r.a(aVar.f28446a));
        createMap.putDouble("right", r.a(aVar.f28447b));
        createMap.putDouble("bottom", r.a(aVar.f28448c));
        createMap.putDouble("left", r.a(aVar.f28449d));
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Float> c(c cVar) {
        return h6.e.g("x", Float.valueOf(r.a(cVar.f28452a)), "y", Float.valueOf(r.a(cVar.f28453b)), "width", Float.valueOf(r.a(cVar.f28454c)), "height", Float.valueOf(r.a(cVar.f28455d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap d(c cVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", r.a(cVar.f28452a));
        createMap.putDouble("y", r.a(cVar.f28453b));
        createMap.putDouble("width", r.a(cVar.f28454c));
        createMap.putDouble("height", r.a(cVar.f28455d));
        return createMap;
    }
}
