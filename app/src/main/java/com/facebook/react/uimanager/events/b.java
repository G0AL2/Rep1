package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.r;

/* compiled from: ContentSizeChangeEvent.java */
/* loaded from: classes.dex */
public class b extends c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final int f15799a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15800b;

    @Deprecated
    public b(int i10, int i11, int i12) {
        this(-1, i10, i11, i12);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", r.a(this.f15799a));
        createMap.putDouble("height", r.a(this.f15800b));
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topContentSizeChange";
    }

    public b(int i10, int i11, int i12, int i13) {
        super(i10, i11);
        this.f15799a = i12;
        this.f15800b = i13;
    }
}
