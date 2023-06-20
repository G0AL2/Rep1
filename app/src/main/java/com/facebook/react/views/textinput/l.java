package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: ReactTextInputSelectionEvent.java */
/* loaded from: classes.dex */
class l extends com.facebook.react.uimanager.events.c<l> {

    /* renamed from: a  reason: collision with root package name */
    private int f16371a;

    /* renamed from: b  reason: collision with root package name */
    private int f16372b;

    public l(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f16371a = i12;
        this.f16372b = i13;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f16372b);
        createMap2.putInt("start", this.f16371a);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topSelectionChange";
    }
}
