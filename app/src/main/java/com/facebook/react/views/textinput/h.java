package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ReactTextInputEvent.java */
/* loaded from: classes.dex */
public class h extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: a  reason: collision with root package name */
    private String f16359a;

    /* renamed from: b  reason: collision with root package name */
    private String f16360b;

    /* renamed from: c  reason: collision with root package name */
    private int f16361c;

    /* renamed from: d  reason: collision with root package name */
    private int f16362d;

    public h(int i10, int i11, String str, String str2, int i12, int i13) {
        super(i10, i11);
        this.f16359a = str;
        this.f16360b = str2;
        this.f16361c = i12;
        this.f16362d = i13;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", this.f16361c);
        createMap2.putDouble("end", this.f16362d);
        createMap.putString("text", this.f16359a);
        createMap.putString("previousText", this.f16360b);
        createMap.putMap("range", createMap2);
        createMap.putInt(Analytics.Param.TARGET, getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topTextInput";
    }
}
