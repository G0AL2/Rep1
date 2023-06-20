package e7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: DrawerStateChangedEvent.java */
/* loaded from: classes.dex */
public class d extends com.facebook.react.uimanager.events.c<d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f29579a;

    public d(int i10, int i11, int i12) {
        super(i10, i11);
        this.f29579a = i12;
    }

    public int a() {
        return this.f29579a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("drawerState", a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topDrawerStateChanged";
    }
}
