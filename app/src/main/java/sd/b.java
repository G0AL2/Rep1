package sd;

import com.google.android.gms.ads.query.QueryInfo;

/* compiled from: QueryInfoMetadata.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f36978a;

    /* renamed from: b  reason: collision with root package name */
    private QueryInfo f36979b;

    /* renamed from: c  reason: collision with root package name */
    private String f36980c;

    public b(String str) {
        this.f36978a = str;
    }

    public String a() {
        return this.f36980c;
    }

    public String b() {
        return this.f36978a;
    }

    public QueryInfo c() {
        return this.f36979b;
    }

    public String d() {
        QueryInfo queryInfo = this.f36979b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void e(String str) {
        this.f36980c = str;
    }

    public void f(QueryInfo queryInfo) {
        this.f36979b = queryInfo;
    }
}
