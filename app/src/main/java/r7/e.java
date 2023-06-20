package r7;

import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ShowAdEvent.java */
/* loaded from: classes2.dex */
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final NetworkConfig f36452a;

    public e(NetworkConfig networkConfig) {
        this.f36452a = networkConfig;
    }

    @Override // r7.b
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        if (this.f36452a.g() != null) {
            hashMap.put("ad_unit", this.f36452a.g());
        }
        hashMap.put("format", this.f36452a.i().g().getFormatString());
        hashMap.put("adapter_class", this.f36452a.i().f());
        if (this.f36452a.n() != null) {
            hashMap.put("adapter_name", this.f36452a.n());
        }
        return hashMap;
    }

    @Override // r7.b
    public String b() {
        return "show_ad";
    }
}
