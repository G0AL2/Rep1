package ce;

import com.facebook.react.bridge.WritableMap;

/* compiled from: ReactNativeFirebaseEvent.java */
/* loaded from: classes3.dex */
public class b implements de.a {

    /* renamed from: a  reason: collision with root package name */
    private String f5480a;

    /* renamed from: b  reason: collision with root package name */
    private WritableMap f5481b;

    public b(String str, WritableMap writableMap) {
        this.f5480a = str;
        this.f5481b = writableMap;
    }

    @Override // de.a
    public WritableMap a() {
        return this.f5481b;
    }

    @Override // de.a
    public String b() {
        return this.f5480a;
    }

    public b(String str, WritableMap writableMap, String str2) {
        this.f5480a = str;
        this.f5481b = writableMap;
    }
}
