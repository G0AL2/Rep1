package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* compiled from: RNGestureHandlerStateChangeEvent.java */
/* loaded from: classes3.dex */
public class i extends com.facebook.react.uimanager.events.c<i> {

    /* renamed from: b  reason: collision with root package name */
    private static final h0.f<i> f28442b = new h0.f<>(7);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f28443a;

    private i() {
    }

    private void a(nd.b bVar, int i10, int i11, c cVar) {
        super.init(bVar.r().getId());
        WritableMap createMap = Arguments.createMap();
        this.f28443a = createMap;
        if (cVar != null) {
            cVar.a(bVar, createMap);
        }
        this.f28443a.putInt("handlerTag", bVar.q());
        this.f28443a.putInt("state", i10);
        this.f28443a.putInt("oldState", i11);
    }

    public static i b(nd.b bVar, int i10, int i11, c cVar) {
        i b10 = f28442b.b();
        if (b10 == null) {
            b10 = new i();
        }
        b10.a(bVar, i10, i11, cVar);
        return b10;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerStateChange", this.f28443a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        this.f28443a = null;
        f28442b.a(this);
    }
}
