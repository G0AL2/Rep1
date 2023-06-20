package md;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import qe.g;
import qe.k;

/* compiled from: PageScrollStateChangedEvent.kt */
/* loaded from: classes3.dex */
public final class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final String f34424a;

    /* compiled from: PageScrollStateChangedEvent.kt */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, String str) {
        super(i10);
        k.f(str, "mPageScrollState");
        this.f34424a = str;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("pageScrollState", this.f34424a);
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
        return "topPageScrollStateChanged";
    }
}
