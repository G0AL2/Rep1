package yd;

import com.google.android.gms.ads.query.QueryInfo;

/* compiled from: QueryInfoMetadata.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f39521a;

    /* renamed from: b  reason: collision with root package name */
    private QueryInfo f39522b;

    /* renamed from: c  reason: collision with root package name */
    private String f39523c;

    public b(String str) {
        this.f39521a = str;
    }

    public String a() {
        return this.f39523c;
    }

    public String b() {
        return this.f39521a;
    }

    public QueryInfo c() {
        return this.f39522b;
    }

    public String d() {
        QueryInfo queryInfo = this.f39522b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void e(String str) {
        this.f39523c = str;
    }

    public void f(QueryInfo queryInfo) {
        this.f39522b = queryInfo;
    }
}
