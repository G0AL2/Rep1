package sd;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: QueryInfoCallback.java */
/* loaded from: classes3.dex */
public class a extends QueryInfoGenerationCallback {

    /* renamed from: a  reason: collision with root package name */
    private com.unity3d.scar.adapter.common.a f36976a;

    /* renamed from: b  reason: collision with root package name */
    private b f36977b;

    public a(b bVar, com.unity3d.scar.adapter.common.a aVar) {
        this.f36976a = aVar;
        this.f36977b = bVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f36977b.e(str);
        this.f36976a.b();
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f36977b.f(queryInfo);
        this.f36976a.b();
    }
}
