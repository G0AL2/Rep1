package ld;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import qe.k;

/* compiled from: TopHttpErrorEvent.kt */
/* loaded from: classes3.dex */
public final class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f34039a;

    /* compiled from: TopHttpErrorEvent.kt */
    /* renamed from: ld.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0444a {
        private C0444a() {
        }

        public /* synthetic */ C0444a(qe.g gVar) {
            this();
        }
    }

    static {
        new C0444a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i10, WritableMap writableMap) {
        super(i10);
        k.f(writableMap, "mEventData");
        this.f34039a = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        k.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f34039a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topHttpError";
    }
}
