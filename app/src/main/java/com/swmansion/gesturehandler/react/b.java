package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* compiled from: RNGestureHandlerEvent.java */
/* loaded from: classes3.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: c  reason: collision with root package name */
    private static final h0.f<b> f28424c = new h0.f<>(7);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f28425a;

    /* renamed from: b  reason: collision with root package name */
    private short f28426b;

    private b() {
    }

    private void a(nd.b bVar, c cVar) {
        super.init(bVar.r().getId());
        WritableMap createMap = Arguments.createMap();
        this.f28425a = createMap;
        if (cVar != null) {
            cVar.a(bVar, createMap);
        }
        this.f28425a.putInt("handlerTag", bVar.q());
        this.f28425a.putInt("state", bVar.p());
        this.f28426b = bVar.j();
    }

    public static b b(nd.b bVar, c cVar) {
        b b10 = f28424c.b();
        if (b10 == null) {
            b10 = new b();
        }
        b10.a(bVar, cVar);
        return b10;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f28425a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return this.f28426b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        this.f28425a = null;
        f28424c.a(this);
    }
}
