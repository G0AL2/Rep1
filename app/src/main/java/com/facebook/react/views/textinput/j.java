package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: ReactTextInputKeyPressEvent.java */
/* loaded from: classes.dex */
public class j extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: a  reason: collision with root package name */
    private String f16363a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public j(int i10, String str) {
        this(-1, i10, str);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("key", this.f16363a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topKeyPress";
    }

    j(int i10, int i11, String str) {
        super(i10, i11);
        this.f16363a = str;
    }
}
