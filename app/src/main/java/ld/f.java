package ld;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import qe.k;

/* compiled from: TopMessageEvent.kt */
/* loaded from: classes3.dex */
public final class f extends com.facebook.react.uimanager.events.c<f> {

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f34044a;

    /* compiled from: TopMessageEvent.kt */
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
    public f(int i10, WritableMap writableMap) {
        super(i10);
        k.f(writableMap, "mEventData");
        this.f34044a = writableMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        k.f(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), "topMessage", this.f34044a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topMessage";
    }
}
