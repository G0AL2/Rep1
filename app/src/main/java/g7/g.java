package g7;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.r;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;

/* compiled from: ScrollEvent.java */
/* loaded from: classes.dex */
public class g extends com.facebook.react.uimanager.events.c<g> {

    /* renamed from: j  reason: collision with root package name */
    private static String f30682j = "g";

    /* renamed from: k  reason: collision with root package name */
    private static final h0.f<g> f30683k = new h0.f<>(3);

    /* renamed from: a  reason: collision with root package name */
    private int f30684a;

    /* renamed from: b  reason: collision with root package name */
    private int f30685b;

    /* renamed from: c  reason: collision with root package name */
    private double f30686c;

    /* renamed from: d  reason: collision with root package name */
    private double f30687d;

    /* renamed from: e  reason: collision with root package name */
    private int f30688e;

    /* renamed from: f  reason: collision with root package name */
    private int f30689f;

    /* renamed from: g  reason: collision with root package name */
    private int f30690g;

    /* renamed from: h  reason: collision with root package name */
    private int f30691h;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.react.views.scroll.b f30692i;

    private g() {
    }

    private void a(int i10, int i11, com.facebook.react.views.scroll.b bVar, int i12, int i13, float f10, float f11, int i14, int i15, int i16, int i17) {
        super.init(i10, i11);
        this.f30692i = bVar;
        this.f30684a = i12;
        this.f30685b = i13;
        this.f30686c = f10;
        this.f30687d = f11;
        this.f30688e = i14;
        this.f30689f = i15;
        this.f30690g = i16;
        this.f30691h = i17;
    }

    public static g b(int i10, int i11, com.facebook.react.views.scroll.b bVar, int i12, int i13, float f10, float f11, int i14, int i15, int i16, int i17) {
        g b10 = f30683k.b();
        if (b10 == null) {
            b10 = new g();
        }
        b10.a(i10, i11, bVar, i12, i13, f10, f11, i14, i15, i16, i17);
        return b10;
    }

    @Deprecated
    public static g c(int i10, com.facebook.react.views.scroll.b bVar, int i11, int i12, float f10, float f11, int i13, int i14, int i15, int i16) {
        return b(-1, i10, bVar, i11, i12, f10, f11, i13, i14, i15, i16);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return this.f30692i == com.facebook.react.views.scroll.b.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", r.a(this.f30684a));
        createMap2.putDouble("y", r.a(this.f30685b));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", r.a(this.f30688e));
        createMap3.putDouble("height", r.a(this.f30689f));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", r.a(this.f30690g));
        createMap4.putDouble("height", r.a(this.f30691h));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.f30686c);
        createMap5.putDouble("y", this.f30687d);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt(Analytics.Param.TARGET, getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return com.facebook.react.views.scroll.b.a((com.facebook.react.views.scroll.b) f6.a.c(this.f30692i));
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        try {
            f30683k.a(this);
        } catch (IllegalStateException e10) {
            ReactSoftExceptionLogger.logSoftException(f30682j, e10);
        }
    }
}
