package e7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: DrawerSlideEvent.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final float f29578a;

    public c(int i10, int i11, float f10) {
        super(i10, i11);
        this.f29578a = f10;
    }

    public float a() {
        return this.f29578a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offset", a());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topDrawerSlide";
    }
}
