package r7;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TestSuiteTabViewEvent.java */
/* loaded from: classes2.dex */
public class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f36453a;

    /* compiled from: TestSuiteTabViewEvent.java */
    /* loaded from: classes2.dex */
    public enum a {
        FAILING("failing_ad_units"),
        WORKING("working_ad_units"),
        YIELD_GROUPS("yield_groups"),
        AD_UNIT_MAPPINGS("ad_unit_mappings"),
        SEARCH("search_ad_units");
        

        /* renamed from: a  reason: collision with root package name */
        final String f36460a;

        a(String str) {
            this.f36460a = str;
        }
    }

    public f(a aVar) {
        this.f36453a = aVar;
    }

    @Override // r7.b
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("view_type", this.f36453a.f36460a);
        return hashMap;
    }

    @Override // r7.b
    public String b() {
        return "ad_units_view";
    }
}
