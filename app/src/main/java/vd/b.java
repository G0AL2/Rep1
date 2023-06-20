package vd;

import com.google.android.gms.ads.query.QueryInfo;

/* compiled from: QueryInfoMetadata.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f38073a;

    /* renamed from: b  reason: collision with root package name */
    private QueryInfo f38074b;

    /* renamed from: c  reason: collision with root package name */
    private String f38075c;

    public b(String str) {
        this.f38073a = str;
    }

    public String a() {
        return this.f38075c;
    }

    public String b() {
        return this.f38073a;
    }

    public QueryInfo c() {
        return this.f38074b;
    }

    public String d() {
        QueryInfo queryInfo = this.f38074b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void e(String str) {
        this.f38075c = str;
    }

    public void f(QueryInfo queryInfo) {
        this.f38074b = queryInfo;
    }
}
