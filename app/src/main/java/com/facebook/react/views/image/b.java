package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;

/* compiled from: ImageLoadEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final int f16085a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16086b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16087c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16088d;

    /* renamed from: e  reason: collision with root package name */
    private final int f16089e;

    /* renamed from: f  reason: collision with root package name */
    private final int f16090f;

    /* renamed from: g  reason: collision with root package name */
    private final int f16091g;

    private b(int i10, int i11, int i12) {
        this(i10, i11, i12, null, null, 0, 0, 0, 0);
    }

    public static final b a(int i10, int i11, Throwable th) {
        return new b(i10, i11, 1, th.getMessage(), null, 0, 0, 0, 0);
    }

    private WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", this.f16087c);
        createMap.putDouble("width", this.f16088d);
        createMap.putDouble("height", this.f16089e);
        return createMap;
    }

    public static final b c(int i10, int i11) {
        return new b(i10, i11, 3);
    }

    public static final b d(int i10, int i11, String str, int i12, int i13) {
        return new b(i10, i11, 2, null, str, i12, i13, 0, 0);
    }

    public static final b e(int i10, int i11) {
        return new b(i10, i11, 4);
    }

    public static final b f(int i10, int i11, String str, int i12, int i13) {
        return new b(i10, i11, 5, null, str, 0, 0, i12, i13);
    }

    public static String g(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return "topProgress";
                        }
                        throw new IllegalStateException("Invalid image event: " + Integer.toString(i10));
                    }
                    return "topLoadStart";
                }
                return "topLoadEnd";
            }
            return "topLoad";
        }
        return "topError";
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) this.f16085a;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        int i10 = this.f16085a;
        if (i10 == 1) {
            createMap.putString("error", this.f16086b);
        } else if (i10 == 2) {
            createMap.putMap("source", b());
        } else if (i10 == 5) {
            createMap.putInt(RNAdsEvents.EVENT_LOADED, this.f16090f);
            createMap.putInt("total", this.f16091g);
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return g(this.f16085a);
    }

    private b(int i10, int i11, int i12, String str, String str2, int i13, int i14, int i15, int i16) {
        super(i10, i11);
        this.f16085a = i12;
        this.f16086b = str;
        this.f16087c = str2;
        this.f16088d = i13;
        this.f16089e = i14;
        this.f16090f = i15;
        this.f16091g = i16;
    }
}
