package ld;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import qe.k;

/* compiled from: TopLoadingFinishEvent.kt */
/* loaded from: classes3.dex */
public final class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f34041a;

    /* compiled from: TopLoadingFinishEvent.kt */
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
    public c(int i10, WritableMap writableMap) {
        super(i10);
        k.f(writableMap, "mEventData");
        this.f34041a = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        k.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f34041a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topLoadingFinish";
    }
}
