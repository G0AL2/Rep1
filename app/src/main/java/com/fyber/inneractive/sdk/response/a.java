package com.fyber.inneractive.sdk.response;

/* loaded from: classes2.dex */
public enum a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    /* JADX INFO: Fake field, exist only in values array */
    RETURNED_ADTYPE_HTML5_VIDEO(9),
    /* JADX INFO: Fake field, exist only in values array */
    RETURNED_ADTYPE_NATIVE(10),
    /* JADX INFO: Fake field, exist only in values array */
    RETURNED_ADTYPE_PMN(11),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    

    /* renamed from: a  reason: collision with root package name */
    public int f20149a;

    a(int i10) {
        this.f20149a = i10;
    }

    public static a a(int i10) {
        a[] values;
        for (a aVar : values()) {
            if (aVar.f20149a == i10) {
                return aVar;
            }
        }
        return null;
    }
}
