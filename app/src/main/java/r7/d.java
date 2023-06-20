package r7;

import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.TestResult;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RequestEvent.java */
/* loaded from: classes2.dex */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final NetworkConfig f36446a;

    /* renamed from: b  reason: collision with root package name */
    private final a f36447b;

    /* compiled from: RequestEvent.java */
    /* loaded from: classes2.dex */
    public enum a {
        BATCH_REQUEST("batch_test_ad_unit"),
        AD_SOURCE("test_individual_ad_source");
        

        /* renamed from: a  reason: collision with root package name */
        final String f36451a;

        a(String str) {
            this.f36451a = str;
        }
    }

    public d(NetworkConfig networkConfig, a aVar) {
        this.f36446a = networkConfig;
        this.f36447b = aVar;
    }

    @Override // r7.b
    public Map<String, String> a() {
        HashMap hashMap = new HashMap();
        if (this.f36446a.g() != null) {
            hashMap.put("ad_unit", this.f36446a.g());
        }
        hashMap.put("format", this.f36446a.i().g().getFormatString());
        hashMap.put("adapter_class", this.f36446a.i().f());
        if (this.f36446a.n() != null) {
            hashMap.put("adapter_name", this.f36446a.n());
        }
        if (this.f36446a.o() == TestResult.SUCCESS) {
            hashMap.put("request_result", "success");
        } else if (this.f36446a.o() == TestResult.UNTESTED) {
            hashMap.put("request_result", "incomplete");
        } else {
            hashMap.put("request_result", "failed");
            hashMap.put("error_code", Integer.toString(this.f36446a.o().getErrorCode()));
        }
        hashMap.put("origin_screen", this.f36447b.f36451a);
        return hashMap;
    }

    @Override // r7.b
    public String b() {
        return "request";
    }
}
