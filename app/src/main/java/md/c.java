package md;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import qe.g;
import qe.k;

/* compiled from: PageSelectedEvent.kt */
/* loaded from: classes3.dex */
public final class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final int f34425a;

    /* compiled from: PageSelectedEvent.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    public c(int i10, int i11) {
        super(i10);
        this.f34425a = i11;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f34425a);
        k.e(createMap, "eventData");
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        k.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topPageSelected";
    }
}
