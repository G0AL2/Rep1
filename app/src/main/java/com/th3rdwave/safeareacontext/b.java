package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* compiled from: InsetsChangeEvent.java */
/* loaded from: classes3.dex */
class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private a f28450a;

    /* renamed from: b  reason: collision with root package name */
    private c f28451b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, a aVar, c cVar) {
        super(i10);
        this.f28450a = aVar;
        this.f28451b = cVar;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", l.b(this.f28450a));
        createMap.putMap("frame", l.d(this.f28451b));
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topInsetsChange";
    }
}
