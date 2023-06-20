package ld;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import qe.k;

/* compiled from: TopShouldStartLoadWithRequestEvent.kt */
/* loaded from: classes3.dex */
public final class h extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f34046a;

    /* compiled from: TopShouldStartLoadWithRequestEvent.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, WritableMap writableMap) {
        super(i10);
        k.f(writableMap, "mData");
        this.f34046a = writableMap;
        writableMap.putString("navigationType", InneractiveMediationNameConsts.OTHER);
        writableMap.putBoolean("isTopFrame", true);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        k.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), "topShouldStartLoadWithRequest", this.f34046a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topShouldStartLoadWithRequest";
    }
}
