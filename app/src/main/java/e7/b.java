package e7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: DrawerOpenedEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {
    public b(int i10, int i11) {
        super(i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topDrawerOpen";
    }
}
