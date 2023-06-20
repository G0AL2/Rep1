package md;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import qe.g;
import qe.k;

/* compiled from: PageScrollEvent.kt */
/* loaded from: classes3.dex */
public final class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final int f34422a;

    /* renamed from: b  reason: collision with root package name */
    private final float f34423b;

    /* compiled from: PageScrollEvent.kt */
    /* renamed from: md.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0452a {
        private C0452a() {
        }

        public /* synthetic */ C0452a(g gVar) {
            this();
        }
    }

    static {
        new C0452a(null);
    }

    public a(int i10, int i11, float f10) {
        super(i10);
        this.f34422a = i11;
        this.f34423b = (Float.isInfinite(f10) || Float.isNaN(f10)) ? 0.0f : 0.0f;
    }

    private final WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f34422a);
        createMap.putDouble("offset", this.f34423b);
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
        return "topPageScroll";
    }
}
