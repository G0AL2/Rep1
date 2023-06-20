package yd;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: QueryInfoCallback.java */
/* loaded from: classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    private com.unity3d.scar.adapter.common.a f39519a;

    /* renamed from: b  reason: collision with root package name */
    private b f39520b;

    public a(b bVar, com.unity3d.scar.adapter.common.a aVar) {
        this.f39519a = aVar;
        this.f39520b = bVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f39520b.e(str);
        this.f39519a.b();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f39520b.f(queryInfo);
        this.f39519a.b();
    }
}
